import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://enspire-qa.gbrx.com/')

WebUI.waitForPageLoad(0)

WebUI.sendKeys(findTestObject('Login Page/Username Field'), GlobalVariable.ScreenCrawlUser)

WebUI.sendKeys(findTestObject('Login Page/Password Field'), GlobalVariable.ScreenCrawlPass)

WebUI.click(findTestObject('Login Page/Login Button'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('GBMS Home Page/Assets'), 0)

WebUI.click(findTestObject('GBMS Home Page/button_Report Repository'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Report Repository/Report Repository Search Header'), 0)

WebUI.takeScreenshot('C:\\Users\\patrick.murphy\\Katalon Studio\\KatalonDemo\\Screenshots\\ReportRepoScreen.jpg', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('GBMS Home Page/Assets'), 0)

WebUI.click(findTestObject('GBMS Home Page/button_Shop Forms'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementPresent(findTestObject(null), 0)

WebUI.takeScreenshot()

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('GBMS Home Page/Assets'), 0)

WebUI.click(findTestObject('GBMS Home Page/button_Customer Portal'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementPresent(findTestObject(null), 0)

WebUI.takeScreenshot()

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('GBMS Home Page/Assets'), 0)

WebUI.closeBrowser()

