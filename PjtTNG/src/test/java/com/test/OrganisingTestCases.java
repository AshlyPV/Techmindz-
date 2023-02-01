package com.test;

import org.testng.annotations.Test;

public class OrganisingTestCases {

	String pTestDaata = "Max123";

	@Test(groups = { "Group A" })
	public void e() {
		System.out.println("Executed Test e");
	}

	@Test(groups = { "Group A" })
	public void d() {
		System.out.println("Executed Test d");
	}

	@Test(groups = { "Group B" })
	public void a() {
		System.out.println("Executed Test a");
	}

	@Test(groups = { "Group B" })
	public void b() {
		System.out.println("Executed Test b");
	}

	@Test(groups = { "Group A" })
	public void c() {
		System.out.println("Executed Test c");
	}

	@Test(groups = { "Group A" })
	public void f() {
		System.out.println("Executed Test f");
	}
}
