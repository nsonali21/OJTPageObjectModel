package com.tests;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.pages.DashboardPage;
import com.pages.LoginPage;

public class LoginTest {
	WebDriver driver=null;
	LoginPage lp=null;
	DashboardPage dp=null;
/*	@Test
	public void test_01() {
		System.setProperty("webdriver.chrome.driver", "C:/TestData/chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("file:///C:/javabykiran-Selenium-Softwares/Offline%20Website/index.html"); 
		driver.manage().window().maximize();

		LoginPage lp=new LoginPage(driver);
		lp.logintoApplication("kiran@gmail.com", "123456");
		
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");


	}*/
	
	@BeforeSuite
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:/TestData/chromedriver.exe");
		driver=new ChromeDriver();

		driver.get("file:///C:/javabykiran-Selenium-Softwares/Offline%20Website/index.html"); 
		driver.manage().window().maximize();

		lp=new LoginPage(driver);
		
	}
	@Test
	public void test_01() {
		dp=lp.validLogin();
		Assert.assertEquals(driver.getTitle(), "JavaByKiran | Dashboard");
	}
	
	@Test
	public void test_02() {
		ArrayList<String> expectedCourses=new ArrayList<String>();
		expectedCourses.add("Selenium");
		expectedCourses.add("Java / J2EE");
		expectedCourses.add("Python");
		expectedCourses.add("Php");
		
		DashboardPage dp=new DashboardPage(driver);
		
		ArrayList<String> actualCourses=dp.verifyCourses();
		Assert.assertEquals(actualCourses, expectedCourses);
		
	}
	@Test
	public void test_03() {
//		DashboardPage dp=new DashboardPage(driver);
		boolean flag=dp.verifyCourses1();
		Assert.assertTrue(flag);
	}


}
