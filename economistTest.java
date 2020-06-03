package economist;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class economistTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dell\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jobs.economist.com");
		
		// Items being displayed on home page
		HomePage obj = new HomePage(driver);
		
		obj.homeDisplayed();
		obj.jobTitleDisplayed();
		obj.locationDisplayed();
		obj.radiusDisplayed();
		obj.SectorDisplayed();
		obj.FooterDisplayed();
		
		Thread.sleep(1000);

		//click sign in link
		obj.clickSignin();
		
		Thread.sleep(1000);
		//verify Sign in page
		
		SignInPage page = new SignInPage(driver);		
		page.verifySignInSection(driver);
		
		//verify home tab click takes user to home page
		obj.clickHomeTab();
		
		// verify find a job tab
		
		FindAJobPage jobpage = new FindAJobPage(driver);
		
		jobpage.clickAndVerifyFindJob(driver);
		
		// verify Job Alerts page
		
		JobAlert jobAlertPage = new JobAlert(driver);
		
		jobAlertPage.JobAlert.click();
		jobAlertPage.ClickJobAlertAndVerifyPage(driver);
		
		// verify search recruiters page
		
		SearchRecruiters tab = new SearchRecruiters(driver);
		
		tab.SearchRecruitersLink.click();
		
		tab.clickSearchRecruitersAndVerifyPage(driver);
		
		// verify Jobs Blog page
		
		JobsBLog blogtab = new JobsBLog(driver);
		
		blogtab.JobsBlogLink.click();
				
		blogtab.clickSearchRecruitersAndVerifyPage(driver);
		
		// verify footer links
		
		FooterLinks links = new FooterLinks(driver);
		
		links.verifyFooterLinks();
		
		// Verify that correct job is displayed
		obj.clickHomeTab();
		obj.verifyJobSearch("Manager");
		
		//Verify that job details can be accessed
		obj.verifyViewDetailsPage();
				
	}

}
