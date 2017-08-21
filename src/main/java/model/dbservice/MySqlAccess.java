package main.java.model.dbservice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.model.dao.DataAccessObject;
import main.java.model.entity.Credit;
import main.java.model.entity.CreditType;

public class MySqlAccess implements DataAccessObject {

    @Override
    public List<Credit> searchCredits(int type, int prepayment, int expansion) {
	ResultSet resultSet = QueryExecuter.execute(createSearchQuery(type, prepayment, expansion));
	List<Credit> credits = new ArrayList<>();
	try {
	    while (resultSet.next()) {
		credits.add(Credit.parseResultSet(resultSet));
	    }
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	return credits;
    }

    private String createSearchQuery(int type, int prepayment, int expansion) {
	return "select * from search_credits where type_id = " + type + " and (prepayment or not " + prepayment
		+ ") and (expansion or not " + expansion + ")";
    }

    private final String typeQuery = "select idcredit_types, type from credit_types";

    @Override
    public List<CreditType> getTypes() {
	ResultSet resultSet = QueryExecuter.execute(typeQuery);
	List<CreditType> result = new ArrayList<>();
	try {
	    while (resultSet.next()) {
		result.add(CreditType.parseTypeFromResultSet(resultSet));
	    }
	} catch (SQLException e) {
	    e.printStackTrace();
	}
	return result;
    }

}
