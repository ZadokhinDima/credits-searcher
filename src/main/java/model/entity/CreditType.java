package main.java.model.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CreditType {
    private int id;
    private String name;

    public static CreditType parseTypeFromResultSet(ResultSet resultSet) throws SQLException {
	return new CreditType(resultSet.getInt(1), resultSet.getString(2));
    }

    public CreditType(int id, String name) {
	this.id = id;
	this.name = name;
    }

    public int getId() {
	return id;
    }

    public void setId(int id) {
	this.id = id;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

}
