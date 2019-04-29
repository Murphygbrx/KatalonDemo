package com.gbrx.common.ui
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class LoginHelper {

	/**
	 * Login by passing url and creds
	 * 
	 * @return
	 */
	@Keyword
	public void Login(String URL, String UserCode, String Password) {
		WebUI.openBrowser(URL)
		WebUI.waitForPageLoad(0)

		WebUI.deleteAllCookies()

		WebUI.maximizeWindow()

		WebUI.waitForElementVisible(findTestObject('Object Repository/Login Page/Login Button'), 0)

		WebUI.sendKeys(findTestObject('Object Repository/Login Page/Username Field'), UserCode)
		WebUI.sendKeys(findTestObject('Object Repository/Login Page/Password Field'), Password)
		WebUI.click(findTestObject('Object Repository/Login Page/Login Button'))

		WebUI.waitForPageLoad(0)

		WebUI.verifyElementVisible(findTestObject('GBMS Home Page/Assets'), FailureHandling.STOP_ON_FAILURE)

		//		CustomKeywords.'com.gbrx.common.ui.PageHelper.clickElement'(findTestObject('GBMS Home Page/button_Mechanical Dashboard'))
	}


	/**
	 * Nav back to the home page and logout
	 * 
	 */
	public void Logout() {

		WebUI.click(findTestObject('Object Repository/Login Page/img'))
		WebUI.click(findTestObject('Object Repository/Login Page/a_Logout'))

		WebUI.closeBrowser()
	}
}