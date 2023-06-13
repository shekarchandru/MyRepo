package com.gl.statics;

public class StaticExample {

	static int staticVar;
	int nonStaticVar;
	
	
	//static methods can access only static variable
	//Non static methods can access static as well as nonstatic variable
	public static void staticMethod1()
	{
		staticVar++;
		System.out.println("StaticVariable accessed in StaticMethod1 :"+staticVar);
	}
	public void nonStaticMethod1()
	{
		staticVar++;
		nonStaticVar++;
		System.out.println("StaticVariable accessed in NonSTATIC METHOD1  :"+staticVar);
		System.out.println("NonStaticVariable accessed in NonSTATIC METHOD1 :"+nonStaticVar);
	}
	public static void staticMethod2()
	{
		staticVar++;
		System.out.println("StaticVariable accessed in StaticMethod2 :"+staticVar);
	}
	public void nonStaticMethod2()
	{
		staticVar++;
		nonStaticVar++;
		System.out.println("StaticVariable accessed in NonSTATIC METHOD2  :"+staticVar);
		System.out.println("NonStaticVariable accessed in NonSTATIC METHOD2 :"+nonStaticVar);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticExample stem1 = new StaticExample();
		StaticExample.staticMethod1(); // staticNum : 1
		stem1.nonStaticMethod1(); // staticNum  :  2     nonStaticNum : 1
		stem1.nonStaticMethod2(); // staticNum  :  3     nonStaticNum : 1 vs 2
		
		StaticExample stem2 = new StaticExample();
		StaticExample.staticMethod2(); // staticNum : 4
		stem2.nonStaticMethod1(); // staticNum  :  5      nonStaticNum : 1
		stem2.nonStaticMethod2(); // staticNum  :  6     nonStaticNum : 1 vs 2
		

	}

}
