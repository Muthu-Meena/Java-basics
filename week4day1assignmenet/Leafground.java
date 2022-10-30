package week4day1assignmenet;

import java.util.List;
import java.util.Set;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leafground {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> windowHandles1 = driver.getWindowHandles();
		System.out.println(windowHandles1.size());
		List<String>window=new ArrayList<String>(windowHandles1);
		driver.switchTo().window(window.get(1));
		System.out.println(driver.getTitle());
		driver.switchTo().window(window.get(2));
		driver.close();
		driver.switchTo().window(window.get(0));
		driver.close();
		
		System.out.println(driver.getTitle());
		
		
		
	}

}
