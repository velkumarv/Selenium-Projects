package Seleniumassess;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.leafground.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));

driver.findElement(By.xpath("//li[@class='ui-menuitem-submenu'][3]")).click();
driver.findElement(By.xpath("//li[@id='menuform:m_input']")).click();
driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("velkumar");
driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys(", India");
boolean enabled = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isEnabled();
System.out.println("Textbox is Enabled="+enabled);
driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
String text = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getText();
System.out.println(text);
driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("vel@gmail.com",Keys.TAB);
driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys("iam velkumar from thoothkudi");
//driver.findElement(By.xpath("//span[@class='ql-picker-label']")).click();
driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
//driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
//driver.findElement(By.xpath("//li[@class='ui-autocomplete-item ui-autocomplete-list-item ui-corner-all'][2]")).click();


		
		
	}

}
