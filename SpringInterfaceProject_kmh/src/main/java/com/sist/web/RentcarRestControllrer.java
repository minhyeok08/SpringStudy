package com.sist.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sist.dao.*;
import com.sist.vo.*;

@RestController
public class RentcarRestControllrer {
	@Autowired
	private RentcarDAO dao;
	
	@GetMapping(value="rentcar/list_vue.do",produces = "text/plain;charset=UTF-8")
	public String rentcar_list_vue(String page)
	{
		
		String result="";
		try
		{
			if(page==null)
				page="1";
			int curpage=Integer.parseInt(page);
			Map map=new HashMap();
			map.put("start", (curpage*12)-11);
			map.put("end", curpage*12);
			List<RentcarVO> list=dao.RentcarListData(map);
			int totalpage=dao.RentcarTotalPage();
			
			JSONArray arr=new JSONArray();
			int i=0;
			
			for(RentcarVO vo:list)
			{
				JSONObject obj=new JSONObject();
				obj.put("cid", vo.getCid());
				obj.put("car_name", vo.getCar_name());
				obj.put("price", vo.getPrice());
				String img="https://rentinjeju.com"+vo.getImg();
				obj.put("img", img);
				if(i==0)
				{
					obj.put("curpage", curpage);
					obj.put("totalpage", totalpage);
				}
				arr.add(obj);
				i++;
			}
			result=arr.toJSONString();
		}catch(Exception ex) {ex.printStackTrace();}
		return result;
	}
}
