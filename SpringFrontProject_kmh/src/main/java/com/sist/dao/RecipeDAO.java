package com.sist.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sist.vo.RecipeVO;
import com.sist.mapper.*; 
@Repository
public class RecipeDAO {
	@Autowired
	private RecipeMapper mapper;
	/*@Select("SELECT no,hit,title,poster,chef,num "
			+ "FROM (SELECT no,hit,title,poster,chef,rownum as num "
			+ "FROM (SELECT no,hit,title,poster,chef "
			+ "FROM recipe ORDER BY no asc))"
			+ "WHERE no BETWEEN #{start} AND #{end} ")*/
	public List<RecipeVO> RecipeListData(Map map)
	{
		return mapper.RecipeListData(map);
	}
	
	//@Select("SELECT CEIL(COUNT(*)) FROM recipe")
	public int RecipeTotalPage()
	{
		return mapper.RecipeTotalPage();
	}
	
	
}
