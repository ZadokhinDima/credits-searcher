package main.java.model.dao;

import java.util.List;

import main.java.model.entity.Credit;
import main.java.model.entity.CreditType;

public interface DataAccessObject {

    List<Credit> searchCredits(int type, int prepayment, int expansion);

    List<CreditType> getTypes();

    void close();
}
