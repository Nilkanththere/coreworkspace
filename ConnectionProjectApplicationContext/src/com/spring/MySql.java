package com.spring;

public class MySql implements Connection {

	@Override
	public void commit() {

System.out.println("Commit---MySql-----connection");
		
	}

	@Override
	public void rollback() {
		
		System.out.println("Rollback---MySql-----connection");
	}

}
