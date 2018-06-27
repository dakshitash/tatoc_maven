package com.qait.com.qait.tatoc_maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BasicCourse {
	
	public void basicCourseSelection(WebDriver driver) {

		driver.findElement(By.linkText("Basic Course")).click();
		String expectedUrl = "http://10.0.1.86/tatoc/basic/grid/gate";
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(expectedUrl, actualUrl);
	}

}
