package com.app.service;

import com.app.dao.TransactionDao;
import com.app.pojos.Transaction;

public class TransactionServiceImp implements TransactionService{

	TransactionDao tDao;
	@Override
	public int placeOrder(Transaction ts) {
		System.out.println("in Transaction service");
		return placeOrder(ts);
	}

}
