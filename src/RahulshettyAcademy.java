import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RahulshettyAcademy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
		
		
		
		System.setProperty("chromedriver.chrome.driver","/Users/hss/Documents/Nasruddin mac/Softwares/chromedriver-mac-x64" );	
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");   
		driver.findElement(By.id("inputUsername")).sendKeys("Nasruddin");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
        System.out.println(driver.findElement(By.cssSelector(".error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click(); 
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");			
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john@rsa.com"); 
        driver.findElement(By.xpath("//input[@placeholder='Email']")).clear();
        driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
        driver.findElement(By.xpath("//form/input[3]")).sendKeys("9014313457");
        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println(driver.findElement(By.cssSelector("form p")).getText());         
        driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='chkboxOne']//parent::span")).click();
        driver.findElement(By.xpath("//button[contains(@class,\"submit\")]")).click();
//        driver.findElement(By.cssSelector("//div[@class='forgot-pwd-btn-conainer']/button[1]"));

	}

}
//driver.findElement(By.id("inputUsername")).sendKeys("nasru91221@gmail.com");    This is the 15th  line 
//driver.findElement(By.name("inputPassword")).sendKeys("MDNasruddin@14");		This is the 16th  line 
//driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");					This is the 22nd  line 
//driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("john@rsa.com"); 		This is the 23rd  line
//driver.findElement(By.cssSelector("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();      This is the 31st  line
