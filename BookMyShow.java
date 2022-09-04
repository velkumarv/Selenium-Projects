package Seleniumassess;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://in.bookmyshow.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//span[text()='Chennai']")).click();
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		String str="chennai";
		if (currentUrl.contains(str)) {
			System.out.println("Current page is based on chennai");
			}
		driver.findElement(By.xpath("//span[@id='4']")).click();
		driver.findElement(By.xpath("//a[text()='The Legend (UA)']")).click();
		
		
		
		
		
	}

}
