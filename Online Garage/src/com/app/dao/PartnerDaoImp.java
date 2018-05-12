package com.app.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Query;

import com.app.pojos.Partner;

@Repository
public class PartnerDaoImp implements PartnerDao{

	@Autowired
	private SessionFactory sf;
	
	@Override
	public int registerPartner(Partner prt) {
		Session ss=sf.getCurrentSession();
		System.out.println("You are in Partner Registration page : "+prt);
		return (int)ss.save(prt);
	}

	@Override
	public Partner loginPartner(int p_id,String pass) {
		String hql="from Partner p where p.partnerId=:partnerId and p.password=:password";
		Query q=sf.getCurrentSession().createQuery(hql).setParameter("partnerId",p_id).setParameter("password",pass);
		Partner pt=(Partner) q.uniqueResult();
		System.out.println("You are in PartnerDaoImp login");
		return pt;
	}



}
