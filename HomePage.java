package economist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.junit.*;

public class HomePage {
	
	String ActualTitle;
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		ActualTitle =driver.getTitle();
	}
	@FindBy(linkText = "Home")
	public WebElement home;
	
	@FindBy(id = "keywords")
	public WebElement jobTitle;
	
	@FindBy(id = "location")
	public WebElement location;

	@FindBy(id = "RadialLocation")
	public WebElement radius;
	
	@FindBy(xpath = "//section[@class='browse brick']")
	public WebElement Sector;
	
	@FindBy(xpath = "//footer[@class='contentinfo']")
	public WebElement footer;
	
	@FindBy(xpath = "//a[contains(text(),'Sign in')]")
	public WebElement SignIn;
	
	@FindBy(xpath = "//input[contains(@class,'width-full')]")
	public WebElement SearchBtn;
	
	@FindBy(xpath = "//span[contains(text(),'Manager (Data Architect)')]")
	public WebElement SearchedJobs;
	
	@FindBy(xpath = "//li[@id='item-22715']//a[@class='button button--lister-view-details'][contains(text(),'View details')]")
	public WebElement ViewDetailsTab;
	
	@FindBy(xpath = "	//li[contains(@class,'job-actions__action job-actions__action--applylink')]//a[contains(@class,'icon-after button button--brand button--apply icon-white js-lightbox')][contains(text(),'Apply')]")
	public WebElement ApplyBtn;
	
	public void homeDisplayed()
	{
		Assert.assertEquals(home.isDisplayed(), true);
		Assert.assertEquals(home.isEnabled(), true);
			System.out.println("Home Tab is displayed");
	}
	
	public void jobTitleDisplayed()
	{
		Assert.assertEquals(jobTitle.isDisplayed(), true);
		Assert.assertEquals(jobTitle.isEnabled(), true);
		System.out.println("jobTitle Textbox is displayed");
	}
	public void radiusDisplayed()
	{
		Assert.assertEquals(radius.isDisplayed(), true);
		Assert.assertEquals(radius.isEnabled(), true);
			System.out.println("radius Textbox is displayed");
	}
	public void locationDisplayed()
	{
		Assert.assertEquals(location.isDisplayed(), true);
		Assert.assertEquals(location.isEnabled(), true);
		System.out.println("location Textbox is displayed");
	}
	public void SectorDisplayed()
	{
		Assert.assertEquals(Sector.isDisplayed(), true);
			System.out.println("Sector Section is displayed");
	}
	
	public void FooterDisplayed()
	{
		Assert.assertEquals(footer.isDisplayed(), true);
			System.out.println("Footer is displayed");
	}
	
	public void clickSignin()
	{
		SignIn.click();
	}
	
	public void clickHomeTab() throws InterruptedException 
	{
		Thread.sleep(500);
		home.click();
		System.out.println("Home Page link verified");
		Thread.sleep(500);
	}
	
	public void verifyhometab() throws InterruptedException 
	{
		String ExpectedTitle = "Jobs.Economist.com | jobs | Choose from 30 live vacancies";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		Thread.sleep(500);
		
		System.out.println("Home page verified, page name is:" + ActualTitle);
	}
	
	public void verifyJobSearch(String Text) throws InterruptedException
	{
		jobTitle.click();
		jobTitle.sendKeys(Text);
		SearchBtn.click();
		
		Thread.sleep(500);
		
		if(SearchedJobs.getText().contains(Text))
		{
			System.out.println("Relevant jobs are shown according to search");
			Thread.sleep(500);
		}
	}
	
	public void verifyViewDetailsPage() throws InterruptedException
	{
		ViewDetailsTab.click();
		Thread.sleep(500);
		// verify that Apply button is shown
		Assert.assertEquals(ApplyBtn.isDisplayed()&& ApplyBtn.isEnabled(), true);
		
		System.out.println("Apply button is shown on details page.");
	}
}

