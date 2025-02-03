package Test;
import org.openqa.selenium.By;
import org.openqa.selenium.keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.chromeDriver;

import page.GoogleSearchpage;
import pages.GoogleSearchPage;

public class GoogleSearchTest {
	private static webDriver driver = null;
	
	public static void main(String[] args) {
		NaaptolSearch();
	}
	public static void NaaptolSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/")
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.naaptol.com/");
		
		driver.findElement(By.name("q").sendkeys("Automation Step by Step"));
		
		GoogleSearchpage.textbox_search(driver).sendKeys("Automation step by sep")
		
		GoogleSearchPage,button_search(driver).click();
		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
		
		driver.close();
	}
}