package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;


//import org.springframework.web.servlet.mvc.SimpleFormController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Partner;
import com.app.service.PartnerService;

@Controller
@RequestMapping("/partner")
public class PatnerController{

	@Autowired
	private PartnerService p_service;
	
	@RequestMapping("/pLogin")
	public String showPrtLoginForm(Partner prt){
		System.out.println("You are in Partner Login form");
		return "pLogin";
	}
	
	
	@RequestMapping(value="/pLogin",method=RequestMethod.POST)
	public String prtLoginProcessForm(@Valid Partner prt,BindingResult res,RedirectAttributes flash,ModelMap map,HttpSession hs){
		
		System.out.println("You are in Partner Login Process Form");
		Partner pt=p_service.loginPartner(prt.getPartnerId(), prt.getPassword());
		System.out.println("In Partner login Controller"+pt);
		if(pt==null){
			System.out.println("In pt==null");
			map.addAttribute("msg","Invalid ID and password");
			return "pLogin";
		}
		{
			System.out.println("In else part of login partner.....");
			hs.setAttribute("partnerLogin",prt);
			flash.addFlashAttribute("partnerLoginFlash",pt);
			return "redirect:/pLoginDetails";	
		}
		
	}
	@RequestMapping("/pRegister")
	public String showRegisterationForm(Partner prt){
		System.out.println("You are P_Register form");
		return "pRegister";
	}
	@ModelAttribute
	@RequestMapping(value="/pRegister",method=RequestMethod.POST)
	public String processForm(@Valid Partner p,BindingResult res,ModelMap map,RedirectAttributes flash,HttpSession hs){
		
		if(res.hasErrors()){
			System.out.println("You are in hasError page");
			return "pRegister";
		}
		else
		{
			
			System.out.println("In P_Registration Process Form");
			System.out.println("In Partner Controller"+p);
			int p_id=p_service.registerPartner(p);
			System.out.println("Register ID is"+p_id);
			hs.setAttribute("pServiceRegisterSession",p);
			flash.addFlashAttribute("pServiceRegisterFlashId",Integer.valueOf(p_id));
			System.out.println("You r redirected before return ");
			return "pDetails";
		}
	
}
}
