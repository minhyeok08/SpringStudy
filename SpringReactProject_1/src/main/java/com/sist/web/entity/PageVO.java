package com.sist.web.entity;

import lombok.Setter;

import lombok.Getter;

@Getter
@Setter
public class PageVO {
	private int curpage;
	private int totalpage;
	private int startPage,endPage;

}
