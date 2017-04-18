package pom.bayboon.consumer.FiltersBeforeSignIn;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Filters {

	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
		  System.setProperty("webdriver.gecko.driver", "F:\\SELENIUM\\geckodriver.exe");
			driver = new FirefoxDriver();
	   
	    baseUrl = "https://www.bayboon.com";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testFilters() throws Exception {
	    driver.get(baseUrl + "/consumer/");
	    driver.findElement(By.id("product")).click();
	    driver.findElement(By.xpath("/html/body/div[2]/div/inner-page/div[1]/div[1]/div/div[1]/div/div[1]/div/div[2]/div/label")).click();
	    System.out.println("unchecked product");
	    driver.findElement(By.xpath("//div[@id='mCSB_1_container']/div/div/div[2]/div/label")).click();
	    System.out.println("slider executed");
	    driver.findElement(By.xpath("//div[@id='sizzle1492012315179']/div/table/tbody/tr/td[3]")).click();
	    driver.findElement(By.xpath("(//input[@type='text'])[6]")).click();
	    driver.findElement(By.xpath("//div[@id='sizzle1492012315179']/div/table/tbody/tr/td[6]")).click();
	    driver.findElement(By.id("selectall")).click();
	    driver.findElement(By.cssSelector("div.checkbox.selectall > label")).click();
	    driver.findElement(By.cssSelector("button.actionicon.closeicon")).click();
	    driver.findElement(By.id("selectall")).click();
	    driver.findElement(By.cssSelector("div.checkbox.selectall > label")).click();
	  }

	  @After
	  public void tearDown() throws Exception {
	    driver.quit();
	    String verificationErrorString = verificationErrors.toString();
	    if (!"".equals(verificationErrorString)) {
	      fail(verificationErrorString);
	    }
	  }

	  private void fail(String verificationErrorString) {
		// TODO Auto-generated method stub
		
	}

	private boolean isElementPresent(By by) {
	    try {
	      driver.findElement(by);
	      return true;
	    } catch (NoSuchElementException e) {
	      return false;
	    }
	  }

	  private boolean isAlertPresent() {
	    try {
	      driver.switchTo().alert();
	      return true;
	    } catch (NoAlertPresentException e) {
	      return false;
	    }
	  }

	  private String closeAlertAndGetItsText() {
	    try {
	      Alert alert = driver.switchTo().alert();
	      String alertText = alert.getText();
	      if (acceptNextAlert) {
	        alert.accept();
	      } else {
	        alert.dismiss();
	      }
	      return alertText;
	    } finally {
	      acceptNextAlert = true;
	    }
	  }

}
