package com.tech.v1;

import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeSoftware {
	private final static Scanner SCANNER = new Scanner(System.in);
	private final static EmployeeOperationV1 EMPLOYEE_OPERATION = new EmployeeOperationV1(); 
	
	public static void main(String[] args) throws SQLException {
		try {
			int op = 0;
			
			do {
				System.out.println(" \n\n 1 :INSERT \n 2: UPDATE \n 3: DELETE \n 4: View \n 5: Exit");
				System.out.println("Enter your op name");
				op = SCANNER.nextInt();
				
				try {
					switch(op) {
					case 1:
						EMPLOYEE_OPERATION.insert();
						EMPLOYEE_OPERATION.view();
						break;
					case 2:
						EMPLOYEE_OPERATION.update();
						EMPLOYEE_OPERATION.view();
						break;
					case 3:
						EMPLOYEE_OPERATION.delete();
						EMPLOYEE_OPERATION.view();
						break;
					case 4:
						EMPLOYEE_OPERATION.view();
						break;
					}
				} catch(Exception e) {
					System.err.println("Sorry => " + e.getMessage() + ":) try again....");
				}
				
			} while(op != 5);
			
			System.out.println("Completed.....");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(!DBConnection.getConnection().isClosed()) {
				DBConnection.getConnection().close();	
			}
		}
		
	}
}
