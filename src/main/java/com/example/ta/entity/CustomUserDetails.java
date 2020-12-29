package com.example.ta.entity;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

public class CustomUserDetails extends User {
	
	private Integer companyId;
	
	public CustomUserDetails(String username, String password,Integer companyId, Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
		
	}
	
	public Integer getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}

	

}
