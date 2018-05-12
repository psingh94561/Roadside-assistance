package com.app.dao;

import com.app.pojos.Transaction;

public interface TransactionDao {
	public int placeOrder(Transaction ts);
}
