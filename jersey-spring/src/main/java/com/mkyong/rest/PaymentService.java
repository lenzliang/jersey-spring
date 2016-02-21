package com.mkyong.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mkyong.domain.Role;
import com.mkyong.domain.User;
import com.mkyong.transaction.TransactionBo;

@Component
@Path("/payment")
public class PaymentService {
	
	@Autowired
	private TransactionBo transactionBo;

	@GET
	@Path("/mkyong")
	@Produces(MediaType.APPLICATION_JSON)
	public List <User> savePayment() {
		 
//		String result = transactionBo.save();
		
		Role role =new Role ();
		role.setRid(3);
		role.setRolename("admin");
		
		Role role2 =new Role ();
		role2.setRid(3);
		role2.setRolename("user");
		
		User user =new User();
		user.setUid(1);
		user.setUsername("zhangsan");
		user.setRole(role);
		
		
		User user2 =new User();
		user2.setUid(2);
		user2.setUsername("lisi");
		user2.setRole(role2);
		
		List <User> userList =new ArrayList<User>();
		userList.add(user);
		userList.add(user2);
		
		return userList;
 
	}

}
