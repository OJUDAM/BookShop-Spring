package kr.djam.bookshop.controller;

import org.junit.BeforeClass;
import org.junit.Test;

public class MainControllerTests extends AbstractApplicationContextTest {

	@BeforeClass
	public static void set() {
		System.out.println("Before");
	}
	@Test
	public void Test() {
		System.out.println("@Test ");
	}
	
}
