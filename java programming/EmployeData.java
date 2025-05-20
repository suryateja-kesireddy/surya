package com.surya.scanner_class;

import java.util.Scanner;

public class EmployeData {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Employe Id:");
		int id=sc.nextInt();
		System.out.print("Enter Employe Name:");
		String name=sc.nextLine();
		name=sc.nextLine();
		System.out.println("Employe id is:"+id);
		System.out.println("Employe Name is:"+name);
		sc.close();

	}

}
