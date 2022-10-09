package week2day1assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesManager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Muthu");
		driver.findElement(By.id("lastNameField")).sendKeys("Meena");
		driver.findElement(By.className("smallSubmit")).click();
		String name= driver.findElement(By.id("viewContact_firstName_sp")).getText();
		System.out.println(name);
		String title = driver.getTitle();
		System.out.println(title);
		
		
		
		
		
		
		
		
		
		
	}

}
