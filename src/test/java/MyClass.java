import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyClass {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Work\\Automation\\Installs\\chromedriver.exe");
	 
	  WebDriver driver = new ChromeDriver();
	  driver.get("http://google.com");
	  driver.quit();
  }
}
