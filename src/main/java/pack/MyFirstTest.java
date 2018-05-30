package pack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class MyFirstTest {
	
	
	@Test
	public void homepage()
	{
		
		System.setProperty("webdriver.chrome.driver", "F:\\Aselenium\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.facebook.com");
		
		String title = driver.getTitle();
		
		
		System.out.println(title);
		
		String expected="Facebook – log in or sign up";
		
		//Assert.assertEquals(title, expected ,"tile is not verified");
		
		driver.findElement(By.id("email")).sendKeys("abcdefgh");
		
		driver.findElement(By.id("pass")).sendKeys("1234567896652");
		
		driver.findElement(By.id("loginbutton")).click();
		
		driver.close();
	
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
