package testngexample;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testnannotation {

	@Test(priority=0)
	   public void testcase1()
	   {
		System.out.println("in test case 1");
	
       }
	@Test(priority=1)
	
	public void testcase2()
	   {
		System.out.println("in test case 2");
	   }
      @Test
	
	public void testcase3()
	   {
		System.out.println("in test case 3");
		 }
      @BeforeMethod
      
       public void inbeforemethod()
       {
    	  System.out.println("in beforemethod");
       }
      @BeforeClass
      
      public void inbeforeclass()
      {
   	  System.out.println("in beforeclass");
      }
      @	BeforeTest
      
      public void inbeforetest()
      {
   	  System.out.println("in beforetest");
      }  
  @AfterMethod
      
      public void inaftermethod()
      {
   	  System.out.println("in aftermethod");
      }  
    @AfterClass
      
      public void inafterclass()
      {
   	  System.out.println("in afterclass");
      }  
    @AfterTest
    
    public void inaftertest()
    {
 	  System.out.println("in aftertest");
    }  
}




