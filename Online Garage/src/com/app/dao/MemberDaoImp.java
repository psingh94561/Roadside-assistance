
package com.app.dao;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Member;
import com.app.pojos.Partner;
import com.app.pojos.Transaction;
import com.app.pojos.Vehicle;

@Repository
public class MemberDaoImp implements MemberDao{

	//protected static Logger logger=Logger.getLogger(MemberDaoImp.class);
	@Autowired
	private SessionFactory sf;
	@Override
	public int registerMember(Member mem) {
		org.hibernate.Session ss=sf.getCurrentSession();
		System.out.println("in dao : reg cust " + mem);
		mem.getAddressInfo().setMemberInfo(mem);
		ss.save(mem);
		ss.save(mem.getAddressInfo());
		return (int)ss.save(mem);
	}

	@Override
	public Member loginMember(int m_id1,String pass) {
		org.hibernate.Session ss1=sf.getCurrentSession();
		String hql="from Member m where m.memberId=:memberId and m.password=:password";
		Query q=ss1.createQuery(hql).setParameter("memberId",m_id1).setParameter("password", pass);
		Member m=(Member)q.uniqueResult();
		System.out.println(m);
		System.out.println("In dao");
		return m;
		//Member) ss1.get(Member.class,m_id1);
	
	}
	
	

	@Override
	public Member getMember(Integer id){
		org.hibernate.Session ss2=sf.getCurrentSession();
	 return (Member)ss2.get(Member.class,id);
	}
	
	
	
	@Override
	public Member updateMember(Member mem) {
		org.hibernate.Session ss2=sf.getCurrentSession();
		Member mem2= (Member) ss2.get(Member.class,mem.getMemberId());
		mem2.setEmail(mem.getEmail());
		mem2.setFirstName(mem.getFirstName());
		mem2.setLastName(mem.getLastName());
		mem2.setPassword(mem.getPassword());
		mem2.setPhone(mem.getPhone());
		mem2.setAlterphone(mem.getAlterphone());
		mem2.setMemberShipType(mem.getMemberShipType());
		ss2.save(mem2);
		System.out.println("Succesfully updated");
		System.out.println(mem2);
		return mem2;
	}

	
	@Override
	public int logout() {
		// TODO Auto-generated method stub
		return 0;
	}

	
	@Override
	public Member showProfile(Member mem) {
		sf.getCurrentSession().get(Member.class,mem.getMemberId());
		return mem;
	}

	
	@Override
	public Integer addVehicle(Vehicle veh) {
		org.hibernate.Session ss3=sf.getCurrentSession();
		System.out.println("in dao : reg cust " + veh);
		System.out.println(veh.getMemberInfo().getMemberId());
		return (Integer)ss3.save(veh);
		
	}

	@Override
	public Integer addTransaction(Transaction tx) {
		org.hibernate.Session ss4=sf.getCurrentSession();
		System.out.println("In dao : addTransaction :"+tx);
		System.out.println(tx.getMemberInfo().getMemberId());
		return (Integer)ss4.save(tx);
	}
	@Override
	public Integer getBillId(Integer id){
		Session ss5=sf.getCurrentSession();
		String hql="select tx.bill from Transaction tx order by bill DESC";
		Integer bId=(Integer)ss5.createQuery(hql).setMaxResults(1).uniqueResult();
		return bId;
		
	}


	@Override
	public List<Partner> getPartnerList(String lat1,String lng1) {
		Session ss4=sf.getCurrentSession();
		System.out.println(lat1+"requwst parameter reached"+lng1);
		String nearLat = lat1.substring(0,lat1.indexOf('.')) +"%";
		String nearLng = lng1.substring(0,lng1.indexOf('.')) +"%";
		String hql="from Partner p where p.lat like :nearLat AND p.lng like :nearLng";
		System.out.println("aana to cahiye tha111");

		@SuppressWarnings("unchecked")
		ArrayList<Partner> listGeo= (ArrayList<Partner>) ss4.createQuery(hql).setParameter("nearLat",nearLat).setParameter("nearLng",nearLng).list();
		System.out.println("aana to cahiye tha"+listGeo);
		return listGeo;
	}
	
	
}