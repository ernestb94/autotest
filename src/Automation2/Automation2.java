package Automation2;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class Automation2 {
	
	public ChromeDriver driver;

	
	@Before
	public void setupProgram() {
		System.setProperty("webdriver.chrome.driver", "C:/Users/Admin/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
	}
	@After
	public void closeProgram() {
		//driver.quit();
	}
	
//	@Test
//	public void testDrag() {
//		driver.get("http://demoqa.com/");
//		WebElement dragButton = driver.findElement(By.xpath("//*[@id=\"menu-item-141\"]"));
//		dragButton.click();
//		WebElement element = driver.findElement(By.xpath("//*[@id=\"draggableview\"]"));
//		WebElement target = driver.findElement(By.xpath("//*[@id=\"droppableview\"]"));
//		Actions move = new Actions(driver);
//		move.dragAndDrop(element,target).perform();
//	}
//	
//	@Test
//	public void testSelect() {
//		driver.get("http://demoqa.com/");
//		WebElement selectButton = driver.findElement(By.xpath("//*[@id=\"menu-item-142\"]"));
//		selectButton.click();
//		WebElement serialize = driver.findElement(By.xpath("//*[@id=\"ui-id-3\"]"));
//		serialize.click();
//		WebElement six = driver.findElement(By.xpath("//*[@id=\"selectable-serialize\"]/li[6]"));
//		six.click();
//	}
//	
//	@Test
//	public void testAccord() {
//		driver.get("http://demoqa.com/");
//		WebElement accordButton = driver.findElement(By.xpath("//*[@id=\"menu-item-144\"]"));
//		accordButton.click();
//		WebElement customize = driver.findElement(By.xpath("//*[@id=\"ui-id-2\"]"));
//		customize.click();
//		WebElement sectiontwo = driver.findElement(By.xpath("//*[@id=\"ui-id-14\"]"));
//		sectiontwo.click();
//		WebElement toggle = driver.findElement(By.xpath("//*[@id=\"toggle\"]/span"));
//		toggle.click();
//	}
//	
//	@Test 
//	public void testAutoComp() {
//		driver.get("http://demoqa.com/");
//		WebElement autoButton = driver.findElement(By.xpath("//*[@id=\"menu-item-145\"]/a"));
//		autoButton.click();
//		WebElement multiple = driver.findElement(By.xpath("//*[@id=\"ui-id-5\"]"));
//		multiple.click();
//		WebElement textbox = driver.findElement(By.xpath("//*[@id=\"tagsss\"]"));
//		textbox.sendKeys("Javascript");  
//	}
	
	@Test 
	public void testDate() {
		driver.get("http://demoqa.com/");
		WebElement dateButton = driver.findElement(By.xpath("//*[@id=\"menu-item-146\"]/a"));
		dateButton.click();
		WebElement pickDate = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[3]/td[7]/a"));
		pickDate.sendKeys("August 19, 2018");
	}

	
	
}
