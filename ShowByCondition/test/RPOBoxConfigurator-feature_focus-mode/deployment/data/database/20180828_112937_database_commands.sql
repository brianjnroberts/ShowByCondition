CREATE TABLE "rpoboxconfigurator$wallview" (
	"id" BIGINT NOT NULL,
	"length" INT NULL,
	"offset" INT NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name")
 VALUES ('b300276f-407e-4841-84c8-6a70f7e66ebc', 
'RPOBoxConfigurator.WallView', 
'rpoboxconfigurator$wallview');
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('cc560a2c-b1d5-493d-afd6-edd066069b98', 
'b300276f-407e-4841-84c8-6a70f7e66ebc', 
'Length', 
'length', 
3, 
0, 
'2', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('e265d266-f8b2-462d-b562-d3322bb4f9fb', 
'b300276f-407e-4841-84c8-6a70f7e66ebc', 
'Offset', 
'offset', 
3, 
0, 
'0', 
false);
CREATE TABLE "rpoboxconfigurator$wallview_box__selected" (
	"rpoboxconfigurator$wallviewid" BIGINT NOT NULL,
	"rpoboxconfigurator$boxid" BIGINT NOT NULL,
	PRIMARY KEY("rpoboxconfigurator$wallviewid","rpoboxconfigurator$boxid"),
	CONSTRAINT "uniq_rpoboxconfigurator$wallview_box__selected_rpoboxconfigurator$boxid" UNIQUE ("rpoboxconfigurator$boxid"),
	CONSTRAINT "uniq_rpoboxconfigurator$wallview_box__selected_rpoboxconfigurator$wallviewid" UNIQUE ("rpoboxconfigurator$wallviewid"));
CREATE INDEX "idx_rpoboxconfigurator$wallview_box__selected_rpoboxconfigurator$box_rpoboxconfigurator$wallview" ON "rpoboxconfigurator$wallview_box__selected" ("rpoboxconfigurator$boxid" ASC,"rpoboxconfigurator$wallviewid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('8184df72-ebde-4f30-8fe4-a57b1bec608a', 
'RPOBoxConfigurator.WallView_Box__Selected', 
'rpoboxconfigurator$wallview_box__selected', 
'b300276f-407e-4841-84c8-6a70f7e66ebc', 
'f02381ff-0835-41e2-b983-6761ff9c72b1', 
'rpoboxconfigurator$wallviewid', 
'rpoboxconfigurator$boxid', 
'idx_rpoboxconfigurator$wallview_box__selected_rpoboxconfigurator$box_rpoboxconfigurator$wallview');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_rpoboxconfigurator$wallview_box__selected_rpoboxconfigurator$boxid', 
'8184df72-ebde-4f30-8fe4-a57b1bec608a', 
'79b27bd8-3f2c-3a31-9561-bb7d0d4c1f2f');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_rpoboxconfigurator$wallview_box__selected_rpoboxconfigurator$wallviewid', 
'8184df72-ebde-4f30-8fe4-a57b1bec608a', 
'2558ff2f-cfd2-350a-9b0a-4430d1c71dd2');
CREATE TABLE "rpoboxconfigurator$wallview_user" (
	"rpoboxconfigurator$wallviewid" BIGINT NOT NULL,
	"system$userid" BIGINT NOT NULL,
	PRIMARY KEY("rpoboxconfigurator$wallviewid","system$userid"),
	CONSTRAINT "uniq_rpoboxconfigurator$wallview_user_rpoboxconfigurator$wallviewid" UNIQUE ("rpoboxconfigurator$wallviewid"));
CREATE INDEX "idx_rpoboxconfigurator$wallview_user_system$user_rpoboxconfigurator$wallview" ON "rpoboxconfigurator$wallview_user" ("system$userid" ASC,"rpoboxconfigurator$wallviewid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('e7b3b7ef-26b2-4b1b-a67f-cc1c8802fdce', 
'RPOBoxConfigurator.WallView_User', 
'rpoboxconfigurator$wallview_user', 
'b300276f-407e-4841-84c8-6a70f7e66ebc', 
'282e2e60-88a5-469d-84a5-ba8d9151644f', 
'rpoboxconfigurator$wallviewid', 
'system$userid', 
'idx_rpoboxconfigurator$wallview_user_system$user_rpoboxconfigurator$wallview');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_rpoboxconfigurator$wallview_user_rpoboxconfigurator$wallviewid', 
'e7b3b7ef-26b2-4b1b-a67f-cc1c8802fdce', 
'4c59239c-f3c8-37d1-a1d0-749c7d02b531');
CREATE TABLE "rpoboxconfigurator$wallview_bank" (
	"rpoboxconfigurator$wallviewid" BIGINT NOT NULL,
	"rpoboxconfigurator$bankid" BIGINT NOT NULL,
	PRIMARY KEY("rpoboxconfigurator$wallviewid","rpoboxconfigurator$bankid"));
CREATE INDEX "idx_rpoboxconfigurator$wallview_bank_rpoboxconfigurator$bank_rpoboxconfigurator$wallview" ON "rpoboxconfigurator$wallview_bank" ("rpoboxconfigurator$bankid" ASC,"rpoboxconfigurator$wallviewid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('35ca41f8-cb73-4d7b-8a61-dc158ea0e477', 
'RPOBoxConfigurator.WallView_Bank', 
'rpoboxconfigurator$wallview_bank', 
'b300276f-407e-4841-84c8-6a70f7e66ebc', 
'cd4681fb-c615-4ff2-82be-aeeb10ae44de', 
'rpoboxconfigurator$wallviewid', 
'rpoboxconfigurator$bankid', 
'idx_rpoboxconfigurator$wallview_bank_rpoboxconfigurator$bank_rpoboxconfigurator$wallview');
CREATE TABLE "rpoboxconfigurator$wallview_wall" (
	"rpoboxconfigurator$wallviewid" BIGINT NOT NULL,
	"rpoboxconfigurator$wallid" BIGINT NOT NULL,
	PRIMARY KEY("rpoboxconfigurator$wallviewid","rpoboxconfigurator$wallid"),
	CONSTRAINT "uniq_rpoboxconfigurator$wallview_wall_rpoboxconfigurator$wallviewid" UNIQUE ("rpoboxconfigurator$wallviewid"));
CREATE INDEX "idx_rpoboxconfigurator$wallview_wall_rpoboxconfigurator$wall_rpoboxconfigurator$wallview" ON "rpoboxconfigurator$wallview_wall" ("rpoboxconfigurator$wallid" ASC,"rpoboxconfigurator$wallviewid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('28086b70-8cc3-4100-aac5-f1b1d3f41021', 
'RPOBoxConfigurator.WallView_Wall', 
'rpoboxconfigurator$wallview_wall', 
'b300276f-407e-4841-84c8-6a70f7e66ebc', 
'faf4d148-39b9-4e3e-96cd-ecb43663bf14', 
'rpoboxconfigurator$wallviewid', 
'rpoboxconfigurator$wallid', 
'idx_rpoboxconfigurator$wallview_wall_rpoboxconfigurator$wall_rpoboxconfigurator$wallview');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_rpoboxconfigurator$wallview_wall_rpoboxconfigurator$wallviewid', 
'28086b70-8cc3-4100-aac5-f1b1d3f41021', 
'bc28c38b-c6ed-3b52-9524-e64854ba34f1');
CREATE TABLE "rpoboxconfigurator$wallview_row__selected" (
	"rpoboxconfigurator$wallviewid" BIGINT NOT NULL,
	"rpoboxconfigurator$rowid" BIGINT NOT NULL,
	PRIMARY KEY("rpoboxconfigurator$wallviewid","rpoboxconfigurator$rowid"),
	CONSTRAINT "uniq_rpoboxconfigurator$wallview_row__selected_rpoboxconfigurator$rowid" UNIQUE ("rpoboxconfigurator$rowid"),
	CONSTRAINT "uniq_rpoboxconfigurator$wallview_row__selected_rpoboxconfigurator$wallviewid" UNIQUE ("rpoboxconfigurator$wallviewid"));
CREATE INDEX "idx_rpoboxconfigurator$wallview_row__selected_rpoboxconfigurator$row_rpoboxconfigurator$wallview" ON "rpoboxconfigurator$wallview_row__selected" ("rpoboxconfigurator$rowid" ASC,"rpoboxconfigurator$wallviewid" ASC);
INSERT INTO "mendixsystem$association" ("id", 
"association_name", 
"table_name", 
"parent_entity_id", 
"child_entity_id", 
"parent_column_name", 
"child_column_name", 
"index_name")
 VALUES ('f45cb87d-ac6b-490f-bd80-cb9edf50f09f', 
'RPOBoxConfigurator.WallView_Row__Selected', 
'rpoboxconfigurator$wallview_row__selected', 
'b300276f-407e-4841-84c8-6a70f7e66ebc', 
'52a59d00-c2b7-4515-8b44-51f7f8bbc482', 
'rpoboxconfigurator$wallviewid', 
'rpoboxconfigurator$rowid', 
'idx_rpoboxconfigurator$wallview_row__selected_rpoboxconfigurator$row_rpoboxconfigurator$wallview');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_rpoboxconfigurator$wallview_row__selected_rpoboxconfigurator$rowid', 
'f45cb87d-ac6b-490f-bd80-cb9edf50f09f', 
'c685d969-a216-3473-af52-43c2043c35c6');
INSERT INTO "mendixsystem$unique_constraint" ("name", 
"table_id", 
"column_id")
 VALUES ('uniq_rpoboxconfigurator$wallview_row__selected_rpoboxconfigurator$wallviewid', 
'f45cb87d-ac6b-490f-bd80-cb9edf50f09f', 
'2b039be0-9970-3cea-a8dd-de61ee194814');
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20180828 11:29:35';
