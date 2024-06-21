 import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.drive",
				"/Users/hss/Documents/Nasruddin mac/Softwares/driver/chromedriver-mac-x64/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");// URL in the Rahulshetty acedemy
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		
		
		
		
		
		
		
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("Ban");
		Thread.sleep(3000);
		List<WebElement> options=driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for (WebElement option:options)
		{
			if (option.getText().equalsIgnoreCase("Bangladesh")) 
			{
				option.click();
				break ; 
			}
			
		}
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Bengaluru (BLR)']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
//		driver.findElement(By.xpath("(//a[@value='MAA'][normalize-space()='Chennai (MAA)'])[2]")).click();
	
		driver.findElement(By.xpath("//div[@id='ui-datepicker-div']"));
//		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(3000L);
//		for (int i = 0; i < 5; i++) {
//			driver.findElement(By.id("hrefIncAdt")).click();
//		}
//		System.out.println(driver.findElement(By.id("hrefIncAdt")).getText());
//		


	}

}

//int i = 1;
//while (i < 5) {                                 	// While loop for repeat click on 1 button to add more Adults
//	i++;
//};
