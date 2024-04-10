package DemoJenkins.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class App 
{
		@Test 
		public void searchOnGoogle() throws InterruptedException {
        // Setup Chrome driver using WebDriverManager
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        // Open Google site
        driver.get("https://www.google.com/");
        WebElement searchBox = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        searchBox.sendKeys("IPhone 15");
        WebElement searchBtn = driver.findElement(By.xpath("(//input[@name=\"btnK\" and @role=\"button\"])[2]"));
        searchBtn.sendKeys(Keys.RETURN);
        // Close the browser window
        Thread.sleep(4000);
        driver.quit();
    }
}
