package Seleniumassess;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExceptionHandle {
	static ChromeDriver driver;
	public static void main(String[] args) {
		try {
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver=new ChromeDriver();
			driver.get("http://leaftaps.com/opentaps/control/main");
		} catch (Exception e) {
			
			String text = driver.findElement(By.xpath("//span[text()='No internet']")).getText();
		
			System.out.println();
		

		
		}
	}
}


