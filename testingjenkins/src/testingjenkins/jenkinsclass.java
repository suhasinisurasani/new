package testingjenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class jenkinsclass
{
	 public static WebDriver driver=null;
	 public static WebDriverWait Wait=null;
	 
	 @Test
	public void display()
	{
   System.setProperty("webdriver.chrome.driver","C:\\Selenium-new-workspace\\Selenium\\drivers\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().deleteAllCookies();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      Wait=new WebDriverWait(driver,10);
      driver.get("http://demo.automationtesting.in/Alerts.html");
       driver.findElement(By.xpath("//a[@href='#CancelTab']")).click();
      driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
      Alert alert=driver.switchTo().alert();
     System.out.println( alert.getText());
      alert.accept();
	}
}
