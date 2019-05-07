package customerportal
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

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When




class democommodity {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am logged in as a Customer Portal User")
	def CustomerPortalLogin() {

		WebUI.openBrowser('')
		WebUI.deleteAllCookies()
		WebUI.maximizeWindow()

		WebUI.navigateToUrl('http://enspire-qa.gbrx.com/')

		WebUI.setText(findTestObject('Page_/input_Username_UserCode'), 'GMS/customer.portal')


		WebUI.setEncryptedText(findTestObject('Page_/input_Password_Password'), 'RigbBhfdqODKcAsiUrg+1Q==')

		WebUI.click(findTestObject('Page_/input_Password_btn btn-primary'))
		println "CustomerPortalLogin"
	}

	@When("I am accessing Out of Service cars from Out of service widget")
	def OutOfServiceWidget() {

		WebUI.click(findTestObject('Page_Customer Portal Dashboard/a_All Out Of Service Cars7'))
	}

	@Then("I should see the Commodity Column")
	def CommodityColumnCheck() {

		WebUI.setText(findTestObject('Page_Event Tracking/input_Contracted Commodity_tablesorter-filter'), '')

		WebUI.waitForElementVisible(findTestObject('Page_Event Tracking/input_Contracted Commodity_tablesorter-filter'), 0)
	}
}