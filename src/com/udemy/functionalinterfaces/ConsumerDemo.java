package com.udemy.functionalinterfaces;

import java.util.function.Consumer;

import com.data.Student;
import com.data.StudentDataBase;

public class ConsumerDemo {

	static Consumer<Student> c1 = p -> System.out.println(p);
	static Consumer<Student> names = p -> System.out.println(p.getName());
	static Consumer<Student> activities = p -> System.out.println(p.getActivities());

	public static void main(String[] args) {
		printNames();
		printNamesAndActivities();
	}

	public static void printNames() {
		StudentDataBase.getAllStudents().forEach(names);
	}

	public static void printNamesAndActivities() {
		StudentDataBase.getAllStudents().forEach(names.andThen(activities));
	}

	public static void printNameAndActivitiesUsingCondition() {
		StudentDataBase.getAllStudents().forEach((s) -> {
			if (s.getGradeLevel() >= 3 && s.getGpa() > 3.9)
				names.andThen(activities).accept(s);
		});
	}

}
