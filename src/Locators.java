import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("chromedriver.chrome.driver","/Users/hss/Documents/Nasruddin mac/Softwares/chromedriver-mac-x64" );
		WebDriver driver= new ChromeDriver();
		driver.get("http://3.129.83.61/sandbox/");
		driver.findElement(By.cssSelector("input[formcontrolname='email']")).sendKeys("admin@gmail.com");
        driver.findElement(By.cssSelector("button.btn.w-100.sign_btn.text-light")).click();
//        driver.get("http://3.129.83.61/sandbox/password");
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys("Admin@123");
        driver.findElement(By.cssSelector("button.btn.w-100.sign_btn.text-light")).click();



		
	}

}
 