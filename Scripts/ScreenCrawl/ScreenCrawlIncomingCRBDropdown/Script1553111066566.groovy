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

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Mechanical Dashboard Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Mechanical Dashbord/b_Assets'))

WebUI.verifyElementVisible(findTestObject('Mechanical Dashbord/b_Audit Tracking'))

WebUI.verifyElementVisible(findTestObject('Mechanical Dashbord/b_Car Events or Invoice Search'))

WebUI.verifyElementVisible(findTestObject('Mechanical Dashbord/b_Event Tracking'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Loading Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('File Loading/File Name Text Box'))

WebUI.verifyElementVisible(findTestObject('File Loading/Import AAR500 File'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Assignment Option'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementNotVisible(findTestObject('Event Assignment/Processing Notification'), 100)

WebUI.verifyElementVisible(findTestObject('Event Assignment/Events'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Agreement Errors Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Agreement Errors/Drag a Column Header'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Multiple Car Invoice Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Multi-Car Invoice Upload/Load AAR500 File'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Multi-Car Invoice Upload/Multi-Car Invoice Upload'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Multi-Car Invoice Upload/Loaded Files'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Load Cover Sheets Option'))

WebUI.waitForPageLoad(0)

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Manage Invoices Option'))

WebUI.waitForPageLoad(0)

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Rejectable Invoices Option'))

WebUI.waitForPageLoad(0)

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Unsent Rejection Letters Option'))

WebUI.waitForPageLoad(0)

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Exception Dashboard Option'))

WebUI.waitForPageLoad(0)

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.closeBrowser()

