package com.qait.com.qait.tatoc_maven;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import com.qait.com.qait.tatoc_maven.BasicCourse;
import com.qait.com.qait.tatoc_maven.CookieHandling;
import com.qait.com.qait.tatoc_maven.Drag;
import com.qait.com.qait.tatoc_maven.FrameDungeon;
import com.qait.com.qait.tatoc_maven.Grid;
import com.qait.com.qait.tatoc_maven.Popup;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TatocTestMaven {

	WebDriver driver;

	BasicCourse obj1 = new BasicCourse();
	Grid obj2 = new Grid();
	FrameDungeon obj3 = new FrameDungeon();
	Drag obj4 = new Drag();
	Popup obj5 = new Popup();
	CookieHandling obj6 = new CookieHandling();
	
	@BeforeClass
	public void launchBrowser() {
		driver = new ChromeDriver();
		driver.get("http://10.0.1.86/tatoc");
		driver.manage().window().maximize();
	}

	@Test(priority = 0)
	public void verifyBasicCourseSelection() {
		obj1.basicCourseSelection(driver);
	}

	@Test(priority = 1)
	public void verifyGreenBoxSelected() {
		obj2.clickBox(driver);
	}

	@Test(priority = 2)
	public void verifyBoxColorSame() {
		obj3.colorMatching(driver);
	}

	@Test(priority = 3)
	public void verifyDragPerformed() {
		obj4.drag(driver);
	}

	@Test(priority = 4)
	public void verifyTextEnteredInPopupWindow() {
		obj5.launchPopupWindow(driver);
	}

	@Test(priority = 5)
	public void verifyCookieAdded() {
		obj6.addCookie(driver);
	}

	@AfterClass
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
}
