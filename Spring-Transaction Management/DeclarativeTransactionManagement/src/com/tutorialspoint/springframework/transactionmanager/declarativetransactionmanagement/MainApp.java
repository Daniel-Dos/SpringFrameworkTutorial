package com.tutorialspoint.springframework.transactionmanager.declarativetransactionmanagement;

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

		StudentDAO studentJdbcTemplat = (StudentDAO) context.getBean("studentJDBCTemplate");

		System.out.println("======Records Creation======");
		studentJdbcTemplat.create("Zara", 11, 99, 2010);
		studentJdbcTemplat.create("Nuha", 2, 97, 2010);
		studentJdbcTemplat.create("Ayan", 25, 100, 2011);

		System.out.println("======Listing All the Records=====");
		List<StudentMarks> sttudentMarks = studentJdbcTemplat.listStudent();
		sttudentMarks.forEach(record -> {
			System.out.print("ID : " + record.getId());
			System.out.print(", Name : " + record.getName());
			System.out.print(", Age : " + record.getAge());
			System.out.print(", Marks : " + record.getMarks() );
			System.out.println(", Year : " + record.getYear());
		});
	}
}