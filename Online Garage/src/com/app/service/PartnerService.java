package com.app.service;

import com.app.pojos.Partner;

public interface PartnerService {
	public Partner loginPartner(int p_id,String password);
	public int registerPartner(Partner prt);
	//public Object getPartnerList(String lat, String lng);
	
}
