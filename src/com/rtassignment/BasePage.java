package com.rtassignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class BasePage {
	
	public static WebDriver driver;

		
	@FindBy(xpath="//input[@name='log']")
	WebElement username;
	
	@FindBy(xpath="//input[@name='pwd']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Log In']")
	WebElement loginBtn;
	

	public void initialization()
	{
		System.setProperty("webdriver.chrome.driver", "C://Users//savita.jadhav//Downloads//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		PageFactory.initElements(driver, this);
		driver.manage().window().maximize();
		driver.get("https://qa.rtcamp.net/activity/");
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://qa.rtcamp.net/activity/");
	}
	
	public void login(String uname, String pwd)
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginBtn.click();
	}
	



}
