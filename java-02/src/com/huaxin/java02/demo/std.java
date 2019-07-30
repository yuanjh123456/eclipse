package com.huaxin.java02.demo;

public class std implements Comparable{
	private String usename;
	private String password;
	int soure;
	int money;
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getUsename() {
		return usename;
	}
	public void setUsename(String usename) {
		this.usename = usename;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public std(String usename, String password, int money) {
		super();
		this.usename = usename;
		this.password = password;
		this.money = money;
	}
	//÷ÿ–¥equals∑Ω∑®
	public boolean equal(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj==null) {
			return false;
		}
		if(this.getClass()!=obj.getClass()) {
			return false;
		}
		std obj1 = (std)obj;
		return this.getUsename().equals(obj1.getUsename())&&this.getPassword().equals(obj1.getPassword());
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + money;
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + ((usename == null) ? 0 : usename.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		std other = (std) obj;
		if (money != other.money)
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		if (usename == null) {
			if (other.usename != null)
				return false;
		} else if (!usename.equals(other.usename))
			return false;
		return true;
	}
	@Override
	public int compareTo(Object o) {
		int a = this.money-((std)o).money;
		return a;
	}
	
}
