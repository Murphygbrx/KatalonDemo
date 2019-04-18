import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.sql.ResultSet

import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

try {
/*	CustomKeywords.'com.database.DemoMySql.connectDB'('tst-ensp-sql06\\gbx17', 'sa', 'boulder.1', 'Enspire')
	ResultSet rowsa = CustomKeywords.'com.database.DemoMySql.executeQuery'('select * from ref.AppUsers where usercode = \'Halliburton/glen.key\'')
	String initialPW = rowsa.getString("AppPassword")
	String initialModuser = rowsa.getString("ModUser")
	
	println("password: " + initialPW + " ModUser " + initialModuser)*/
	
	
	WebUI.openBrowser('')
	
	WebUI.navigateToUrl('https://enspire-ua.gbrx.com/')
	
	WebUI.click(findTestObject('Login Page/Forgot Password Link'))
	
	WebUI.waitForPageLoad(0)
	
	WebUI.focus(findTestObject('Login Page/PasswordModal'), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.setText(findTestObject('Login Page/ForgotPassword_UserName'), 'halliburton/glen.key')
	
	WebUI.click(findTestObject('Login Page/button_Reset Password'))
	
	WebUI.focus(findTestObject('Login Page/Welcome Div'), FailureHandling.STOP_ON_FAILURE)
	
	WebUI.focus(findTestObject('Login Page/ForgotPasswordLoginText'))
	
	//WebUI.verifyTextPresent('Please check your email for instructions on how to log in to your account.', false)
/*	def rowsb = CustomKeywords.'com.database.DemoMySql.executeQuery'('select * from ref.AppUsers where usercode = \'Halliburton/glen.key\'')
	
	println("Rowsa " + rowsa.get(0))
	println("Rowsb " + rowsb.get(0))*/
} finally {

	CustomKeywords.'com.database.DemoMySql.closeDatabaseConnection'()
	
	WebUI.closeBrowser()
}

