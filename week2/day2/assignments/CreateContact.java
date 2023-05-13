package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateContact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get( "http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText( "Create Contact")).click();
		driver.manage().timeouts().implicitlyWait(150,TimeUnit.SECONDS);
		driver.findElement(By.id("firstNameField")).sendKeys("Sharmi");
		driver.findElement(By.id("lastNameField")).sendKeys("S");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Information Technology");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']")).sendKeys("NewYork");
		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important note");
		driver.findElement(By.name("submitButton")).click();
		System.out.println("The title of the current page is:" +driver.getTitle());   
	
		
		
	
		

	}

}
