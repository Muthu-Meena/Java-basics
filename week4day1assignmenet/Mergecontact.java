package week4day1assignmenet;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Mergecontact {

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
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println(windowHandles1.size());
		List<String>window1=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(window1.get(1));
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
		driver.switchTo().window(window1.get(0));
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		System.out.println(windowHandles2.size());
		List<String>window2=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(window2.get(1));
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[3]")).click();
		driver.switchTo().window(window2.get(0));
		
		driver.findElement(By.linkText("Merge")).click();
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		

		
		
		
		
		
	
	}

}
