package com.topzenith.app.topzenith;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;

import com.topzenith.app.topzenith.BaseClass;
import com.topzenith.app.topzenith.LoginPage;

public class LoginTest extends BaseClass {
	private static Logger Logger = LogManager.getLogger(LoginTest.class);

//	public void browserlaunch() throws InterruptedException {
//
//		BaseClass.openbrowser();
//		Thread.sleep(5000);
//		extent.flush();
//
//	}

	@Test
	public void loginprocess() throws InterruptedException {
		BaseClass.openbrowser();
		Thread.sleep(5000);
		extent.flush();
		LoginPage LP = new LoginPage(BaseClass.driver);
		Logger.info("Add  credentials");

		LP.username();
		LP.Password();
		LP.LoginBTW();

		Logger.info("Login done now ");
		Thread.sleep(2000);
		extent.flush();
	}

}