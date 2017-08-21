package main.java.controller;

import java.sql.SQLException;
import java.util.List;

import main.java.model.dao.DataAccessObject;
import main.java.model.dbservice.MySqlAccess;
import main.java.model.entity.CreditType;

public class StartPageLoader {

    public String creditTypesToHtmlSelect() throws SQLException {
	DataAccessObject myDataAccessObject = new MySqlAccess();
	return createOptionsFromList(myDataAccessObject.getTypes());
    }

    private String createOptionsFromList(List<CreditType> types) {
	String result = new String();
	for (CreditType type : types) {
	    result += "<option value = " + type.getId() + ">" + type.getName() + "</option>";
	}
	return result;
    }
}
