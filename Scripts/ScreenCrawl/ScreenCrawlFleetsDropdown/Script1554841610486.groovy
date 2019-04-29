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

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Fleets Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Fleets Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Master Fleets Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Master Fleets Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Master Fleet Search/Master Fleet Search Clear Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Fleets Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Fleets Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Fleets Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Fleets Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Fleet Search/Fleet Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Fleets Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Fleets Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Cars Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Cars Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Car Search/Car Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Fleets Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Fleets Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Batch Car AddEdit Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Batch Car AddEdit Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Batch Car AddEdit/Step 1 Specify Car List'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Batch Car AddEdit/Step 2 Specify Car Attributes'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Batch Car AddEdit/Step 3 Review Cars Before Posting'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Fleets Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Fleets Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Storage Records Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Storage Records Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Storage Record Search/Storage Record Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Fleets Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Fleets Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Shop Records Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Shop Records Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Shop Record Search/Shop Record Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.closeBrowser()

