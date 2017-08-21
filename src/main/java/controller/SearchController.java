package main.java.controller;

import java.sql.SQLException;
import java.util.List;

import main.java.model.dao.DataAccessObject;
import main.java.model.dbservice.MySqlAccess;
import main.java.model.entity.Credit;

public class SearchController {

    private int type;
    private int prepayment, expansion;

    private DataAccessObject myDataAccessObject;

    public SearchController(int type, int prepayment, int expansion) {
	myDataAccessObject = new MySqlAccess();
	this.type = type;
	this.prepayment = prepayment;
	this.expansion = expansion;
    }

    public String addSearchResults() throws SQLException {
	String result = "";
	List<Credit> credits = myDataAccessObject.searchCredits(type, prepayment, expansion);
	if (credits.size() == 0) {
	    return "<h3> Вибачте, не знайшлось жодного кредиту по вашому запиту </h3>";
	}
	for (Credit credit : credits) {
	    result += addCreditItemToHttm(credit);
	}
	return result;
    }

    public String addCreditItemToHttm(Credit credit) {
	String result = "";
	result += "<h3>Банк: " + credit.getBank().getName() + "</h3>";
	result += "<h3>Тип кредиту: " + credit.getType().getName() + "</h3>";
	result += "<h3>Процентна ставка: " + credit.getInterestRate() + "% </h3>";
	result += "<h4>";
	if (credit.hasPrepayment()) {
	    result += "Із можливістю  дострокового погашення. ";
	}
	if (credit.hasExpansion()) {
	    result += "Із можливістю  розширення кредитної лінії.";
	}
	result += "</h4>";
	return result + "</br>";
    }
}
