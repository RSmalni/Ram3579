package in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Student {
	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Ram\\driver\\chromedriver.exe");
    WebDriver d = new ChromeDriver();
    d.get("http://greenstech.in/selenium-course-content.html");
    WebElement game = d.findElement(By.xpath("//div[@id='heading20']"));
    game.click();
    //Thread.sleep(3000);
    WebElement text = d.findElement(By.xpath("(//a[@title='Interview Questions'])[6]"));
    text.click();
    
    
    		
    		
    
   
    
	}

}
