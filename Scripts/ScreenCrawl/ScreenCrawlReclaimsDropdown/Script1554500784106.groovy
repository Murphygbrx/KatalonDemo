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

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reclaims Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reclaims Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reclaim Dashboard Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reclaim Dashboard Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Reclaim Dashboard/Reclaim Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reclaims Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reclaims Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Single Car Detail Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Single Car Detail Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Single Car Detail/Car Detail Section'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Single Car Detail/Show Processed Candidates'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reclaims Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reclaims Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Multi-Car Lookup Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Multi-Car Lookup Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Multi-Car Lookup/Details'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Multi-Car Lookup/button_Clear Filter'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reclaims Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reclaims Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Process Candidates Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Process Candidates Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Counter Reclaim Management/Details'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Counter Reclaim Management/Date Range'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Counter Reclaim Management/Equipment'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reclaims Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reclaims Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Produce Counters Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Produce Counters Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Produce Counters/Produce Counters'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reclaims Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reclaims Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Relief Reclaims Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Relief Reclaims Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Relief Reclaims Reconcile/Month Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Reclaims Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Reclaims Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Investigator Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Investigator Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Reclaim Investigator/Investigator Search Modal'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.closeBrowser()

