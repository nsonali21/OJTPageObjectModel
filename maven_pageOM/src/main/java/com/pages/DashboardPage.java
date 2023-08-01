package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
WebDriver dpDriver=null;

	public DashboardPage(WebDriver driver) {
	this.dpDriver=driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h3")
	List<WebElement> courses;
	
	public ArrayList<String> verifyCourses() {
		ArrayList<String> actualCourses=new ArrayList<String>();
		for(WebElement course:courses) {
			String text=course.getText();
			actualCourses.add(text);
			}
		return actualCourses;
	}
	
	public boolean verifyCourses1() {
		ArrayList<String> actualCourses=new ArrayList<String>();
		for(WebElement course:courses) {
			String text=course.getText();
			actualCourses.add(text);
			}
		ArrayList<String> expectedCourses=new ArrayList<String>();
		expectedCourses.add("Selenium");
		expectedCourses.add("Java / J2EE");
		expectedCourses.add("Python");
		expectedCourses.add("Php");
		
		if(actualCourses.equals(expectedCourses))
			return true;
		else
			return false;
		
	}

}
