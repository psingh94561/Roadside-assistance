package com.app.dao;

import java.util.List;

import com.app.pojos.Member;
import com.app.pojos.Transaction;
import com.app.pojos.Vehicle;

public interface MemberDao {
	public Member loginMember(int m_id,String pass);
	public int registerMember(Member mem);
	public Member updateMember(Member mem);
	public Integer addVehicle(Vehicle veh);
	public Member showProfile(Member mem);
	public int logout();
	public Integer addTransaction(Transaction tx);
	Member getMember(Integer id);
	public List<com.app.pojos.Partner> getPartnerList(String lat, String lng);
	Integer getBillId(Integer id);
}
