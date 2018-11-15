package com.corejava.others;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.corejava.vo.Employee;

public class SerializableExample {
	
	private static Logger logger = LoggerFactory.getLogger(SerializableExample.class); 
	
	public static void createObjectAndWriteToFileAsStream(Employee employee) throws IOException {
		System.out.println(">> createObjectAndWriteToFile");
		logger.debug(">> createObjectAndWriteToFile");
		FileOutputStream foos = null;
		ObjectOutputStream oos = null;
		
		try {
			System.out.println("Writing to file....");
			foos = new FileOutputStream("C:\\Users\\Bhabadyuti Bal\\Desktop\\seriz.txt");
			oos = new ObjectOutputStream(foos);
			oos.writeObject(employee);
			System.out.println("Writing to file completed....");
		} catch (Exception e) {
			System.out.println("Exception occured while writing to file");
			throw e;
		} finally {
			logger.info("In finally...");
			foos.close();
			oos.close();
		}
		
		
	}
	
	
	public static void main(String[] args) throws IOException {
		Employee employee = new Employee("Kanhu", 20);
		createObjectAndWriteToFileAsStream(employee);
		createObjectAndReadFromFileStream("C:\\Users\\Bhabadyuti Bal\\Desktop\\seriz.txt");
	}


	private static void createObjectAndReadFromFileStream(String string) {
		// TODO Auto-generated method stub
		
	}

}
