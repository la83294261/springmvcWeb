package com.wangyin.szkweb.Domain;


import java.util.List;

/**
 * 名称：JsonPage.java<br>
 * 描述：<br>
 * 最近修改时间：2016年3月24日上午11:07:37
 * 
 * @since 2016年3月24日
 * @author qibo
 */
public class JsonPage {
  private int total;
  private int page;
  private long records;
  private List<?> rows;

  /**
   * @return the total
   */
  public int getTotal() {
    return total;
  }

  /**
   * @param total
   *          the total to set
   */
  public void setTotal(int total) {
    this.total = total;
  }

  /**
   * @return the page
   */
  public int getPage() {
    return page;
  }

  /**
   * @param page
   *          the page to set
   */
  public void setPage(int page) {
    this.page = page;
  }

  /**
   * @return the records
   */
  public long getRecords() {
    return records;
  }

  /**
   * @param records
   *          the records to set
   */
  public void setRecords(long records) {
    this.records = records;
  }

  /**
   * @return the rows
   */
  public List<?> getRows() {
    return rows;
  }

  /**
   * @param rows
   *          the rows to set
   */
  public void setRows(List<?> rows) {
    this.rows = rows;
  }

  /**
   * 
   * @Title: getFromPageInfo
   * @Description:
   * @param @param page
   * @param @return
   * @return JsonPage 返回类型
   * @throws
   */
//  public static JsonPage getFromPageInfo(PageInfo page) {
//    JsonPage jsonPage = new JsonPage();
//    jsonPage.setTotal(page.getPages());
//    jsonPage.setPage(page.getPageNum());
//    jsonPage.setRecords(page.getTotal());
//    jsonPage.setRows(page.getList());
//    return jsonPage;
//  }
}
