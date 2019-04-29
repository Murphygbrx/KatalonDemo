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

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Trips Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Trips Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Trip Search Dropdown Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Trip Search Dropdown Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Trip Search/Trip Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Trips Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Trips Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Unit Train Trips Dropdown Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Unit Train Trips Dropdown Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Unit Train Search/Unit Train Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Trips Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Trips Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Create Trips Dropdown Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Create Trips Dropdown Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Create Trips/Car Details'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Create Trips/Common BOL Data'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Create Trips/Movement'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Trips Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Trips Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Trip Patterns Dropdown Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Trip Patterns Dropdown Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Trip Pattern Search/Trip Pattern Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Trips Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Trips Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/In-Progress Trips Dropdown Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/In-Progress Trips Dropdown Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/In-Progress Trips/In-Progress Trips'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.closeBrowser()

