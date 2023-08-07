package com.sist.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.sist.vo.*;
import com.sist.dao.*;
import com.sist.mapper.RentcarMapper;

@Repository
public class RentcarDAO {
	@Autowired
	private RentcarMapper mapper;
	
	/*@Select("SELECT cid,price,img,car_name,num "
			+ "FROM (SELECT cid,price,img,car_name,rownum as num "
			+ "FROM (SELECT cid,price,img,car_name "
			+ "FROM rent_info ORDER BY asc)) "
			+ "WHERE num BETWEEN #{start} and #{end} ")*/
	public List<RentcarVO> RentcarListData(Map map)
	{
		return mapper.RentcarListData(map);
	}
	
	//@Select("SELECT CELL(count(*)/12.0)) FROM rent_info")
	public int RentcarTotalPage()
	{
		return mapper.RentcarTotalPage();
	}
	/*@Select("SELECT cid,price,img,car_name,car_size,fuel_type,gear_type,brand,seater,num "
			+ "FROM rent_info "
			+ "WHERE cid=#{cid}")*/
	/*public RentcarVO RentcarDetailData(Map map)
	{
		return mapper.RentcarDetailData(map);
	}*/
	/*@Select("SELECT cid,price,img,car_name,num "
			+ "FROM (SELECT cid,price,img,car_name,rownum as num "
			+ "FROM (SELECT cid,price,img,car_name "
			+ "FROM rent_info ORDER BY asc WHERE car_name LIKE '%'||#{car_name}||'%')) "
			+ "WHERE num BETWEEN #{start} and #{end} ")*/
	public List<RentcarVO> RentcarFindData(Map map)
	{
		return mapper.RentcarFindData(map);
	}
}
