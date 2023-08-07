package com.sist.web;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.sist.dao.RentcarDAO;
@Controller
public class RentcarController {
	@Autowired
	private RentcarDAO dao;
	
	@GetMapping("rentcar/list.do")
	public String Rentcar_list()
	{
		return "rentcar_list";
	}
}
