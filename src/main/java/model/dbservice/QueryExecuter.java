package main.java.model.dbservice;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QueryExecuter {
    static ResultSet execute(String query) {
	try {
	    Connection connection = DBConnection.getConnection();
	    Statement statement = connection.createStatement();
	    return statement.executeQuery(query);
	} catch (SQLException e) {
	    e.printStackTrace();
	    return null;
	}
    }
}
