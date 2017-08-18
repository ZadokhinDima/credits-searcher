package main.java.controller;

import java.sql.SQLException;
import java.util.List;

import main.java.model.dbservice.InitServises;
import main.java.model.entity.CreditType;

public class StartPageLoader {

    public String creditTypesToHtmlSelect() throws SQLException {
	InitServises servises = new InitServises();
	return createOptionsFromList(servises.getCreditTypes());
    }

    private String createOptionsFromList(List<CreditType> types) {
	String result = new String();
	for (CreditType type : types) {
	    result += "<option value = " + type.getId() + ">" + type.getName() + "</option>";
	}
	return result;
    }
}
