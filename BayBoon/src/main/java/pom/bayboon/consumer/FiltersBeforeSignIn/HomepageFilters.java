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

public class HomepageFilters {
	
	
	private WebDriver driver;
	  private String baseUrl;
	  private boolean acceptNextAlert = true;
	  private StringBuffer verificationErrors = new StringBuffer();

	  @Before
	  public void setUp() throws Exception {
		System.setProperty("webdriver.gecko.driver", "F:\\SELENIUM\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver = new FirefoxDriver();
	    baseUrl = "https://www.bayboon.com";
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  }

	  @Test
	  public void testFilters() throws Exception {
	    driver.get(baseUrl + "/consumer/");
	    System.out.println("before click on product");
	    driver.findElement(By.xpath("/html/body/div[2]/div/inner-page/div[1]/div[1]/div/div[1]/div/div[1]/div/div[2]/div/label")).click();
	    //driver.findElement(By.id("product")).click();
	    System.out.println("after click on product");
	    driver.findElement(By.xpath("//div[@id='mCSB_1_container']/div/div/div[2]/div/label")).click();
	    driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[5]/td[4]")).click();
	    driver.findElement(By.xpath("//div[@id='sizzle1491927009834']/div/table/tbody/tr[3]/td[2]")).click();
	    driver.findElement(By.id("selectall")).click();
	    driver.findElement(By.cssSelector("div.checkbox.selectall > label")).click();
	    driver.findElement(By.cssSelector("button.actionicon.closeicon")).click();
	    driver.findElement(By.cssSelector("a.nav-bg-beauty > label.ng-binding")).click();
	  }

	 // @After
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
	
	


	
	{
	/*static WebDriver driver;
	public static void main(String[] args) {
		
		try {
			System.setProperty("webdriver.gecko.driver", "F:\\SELENIUM\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.bayboon.com/consumer/");
			driver.manage().window().maximize();
			
			//unchecking product checkbox
			driver.findElement(By.xpath("/html/body/div[2]/div/inner-page/div[1]/div[1]/div/div[1]/div/div[1]/div/div[2]/div/label")).click();
			
			//From date
			driver.findElement(By.xpath("/html/body/div[2]/div/inner-page/div[1]/div[1]/div/div[1]/div/div[3]/div/div/div[1]/div/input")).click();
			
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[5]/td[4]")).click();
			
			
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(3000);
			//To date
			driver.findElement(By.xpath("/html/body/div[2]/div/inner-page/div[1]/div[1]/div/div[1]/div/div[3]/div/div/div[2]/div/input")).click();
			System.out.println("clicked on To date");
			driver.findElement(By.xpath("/html/body/div[4]/div[1]/table/tbody/tr[3]/td[3]")).click();
			System.out.println("clicked on To date in popup");
			
			//Category SelectAll checkbox uncheck
			driver.findElement(By.xpath("/html/body/div[2]/div/inner-page/div[1]/div[1]/div/div[1]/div/div[4]/h2/div/label")).click();
			System.out.println("unchecked selectAll");
			//closing popup
			driver.findElement(By.xpath("/html/body/div[4]/div/button")).click();
			System.out.println("popup closed");
			//click on Beauty checkbox
			driver.findElement(By.xpath("/html/body/div[2]/div/inner-page/div[1]/div[1]/div/div[1]/div/div[4]/nav/ul/li[4]/a/label")).click();
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}

}

*/
}
}
