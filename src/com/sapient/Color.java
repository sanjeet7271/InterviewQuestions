package com.sapient;

public class Color {
	public String colorCode="Black";
	private Color(String colorCode) {
		this.colorCode=colorCode;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color colorClass=new Color("White");
		System.out.println(colorCode);
	}

}
