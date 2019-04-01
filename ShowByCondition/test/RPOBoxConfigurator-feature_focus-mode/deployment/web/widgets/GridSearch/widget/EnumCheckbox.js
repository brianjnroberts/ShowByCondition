define([
	"dojo/_base/declare",
	"GridSearch/widget/Core",
	"dojo/_base/lang",
	"dojo/query",
	"dojo/dom-construct",
	"dijit/_TemplatedMixin",
	"dojo/text!GridSearch/widget/template/EnumCheckbox.html"
], function (declare, Core, dojoLang, dojoQuery, domConstruct, _TemplatedMixin, widgetTemplate) {
	"use strict";

	return declare("GridSearch.widget.EnumCheckbox", [Core, _TemplatedMixin], {

		templateString: widgetTemplate,

		// Internal variables.
		_handles: null,
		_contextObj: null,
		_enumOptions: null,

		//modeler
		pathToAttribute: "",

		constructor: function () {
			this._enumOptions = [];
		},

		postCreate: function () {
			logger.debug(this.id + ".postCreate");
			this.superPostCreate();

			//for version 1, we'll just be getting the options of an enumeration and presenting them here
			//in a later version, we'll support selecting data over an association as well

			//get static options
			this._populateEnumOptions();

			//retrieve state (if available)
			//not supported in v1
			//implement this.getState and the saveState function to store and retrieve selections
			//this.selectNode.value = this.getState("selection", "");
		},

		update: function (obj, callback) {
			logger.debug(this.id + ".update");

			this._setupGrid(this._finishGridSetup.bind(this));

			this._contextObj = obj;
			if (callback) { callback() };
		},

		resize: function (box) {
			logger.debug(this.id + ".resize");
		},
		uninitialize: function () {
			logger.debug(this.id + ".uninitialize");
		},
		storeState: function (t) {
			//TODO: implement for v1
			//t("selection", this.selectNode.value);
		},
		_finishGridSetup: function () {
			if (this._grids) {
				//if the grid is set to wait for search, ensure we set the "_searchFilled" flag
				for (var i = 0; i < this._grids.length; i++) {
					var curGrid = this._grids[i];
					if (curGrid.config && curGrid.config.gridpresentation && curGrid.config.gridpresentation.waitforsearch && this.searchNode.value) {
						curGrid._searchFilled = true;
					}
				}
			}
		},
		_populateEnumOptions: function () {
			//TODO: implement for v1

			var enumMapping = mx.meta.getEntity(this.gridEntity).getEnumMap(this.pathToAttribute);

			for (var i = 0; i < enumMapping.length; i++) {
				this._addCheckbox(enumMapping[i]);
			}
		},

		//Creates a single checkbox given an enumeration mapping
		_addCheckbox: function (singleEnumMap) {
			if (singleEnumMap) {
				//var nextIndex = this._enumOptions.length,
				var inputLabel, inputValue, tempInputNode, tempLabelNode, wrapperNode;
				inputLabel = singleEnumMap.caption;
				inputValue = singleEnumMap.key;

				wrapperNode = document.createElement("div");

				tempInputNode = domConstruct.toDom("<input type='checkbox' value='" + inputValue + "'label='" + inputLabel + "'>");
				tempLabelNode = domConstruct.toDom("<label>" + inputLabel + "</label>");

				wrapperNode.appendChild(tempInputNode);
				wrapperNode.appendChild(tempLabelNode);

				this._enumOptions.push(tempInputNode);
				domConstruct.place(wrapperNode, this.filterContainer);

				tempInputNode.addEventListener("click", dojoLang.hitch(this, function (event) {
					this._fireSearch();
				}));
			}
		},
		/*_optionSelected: function() {
			var grid = this._grid,
                datasource = grid._datasource

            if (!datasource) {
                datasource = grid._dataSource;
            }

            var newConstraint = this._getSearchConstraintAllSearchBoxes();
            datasource.setConstraints(newConstraint);

			//if the grid is set to wait for search, ensure we set the "_searchFilled" flag
			if(grid.config && grid.config.gridpresentation && grid.config.gridpresentation.waitforsearch) {
				if(newConstraint) {
					grid._searchFilled = true;
				} else {
					//grid._searchFilled = false; //grid doesn't refresh or empty if you do this
					datasource.setConstraints("[1=0]");
				}
			}
			this.onSearchChanged();

			this._reloadGrid();
		},*/
		_getSearchConstraint: function () {
			var constraint = "[";
			var filterLabel = "";

			for (var i = 0; i < this._enumOptions.length; i++) {
				var currentInput = this._enumOptions[i];
				if (currentInput.checked) {
					constraint = constraint + this.pathToAttribute + "='" + currentInput.value + "' or ";
					filterLabel = filterLabel + currentInput.attributes.label.value + " or ";
				}
			}

			if (constraint.length > 1) {
				constraint = constraint.substring(0, constraint.length - 4);
				constraint = constraint + "]";
				filterLabel = filterLabel.substring(0, filterLabel.length - 4);
			} else {
				constraint = "";
			}

			if (constraint) {
				this._currentFilter = filterLabel;
			} else {
				this._currentFilter = null;
			}
			//this.onSearchChanged();
			return constraint;
		},
		_clear: function () {
			//this.searchNode.value = "";
			for (var i = 0; i < this._enumOptions.length; i++) {
				var currentInput = this._enumOptions[i];
				currentInput.checked = false;
			}
			this._currentFilter = null;
			this._fireSearch();
		},
	});
});

require(["GridSearch/widget/EnumCheckbox"]);
