package practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C extends B {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");

		String actualTitle = driver.getTitle();
		String expectedTitle ="googles";


		if (actualTitle.equalsIgnoreCase(expectedTitle)) {
			System.out.println("pass");
		}

		else {
			System.out.println("Fail");
		}
	}
}
