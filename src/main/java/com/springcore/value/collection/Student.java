package com.springcore.value.collection;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Scope("prototype")
public class Student
{
	@Value("12")
	private int rollno;
	@Value("viraj")
	private String name;
	@Value("9th")
	private String std;
	@Value("C")
	private String div;
	@Value("#{phones}")
	private List<String> phoneNo;

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStd() {
		return std;
	}

	public void setStd(String std) {
		this.std = std;
	}

	public String getDiv() {
		return div;
	}

	public void setDiv(String div) {
		this.div = div;
	}

	public List<String> getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(List<String> phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", std=" + std + ", div=" + div + "]";
	}

	
	
	
	
	
	
	

}
