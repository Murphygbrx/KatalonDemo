package com.database

//import java.sql.ResultSet
//import java.sql.Statement

import java.sql.ResultSet

import com.kms.katalon.core.annotation.Keyword
import com.mysql.jdbc.*

import groovy.sql.Sql

public class DemoMySql {
	private static Sql sql = null;

	/**
	 * Open and return a connection to database
	 * @param dataFile absolute file path
	 * @return an instance of java.sql.Connection
	 */


	//Establishing a connection to the DataBase

	@Keyword

	def connectDB(String dbconnection, String username, String password, String schema){
		//Load driver class for your specific database type

		//sql = Sql.newInstance("jdbc:sqlserver://dev-ensp-sql06\\gbx17qa;databaseName=Enspire", "sa","boulder.1", "com.mysql.jdbc.Driver")
		sql = Sql.newInstance("jdbc:sqlserver://" + dbconnection + ";databaseName=" + schema, username, password, "com.mysql.jdbc.Driver")

		return sql
	}

	/**
	 * execute a SQL query on database
	 * @param queryString SQL query string
	 * @return a reference to returned data collection, an instance of java.sql.ResultSet
	 */

	//Executing the constructed Query and Saving results in resultset

	@Keyword

	def executeQuery(String queryString) {

		def rows = sql.rows(queryString)

		return rows

	}

	//Closing the connection

	@Keyword

	def closeDatabaseConnection() {

		if(sql != null){
			sql.close()
		}

		sql = null

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
