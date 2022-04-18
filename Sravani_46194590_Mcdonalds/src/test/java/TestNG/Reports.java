package TestNG;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import Demo.DemoLog;
import io.github.bonigarcia.wdm.WebDriverManager;
public class Reports {public static WebDriver driver;
static By Log=By.xpath("//*[@id=\"headerComp\"]/div/div[2]/div[2]/div[2]");
static By logpwd=By.xpath("/html/body/ngb-modal-window/div/div/app-login-modal/div/div[1]/div/div[2]/div");
static By mobile=By.xpath("/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div/div[1]/input");
static By password=By.xpath("//*[@id='password']");
static By continuepage=By.xpath("/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div/div[4]/div[3]/button");


public static ExtentHtmlReporter obj1=new ExtentHtmlReporter("./Reports/extentreport1.html");
public static ExtentReports obj2=new ExtentReports();
@BeforeClass
public static void setDriver()
{
DemoLog.log(2);
obj2.attachReporter(obj1);
ExtentTest obj3=obj2.createTest("Opening the Test");
obj3.log(Status.INFO,"Opening the browser");
try
{
DemoLog.log(1);
WebDriverManager.chromedriver().setup();
driver = new ChromeDriver();
obj3.log(Status.PASS,"The browser open");
}
catch(Exception e)
{
DemoLog.log(3);
System.out.println("Before Report block");
obj3.log(Status.FAIL,"The browser does not opened");
}
obj2.flush();
}
@Test
public static void Mcd()
{
DemoLog.log(2);
obj2.attachReporter(obj1);
ExtentTest obj4=obj2.createTest("Opening the Application and login");
obj4.log(Status.INFO,"Opening the Mc Delivery site");
try
{
DemoLog.log(1);
driver.get("https://www.mcdelivery.co.in/");
driver.manage().window().maximize();
obj4.log(Status.PASS,"The application opened in the browser");
try {
Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
}
catch(AssertionError e) {
DemoLog.log(4);
}
Screenshot.screenShot(1);
Thread.sleep(3000);
obj4.log(Status.PASS,"The application navigated to the next page");
String filepath=System.getProperty("user.dir")+"//ScreenShots//Screenshot1.png";
obj4.addScreenCaptureFromPath(filepath);
}
catch(Exception e)
{
DemoLog.log(5);
System.out.println("Browser");
obj4.log(Status.FAIL,"The applcation failed");
}try {
DemoLog.log(1);
driver.findElement(Log).click();
Thread.sleep(2000);
obj4.log(Status.PASS,"The login button is clicked");
try {
Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
}
catch(AssertionError e) {
DemoLog.log(4);
}
Thread.sleep(3000);
obj4.log(Status.PASS,"The application navigated to the next page");
}
catch(Exception e)
{
DemoLog.log(5);
System.out.println("Login Button");
obj4.log(Status.FAIL,"The login button not clicked");
}try {
DemoLog.log(1);
driver.findElement(logpwd).click();
Thread.sleep(2000);
obj4.log(Status.PASS,"The login page is clicked");
try {
Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
}
catch(AssertionError e) {
DemoLog.log(4);
}
Thread.sleep(3000);
obj4.log(Status.PASS,"The application navigated to the next step");
}
catch(Exception e)
{
DemoLog.log(5);
System.out.println("Login page");
obj4.log(Status.FAIL,"The login page not clicked");
}try {
DemoLog.log(1);
driver.findElement(mobile).sendKeys("7330766643");
Thread.sleep(2000);
obj4.log(Status.PASS,"The Mobile number entered");
try {
Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
}
catch(AssertionError e) {
DemoLog.log(4);
}
Thread.sleep(3000);
obj4.log(Status.PASS,"The application navigated to the next step");
}
catch(Exception e)
{
DemoLog.log(5);
System.out.println("Mobile Number");
obj4.log(Status.FAIL,"The mobile number is not entered");
}try {
DemoLog.log(1);
driver.findElement(password).sendKeys("Reddy@123");
Thread.sleep(2000);
obj4.log(Status.PASS,"The password entered");
try {
Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
}
catch(AssertionError e) {
DemoLog.log(4);
}
Screenshot.screenShot(2);
Thread.sleep(3000);
obj4.log(Status.PASS,"The application navigated to the next step");
String filepath=System.getProperty("user.dir")+"//ScreenShots//Screenshot2.png";
obj4.addScreenCaptureFromPath(filepath);
}
catch(Exception e)
{
DemoLog.log(5);
System.out.println("Password");
obj4.log(Status.FAIL,"The password is not entered");
}try {
DemoLog.log(1);
driver.findElement(continuepage).click();
Thread.sleep(2000);
obj4.log(Status.PASS,"The continue button is clicked");
try {
Assert.assertEquals(driver.getTitle(), "McDonald's - Order McDonald's Burger & Wraps online|McDelivery");
}
catch(AssertionError e) {
DemoLog.log(4);
}
Thread.sleep(3000);
obj4.log(Status.PASS,"The application navigated to the next step");
}
catch(Exception e)
{
DemoLog.log(5);
System.out.println("Continue page");
obj4.log(Status.FAIL,"The continue button is not clicked");
}
}
}