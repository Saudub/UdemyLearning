package completeFlow;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class MyFlow {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		System.out.println("Enter the Password");
//		Scanner sc =new Scanner(System.in);
//		String pswd = sc.next();
//		System.out.println("Enter the Username");
//		String Username =sc.next();
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(2000));
		
		driver.get("https://www.microsoft.com/en-us/surface");
		driver.manage().window().maximize();
		String PageTitle = driver.getTitle();
		String expectedPagetTitle ="Microsoft Surface Copilot+ PCs, Laptops, 2-in-1s, Computers & All-in-Ones | Microsoft Surface";
		try {
		Assert.assertEquals(PageTitle, expectedPagetTitle);
	    System.out.println("Page Title is Matching");
		}	
		
		catch(AssertionError e){
			System.out.println("Page Title is not matching "+ e);
		}
		
		driver.findElement(By.cssSelector("div[id='mectrl_headerPicture']")).click();
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//reports//"+"Screenshot"+".png"));
		driver.getWindowHandles();
		driver.getCurrentUrl();
		

		
	
		
		
		}
	}
