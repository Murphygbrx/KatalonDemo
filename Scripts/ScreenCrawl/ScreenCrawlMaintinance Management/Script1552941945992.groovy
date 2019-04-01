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

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/Maintenance Management'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('GBMS Home Page/button_Mechanical Dashboard'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Mechanical Dashbord/b_Assets'))

WebUI.verifyElementVisible(findTestObject('Mechanical Dashbord/b_Event Tracking'))

not_run: WebUI.verifyElementVisible(findTestObject('Mechanical Dashbord/b_Audit Tracking'))

WebUI.verifyElementVisible(findTestObject('Mechanical Dashbord/b_Car Events or Invoice Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/Maintenance Management'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('GBMS Home Page/button_Accounting Search'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Accounting Search/Incoming Invoice Search Section'))

WebUI.verifyElementVisible(findTestObject('Accounting Search/Asset Search Section'))

WebUI.verifyElementVisible(findTestObject('Accounting Search/Outgoing Invoiced Search Section'))

WebUI.verifyElementVisible(findTestObject('Accounting Search/Car Search Section'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/Maintenance Management'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('GBMS Home Page/button_Gauge Tables'))

WebUI.switchToWindowUrl('http://tankcar.gbrx.com/#/')

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Tank Car Gauge/Car Mark'))

WebUI.verifyElementVisible(findTestObject('Tank Car Gauge/Car Number (Start)'))

WebUI.verifyElementVisible(findTestObject('Tank Car Gauge/Car Number (End)'))

WebUI.click(findTestObject('Tank Car Gauge/Back to Gbrx.com'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Greenbrier Corp Home/NYSE_logo'))

WebUI.switchToWindowUrl('http://enspire-qa.gbrx.com/Home/Landing')

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/Maintenance Management'), FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

