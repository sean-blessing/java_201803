import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PirateTest {

		
	@Test
	public void pirateCreateTest() {
		System.out.println("pirateCreateTest");
		Pirate p1 = new Pirate("Jack Black");
		assertEquals("Jack Black", p1.getName());
		assertEquals(4, p1.getLimbsRemaining());
	}
	
	@Test
	public void octoPirateTest() {
		System.out.println("octoPirateTest");
		Pirate p1 = new Pirate("OctoPete", 8);
		assertEquals(8,p1.getLimbsRemaining());
	}

//	@Test
//	public void loseLimbTest() {
//		System.out.println("loseLimbTest");
//		Pirate p1 = new Pirate("Jack Sparrow");
//		p1.loseALimb();
//		assertEquals(3,p1.getLimbsRemaining());
//	}
//	
	@Before
	public void before() {
		System.out.println("before");
	}
	@After
	public void after() {
		System.out.println("after");
	}
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
	}
	@AfterClass
	public static void afterClass() {
		System.out.println("afterClass");
	}

}
