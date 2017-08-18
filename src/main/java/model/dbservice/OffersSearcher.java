package main.java.model.dbservice;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import main.java.model.entity.Credit;

public class OffersSearcher {

    public List<Credit> search(int type, int prepayment, int expansion) throws SQLException {
	ResultSet resultSet = QueryExecuter.execute(createQuery(type, prepayment, expansion));
	List<Credit> credits = new ArrayList<>();
	while (resultSet.next()) {
	    credits.add(Credit.parseResultSet(resultSet));
	}
	return credits;

    }

    private String createQuery(int type, int prepayment, int expansion) {
	return "select * from search_credits where type_id = " + type + " and (prepayment or not " + prepayment
		+ ") and (expansion or not " + expansion + ")";
    }
}
