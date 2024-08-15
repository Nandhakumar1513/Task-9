package Task9_seleniumconcepts;

import java.time.Duration;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxval {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Browser name");

		String browser=sc.next().toLowerCase();
		WebDriver driver=null;

		System.out.println("The Selected Browser: "+browser);

		if(browser.equals("firefox")) 
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		else 
		{
			System.out.println("Invalid Browser Selection");
			System.exit(0);
		}
		if(driver!=null)
		{
			firefoxval.testBrowser(driver);
		}
		else
		{
			System.out.println("Invalid Browser Selection");
		}
	}

	public static void testBrowser(WebDriver driver) throws InterruptedException {
		driver.get("https://www.google.com/");
		String currentURL=driver.getCurrentUrl();
		System.out.println(currentURL);	
		Thread.sleep(2000);
		driver.quit();
	}	

}
