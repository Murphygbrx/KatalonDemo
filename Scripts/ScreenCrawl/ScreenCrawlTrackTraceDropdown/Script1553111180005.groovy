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

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Track Trace Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Track Trace Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Car Status'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Car Status'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Car Status/Enter Cars to See Status'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Track Trace Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Track Trace Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Search Existing CLMs Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Search Existing CLMs Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('CLM Search/CLM Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Track Trace Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Track Trace Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Trace List Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Trace List Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Tracing Project Search/Tracing Project Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Track Trace Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Track Trace Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/CLM Request Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/CLM Request Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/CLM Requests/25 Most Recent CLM Requests'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Track Trace Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Track Trace Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Current Location Map Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Current Location Map Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Current Location Map/Current Location Search'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Current Location Map/Pin Color Modes'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Track Trace Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Track Trace Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Car History Map Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Car History Map Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Car History Map/Car Search'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Car History Map/Legend'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.closeBrowser()

