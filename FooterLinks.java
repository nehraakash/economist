package economist;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterLinks {

	public FooterLinks(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'About Us')]")
	WebElement AboutUs;
	
	@FindBy(linkText = "Contact Us")
	WebElement ContactUs;
	
	@FindBy(linkText = "Terms & Conditions")
	WebElement Terms;
	
	@FindBy(linkText = "Privacy Policy")
	WebElement PrivacyPolicy;
	
	@FindBy(linkText = "Advertise with us")
	WebElement AdvertiseWithUs;
	
	public void verifyFooterLinks() throws InterruptedException
	{
		Assert.assertEquals(AboutUs.isDisplayed()&& AboutUs.isEnabled(), true);
		Assert.assertEquals(ContactUs.isDisplayed()&& ContactUs.isEnabled(), true);
		Assert.assertEquals(Terms.isDisplayed()&& Terms.isEnabled(), true);
		Assert.assertEquals(PrivacyPolicy.isDisplayed()&& PrivacyPolicy.isEnabled(), true);
		Assert.assertEquals(AdvertiseWithUs.isDisplayed()&& AdvertiseWithUs.isEnabled(), true);		
		Thread.sleep(500);
		System.out.println("All the footer links are displayed and clickable.");
	}
}
