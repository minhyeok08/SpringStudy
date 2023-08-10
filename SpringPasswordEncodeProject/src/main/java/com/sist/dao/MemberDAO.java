package com.sist.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.*;
import com.sist.mapper.*;
import com.sist.vo.MemberVO;
@Repository
public class MemberDAO {
	@Autowired
	private MemberMapper mapper;
	
	/*@Insert("IMSERT INTO springTestMember VALUES("
			+ "#{id},#{pwd},#{name},#{sex})")*/
	public void memeberInsert(MemberVO vo)
	{
		mapper.memeberInsert(vo);
	}
	
	// 로그인
	/*@Select("SELECT COUNT(*) FROM springTestMember "
			+ "WHERE id=#{id}")*/
	public int memberIdCheck(String id)
	{
		return mapper.memberIdCheck(id);
	}
	
	/*@Select("SELECT pwd,name,sex FROM springTestMember "
			+ "WHERE id=#{id}")*/
	public MemberVO memberLogin(String id)
	{
		return mapper.memberLogin(id);
	}
	
	/*public MemberVO memberLogin(String id,String pwd)
	{
		MemberVO vo=new MemberVO();
		int count=mapper.memberIdCheck(id);
		if(count==0)
		{
			vo.setMsg("NOID");
		}
		else
		{
			MemberVO dbvo=mapper.memberLogin(id);
			if(pwd.equals(dbvo.getPwd()))
			{
				vo.setMsg("OK");
				vo.setId(dbvo.getId());
				vo.setName(dbvo.getName());
				vo.setSex(dbvo.getSex());
			}
			else
			{
				vo.setMsg("NOPWD");
			}
		}
		return vo;
	}*/
}
