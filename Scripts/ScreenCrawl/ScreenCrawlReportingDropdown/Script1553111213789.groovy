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

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reporting Dashboard Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reporting Dashboard Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Reporting Dashboard/Report Parameters'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reports Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reports Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Reports/Reports'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Dashboards Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Dashboards Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Dashboard/Reporting Dashboard'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Saved Reports Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Saved Reports Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Saved Reports/Saved Reports'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/AAR Car Type Codes'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/AAR Car Type Codes'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('AAR Car Type Code Search/AAR Car Type Code Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Manage Reports Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Manage Reports Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Report Management/Report Management'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Report Repository Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Report Repository Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Report Repository Search/Report Repository Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Report Images Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Report Images Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Report Images/Report Images'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Report Themes Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Report Themes Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Report Themes/Report Themes'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Plant Dashboard Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Plant Dashboard Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Plant Dashboard/Select Company'))

WebUI.verifyElementVisible(findTestObject('Plant Dashboard/Latest Trips by Car Mark'))

WebUI.verifyElementVisible(findTestObject('Plant Dashboard/Search Trips by PO Number'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reporting Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Problem Trip Dashboard Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Problem Trip Dashboard Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Trip Problem Overview/Car Status by Car Mark'))

WebUI.verifyElementVisible(findTestObject('Trip Problem Overview/Search Trips by PO Number'))

WebUI.verifyElementVisible(findTestObject('Trip Problem Overview/Trip Problems'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.closeBrowser()

