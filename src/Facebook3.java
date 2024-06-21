import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("chromedriver.chrome.driver","/Users/hss/Documents/Nasruddin mac/Softwares/chromedriver-mac-x64" );
		WebDriver driver= new ChromeDriver();          
		//   /html/body/header/div//button[1]/following-sibling::button [1]		 
		//   /html/body/header/div//button[1]()- This is a parent to child     traver
		//   /following-sibling::button [1]	   - This is a Sibling to sibling  traver
		 driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		 System.out.println(driver.findElement(By.xpath("/html/body/header/div//button[1]/following-sibling::button [1]")).getText());
		 System.out.println(driver.findElement(By.xpath("/html/body/header/div//button[2]")).getText());


	}

}
