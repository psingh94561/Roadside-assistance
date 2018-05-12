package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MappingController {

	@RequestMapping(value="/{path}")
	String universalHandler(@PathVariable("path") String mypath)
	{
		System.out.println("in universal handler" +mypath);
		return mypath;
	}
}
