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

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Yard Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Yard Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Company Hierarchy Definition Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Company Hierarchy Definition Option'))

WebUI.waitForPageLoad(0)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/AssetView 360 Search/Asset Mark'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Yard Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Yard Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Facility Management Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Facility Management Option'))

WebUI.waitForPageLoad(0)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/AssetView 360 Search/Asset Mark'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Yard Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Yard Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Car Inventory Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Car Inventory Option'))

WebUI.waitForPageLoad(0)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/AssetView 360 Search/Asset Mark'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Yard Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Yard Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Track View Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Track View Option'))

WebUI.waitForPageLoad(0)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/AssetView 360 Search/Asset Mark'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Yard Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Yard Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Switch Fees Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Switch Lists Option'))

WebUI.waitForPageLoad(0)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/AssetView 360 Search/Asset Mark'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Yard Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Yard Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Attribute Admin Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Attribute Admin Option'))

WebUI.waitForPageLoad(0)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/AssetView 360 Search/Asset Mark'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Yard Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Yard Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Rules Admin Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Rules Admin Option'))

WebUI.waitForPageLoad(0)

not_run: WebUI.verifyElementVisible(findTestObject('Object Repository/AssetView 360 Search/Asset Mark'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.closeBrowser()

