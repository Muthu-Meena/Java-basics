package week2day1assign;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

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
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Muthu");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Meena");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Saravanan");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Physics");
driver.findElement(By.id("createLeadForm_description")).sendKeys("Good Girl");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("meena1961997@gmail.com");
driver.findElement(By.className("smallSubmit")).click();
String title = driver.getTitle();
System.out.println(title);



		




		




	}

}
