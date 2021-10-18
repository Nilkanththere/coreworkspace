package com.spring;

public class Oracle implements Connection{

	@Override
	public void commit() {
		System.out.println("Commit---Oracle-----connection");
		
	}

	@Override
	public void rollback() {
		System.out.println("Rollback---Oracle-----connection");
		
	}

}
