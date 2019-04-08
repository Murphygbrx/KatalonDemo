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

not_run: WebUI.click(findTestObject('GBMS Home Page/button_Payables'))

not_run: WebUI.waitForPageLoad(0)

not_run: WebUI.switchToWindowTitle('cc.gbrx.com')

not_run: WebUI.delay(3)

not_run: WebUI.back()

not_run: WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.click(findTestObject('GBMS Home Page/button_Reclaim Validation'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Reclaim Validation Candidate Dashboard/Search Section'), 0)

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.click(findTestObject('GBMS Home Page/button_Reporting Dashboard'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Reporting Dashboard/Report Parameters'), 0)

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.click(findTestObject('GBMS Home Page/button_Claims Management'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Process Claims/Search Parameters'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Process Claims/ReceiptReporting Dates'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Process Claims/Claim Search Results'), 0)

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.closeBrowser()

