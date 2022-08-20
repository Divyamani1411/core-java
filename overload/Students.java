package org.overload;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("student method id=>" + id);
	}

	public void getStudentInfo(int id, String name) {
		// System.out.println("student method id=>"+id);
		System.out.println("student method id=>" + id);
		System.out.println("student method name=>" + name);
	}

	public void getStudentInfo(String email, long phno) {
		System.out.println("student method email=>" + email);
		System.out.println("student method phonenumber=>" + phno);
	}
}
