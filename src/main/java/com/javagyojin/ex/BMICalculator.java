package com.javagyojin.ex;

public class BMICalculator {
	
	private double normal;//����
	private double lowWeight;//��ü��
	private double overWeight;//������
	private double obesity;//��
	
	public void bmicalcuation(double weight, double height) {
		
		// BMI ���� : ������ / (Ű*0.01)**2
		
		double h = height * 0.01;
		double bmi_result = weight / (h*h);
		
		System.out.println("����� BMI ���� : " + (int)bmi_result);
		
		if (bmi_result > obesity) {
			System.out.println("���� ���Դϴ�!");
		} else if (bmi_result > overWeight) {
			System.out.println("���� ��ü���Դϴ�!");
		} else if (bmi_result > normal) {
			System.out.println("���� �����Դϴ�!");
		} else {
			System.out.println("���� ��ü���Դϴ�!");
		}			
		
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}
	

}
