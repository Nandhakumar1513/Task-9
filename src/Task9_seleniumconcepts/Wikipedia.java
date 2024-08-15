package Task9_seleniumconcepts;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wikipedia {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		//navigating to the website		
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);

		String title=driver.getTitle();
		System.out.println("The title of the first page: "+title);

		WebElement searchelement= driver.findElement(By.id("searchInput"));
		searchelement.sendKeys("Artificial Intelligence");

		WebElement clickelement= driver.findElement(By.xpath("//i[@class='sprite svg-search-icon']"));
		clickelement.click();

		String landedtitle=driver.getTitle();
		System.out.println("The title of the landing page: "+landedtitle);

		WebElement historyelement= driver.findElement(By.linkText("View history"));
		historyelement.click();

		String historytitle=driver.getTitle();
		System.out.println("The title of the History Page is: "+historytitle);

		Thread.sleep(2000);

		driver.quit();


	}

}
