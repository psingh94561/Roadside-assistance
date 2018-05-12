package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.PartnerDao;
import com.app.pojos.Partner;

@Service(value="partner_service")
@Transactional
public class PartnerServiceImp implements PartnerService{

	@Autowired
	PartnerDao pdao;
	
	@Override
	
	public int registerPartner(Partner prt) {
		System.out.println("You are in register Partner Service Implementation : "+prt);
		return pdao.registerPartner(prt);
	}
	@Override
	public Partner loginPartner(int p_id,String password) {
		// TODO Auto-generated method stub
		return pdao.loginPartner(p_id,password);
	}
/*	@Override
	public Object getPartnerList(String lat, String lng) {
		// TODO Auto-generated method stub
		return pdao.getPartnerList(lat, lng);
	}
*/
}
