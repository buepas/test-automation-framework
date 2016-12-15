/*
 ===========================================================================
 @    $Author$
 @  $Revision$
 @      $Date$
 @
 ===========================================================================
 */
package com.baloise.testautomation.taf.swing.base._interfaces;

import com.baloise.testautomation.taf.common.interfaces.ISwElement;

/**
 * 
 */
public interface ISwTable<R> extends ISwElement<R> {

  public enum Command {
    clickcell, doubleclickcell, rightclickcell, getcelltext, getcellindex, entervalue, cellexists
  }

  public final String paramText = "text";

  public final String paramRow = "row";

  public final String paramCol = "col";

  public final String paramCellExists = "cellExists";

  public final String type = "table";

  public void clickCell(int row, int col);

  public void clickCell(String text);

  public void doubleClickCell(int row, int col);

  public void doubleClickCell(String text);

  public String getCellText(int row, int col);

  public void rightClickCell(int row, int col);

  public void rightClickCell(String text);

  public Long getCellRow(String value);

  void enterValue(int row, int column, String value);

  boolean cellExists(String text);

}
