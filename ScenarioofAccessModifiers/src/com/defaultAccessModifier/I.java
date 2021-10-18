package com.defaultAccessModifier;

public interface I {
	
	
	
public abstract  int m1();


public   default void m2()
{
	System.out.println("java 8 Features");
}



public  static void m3()
{
	System.out.println("java 8 Features");
}
}
