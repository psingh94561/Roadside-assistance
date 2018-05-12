package com.app.service;

import java.util.List;

import org.hibernate.validator.internal.constraintvalidators.EmailValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.MemberDao;
import com.app.dao.PartnerDao;
import com.app.pojos.Member;
import com.app.pojos.Partner;
import com.app.pojos.Transaction;
import com.app.pojos.Vehicle;

@Service("mem_service")
@Transactional
public class MemberServiceImp implements MemberService{
	
	@Autowired
	private MemberDao dao;
	
	@Autowired
	private PartnerDao pdao;
	
	
	@Override
	public Member loginMember(int m_id,String pass){
		System.out.println(m_id+" "+pass);
		System.out.println(dao.loginMember(m_id, pass));
		Member m=dao.loginMember(m_id, pass);
		System.out.println("In service");
		return m;
	}
	
	@Override
	public int registerMember(Member mem){
		System.out.println(mem);
		return dao.registerMember(mem);
	}

	@Override
	public Member updateMember(Member mem) {
		System.out.println(mem);
		return dao.updateMember(mem);
	}

	@Override
	public int logoutMember() {
		return dao.logout();
	}

	@Override
	public Member showProfile(Member mem) {
		System.out.println(mem);
		return dao.showProfile(mem);
	}

	@Override
	public Integer addVehicle(Vehicle veh) {
		return dao.addVehicle(veh);
	}

	@Override
	public Integer addTransaction(Transaction tx) {
		return dao.addTransaction(tx);
	}

	@Override
	public Member getMember(Integer id) {	
		return dao.getMember(id);
	}

	@Override
	public List<Partner> getPartnerList(String lat,String lng) {
		return dao.getPartnerList(lat,lng);
	}

	@Override
	public Integer getBillId(Integer id) {
		return dao.getBillId(id);
	}
}
