package in;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Ram\\driver\\chromedriver.exe");
		WebDriver v = new ChromeDriver();
		
		v.get("http://www.greenstechnologys.com/");
		WebElement user = v.findElement(By.xpath("//div[contains(@id,'art')]"));
		String text = user.getText();
		System.out.println(text);
		

}
}