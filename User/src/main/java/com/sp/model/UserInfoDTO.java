package com.sp.model;

public class UserInfoDTO {
	private String username;
	private Integer wallet;
	
	public UserInfoDTO(User user) {
		this.setUsername(user.getSurName());
		this.setWallet(user.getWallet());
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Integer getWallet() {
		return wallet;
	}
	
	public void setWallet(Integer wallet) {
		this.wallet = wallet;
	}
	
	
}