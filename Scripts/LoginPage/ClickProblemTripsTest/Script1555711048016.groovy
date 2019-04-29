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

CustomKeywords.'com.database.DemoMySql.connectDB'('tst-ensp-sql06\\gbx17', 'sa', 'boulder.1', 'Enspire')
def rs2 = CustomKeywords.'com.database.DemoMySql.executeQuery'("select AppPassword from ref.AppUsers where usercode = 'GMS/glen.key'")

CustomKeywords.'com.database.DemoMySql.closeDatabaseConnection'()

String initialPW = rs2[0].AppPassword

CustomKeywords.'com.gbrx.common.ui.LoginHelper.Login'('enspire-ua.gbrx.com', 'GMS/glen.key', initialPW)


//Object Repository/GBMS Home Page/button_Mechanical Dashboard
WebUI.waitForPageLoad(10)

//CustomKeywords.'com.gbrx.common.ui.PageHelper.clickElement'('Object Repository/GBMS Home Page/button_Problem Trips')
WebUI.click(findTestObject('Object Repository/GBMS Home Page/button_Mechanical Dashboard'))

WebUI.closeBrowser()


