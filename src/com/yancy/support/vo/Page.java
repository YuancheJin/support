package com.yancy.support.vo;

import java.util.List;

//分页的工具类
public class Page {
	private int totalRowNum = 0;// 总行数
	private int pageSize = 20;// 每页显示的结果数
	private int totalPageNum = 1;// 总页数
	private int currentPageIndex = 1;// 当前页号

	private boolean hasFirst = false;// 有无首页
	private boolean hasLast = false;// 有无尾页
	private boolean hasPrev = false;// 有无上一页
	private boolean hasNext = false;// 有无下一页

	private int startPageIndex = 1;// 起始页号
	private int endPageIndex = 1;// 结束页号

	private int pageIndexNum = 10; // 页号数量,google=19 ,yahoo=10

	private int firstResult = 0;
	private int maxResults = pageSize;
	private List result;

	public List getResult() {
		return result;
	}

	public void setResult(List result) {
		this.result = result;
	}

	public Page(){
		
	}

	public Page(int totalRowNum, int currentPageIndex, int pageSize) {
		super();
		this.totalRowNum = Math.max(0, totalRowNum);
		this.pageSize = Math.max(1, pageSize);
		this.totalPageNum = Math.max(1, (int) Math.ceil(1.0 * this.totalRowNum
				/ this.pageSize));

		// totalPageNum=6
		this.currentPageIndex = Math.min(Math.max(1, currentPageIndex),
				totalPageNum);

		this.hasFirst = this.hasPrev = (currentPageIndex > 1);
		this.hasLast = this.hasNext = (currentPageIndex < totalPageNum);

		// currentPageIndex= 10 pageIndexNum= 10-1=9/2=4.5 -> 5

		// 5 =10-5
		// 14=10+4

		this.startPageIndex = currentPageIndex
				- (int) Math.ceil((pageIndexNum - 1) / 2.0);
		this.startPageIndex = Math.max(1, startPageIndex);

		this.endPageIndex = currentPageIndex
				+ (int) Math.floor((pageIndexNum - 1) / 2.0);
		this.endPageIndex = Math.min(endPageIndex, totalPageNum);

		this.firstResult = (currentPageIndex - 1) * this.pageSize;
		this.maxResults = this.pageSize;

	}

	public int getTotalRowNum() {
		return totalRowNum;
	}

	public void setTotalRowNum(int totalRowNum) {
		this.totalRowNum = totalRowNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getTotalPageNum() {
		return totalPageNum;
	}

	public void setTotalPageNum(int totalPageNum) {
		this.totalPageNum = totalPageNum;
	}

	public int getCurrentPageIndex() {
		return currentPageIndex;
	}

	public void setCurrentPageIndex(int currentPageIndex) {
		this.currentPageIndex = currentPageIndex;
	}

	public boolean isHasFirst() {
		return hasFirst;
	}

	public void setHasFirst(boolean hasFirst) {
		this.hasFirst = hasFirst;
	}

	public boolean isHasLast() {
		return hasLast;
	}

	public void setHasLast(boolean hasLast) {
		this.hasLast = hasLast;
	}

	public boolean isHasPrev() {
		return hasPrev;
	}

	public void setHasPrev(boolean hasPrev) {
		this.hasPrev = hasPrev;
	}

	public boolean isHasNext() {
		return hasNext;
	}

	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}

	public int getStartPageIndex() {
		return startPageIndex;
	}

	public void setStartPageIndex(int startPageIndex) {
		this.startPageIndex = startPageIndex;
	}

	public int getEndPageIndex() {
		return endPageIndex;
	}

	public void setEndPageIndex(int endPageIndex) {
		this.endPageIndex = endPageIndex;
	}

	public int getPageIndexNum() {
		return pageIndexNum;
	}

	public void setPageIndexNum(int pageIndexNum) {
		this.pageIndexNum = pageIndexNum;
	}

	public int getFirstResult() {
		return firstResult;
	}

	public void setFirstResult(int firstResult) {
		this.firstResult = firstResult;
	}

	public int getMaxResults() {
		return maxResults;
	}

	public void setMaxResults(int maxResults) {
		this.maxResults = maxResults;
	}

}
