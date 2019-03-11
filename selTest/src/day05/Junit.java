package day05;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Junit {
	@Before
	public void c() {
		System.out.println("这是@Before");	
	}
	@Test
public void a() {
	System.out.println("这是第一个@test");	
}
	@Test
	public void b() {
		System.out.println("这是第二个@test");
	}
	@After
	public void d() {
		System.out.println("这是@After");	
	}
}
