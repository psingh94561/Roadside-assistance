package com.app.service;

import java.util.List;

import com.app.pojos.*;
import com.sun.istack.internal.logging.Logger;

public interface MemberService {
	public Member loginMember(int m_id,String pass);
	public int registerMember(Member mem);
	public Member updateMember(Member mem);
	public Member showProfile(Member mem);
	public Integer addVehicle(Vehicle veh);
	public int logoutMember();
	public Integer addTransaction(Transaction tx);
	public Member getMember(Integer id);
	Integer getBillId(Integer id);
	public List<Partner> getPartnerList(String lat,String lng);

}
