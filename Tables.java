package Seleniumassess;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.leafground.com/table.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	List<WebElement> countryName = driver.findElements(By.xpath("(//table[@role='grid'])[2]//tr/td[2]"));
	int size = countryName.size();
	System.out.println("size"+size);
	
	for (int i = 0; i <size; i++) {
		String text = countryName.get(i).getText();
		//System.out.println(i+" "+text);
	}
	
	
	
	//print names in dynamic xpath
//List<WebElement> name = driver.findElements(By.xpath("//table[@role='grid'][1]//tr/td[1]"));
//int size = name.size();
//System.out.println("no of Names"+" : "+size);
//
//for (int i = 1; i <=size; i++) {
//	String text = driver.findElement(By.xpath("//table[@role='grid']//tr["+i+"]/td[1]")).getText();
//	String text1 = driver.findElement(By.xpath("//table[@role='grid']//tr["+i+"]/td[2]")).getText();
//	System.out.println(i+" "+"countryName:"+text+"          "+"Name: "+text1);
//}
System.out.println("countryNames"+" : "+size);
for (int i = 1; i <=size; i++) {
String text1 = driver.findElement(By.xpath("//table[@role='grid']//tr["+i+"]/td["+i+"]")).getText();
System.out.println(i+" "+text1);
}
}

	
	
	

	
}
