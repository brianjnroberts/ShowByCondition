// This file was generated by Mendix Modeler 7.16.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package rpoboxconfigurator.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the RPOBoxConfigurator module
	public static void aCR_ConCatRPOData(IContext context, rpoboxconfigurator.proxies.RPO _rPO)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RPO", _rPO == null ? null : _rPO.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.ACR_ConCatRPOData", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_CallSearchRPO(IContext context)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			Core.execute(context, "RPOBoxConfigurator.ACT_CallSearchRPO", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_DeleteWall(IContext context, rpoboxconfigurator.proxies.Wall _wall, rpoboxconfigurator.proxies.RPO _rPO)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Wall", _wall == null ? null : _wall.getMendixObject());
			params.put("RPO", _rPO == null ? null : _rPO.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.ACT_DeleteWall", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_MarkRPOComplete(IContext context, rpoboxconfigurator.proxies.RPO _rPO)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RPO", _rPO == null ? null : _rPO.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.ACT_MarkRPOComplete", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_ReopenWall(IContext context, rpoboxconfigurator.proxies.Wall _wall)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Wall", _wall == null ? null : _wall.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.ACT_ReopenWall", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_RevertToInProgress(IContext context, rpoboxconfigurator.proxies.Wall _wall)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Wall", _wall == null ? null : _wall.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.ACT_RevertToInProgress", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_SaveRPO(IContext context, rpoboxconfigurator.proxies.RPO _rPO)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RPO", _rPO == null ? null : _rPO.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.ACT_SaveRPO", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_SaveUpdateLastModifiedDate(IContext context, rpoboxconfigurator.proxies.Wall _wall)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Wall", _wall == null ? null : _wall.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.ACT_SaveUpdateLastModifiedDate", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_ShowRPODetailsOrWallEdit(IContext context, rpoboxconfigurator.proxies.RPO _rPO)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RPO", _rPO == null ? null : _rPO.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.ACT_ShowRPODetailsOrWallEdit", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_ShowWall_Edit_Structure(IContext context, rpoboxconfigurator.proxies.Wall _wall, rpoboxconfigurator.proxies.RPO _rPO)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Wall", _wall == null ? null : _wall.getMendixObject());
			params.put("RPO", _rPO == null ? null : _rPO.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.ACT_ShowWall_Edit_Structure", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void aCT_ViewReadOnlyPageForWall(IContext context, rpoboxconfigurator.proxies.Wall _wall)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Wall", _wall == null ? null : _wall.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.ACT_ViewReadOnlyPageForWall", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void addBank(IContext context, rpoboxconfigurator.proxies.Wall _wall)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Wall", _wall == null ? null : _wall.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.AddBank", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void addBankToWallView(IContext context, rpoboxconfigurator.proxies.WallView _wallView)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WallView", _wallView == null ? null : _wallView.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.AddBankToWallView", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void addBox(IContext context, rpoboxconfigurator.proxies.Row _row, rpoboxconfigurator.proxies.Bank _bank)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			params.put("Bank", _bank == null ? null : _bank.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.AddBox", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void addNumberToBoxNumber_Done(IContext context, rpoboxconfigurator.proxies.Box _box, rpoboxconfigurator.proxies.Wall _wall)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Box", _box == null ? null : _box.getMendixObject());
			params.put("Wall", _wall == null ? null : _wall.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.AddNumberToBoxNumber_Done", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void addRow(IContext context, rpoboxconfigurator.proxies.Bank _bank)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Bank", _bank == null ? null : _bank.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.AddRow", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void addRowAbove(IContext context, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.AddRowAbove", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void addRowBelow(IContext context, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.AddRowBelow", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void advanceBoxSelection(IContext context, rpoboxconfigurator.proxies.Box _box, rpoboxconfigurator.proxies.Wall _wall)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Box", _box == null ? null : _box.getMendixObject());
			params.put("Wall", _wall == null ? null : _wall.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.AdvanceBoxSelection", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void applyNewRowType(IContext context, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.ApplyNewRowType", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void applyNewRowTypeAndClosePage(IContext context, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.ApplyNewRowTypeAndClosePage", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void applyOverflowDirection(IContext context, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.ApplyOverflowDirection", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void deleteBank(IContext context, rpoboxconfigurator.proxies.Bank _bank)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Bank", _bank == null ? null : _bank.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.DeleteBank", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void deleteRow(IContext context, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.DeleteRow", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void deleteRowAboveIfExists(IContext context, rpoboxconfigurator.proxies.Row _row, rpoboxconfigurator.proxies.Bank _bank)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			params.put("Bank", _bank == null ? null : _bank.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.DeleteRowAboveIfExists", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void deleteRowBelowIfExists(IContext context, rpoboxconfigurator.proxies.Row _row, rpoboxconfigurator.proxies.Bank _bank)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			params.put("Bank", _bank == null ? null : _bank.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.DeleteRowBelowIfExists", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void duplicateBank(IContext context, rpoboxconfigurator.proxies.Bank _bank)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Bank", _bank == null ? null : _bank.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.DuplicateBank", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.Long getBankHeight(IContext context, rpoboxconfigurator.proxies.Bank _bank)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Bank", _bank == null ? null : _bank.getMendixObject());
			return (java.lang.Long)Core.execute(context, "RPOBoxConfigurator.GetBankHeight", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.util.List<rpoboxconfigurator.proxies.Bank> getBanksForWallView(IContext context, rpoboxconfigurator.proxies.WallView _wallView)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WallView", _wallView == null ? null : _wallView.getMendixObject());
			java.util.List<IMendixObject> objs = Core.execute(context, "RPOBoxConfigurator.GetBanksForWallView", params);
			java.util.List<rpoboxconfigurator.proxies.Bank> result = null;
			if (objs != null)
			{
				result = new java.util.ArrayList<rpoboxconfigurator.proxies.Bank>();
				for (IMendixObject obj : objs)
					result.add(rpoboxconfigurator.proxies.Bank.initialize(context, obj));
			}
			return result;
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static rpoboxconfigurator.proxies.Row getRowAfter(IContext context, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "RPOBoxConfigurator.GetRowAfter", params);
			return result == null ? null : rpoboxconfigurator.proxies.Row.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static rpoboxconfigurator.proxies.Row getRowBefore(IContext context, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "RPOBoxConfigurator.GetRowBefore", params);
			return result == null ? null : rpoboxconfigurator.proxies.Row.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static rpoboxconfigurator.proxies.RowTypeProjection getRowTypeProjection(IContext context, rpoboxconfigurator.proxies.RowType _rowType)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("RowType", _rowType == null ? null : _rowType.name());
			IMendixObject result = (IMendixObject)Core.execute(context, "RPOBoxConfigurator.GetRowTypeProjection", params);
			return result == null ? null : rpoboxconfigurator.proxies.RowTypeProjection.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void markWallAsCompleteSaveAndClose(IContext context, rpoboxconfigurator.proxies.Wall _wall)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Wall", _wall == null ? null : _wall.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.MarkWallAsCompleteSaveAndClose", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void moveBankLeft(IContext context, rpoboxconfigurator.proxies.Bank _bank)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Bank", _bank == null ? null : _bank.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.MoveBankLeft", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void moveBankRight(IContext context, rpoboxconfigurator.proxies.Bank _bank)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Bank", _bank == null ? null : _bank.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.MoveBankRight", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void moveWallViewLeft(IContext context, rpoboxconfigurator.proxies.WallView _wallView)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WallView", _wallView == null ? null : _wallView.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.MoveWallViewLeft", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void moveWallViewRight(IContext context, rpoboxconfigurator.proxies.WallView _wallView)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WallView", _wallView == null ? null : _wallView.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.MoveWallViewRight", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void overflowRowAbove(IContext context, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.OverflowRowAbove", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void overflowRowBelow(IContext context, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.OverflowRowBelow", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void resequenceBanksInWall(IContext context, rpoboxconfigurator.proxies.Wall _wall)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Wall", _wall == null ? null : _wall.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.ResequenceBanksInWall", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void resequenceRowsInBank(IContext context, rpoboxconfigurator.proxies.Bank _bank)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Bank", _bank == null ? null : _bank.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.ResequenceRowsInBank", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void setBoxAsSelected(IContext context, rpoboxconfigurator.proxies.Box _box, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Box", _box == null ? null : _box.getMendixObject());
			params.put("Row", _row == null ? null : _row.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.SetBoxAsSelected", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void setRowAsSelected(IContext context, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.SetRowAsSelected", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void setRowTypeA(IContext context, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.SetRowTypeA", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void setRowTypeB(IContext context, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.SetRowTypeB", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void setRowTypeC(IContext context, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.SetRowTypeC", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void setRowTypeD(IContext context, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.SetRowTypeD", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void setRowTypeE(IContext context, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.SetRowTypeE", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean showAddRowButton(IContext context, rpoboxconfigurator.proxies.Bank _bank)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Bank", _bank == null ? null : _bank.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "RPOBoxConfigurator.ShowAddRowButton", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean showRowAfter(IContext context, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "RPOBoxConfigurator.ShowRowAfter", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static boolean showRowBefore(IContext context, rpoboxconfigurator.proxies.Row _row)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row", _row == null ? null : _row.getMendixObject());
			return (java.lang.Boolean)Core.execute(context, "RPOBoxConfigurator.ShowRowBefore", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void showRPODetailsFromWall(IContext context, rpoboxconfigurator.proxies.Wall _wall)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Wall", _wall == null ? null : _wall.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.ShowRPODetailsFromWall", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String sUB_CheckforDuplicatePONumbers(IContext context, java.util.List<rpoboxconfigurator.proxies.Box> _boxList_OnWall)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			java.util.ArrayList<IMendixObject> listparam_boxList_OnWall = null;
			if (_boxList_OnWall != null)
			{
				listparam_boxList_OnWall = new java.util.ArrayList<IMendixObject>();
				for (rpoboxconfigurator.proxies.Box obj : _boxList_OnWall)
					listparam_boxList_OnWall.add(obj.getMendixObject());
			}
			params.put("BoxList_OnWall", listparam_boxList_OnWall);
			return (java.lang.String)Core.execute(context, "RPOBoxConfigurator.SUB_CheckforDuplicatePONumbers", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static rpoboxconfigurator.proxies.Box sUB_GetFirstBoxInRow(IContext context, rpoboxconfigurator.proxies.Row _row_Next)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Row_Next", _row_Next == null ? null : _row_Next.getMendixObject());
			IMendixObject result = (IMendixObject)Core.execute(context, "RPOBoxConfigurator.SUB_GetFirstBoxInRow", params);
			return result == null ? null : rpoboxconfigurator.proxies.Box.initialize(context, result);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void sUB_RefreshWallViewBanks(IContext context, rpoboxconfigurator.proxies.WallView _wallView)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("WallView", _wallView == null ? null : _wallView.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.SUB_RefreshWallViewBanks", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String vAL_ValidateWallStructure(IContext context, rpoboxconfigurator.proxies.Wall _wall)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Wall", _wall == null ? null : _wall.getMendixObject());
			return (java.lang.String)Core.execute(context, "RPOBoxConfigurator.VAL_ValidateWallStructure", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static java.lang.String validateBank(IContext context, rpoboxconfigurator.proxies.Bank _iteratorBank)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("IteratorBank", _iteratorBank == null ? null : _iteratorBank.getMendixObject());
			return (java.lang.String)Core.execute(context, "RPOBoxConfigurator.ValidateBank", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void validateWall(IContext context, rpoboxconfigurator.proxies.Wall _wall)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Wall", _wall == null ? null : _wall.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.ValidateWall", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
	public static void validateWallNumbers(IContext context, rpoboxconfigurator.proxies.Wall _wall)
	{
		try
		{
			Map<java.lang.String, Object> params = new HashMap<java.lang.String, Object>();
			params.put("Wall", _wall == null ? null : _wall.getMendixObject());
			Core.execute(context, "RPOBoxConfigurator.ValidateWallNumbers", params);
		}
		catch (CoreException e)
		{
			throw new MendixRuntimeException(e);
		}
	}
}