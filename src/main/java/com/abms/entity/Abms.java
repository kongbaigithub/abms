package com.abms.entity;

public class Abms {

	private Long id;
	
	/**
	 * 人名
	 */
	private String name;
	
	/**
	 * 工作单位
	 */
	private String company;
	
	/**
	 * 电话号码
	 */
	private String phone;
	
	/**
	 * E-mail
	 */
	private String mail;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Abms [id=" + id + ", name=" + name + ", company=" + company + ", phone=" + phone + ", mail=" + mail
				+ "]";
	}
}
