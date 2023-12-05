package com.pavan.service;

import com.pavan.beans.Student;

public class InstituteServiceImpl implements InstituteService {

	public void enquiry(Student std, String course_name) {
		System.out.println("Student Enquiry Details");
		System.out.println("------------------------");
		System.out.println("Student Name  : "+std.getSname());
		System.out.println("Student Qual  : "+std.getSqual());
		System.out.println("Student Email : "+std.getSemail());
		System.out.println("Student Mobile: "+std.getSmobile());
		System.out.println("Student Course: "+course_name);

	}

	public void registration(Student std, String course_name) {
		System.out.println("Student Registration Details");
		System.out.println("------------------------");
		System.out.println("Student Name  : "+std.getSname());
		System.out.println("Student Qual  : "+std.getSqual());
		System.out.println("Student Email : "+std.getSemail());
		System.out.println("Student Mobile: "+std.getSmobile());
		System.out.println("Student Course: "+course_name);

	}

}
