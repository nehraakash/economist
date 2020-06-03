package economist;

import java.sql.Driver;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobAlert {
	
	String ActualTitle;
	
	public JobAlert(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
		ActualTitle =driver.getTitle();
	}
	
	@FindBy(xpath = "//a[contains(text(),'Job alerts')]")
	WebElement JobAlert;
	
	public void ClickJobAlertAndVerifyPage(WebDriver driver) throws InterruptedException 
	{
		String ActualTitle =driver.getTitle();
		Thread.sleep(1000);
		String ExpectedTitle = "New Job By Email | Jobs.Economist.com";
		Assert.assertEquals(ExpectedTitle,ActualTitle);
		System.out.println("Job Alert page verified, page name is:" + ActualTitle);
	}
}
