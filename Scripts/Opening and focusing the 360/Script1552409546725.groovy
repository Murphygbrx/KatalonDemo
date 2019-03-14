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

WebUI.verifyElementPresent(findTestObject('GBMS Home Page/Maintenance Management'), 0)

WebUI.click(findTestObject('GBMS Home Page/button_Mechanical Dashboard'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('360 New Window/AOK 354450 Link'))

WebUI.waitForPageLoad(0)

WebUI.click(findTestObject('360 New Window/AssetView 360 Button'))

WebUI.switchToWindowUrl('http://enspire-qa.gbrx.com/AssetManagement/Asset/AssetView360Popout/141375977')

WebUI.waitForPageLoad(0)

WebUI.verifyElementPresent(findTestObject('360 New Window/h3_Asset Information'), 0)

WebUI.waitForElementVisible(findTestObject('360 New Window/label_Asset Mark'), 0)

WebUI.takeScreenshot('C:\\Users\\patrick.murphy\\Katalon Studio\\KatalonDemo\\Screenshots\\360View.jpg', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeWindowUrl('http://enspire-qa.gbrx.com/AssetManagement/Asset/AssetView360Popout/141375977')

WebUI.switchToDefaultContent()

WebUI.verifyElementPresent(findTestObject('360 New Window/AssetView 360 Button'), 0)

WebUI.takeScreenshot('C:\\Users\\patrick.murphy\\Katalon Studio\\KatalonDemo\\Screenshots\\360BacktoHome.jpg', FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

