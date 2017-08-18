package main.java.model.dbservice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.model.entity.CreditType;

public class InitServises {
    public List<CreditType> getCreditTypes() throws SQLException {
	return getTypesFromDB("select idcredit_types, type from credit_types");
    }

    private List<CreditType> getTypesFromDB(String query) throws SQLException {
	ResultSet resultSet = QueryExecuter.execute(query);
	List<CreditType> result = new ArrayList<>();
	while (resultSet.next()) {
	    result.add(new CreditType(resultSet.getInt(1), resultSet.getString(2)));
	}
	return result;
    }
}
