package com.javagyojin.ex;

import java.util.ArrayList;

public class MyInfo {
	
	private String name;
	private double weight;
	private double height;
	private ArrayList<String> hobbys;
	private BMICalculator bmiCalculator;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public ArrayList<String> getHobbys() {
		return hobbys;
	}
	public void setHobbys(ArrayList<String> hobbys) {
		this.hobbys = hobbys;
	}
	public BMICalculator getBmiCalculator() {
		return bmiCalculator;
	}
	public void setBmiCalculator(BMICalculator bmiCalculator) {
		this.bmiCalculator = bmiCalculator;
	}
	
	
	public void bmiCalculation() {
		bmiCalculator.bmicalcuation(weight, height);
	}
	
	
	public void getInfoPrint() {
		System.out.println("�̸� :" + name);
		System.out.println("Ű :" + height);
		System.out.println("������ :" + weight);
		System.out.println("��� :" + hobbys);
		bmiCalculation();
		
	}
	
	
}
