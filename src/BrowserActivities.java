
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test; 



@Test
public class BrowserActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("chromedriver.chrome.driver", "/Users/hss/Documents/Nasruddin mac/Softwares/driver/chromedriver-mac-x64/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.navigate().to("http://rahulshettyacedamy.com/#/index/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.getTitle();
		driver.getCurrentUrl();
		 
		

	}

}
