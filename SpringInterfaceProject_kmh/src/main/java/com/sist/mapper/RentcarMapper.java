package com.sist.mapper;
import java.util.*;

import org.apache.ibatis.annotations.Select;

import com.sist.vo.*;


public interface RentcarMapper {
	@Select("SELECT cid,price,img,car_name,num "
			+ "FROM (SELECT cid,price,img,car_name,rownum as num "
			+ "FROM (SELECT cid,price,img,car_name "
			+ "FROM rent_info ORDER BY cid asc)) "
			+ "WHERE num BETWEEN #{start} and #{end} ")
	public List<RentcarVO> RentcarListData(Map map);
	
	@Select("SELECT CEIL(count(*)/12.0) FROM rent_info")
	public int RentcarTotalPage();
	
	@Select("SELECT cid,price,img,car_name,num "
			+ "FROM (SELECT cid,price,img,car_name,rownum as num "
			+ "FROM (SELECT cid,price,img,car_name "
			+ "FROM rent_info ORDER BY cid asc WHERE car_name LIKE '%'||#{car_name}||'%')) "
			+ "WHERE num BETWEEN #{start} and #{end} ")
	public List<RentcarVO> RentcarFindData(Map map);
	
}
