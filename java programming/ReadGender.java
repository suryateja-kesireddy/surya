package com.surya.scanner_class;

import java.util.Scanner;

public class ReadGender {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Gender:");
        char gender=sc.next().charAt(0);
        System.out.println("Your Gender is:"+gender);
        sc.close();
	}

}
