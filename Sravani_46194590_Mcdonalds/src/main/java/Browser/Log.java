package Browser;

import org.openqa.selenium.By;

public class Log extends Browser {
static By Log=By.xpath("//*[@id=\"headerComp\"]/div/div[2]/div[2]/div[2]");
static By logpwd=By.xpath("/html/body/ngb-modal-window/div/div/app-login-modal/div/div[1]/div/div[2]/div");
static By mobile=By.xpath("/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div/div[1]/input");
static By password=By.xpath("//*[@id='password']");
static By continuepage=By.xpath("/html/body/ngb-modal-window/div/div/app-login-modal/div/div[2]/form/div/div[4]/div[3]/button");



public static void Log() throws Exception {
	driver.findElement(Log).click();
	Thread.sleep(2000);
}
public static void userlogin()throws Exception  {
	
	driver.findElement(logpwd).click();
	Thread.sleep(2000);
}

public static void mobilenumber() throws Exception {
	driver.findElement(mobile).sendKeys("7330766643");
	Thread.sleep(2000);
}
public static void password() throws Exception {
	driver.findElement(password).sendKeys("Reddy@123");
	Thread.sleep(2000);
}
public static void clickcontinue() throws Exception {
	driver.findElement(continuepage).click();
	Thread.sleep(2000);
}
}
