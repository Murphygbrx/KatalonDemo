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

WebUI.verifyElementPresent(findTestObject('Login Page/Enspire Image'), 0)

WebUI.sendKeys(findTestObject('Login Page/Username Field'), 'glentest1gms')

WebUI.sendKeys(findTestObject('Login Page/Password Field'), '12345678')

WebUI.click(findTestObject('Login Page/Login Button'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Incoming CRB Dropdown'))

WebUI.click(findTestObject('GBMS Home Page Dropdowns/Loading Option'))

WebUI.waitForPageLoad(0)

WebUI.waitForElementVisible(findTestObject('File Loading/Import AAR500 File'), 0)

WebUI.verifyElementNotHasAttribute(findTestObject('File Loading/td_TestFile.txt'), 'TestFile.txt', 0)

WebUI.selectOptionByValue(findTestObject('File Loading/Non-Approved Shops Option'), 'NonApprovedShop', true)

WebUI.sendKeys(findTestObject('File Loading/File Name Text Box'), 'C:\\Users\\patrick.murphy\\Desktop\\Notepad\\TestFile.txt')

WebUI.click(findTestObject('Object Repository/input_File Name_ctl00MainContentrpAAR500FileImportcmdUpload'))

WebUI.waitForPageLoad(0)

WebUI.verifyElementText(findTestObject('Page_AAR500 File Import/td_TestFile.txt'), 'TestFile.txt')

WebUI.takeScreenshot('C:\\Users\\patrick.murphy\\Katalon Studio\\KatalonDemo\\Screenshots\\ItemUploaded.jpg', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/input_Error_ctl00MainContentrpAAR500SubmissionsgvActiveAAR500Submissionscell0_0imgDeleteAAR500Submission'))

WebUI.waitForAlert(0)

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/input_Incoming CRB_ctl00HomeButton'))

WebUI.closeBrowser()

WebUI.waitForPageLoad(0)

