import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class NameGreetingTester
	{

//	@BeforeAll
//	static void setUpBeforeClass() throws Exception
//		{
//		System.out.println("Set up before");
//		}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception
//		{
//		System.out.println("Tear down after");
//		}
//
//	@BeforeEach
//	void setUp() throws Exception
//		{
//		System.out.println("Set up");
//		}
//
//	@AfterEach
//	void tearDown() throws Exception
//		{
//		System.out.println("Tear down");
//		}

	@Test
	void test()
		{
	    Assertions.assertEquals( 5, NameGreeting.addNumbers(2, 3),"Nice try, but...");
		}

// assertEquals("Hello World!\n", outContent.toString());
	}
