package com.tutorialspoint.springframework.transactionmanagement.programatictransactionmanagement;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author daniel
 * Daniel-Dos
 * daniel.dias.analistati@gmail.com
 */
public class MainApp {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

		StudentJDBCTemplate studentJDBCTemplate = (StudentJDBCTemplate) context.getBean("studentJDBCTemplate");

		System.out.println("------Records Creation------");
		studentJDBCTemplate.create("Zara", 11, 99, 2010);
		studentJDBCTemplate.create("Nuha", 2, 97, 2010);
		studentJDBCTemplate.create("Ayan", 2, 100, 2011);

		System.out.println("-----Listing All the Records-----");
		List<StudentMarks> studentMarks = studentJDBCTemplate.listStudents();

		studentMarks.forEach(record -> {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.print(", Age : " + record.getAge());
			System.out.print(", Marks : " + record.getMarks());
			System.out.println(", Year : " + record.getYear());
		});
	}
}