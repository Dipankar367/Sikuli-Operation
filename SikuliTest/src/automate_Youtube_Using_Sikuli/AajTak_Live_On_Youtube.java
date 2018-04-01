package automate_Youtube_Using_Sikuli;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class AajTak_Live_On_Youtube {
	
	/*********finally success to automate youtube in my own scenario********/

	public static void main(String[] args) throws FindFailed, Exception {

		System.setProperty("webdriver.chrome.driver", "‪D:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://youtube.com");
		
		Screen sc = new Screen();
		
		Pattern sbox = new Pattern("E:\\Selenium\\sikuli_img\\searchbox.PNG");
		Pattern scbtn = new Pattern("E:\\Selenium\\sikuli_img\\searchbtn.PNG");
		Pattern clk = new Pattern("E:\\Selenium\\sikuli_img\\aajtak.PNG");
		
		
		sc.type(sbox, "aaj tak live"); // type in youtube search box
		sc.click(scbtn); // click search button
		Thread.sleep(5000);
		sc.click(clk); //click the given content
		

	}

}
