package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/mem")
public class TransactionController {

	@RequestMapping("/transaction")
	public String transactionBegin(){
		return "transaction";
	}
}
