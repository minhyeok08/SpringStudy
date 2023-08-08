package com.sist.service;

import java.util.List;
import java.util.Map;

import com.sist.vo.RecipeVO;


public interface RecipeService {
	
	public List<RecipeVO> RecipeListData(Map map);
	
	public int RecipeTotalPage();
	
}
