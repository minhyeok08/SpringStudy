package com.sist.mapper;
import java.util.*;

import org.apache.ibatis.annotations.Select;

import com.sist.vo.*;
public interface FoodMapper {
	@Select("SELECT cno,title,poster,subject "
			+ "FROM food_category "
			+ "ORDER BY cno ASC")
	public List<CategoryVO> foodCategoryListData();
	
	@Select("SELECT title,subject FROM food_category "
			+ "WHERE cno=#{cno}")
	public CategoryVO foodCategoryInfoData(int cno);
	
	@Select("SELECT fno,name,address,phone,type,poster,score,"
			+ "(SELECT name FROM springReply "
			+ "WHERE rownum=1 AND fno=food_house.fno) as userName,"
			+ "(SELECT msg FROM springReply "
			+ "WHERE rownum=1 AND fno=food_house.fno) as rdata "
			+ "FROM food_house "
			+ "WHERE cno=#{cno}")
	public List<FoodVO> foodListData(int cno); 
	
	public List<FoodVO> foodFindData(Map map);
	
	public int foodFindTotalPage(Map map);
	
	@Select("SELECT fno,cno,name,phone,address,type,time,parking,price,score,poster "
			+ "FROM food_house "
			+ "WHERE fno=#{fno}")
	public FoodVO foodDetailData(int fno);
	
	//@Select("SELECT fno,cno,name,phone,address,type,time,parking,price,score,poster "
	//		+ "FROM food_house WHERE fno=#{fno}")
	//public FoodVO foodDetailHouserData(int fno);
	
	// 추천
	@Select("SELECT DISTINCT name FROM food_location WHERE LENGTH(name)>1")
	public List<String> foodNameGetData();
	
	// 실제 정보
	@Select("SELECT fno,name,poster,rownum FROM food_location "
			+ "WHERE name=#{name} AND rownum<=1")
	public FoodVO foodRecommandInfoData(String name);
}
