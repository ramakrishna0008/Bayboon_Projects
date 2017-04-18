package pom;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConsumerSignUP {
static WebDriver driver;
	

	
	public static void main(String[] args) {
	//public void signUp(){	
		try{
						
			System.setProperty("webdriver.gecko.driver", "F:\\SELENIUM\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.bayboon.com/consumer/");
			driver.manage().window().maximize();
			driver.findElement(By.id("signin-width")).click();
			driver.findElement(By.linkText("Sign Up")).click();
			driver.findElement(By.id("userEmail")).clear();
			driver.findElement(By.id("userEmail")).sendKeys("gropzeal12@gmail.com");
			driver.findElement(By.id("password")).clear();
			driver.findElement(By.id("password")).sendKeys("group123");
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("/html/body/div[2]/header-dir/div[2]/div/login/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div[2]/form/div[3]/div[1]/label")).click();
			driver.findElement(By.xpath("/html/body/div[2]/header-dir/div[2]/div/login/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div[2]/form/div[3]/div[2]/label")).click();
			driver.findElement(By.xpath("/html/body/div[2]/header-dir/div[2]/div/login/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div[2]/form/div[3]/div[3]/label")).click();
			driver.findElement(By.xpath("/html/body/div[2]/header-dir/div[2]/div/login/div/div/div/div/div/div/div/div/div[1]/div/div[2]/div/div[2]/form/div[4]/div/div/button")).click();
			/*driver.findElement(By.xpath(".//*[@id='profile']/form/div[3]/div[1]/label")).click();
			driver.findElement(By.xpath(".//*[@id='profile']/form/div[3]/div[2]/label")).click();
			driver.findElement(By.xpath(".//*[@id='profile']/form/div[3]/div[3]/label")).click();
			driver.findElement(By.xpath("(//button[@type='submit'])[3]")).click();*/
			
			
			//driver.findElement(By.cssSelector("html body.ng-scope.modal-open div#commentsflag.alert-pane div.alert.alert-fixed-top.alert-warning button.actionicon.closeicon")).click();

			System.out.println("before printing message");
			
			Alert alert=driver.switchTo().alert();  
			//String alertMessage=driver.switchTo().alert().getText();  
			System.out.println(alert.getText());   
			alert.accept();  
			System.out.println("after printing message");
			
			/*ConsumerSignUp cSignUp = new ConsumerSignUp();
			cSignUp.printString();*/
			
		} catch (Exception e) {
			
			e.printStackTrace();
			}

	}
	public void printString() throws Exception
	{
		
		System.out.println("Print String method");
		/*String alertmessagetext = driver.switchTo().alert().getText();
		System.out.println(alertmessagetext);
		driver.switchTo().alert().accept();	*/
		
		/*Alert alert=driver.switchTo().alert();  
		String alertMessage=driver.switchTo().alert().getText();  
		System.out.println(alertMessage);   
		alert.accept();  */
		      
		
		Alert alert=driver.switchTo().alert();  
		//String alertMessage=driver.switchTo().alert().getText();  
		System.out.println(alert.getText());   
		alert.accept();  
		
		//System.out.println("Alert text is: " + driver.switchTo().alert().getText());
	}

}






