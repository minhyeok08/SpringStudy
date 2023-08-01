package com.sist.dao;

public class MyDAO {
	public void getConnection()
	{
		System.out.println("오라클 연결");
	}
	public void disConnction()
	{
		System.out.println("오라클 해제");
	}
	public void aopSelect()
	{
		getConnection();
		System.out.println("SELECT문장 실행...");
		disConnction();
	}
	public void aopInsert()
	{
		getConnection();
		System.out.println("INSERT문장 실행...");
		disConnction();
	}
	public void aopUpdate()
	{
		getConnection();
		System.out.println("UPDATE문장 실행...");
		disConnction();
	}
	public void aopDelete()
	{
		getConnection();
		System.out.println("DELETE문장 실행...");
		disConnction();
	}
}
