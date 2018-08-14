package webdriverDemo1;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Automation1 {
	
	public ChromeDriver driver;

	@Before
	public void setupProgram() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
	}
	@After
	public void closeProgram() {
		driver.quit();
	}

	
	@Test
    public void findItem() {
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.id("search_query_top")).sendKeys("shirt");
		WebElement searchButton = driver.findElement(By.id("searchbox"));
		searchButton.submit();
		WebElement foundItem = driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a"));
		assertEquals("Faded Short Sleeve T-shirts", foundItem.getText());
	}
}
