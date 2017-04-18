package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.remote.server.handler.GetElementAttribute;
import org.testng.annotations.AfterSuite;

public class TestNGClass {
	public String auth = null;
  @Test
  public void test1() {
	  System.out.println("TestNG class executed");
  }
  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("after suite");
  }

}
