package day000;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.firefox.FirefoxOptions;

public class LinksOnGrid {
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void linkTest(String b) throws MalformedURLException
	{
		System.out.println(b);
		
		
		
		if(b.equals("firefox"))
		{
			FirefoxOptions cap = new FirefoxOptions(); 
			/*cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
			                  UnexpectedAlertBehaviour.IGNORE);*/

			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
			
		}
		else if(b.equals("chrome"))
		{
			ChromeOptions cap
			= new ChromeOptions(); 
			/*cap.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
			                  UnexpectedAlertBehaviour.IGNORE);
*/
			driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		}
		
		driver.get("http://newtours.demoaut.com");
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for(int i=0;i<links.size();i++)
		{
			if(!links.get(i).getText().isEmpty())
			{
				String linkname=links.get(i).getText();
				String expurl=links.get(i).getAttribute("href");
				links.get(i).click();
				String acturl=driver.getCurrentUrl();
				if(acturl.contains(expurl))
				{
					System.out.println(linkname+" is working correctly");
				}
				else
				{
					System.out.println(linkname+" is not working correctly");
				}
				driver.navigate().back();
				links=driver.findElements(By.tagName("a"));
				
				
				
				
				
				
				
				
				
			}
		}
	}

}