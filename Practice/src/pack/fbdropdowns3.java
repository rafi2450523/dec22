package pack;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners(listners.TestngListners.class)
public class fbdropdowns3 {
	@Test
	public void selectDDValues()throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement month_dropdown=driver.findElement(By.id("month"));
		Select month_dd=new Select(month_dropdown);
		List<WebElement> month_list=month_dd.getOptions();
		int total_months=month_list.size();
		Assert.assertEquals(total_months, 13);
		System.out.println("total months count is "+ total_months);
		for (WebElement ele : month_list) {
			String month_name = ele.getText();
			System.out.println("months are "+month_name);
			
		}
		
		driver.quit();
	}

}
