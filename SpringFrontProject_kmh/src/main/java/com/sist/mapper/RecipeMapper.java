package com.sist.mapper;
import java.util.*;

import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sist.vo.*;
public interface RecipeMapper {
	
	@Select("SELECT no,hit,title,poster,chef,num "
			+ "FROM (SELECT no,hit,title,poster,chef,rownum as num "
			+ "FROM (SELECT no,hit,title,poster,chef "
			+ "FROM recipe ORDER BY no asc)) "
			+ "WHERE no BETWEEN #{start} AND #{end} ")
	public List<RecipeVO> RecipeListData(Map map);
	
	@Select("SELECT CEIL(COUNT(*)/12.0) FROM recipe")
	public int RecipeTotalPage();
	
	/*
	 * @Update("UPDATE recipe SET " + "hit=hit+1 " + "WHERE no=#{no}") public void
	 * hitIncrement(int no);
	 */
}
