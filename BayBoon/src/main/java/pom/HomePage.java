package pom;

import org.openqa.selenium.WebDriver;

public class HomePage extends TestConsumerSignin  {
	//static WebDriver driver;
	
	public void test(){
		//ConsumerSignin cs = new ConsumerSignin();
		//TestConsumerSignin tcs = new TestConsumerSignin();
		//tcs.signIn();
		signIn();
	}
	public static void main(String[] args){
		HomePage home = new HomePage();
		home.test();
	}
	
}
