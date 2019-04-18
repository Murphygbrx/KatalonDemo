import groovy.sql.GroovyResultSetExtension


try {
	CustomKeywords.'com.database.DemoMySql.connectDB'('tst-ensp-sql06\\gbx17', 'sa', 'boulder.1', 'Enspire')
	def rs2 = CustomKeywords.'com.database.DemoMySql.executeQuery'('select AppPassword, ModUser, ModDate, PasswordResetDate from ref.AppUsers where usercode = \'Halliburton/glen.key\'')
	
	
	String initialPW = rs2[0].AppPassword
	String initialModuser = rs2[0].ModUser
	
	println("password: " + initialPW + " ModUser " + initialModuser)
	
	//CustomKeywords.'com.database.DemoMySql.connectDB'('dev-ensp-sql06\\gbx17qa', 'sa', 'boulder.1', 'Enspire')
	//
	//def rows = CustomKeywords.'com.database.DemoMySql.executeQuery'('select * from ref.AppUsers where usercode = \'GMS/glentest1gms\'')
	//
	////def data = TestDataFactory.findTestData('Data Files/GetAppPassword')
	//println('data of rows: ' + rows.get(0))
} finally {

	CustomKeywords.'com.database.DemoMySql.closeDatabaseConnection'()
}

