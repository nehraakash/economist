package economist;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchRecruiters {

	public SearchRecruiters(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Search recruiters')]")
	WebElement SearchRecruitersLink;
	
	@FindBy(xpath = "//h1[contains(text(),'Search')]")
	WebElement SearchRecruitersHeading;	
	
	public void clickSearchRecruitersAndVerifyPage(WebDriver driver) throws InterruptedException
	{
		String ActualTitle =driver.getTitle();
		Thread.sleep(500);
		
		Assert.assertEquals(SearchRecruitersHeading.isDisplayed(), true);
		System.out.println("Search Recruiters page verified, page name is: " + ActualTitle);
	}

}
