package economist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.junit.*;


public class FindAJobPage {
	
	public FindAJobPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);

		
	}
	
	@FindBy(xpath = "//a[contains(text(),'Find a job')]")
	WebElement FindJob;
	
	@FindBy(xpath = "//h1[contains(text(),'Found 33 jobs')]")
	WebElement PageHeading;
	
	public void clickAndVerifyFindJob(WebDriver driver) throws InterruptedException 
	{
		FindJob.click();
		Thread.sleep(1000);
		String ActualTitle =driver.getTitle();
		Assert.assertEquals(PageHeading.isDisplayed(), true);
		System.out.println("Find a job page verified, page name is:" + ActualTitle);
		}
}
