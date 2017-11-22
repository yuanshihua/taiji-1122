package cn.com.taiji.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Student> listStu = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			Student student = new Student(i+1,"stu"+i+1,5*(int)(Math.random()*8)+60);
			listStu.add(student);
		}
		
		Map<Integer, List<Student>> collects = listStu.stream().collect(Collectors.groupingBy(Student::getGrade));
		for (Map.Entry<Integer, List<Student>> entry : collects.entrySet()) {
			System.out.println("*****************************************************");
			System.out.println("成绩为"+entry.getKey());
			for (Student student : entry.getValue()) {
				System.out.println("当前学生的编号是"+student.getId()+",姓名是"+student.getName());
				System.out.println("---------------------");
			}
			System.out.println("当前成绩的总人数是"+entry.getValue().size());
		}
	}
}
