
package Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Browser {
public static WebDriver driver;

public static void setDriver()
{
WebDriverManager.chromedriver().setup();
driver=new ChromeDriver();
driver.manage().window().maximize();
}
public static void getUrl(String string) throws Exception
{
driver.get(string);
Thread.sleep(3000);
}

public static void closeBrowser() {
try {
driver.quit();
}
catch(Exception e) {
System.out.println("Browser not closing");
}
}//driver.findElement(signUp).click();

}

