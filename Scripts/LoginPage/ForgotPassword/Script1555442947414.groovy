import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.sql.ResultSet as ResultSet
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://enspire-ua.gbrx.com/')

WebUI.deleteAllCookies()

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Login Page/Forgot Password Link'))

WebUI.waitForPageLoad(0)

WebUI.focus(findTestObject('Object Repository/Login Page/PasswordModal'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/Login Page/ForgotPassword_UserName'), 'halliburton/glen.key')

WebUI.click(findTestObject('Object Repository/Login Page/button_Reset Password'))

WebUI.delay(1)

WebUI.verifyElementVisible(findTestObject('Object Repository/Login Page/ForgotPasswordText'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.closeBrowser()

