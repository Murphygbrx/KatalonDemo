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

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/Visibility  Logistics'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('GBMS Home Page/button_Problem Trips'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Trip Problem Overview/Car Status by Car Mark'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Trip Problem Overview/Search Trips by PO Number'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Trip Problem Overview/Trip Problems'), 0)

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/Visibility  Logistics'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('GBMS Home Page/button_CLM Search'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Object Repository/CLM Search/CLM Search'), 0)

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/Visibility  Logistics'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('GBMS Home Page/button_Trace Projects'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Tracing Project Search/Tracing Project Search'), 0)

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/Visibility  Logistics'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('GBMS Home Page/button_Trip Search'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Trip Search/Trip Search'), 0)

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/Visibility  Logistics'), FailureHandling.STOP_ON_FAILURE)

'User does not have perms for this button. Page loads a blank page and error is thrown on the back end. '
WebUI.click(findTestObject('GBMS Home Page/button_Yard Dashboard'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject(null), 0)

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/Visibility  Logistics'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

