package com.udemy.functionalinterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.data.Student;
import com.data.StudentDataBase;

public class FunctionalInterfaceStudentDemo {

	static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {
		Map<String, Double> studentGrade = new HashMap<>();
		
		students.forEach(student -> {
			if(student.getGpa()>3.0) {
				studentGrade.put(student.getName(), student.getGpa());
			}
		});
		return studentGrade;
	});

	public static void main(String[] args) {
		
		System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));

	}

}
