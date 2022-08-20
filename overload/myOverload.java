package org.overload;
//method overloading
public class myOverload {

	public static void main(String[] args) {

		Students student = new Students();
		student.getStudentInfo(102);
		student.getStudentInfo(102, "Divya");
		student.getStudentInfo("divyamani1411@gmail.com", 8056598275l);

	}

}
