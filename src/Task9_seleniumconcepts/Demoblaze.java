package Task9_seleniumconcepts;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoblaze {

	public static void main(String[] args) throws InterruptedException {

		//launching chrome browser
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//navigating to the website		
		driver.get("https://www.demoblaze.com/");
		Thread.sleep(2000);

		//getting the website title
		String title = new String(driver.getTitle());

		if(title.equals("STORE"))
		{
			System.out.println("The current title of the website is : "+title);
			System.out.println("Page landed on the correct website");	

		}
		else
		{
			System.out.println("Page not landed on the correct website");
		}
		driver.quit();

	}
}
