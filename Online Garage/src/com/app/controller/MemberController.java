package com.app.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import com.app.pojos.Address;
import com.app.pojos.Member;
import com.app.pojos.Partner;
import com.app.pojos.Transaction;
import com.app.pojos.Vehicle;
import com.app.service.MemberService;
import com.app.service.PartnerService;
import com.fasterxml.jackson.annotation.JsonFormat.Value;
import com.mysql.jdbc.PreparedStatement.ParseInfo;


@Controller
@RequestMapping("/mem")
public class MemberController{
	@Autowired
	private MemberService memService;
	@Autowired
	private PartnerService p_service;
	
	
	@RequestMapping("/login")
	public String showLoginForm(Member m){
		System.out.println("In login method");
		return "login";
	}
		@RequestMapping(value="/login",method=RequestMethod.POST)
	public String processForm(@Valid Member m,BindingResult res,ModelMap map,RedirectAttributes flash,HttpSession hs)
	{
		System.out.println("In process form");
		try{
			Member m1=memService.loginMember(m.getMemberId(),m.getPassword());
		System.out.println("in controller"+m1);
		/*if(res.hasErrors())
		{
			System.out.println("In login hasError method");
			return "login";
		}*/
		if(m1==null){
			System.out.println("In m1==null ");
			map.addAttribute("msg","Invalid ID ,Email or password");
			return "login";
		}
		else{
			System.out.println("In else.......");
			hs.setAttribute("memberLogin",m);
			flash.addFlashAttribute("memService",m1);
			return "redirect:/details";
			
		}
		}catch(Exception e){
			map.addAttribute("msg","This is an error :"+e.getMessage());
			return "login";
		}
		
	}
	@RequestMapping("/register")
	public String showRegisterForm(Member mem)
	{
		return "register";
	}
	
	@RequestMapping(value="/register",method=RequestMethod.POST)
	public String processRegister(@Valid Member m,BindingResult res,RedirectAttributes flash,ModelMap map,HttpSession hs){
	try{	
		if(res.hasErrors()){
			System.out.println("in register haserror method");
			return "register";
		}
		else{
			System.out.println("in process register method member is"+m+"map is"+map);
			int m_id=memService.registerMember(m);
			System.out.println("in process register method member 2is"+m+"map is"+map);
			System.out.println("id is"+m_id);
			hs.setAttribute("memberRegister",m);
			flash.addFlashAttribute("m_id",Integer.valueOf(m_id));
			System.out.println("before return"+" "+flash);
			return "redirect:/rdetails";
		}
		}catch(Exception e){
			map.addAttribute("errorMsg2","Error in registration process form"+e.getMessage());
			return "register";
		}
	
	}
	
	@RequestMapping("/profile")
	public String showProfile(Member m){
		System.out.println("You are in Profile Page");
		return "profile";
	}
		@RequestMapping("/mem/profile/updateMember")
		public String showUpdateForm(ModelMap map,HttpSession hs){
			System.out.println("You are in show Update Form");
			map.addAttribute("member", memService.getMember(((Member)hs.getAttribute("memberLogin")).getMemberId()));
			return "updateMember";
		}
		
		@RequestMapping(value="/mem/profile/updateMember",method=RequestMethod.POST)
		public String processUpdate(@Valid Member m,BindingResult res,RedirectAttributes flash,ModelMap map,HttpSession hs){
			try{
			if(res.hasErrors()){
				System.out.println("You are in ProcessUpdate hassErrors");
				return "updateMember";
			}
			else{
				System.out.println("you r in processUPdate else part");
				Member m2=(Member)hs.getAttribute("memberLogin");
				m.setMemberId(m2.getMemberId());
				map.addAttribute(m);
				memService.updateMember(m);
				flash.addFlashAttribute("memberUpdate",m);
				return "redirect:/details";
				
		}
			}catch(Exception e){
				map.addAttribute("msg3","Error in update page"+e.getMessage());
				return "updateMember";
			}
			
	}
		@RequestMapping("/addVehicle")
		public String showAddVehicleForm(Vehicle veh){
			return "addVehicle";
		}
		
		@RequestMapping(value="/addVehicle",method=RequestMethod.POST)
		public String processAddVehicle(Vehicle veh,BindingResult res,RedirectAttributes flash,ModelMap map,HttpSession hs){
			/*if(res.hasErrors())
			{
				System.out.println("There is a error in add vehicle");
				return "addVehicle";
			}*/
			{
				Member m = (Member)hs.getAttribute("memberLogin");
				//m.setAlterphone(new BigInteger("12345"));
				System.out.println("You r in procee add vehicle part : "+m.getMemberId());
				veh.setMemberInfo(m);
				Integer vh= memService.addVehicle(veh);
				System.out.println(veh);
				hs.setAttribute("addVehicleSession",veh);
				flash.addFlashAttribute("vehicle_reg",vh);
				return "redirect:/vechicle_detail";
			}
		}
		@RequestMapping("/logout")
		public String logout (HttpSession hs){
			System.out.println("In logout");
			System.out.println("Invalidating session");
			hs.invalidate();
			return "logout";
		}
		
		@RequestMapping("/transaction")
		public String transactionBegin(Transaction tx,ModelMap map){
			Integer bId=(Integer)memService.getBillId(tx.getBill());
			map.addAttribute("BillId",bId+1);
			System.out.println("Bill Id :"+bId);
			System.out.println("You are in Tansaction Controller page");
			
			return "transaction";
		}
		@RequestMapping(value="/transaction",method=RequestMethod.POST)
		public String processtransactionBegin(Transaction tx,
				BindingResult res,
				RedirectAttributes flash,
				Model map,HttpSession hs){
			System.out.println("You are in Tansaction Controller Process page");
			Member m = (Member)hs.getAttribute("memberLogin");
			tx.setMemberInfo(m);
			System.out.println("You are member :"+m.getMemberId());
			Integer tr=memService.addTransaction(tx);
			hs.setAttribute("addTransactionSession",tx);
			flash.addFlashAttribute("TransactionFlash",tr);
			System.out.println("You r in procee add vehicle part : "+m.getMemberId());
			System.out.println("Lat for member :"+tx.getLat()+ " "+tx.getLng());
			hs.setAttribute("client",tx);
			//map.addAttribute("neighbours",memService.getPartnerList(tx.getLat(),tx.getLng()));
			return "redirect:/Bill";
		}
	/*	@RequestMapping(value="/Bill")
		public String billPage(){
			System.out.println("In Bill pagee");
			return "Bill";
		}
		*/
		@RequestMapping(value="/Bill",method=RequestMethod.POST)
		public String getPartnerId(HttpServletRequest req)
		{
			Integer pId=Integer.parseInt(req.getParameter("partnerId"));
			System.out.println("You are in getPartnerId");
			System.out.println(pId);
			return "redirect:/";
		}
		
		@RequestMapping("/getNeighbours")
		public @ResponseBody List<Partner> getNeighbour(@RequestParam String lat, @RequestParam String lng){
			System.out.println(lat+" in controller se hi "+lng);
			return memService.getPartnerList(lat, lng);
		}	
}