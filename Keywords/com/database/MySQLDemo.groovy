package com.database

//import java.sql.ResultSet
//import java.sql.Statement

import com.kms.katalon.core.annotation.Keyword
//import com.mysql.jdbc.Connection

import groovy.sql.Sql
import com.mysql.jdbc.*

public class DemoMySql {
	//private static Connection connection = null;

	/**
	 * Open and return a connection to database
	 * @param dataFile absolute file path
	 * @return an instance of java.sql.Connection
	 */


	//Establishing a connection to the DataBase

	@Keyword

	def connectDB(String url, String dbname, String port, String username, String password){
		//Load driver class for your specific database type

		//String conn = "jdbc:sqlserver://localhost;databaseName=Umler"


		//if(connection != null && !connection.isClosed()){
		//connection.close()
		//}

		//connection = DriverManager.getConnection(conn, username, password)

		//return connection
		
		println("starting the connect")
		//jdbc:sqlserver://dev-ensp-sql06\gbx17qa;databaseName=Enspire
		def sql = Sql.newInstance("jdbc:sqlserver://dev-ensp-sql06\\gbx17qa;databaseName=Enspire", "sa","boulder.1", "com.mysql.jdbc.Driver")


		def row = sql.firstRow("select AppPassword from Ref.Appusers where UserCode = 'gms/glentest1gms'")

		println('row is ' + row.apppassword)

		return row.apppassword

	}

	/**
	 * execute a SQL query on database
	 * @param queryString SQL query string
	 * @return a reference to returned data collection, an instance of java.sql.ResultSet
	 */

	//Executing the constructed Query and Saving results in resultset

	@Keyword

	def executeQuery(String queryString) {

		//Statement stm = connection.createStatement()

		//ResultSet rs = stm.executeQuery(queryString)

		//return rs

	}

	//Closing the connection

	@Keyword

	def closeDatabaseConnection() {

		if(connection != null && !connection.isClosed()){
			connection.close()
		}

		connection = null

	}

	/**
	 * Execute non-query (usually INSERT/UPDATE/DELETE/COUNT/SUM...) on database
	 * @param queryString a SQL statement
	 * @return single value result of SQL statement
	 */

	@Keyword

	def execute(String queryString) {

		//Statement stm = connection.createStatement()

		boolean result = stm.execute(queryString)

		return result

	}

}
