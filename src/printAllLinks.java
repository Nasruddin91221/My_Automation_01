import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.github.bonigarcia.wdm.WebDriverManager;

public class printAllLinks {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://3.129.83.61/sandbox/");
		driver.findElement(By.cssSelector("input[formcontrolname='email']")).sendKeys("admin@gmail.com");
        driver.findElement(By.cssSelector("button.btn.w-100.sign_btn.text-light")).click();
        Thread.sleep(3000);
        driver.findElement(By.cssSelector("input[formcontrolname='password']")).sendKeys("Admin@123");
        driver.findElement(By.cssSelector("button.btn.w-100.sign_btn.text-light")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/button[1]")).click();
        driver.findElement(By.xpath("//ul[@class='dropdown-menu show']//a[@class='dropdown-item cursor-pointer'][normalize-space()='Create Invoice']")).click();

//        List<WebElement> alltags =
//        		driver.findElements(By.tagName("div"));
//        System.out.println("Total tags are :"+alltags.size());
//        
//        for (int i=0 ;i<alltags.size() ;i++);{
//        	
//			int i = 0;
////			System.out.println("Create invoice page Links are: "+ alltags.get(i).getAttribute(""));
//        }
//        
//        		WebElement m =driver.findElement(By.xpath("//tbody/tr[1]/td[8]/div[1]/button[1]"));
//        	      System.out.println("The three dots are working: "+ m.getText());
//        	      for (String t : linkTexts) {							
//        				driver.findElement(By.linkText(t)).click();					
//        				if (driver.getTitle().equals(underConsTitle)) {							
//        	                System.out.println("\"" + t + "\""								
//        	                        + " is under construction.");			
//        	            } else {			
//        	                System.out.println("\"" + t + "\""								
//        	                        + " is working.");			
//        	            }		
//        				driver.navigate().back();			
//        	        }		
//        				driver.quit();			
//        	    }		
//        	
//
// 
//}


//List<WebElement> linkElements = driver.findElements(By.tagName("a"));							
//String[] linkTexts = new String[linkElements.size()];							
//	int					i = 0;					
//
//	//extract the link texts of each link element		
//	for (WebElement e : linkElements) {							
//	linkTexts[i] = e.getText();							
//	i++;			
//}		
//
//	//test each link		
//	for (String t : linkTexts) {							
//	driver.findElement(By.linkText(t)).click();					
//	if (driver.getTitle().equals(underConsTitle)) {							
//        System.out.println("\"" + t + "\""								
//                + " is under construction.");			
//    } else {			
//        System.out.println("\"" + t + "\""								
//                + " is working.");			
//    }		
//	driver.navigate().back();			
//}		
//	driver.quit();			
}		
}