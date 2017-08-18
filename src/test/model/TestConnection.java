package test.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.junit.Assert;
import org.junit.Test;

import main.java.model.dbservice.DBConnection;

public class TestConnection {

    @Test
    public void test() {
	try {
	    Connection connection = DBConnection.getConnection();
	    Statement statement = connection.createStatement();
	    ResultSet rSet = statement.executeQuery("select test()");
	    rSet.next();
	    Assert.assertTrue(rSet.getInt(1) == 1);
	} catch (Exception e) {
	    e.printStackTrace();
	    Assert.fail();
	}
    }

}
