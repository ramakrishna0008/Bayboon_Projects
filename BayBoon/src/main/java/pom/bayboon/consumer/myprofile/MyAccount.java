package pom.bayboon.consumer.myprofile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyAccount {

/*	private WebDriver driver;
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
	  public void testUntitled() throws Exception {
	    driver.get(baseUrl + "/consumer/");
	    driver.findElement(By.id("signin-width")).click();
	    driver.findElement(By.id("userName")).clear();
	    driver.findElement(By.id("userName")).sendKeys("ramakrishna0008@gmail.com");
	    driver.findElement(By.id("passwords")).click();
	    driver.findElement(By.id("passwords")).clear();
	    driver.findElement(By.id("passwords")).sendKeys("group123");
	    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	    
	    System.out.println("signin successfully");
	    driver.findElement(By.cssSelector("span.ng-binding.ng-scope")).click();
	    System.out.println("Clicked on Name");
	    driver.findElement(By.linkText("My Profile")).click();
	    driver.findElement(By.id("alternativeEmail")).clear();
	    driver.findElement(By.id("alternativeEmail")).sendKeys("praveenanuthan@gmail.com");
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
	  }*/
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception{
		
		try {
			//ConsumerSignin object
			/*ConsumerSignIn cSignIn = new ConsumerSignIn();
			cSignIn.signIn();*/
			
			System.setProperty("webdriver.gecko.driver", "E:\\seleinium_software\\software\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.bayboon.com/consumer/");
			driver.manage().window().maximize();
			driver.findElement(By.id("signin-width")).click();
			
			driver.findElement(By.id("userName")).clear();
			driver.findElement(By.id("userName")).sendKeys("ramakrishna0008@gmail.com");
			driver.findElement(By.id("passwords")).clear();
			driver.findElement(By.id("passwords")).sendKeys("group123");
			
			Thread.sleep(1000);
			//driver.findElement(By.xpath("id('home')/x:form/x:div[3]/x:div/x:div/x:button")).click();
			driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
			
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			Thread.sleep(10000);//when we put 3 seconds , below code is not executed
			System.out.println("After signin");
			
			driver.findElement(By.cssSelector("i.fa.fa-chevron-down")).click();
			
			System.out.println("clicked on Name");
			driver.findElement(By.linkText("My Profile")).click();
					
			System.out.println("clicked on myprofile");
			Thread.sleep(10000);
			driver.findElement(By.id("alternativeEmail")).clear();

			driver.findElement(By.id("alternativeEmail")).sendKeys("praveena@bayboon.com");
			System.out.println("Alternate email entered");
			Thread.sleep(20000);
			// below 2 statements are not working
			//driver.findElement(By.id("service0")).click();
			//driver.findElement(By.cssSelector("form[name=\"profileValidations\"] > div.form-group > div.checkbox > label")).click();
			
			driver.findElement(By.xpath("/html/body/div[2]/div/my-account/div/div[4]/div[1]/div/div/div[2]/div[2]/div/form/div/div[1]/label")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/my-account/div/div[4]/div[1]/div/div/div[2]/div[2]/div/form/div/div[2]/label")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/my-account/div/div[4]/div[1]/div/div/div[2]/div[2]/div/form/div/div[3]/label")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/my-account/div/div[4]/div[1]/div/div/div[2]/div[2]/div/form/div/div[4]/label")).click();
			System.out.println("clicked on  all checkboxes");
			
			driver.findElement(By.id("billingFirstName")).clear();
			driver.findElement(By.id("billingFirstName")).sendKeys("Rama");
			
			driver.findElement(By.id("billingLastName")).clear();
			driver.findElement(By.id("billingLastName")).sendKeys("Krishna");
			
			driver.findElement(By.id("billingEmail")).clear();
			driver.findElement(By.id("billingEmail")).sendKeys("ramakrishna0008@gmail.com");
			
			driver.findElement(By.id("billingPhone")).clear();
			driver.findElement(By.id("billingPhone")).sendKeys("9666270008");
			
			driver.findElement(By.id("billingStreet1")).clear();
			driver.findElement(By.id("billingStreet1")).sendKeys("Woodfield Square Ln");
			
			driver.findElement(By.id("billingStreet2")).clear();
			driver.findElement(By.id("billingStreet2")).sendKeys("200");
			
			driver.findElement(By.id("billingCity")).clear();
			driver.findElement(By.id("billingCity")).sendKeys("Brighton");
			
			driver.findElement(By.id("billingZip")).clear();
			driver.findElement(By.id("billingZip")).sendKeys("48116");
			
			driver.findElement(By.id("billingState")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div/my-account/div/div[4]/div[2]/div[1]/div/div/div[2]/div/div/form/div[9]/select/option[28]")).click();
			
			driver.findElement(By.id("billingCountry")).click();
			System.out.println("clicked on Country dropdown");
			driver.findElement(By.xpath("/html/body/div[2]/div/my-account/div/div[4]/div[2]/div[1]/div/div/div[2]/div/div/form/div[10]/select/option[2]")).click();
			System.out.println("Country dropdown USA selected");
			
			driver.findElement(By.xpath("/html/body/div[2]/div/my-account/div/div[4]/div[2]/div[2]/div/div[1]/div/div[2]/div/label")).click();
			System.out.println("Same as Billing checkbox");
			Thread.sleep(3000);
			
			driver.findElement(By.xpath("/html/body/div[2]/div/my-account/div/div[4]/div[2]/div[3]/div/button")).click();
			System.out.println("clicked on Submit button");
			
			
			
		} catch (Exception e) {
						
			e.printStackTrace();
		}
		
	}
}
