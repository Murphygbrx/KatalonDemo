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

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Assets Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Assets Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/AssetView 360 Search Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/AssetView 360 Search Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/AssetView 360 Search/Asset Mark'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Assets Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Assets Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Manage Asset Groups Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Manage Asset Groups Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Asset Group Search/Asset Group Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Assets Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Assets Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Car Spec. Bulk Update Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Car Spec. Bulk Update Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Car Spec. Bulk Entry - Asset Search/Car Specification Bulk Edit Asset Selection'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Assets Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Assets Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Clone Asset Specifications Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Clone Asset Specifications Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Clone Car Find Assets/Asset to Clone'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Assets Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Assets Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Car Information Search Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Car Information Search Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Car Information Search/Asset Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Assets Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Assets Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Add Notes  Documents Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Add Notes  Documents Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Add Notes  Documents to Assets/Add Notes  Documents to Assets'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Assets Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Assets Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Shop Forms Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Shop Forms Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Shop Reference Documents/Shop Reference Documents'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.closeBrowser()

