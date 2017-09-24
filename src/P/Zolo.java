package P;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;





public class Zolo {

	public static void main(String[] args) throws Exception {
		
	
		
	FirefoxDriver driver = new FirefoxDriver();
	
	driver.manage().window().maximize();
	
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	
	driver.navigate().to("http://52.201.90.154:9002");
	
	driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[3]/a")).click();
	  
	Thread.sleep(5000);
	
	driver.findElement(By.xpath(".//*[@id='signin']/div/div[2]/div[2]/form/div[1]/input")).sendKeys("7777777027");
	
	driver.findElement(By.xpath(".//*[@id='signin']/div/div[2]/div[2]/form/div[2]/input")).sendKeys("123456");
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath(".//*[@id='signin']/div/div[2]/div[2]/form/div[4]/div/input")).click();
	
	Thread.sleep(6000);
   	
    WebElement el = driver.findElement(By.xpath(".//*[@id='searchBar']"));
   
    el.sendKeys("electronic");
    
    Thread.sleep(7000);
    
    driver.findElement(By.xpath("html/body/ul/li[3]/div")).click();
    
    WebElement el1 = driver.findElement(By.xpath(".//*[@id='content']/div/div[1]/div/form/div/div[1]/select"));
    
    el1.click();
    
    Select sl = new Select(el1);
    
    Thread.sleep(8000);
    
   sl.selectByVisibleText("5000 - 8000");
   
   Thread.sleep(5000);
    
    WebElement el2 = driver.findElement(By.xpath(".//*[@id='content']/div/div[1]/div/form/div/div[2]/select"));
    
    el2.click();
    
    Select sl1 = new Select(el2);
    
    Thread.sleep(5000);
    
    sl1.selectByVisibleText("2 Sharing");
    
   Thread.sleep(5000);
    
    WebElement el3 = driver.findElement(By.xpath(".//*[@id='gender-drpdwn']"));
    
    el3.click();
    
    Select sl2 = new Select(el3);
    
    Thread.sleep(5000);
    
    sl2.selectByVisibleText("Men");
    
   
    Thread.sleep(9000);
    
    System.out.println(driver.getTitle());
    
    driver.findElement(By.xpath(".//*[@id='content']/div/div[3]/div[2]/div[1]/div[1]/a")).click();
    
    Thread.sleep(4000);
    
    WebElement el4 = driver.findElement(By.xpath(".//*[@id='content']/div[3]/div[2]/div/div/div[2]/div/div[1]/div/form/div[2]/p[2]/select"));
  
    el4.click();
    
    Select sl3 = new Select(el4);
    
    Thread.sleep(6000);
    
    sl3.selectByVisibleText("10 am - 11 am");
    
    Thread.sleep(6000);
    
    driver.findElement(By.xpath(".//*[@id='content']/div[3]/div[2]/div/div/div[2]/div/div[2]/div")).click();
    
    
    
	
	
	
	
   
	
	
	
	
	
	 
	

	}

}
