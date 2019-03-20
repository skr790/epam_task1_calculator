package skr_jc_pk;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class math_tester {
	mymath m=new mymath();
	@Test
	void addTest() {
		
		int k=m.add(100, 200);
		assertEquals(300,k);
		
		//assertEquals(72,m.add(3, 19));
	}
	
	@Test
	void add1Test() {
		
		int k=m.add(1000, 200);
		assertEquals(1200,k);
		assertEquals(22,m.add(11, 11));
	}
	@Test
	void multest() {
		int pr=m.multi(2, 5);
		assertEquals(10,pr);
		
	}
	
	@Test
	void tesmulti2() {
		assertEquals(22,m.multi(2,11));
		
	}
	
	@Test
	void testdiv() {
		assertEquals(2.0,m.divv(4, 2));
	}
	@Test
	void testdiv2() {
		assertEquals(1.0,m.divv(1, 1));
	}


	

}
