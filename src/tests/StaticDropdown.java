package tests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class StaticDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.drive","/Users/hss/Documents/Nasruddin mac/Softwares/driver/chromedriver-mac-x64");
		System.setProperty("webdriver.chrome.drive","/Users/hss/Documents/Nasruddin mac/Softwares/driver/chromedriver-mac-x64");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
//		WebElement staticDropdown =driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
//		Select dropdown = new Select(staticDropdown );
//		dropdown.selectByIndex(2);
//		System.out.println(dropdown.getFirstSelectedOption() .getText());
//		dropdown.selectByValue("INR");
//		System.out.println(dropdown.getFirstSelectedOption() .getText());
//		dropdown.selectByVisibleText("USD");
//		System.out.println(dropdown.getFirstSelectedOption() .getText());
	}

}  