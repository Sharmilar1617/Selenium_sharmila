package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobiles",Keys.ENTER);
		List<WebElement> prices = driver.findElements(By.className("a-price-whole")); 
		List<Integer> list=new ArrayList<>();
		for (WebElement each : prices) {
			String text2=each.getText();
			String withoutcomma = text2.replaceAll(",","");
			if(!withoutcomma.isEmpty()) {
				int price2=Integer.parseInt(withoutcomma);
				list.add(price2);
			}}
			System.out.println(list);
			Collections.sort(list);
			Integer price2 = list.get(0);
			System.out.println(price2);
		}
		
	
		}

	


