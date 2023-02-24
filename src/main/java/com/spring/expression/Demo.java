package com.spring.expression;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Demo {
	
	@Value("#{21+22}")
	private int x;
	@Value("#{22}")
	private int y;
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double z;
	
	@Value("#{T(java.lang.Math).PI}")
	private double e;
	
	@Value("#{new java.lang.String('Manisha')}")
	private String name;
	
	@Value("#{ 8-6 >3  }")
	private boolean isActive;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	

	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Demo [x=" + x + ", y=" + y + ", z=" + z +", e= "+ e+ ", name= "+name +",isActive= "+isActive+"]";
	}
	public void doAddition(int x, int y)
	{
		this.x=x;
		this.y=y;
		System.out.println("Addition : "+(x+y));
	}
	
	
	

}
