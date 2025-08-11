package com.knot.Banking.DaoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.knot.Banking.Dao.CustomerDao;
import com.knot.Banking.Model.AccountModel;
import com.knot.Banking.Model.CardModel;
import com.knot.Banking.Model.CustomerModel;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

@Repository
public class CustomerDaoImpl implements CustomerDao {
    @Autowired
    EntityManager entityManager;

    @Override
    public CustomerModel getCustomerById(String id) {
        StringBuilder sb= new StringBuilder();
        sb.append("select * from customer where customer_id =:id");
        Query qry= entityManager.createNativeQuery(sb.toString(), CustomerModel.class);
        qry.setParameter("id", id);
        @SuppressWarnings("unchecked")
		List<CustomerModel> result= qry.getResultList();
        if (result.isEmpty()) {
            return null; // No customer found
        } else {
            return result.get(0);
        }
    }

    @Override
    public CardModel getCardByCustomerId(Integer accountId) {
        StringBuilder sb= new StringBuilder();
        sb.append("select * from cards where account_id =:id");
        Query qry= entityManager.createNativeQuery(sb.toString(), CardModel.class);
        qry.setParameter("id", accountId);
        @SuppressWarnings("unchecked")
		List<CardModel> result= qry.getResultList();
        if (result.isEmpty()) {
            return null; // No card found
        } else {
            return result.get(0);
        }
    }

    @Override
    public AccountModel getAccountByCustomerId(String id) {
        StringBuilder sb= new StringBuilder();
        sb.append("select * from accounts where customer_id =:id");
        Query qry= entityManager.createNativeQuery(sb.toString(), AccountModel.class);
        qry.setParameter("id", id);
        @SuppressWarnings("unchecked")
		List<AccountModel> result= qry.getResultList();
        if (result.isEmpty()) {
            return null; // No account found
        } else {
            return result.get(0);
        }
    }

    @Override
    public List<CustomerModel> getAllCustomers() {
        StringBuilder sb= new StringBuilder();
        sb.append("select * from customer");
        Query qry= entityManager.createNativeQuery(sb.toString(), CustomerModel.class);
        @SuppressWarnings("unchecked")
        List<CustomerModel> customerModels= qry.getResultList();
        return customerModels;
    }
}