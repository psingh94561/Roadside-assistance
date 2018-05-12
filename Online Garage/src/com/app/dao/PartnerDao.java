package com.app.dao;

import java.util.List;

import com.app.pojos.Partner;

public interface PartnerDao {
	public int registerPartner(Partner prt);
	public Partner loginPartner(int p_id, String password);
	//public List<Partner> getPartnerList(String lat, String lng);
}
