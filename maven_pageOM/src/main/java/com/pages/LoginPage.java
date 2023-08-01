package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
WebDriver lpDriver=null;
public LoginPage(WebDriver driver) {
	this.lpDriver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy(id="email")
WebElement username;
//public WebElement getUserName() {
//	return lpDriver.findElement(By.id("email"));
//}
@FindBy(id="password")
WebElement passwrd;
//public WebElement getPassword() {
//	return lpDriver.findElement(By.id("password"));
//}
@FindBy(xpath="//button")
WebElement button;
//public WebElement getLoginButton() {
//	return lpDriver.findElement(By.xpath("//button"));
//}
public void logintoApplication(String uname,String password)
{
//	getUserName().sendKeys(uname);
//	getPassword().sendKeys(password);
//	getLoginButton().click();
     username.sendKeys(uname);
    passwrd.sendKeys(password);
    button.click();
	}

public DashboardPage validLogin() {
	username.sendKeys("kiran@gmail.com");
    passwrd.sendKeys("123456");
    button.click();
    return new DashboardPage(lpDriver);
}
}
