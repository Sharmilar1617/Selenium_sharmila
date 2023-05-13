package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get( "http://leaftaps.com/opentaps");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
       
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText( "Create Lead")).click();
		driver.findElement(By.className("inputBox")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("S");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("A");
		WebElement sourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec=new Select(sourceDD);
		sec.selectByIndex(4);
		WebElement marketcompaignDD1 = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec1=new Select(marketcompaignDD1);
		sec1.selectByVisibleText("Automobile");
		WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select sec2=new Select(ownership);
		sec2.selectByValue("OWN_CCORP");
		driver.findElement(By.className("smallSubmit")).click();
		 String title=driver.getTitle();
			System.out.println(title);
		
	}

}
