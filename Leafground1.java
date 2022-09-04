package Seleniumassess;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));

		driver.findElement(By.xpath("//li[@class='ui-menuitem-submenu'][3]")).click();
		driver.findElement(By.xpath("//li[@id='menuform:m_input']")).click();
		
	//Add name
		driver.findElement(By.xpath("//input[@id='j_idt88:name']")).sendKeys("velkumar");
		
	//Append text
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).sendKeys(", India");
		
	//Textbox is enabled
		boolean enabled = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt93']")).isEnabled();
		System.out.println("Textbox is Enabled="+enabled);
		
	//clear text
		driver.findElement(By.xpath("//input[@id='j_idt88:j_idt95']")).clear();
	
	//Retrieve the typed text.
	String attribute = driver.findElement(By.xpath("//input[@id='j_idt88:j_idt97']")).getAttribute("value");
	System.out.println("Attributevalue:-"+attribute);
	
	//Type email and Tab.
	driver.findElement(By.xpath("//input[@id='j_idt88:j_idt99']")).sendKeys("vel@gmail.com",Keys.TAB);
	
	//Type about yourself
	driver.findElement(By.xpath("//textarea[@id='j_idt88:j_idt101']")).sendKeys("iam velkumar from thoothkudi");
	
	//confirm Error message
	driver.findElement(By.xpath("//input[@id='j_idt106:thisform:age']")).sendKeys(Keys.ENTER);
	boolean displayed = driver.findElement(By.xpath("//span[text()='Age is mandatory']")).isDisplayed();
	System.out.println("is Displayed:- "+displayed);
	
	//label position changing
	Point location = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
	System.out.println("Location"+location);
	driver.findElement(By.xpath("//input[@name='j_idt106:float-input']")).click();
	Point location1 = driver.findElement(By.xpath("//label[text()='Username']")).getLocation();
	System.out.println("Newocation"+location1);
	if (location!=location1) {
		System.out.println("Label postion is changed");
	} else {
		System.out.println("Label postion is not changed");
	}
	Thread.sleep(5000);
	driver.findElement(By.xpath("//ul[contains(@class,'ui-autocomplete-multiple')]")).sendKeys("Vel");
	Thread.sleep(5000);
	List<WebElement> name = driver.findElements(By.xpath("//ul[contains(@class,'ui-autocomplete-list ui-widget')]/li"));
	//for (int i = 0; i < name.size(); i++) {
		name.get(2).click();
		System.out.println(name);
	
	
	}

}
