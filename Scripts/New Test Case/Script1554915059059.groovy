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

WebUI.navigateToUrl('https://enspire-ua.gbrx.com/')

WebUI.setText(findTestObject('Object Repository/Test1/Page_/input_Username_UserCode'), 'GMS/divya.test')

WebUI.setEncryptedText(findTestObject('Object Repository/Test1/Page_/input_Password_Password'), 'RigbBhfdqODKcAsiUrg+1Q==')

WebUI.click(findTestObject('Object Repository/Test1/Page_/input_Password_btn btn-primary'))

WebUI.click(findTestObject('Object Repository/Test1/Page_GMS Home/a_Admin'))

WebUI.click(findTestObject('Object Repository/Test1/Page_GMS Home/a_Help'))

WebUI.click(findTestObject('Object Repository/Test1/Page_GMS Home/a_Landing Page'))

WebUI.click(findTestObject('Object Repository/Test1/Page_Greenbrier Management Services/a_Logout'))

WebUI.closeBrowser()

