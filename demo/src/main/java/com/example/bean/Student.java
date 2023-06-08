package com.example.bean;

public class Student {

	private int roll_no;
	private String student_name;
	private String student_address;

	public int getRoll_no() {
		return roll_no;
	}

	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public String getStudent_address() {
		return student_address;
	}

	public void setStudent_address(String student_address) {
		this.student_address = student_address;
	}

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", student_name=" + student_name + ", student_address=" + student_address
				+ "]";
	}
}
