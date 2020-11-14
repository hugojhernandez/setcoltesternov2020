package seleniumejemlo;

import java.io.File;
import java.nio.file.Paths;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclas1 {

	public static void main(String[] args) {
		System.out.println("ejemplo");
		String exePath = Paths.get("").toAbsolutePath().toString() + File.separator + "drivers" + File.separator;// setera el path de nuestro driver
		System.setProperty("webdriver.chrome.driver", exePath + "chromedriver.exe");//identificando l .exe para driver
		WebDriver driver = new ChromeDriver();//creacion en tiemp de ejecución  Chromedriver
		driver.get("https://www.cooltesters.com/");
	}

}
