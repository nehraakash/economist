package economist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.junit.Assert;

public class SignInPage {

	String ActualTitle;
	
	public SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		ActualTitle =driver.getTitle();
	}
	
	public void verifySignInSection(WebDriver driver) throws InterruptedException
	{
		String ExpectedTitle = "Logon | Jobs.Economist.com";
		String ActualTitle =driver.getTitle();
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		Thread.sleep(500);
		
		System.out.println("Sign in page verified, page name is:" + ActualTitle);
	}
}
