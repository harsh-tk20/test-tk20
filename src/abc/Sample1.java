package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "E:\\selenium\\selenium files\\Drivers\\geckodriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("https://www.google.com");
		driver.quit();
	}

}
