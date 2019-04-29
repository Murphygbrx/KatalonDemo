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

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Accounting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Accounting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Accounting Search Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Accounting Search/Incoming Invoice Search Section'))

WebUI.verifyElementVisible(findTestObject('Accounting Search/Asset Search Section'))

WebUI.verifyElementVisible(findTestObject('Accounting Search/Outgoing Invoiced Search Section'))

WebUI.verifyElementVisible(findTestObject('Accounting Search/Car Search Section'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Accounting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Accounting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Approve AP Option'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Approve AP/Invoices Grid'), 0)

WebUI.verifyElementVisible(findTestObject('Approve AP/Legend Img'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Accounting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Accounting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/On Hold Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('On Hold/Invoices On Hold Header'))

WebUI.verifyElementVisible(findTestObject('On Hold/Un-Hold'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Accounting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Accounting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Approve AR Option'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('Approve AR/AR Approvable Table'), 0)

WebUI.waitForElementVisible(findTestObject('Approve AR/Invoice Response AR Approvable Table'), 0)

WebUI.verifyElementVisible(findTestObject('Approve AR/CBA AR Approvable'))

WebUI.verifyElementVisible(findTestObject('Approve AR/Legend Img'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Accounting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Accounting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Extra Charges Option'))

WebUI.waitForElementVisible(findTestObject('Extra Charges/Extra Charges Table'), 0)

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Extra Charges/Extra Charges Header'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Accounting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Accounting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Invoiceable Option'))

WebUI.verifyElementVisible(findTestObject('Invoiceable/Loading...'))

WebUI.waitForElementVisible(findTestObject('Invoiceable/Pending Invoices Table'), 0)

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Invoiceable/Pending Invoices Header'))

WebUI.verifyElementVisible(findTestObject('Invoiceable/Legend Img'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Accounting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Accounting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Integration System Errors Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Integration System Errors/Integration System Errors Header'))

WebUI.verifyElementVisible(findTestObject('Integration System Errors/System Erros Table'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Accounting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Accounting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Outgoing Invoice Search Option'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Outgoing Invoice Search/Outgoing Invoice Search Header'))

WebUI.verifyElementVisible(findTestObject('Outgoing Invoice Search/Search Results Header'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page Dropdowns/Accounting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Accounting Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Invoice Response Progress Option'))

WebUI.waitForElementVisible(findTestObject('Invoice Responses In Progress/Invoice Response Progress Table'), 0)

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('Invoice Responses In Progress/Invoice Responses In Progress Header'))

WebUI.verifyElementVisible(findTestObject('Invoice Responses In Progress/Outgoing CBA Letters Header'))

WebUI.back()

WebUI.waitForPageLoad(0)

WebUI.verifyElementVisible(findTestObject('GBMS Home Page/GBX Logo'))

WebUI.closeBrowser()

