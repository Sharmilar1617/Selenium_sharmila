package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[contains(text(),'account')]")).click();
		driver.findElement(By.name("firstname")).sendKeys("Sharmi");
		driver.findElement(By.name("lastname")).sendKeys("R");
		driver.findElement(By.name("reg_email__")).sendKeys("1234567890");
		driver.findElement(By.id("password_step_input")).sendKeys("1234");
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("05");
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Oct");
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1994");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
	
		
		
		
		
		
		

	}

}
