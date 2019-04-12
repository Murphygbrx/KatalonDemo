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

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Rates Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Rates Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Freight Invoices Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Freight Invoices Option'))

WebUI.waitForAlert(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.acceptAlert(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForAlert(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.acceptAlert(FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Freight Invoice Search/Freight Invoice Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Rates Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Rates Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Leases Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Leases Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Lease Search/Lease Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Rates Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Rates Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Demurrage Detention Rates Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Demurrage Detention Rates Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Demurrage Rate Search/Demurrage Rate Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Rates Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Rates Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Freight Rates Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Freight Rates Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Freight Rate Search/Freight Rate Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Rates Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Rates Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Freight Rate Carriers Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Freight Rate Carriers Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Freight Rate Carrier Search/Freight Rate Carrier Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Rates Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Rates Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Fuel Surcharge Rates Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Fuel Surcharge Rates Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Fuel Surcharge Rate Search/Fuel Surcharge Rate Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Rates Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Rates Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Fuel Surcharge Carriers Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Fuel Surcharge Carriers Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Fuel Surcharge Search/Fuel Surcharge Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Rates Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Rates Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/STCC Groups Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/STCC Groups Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/STCC Group Search/STCC Group Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Rates Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Rates Dropdown'))

WebUI.verifyElementClickable(findTestObject('GBMS Home Page Dropdowns/Switch Fees Option'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Switch Fees Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Switch Fee Search/Switch Fee Search'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.closeBrowser()

