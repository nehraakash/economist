package economist;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobsBLog {
	
	public JobsBLog(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Jobs blog')]")
	WebElement JobsBlogLink;
	
	@FindBy(xpath = "//h1[contains(text(),'Jobs blog')]")
	WebElement JobsBlogHeading;	
	
	
	public void clickSearchRecruitersAndVerifyPage(WebDriver driver) throws InterruptedException
	{
		String ActualTitle =driver.getTitle();
		Thread.sleep(500);
		
		Assert.assertEquals(JobsBlogHeading.isDisplayed(), true);
		System.out.println("Jobs Blog page verified, page name is:" + ActualTitle);
	}

}

