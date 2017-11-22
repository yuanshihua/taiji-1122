package cn.com.taiji.learnLamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Predicate;

import cn.com.taiji.entity.Person;

public class Test {
	public static void main(String[] args) {
		double d1 = integrate(x -> x, 10, 100, 1000);
		double d2 = integrate(x -> 2.5, 10, 100, 1000);
		double d3 = integrate(x -> x * x, 10, 100, 1000);
		sample();
		new Thread(()->System.out.println("hello world")).start();
		System.out.println("********************************************************************");
		List<Person> listPerson = new ArrayList<>();
		listPerson.add(new Person(10,2000d,34,"heheda"));
		listPerson.add(new Person(120,2000d,45,"Bingo"));
		listPerson.add(new Person(10,800d,45,"Bingo"));
		List<Person> list1 = findMatchPerson(listPerson, p->p.getAge()>30);
		List<Person> list2 = findMatchPerson(listPerson, p->p.getId()==10);
		List<Person> list3 = findMatchPerson(listPerson, p->p.getSalary()>1000);
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);
	}

	public static double integrate(DoubleUnaryOperator func, double a, double b, int numSlices) {
		if (numSlices < 1)
			numSlices = 1;
		double delta = (b - a) / numSlices;
		double start = a + delta / 2.0;
		double sum = 0.0;
		for (int i = 0; i < numSlices; i++) {
			sum += delta * func.applyAsDouble(start + delta * i);
		}
		return sum;
	}

	
	public static void sample() {
		String[] atp = { "Rafael Nadal", "Novak Djokovic", "Stanislas Wawrinka", "David Ferrer", "Roger Federer",
				"Andy Murray", "Tomas Berdych", "Juan Martin Del Potro" };
		List<String> players = Arrays.asList(atp);

		// 以前的循环方式
		for (String player : players) {
			System.out.print(player + "; ");
		}

		// 使用 lambda 表达式以及函数操作(functional operation)
		players.forEach((player)->System.out.println(player+""));
		// 在 Java 8 中使用双冒号操作符(double colon operator)
		players.forEach(System.out::println);
		
	}

	public static List<Person> findMatchPerson(List<Person> listPerson , Predicate<Person> p) {
		List<Person> list = new ArrayList<>();
		for (Person person : listPerson) {
			if(p.test(person)) {
				list.add(person);
			}
		}
		return list;
	}

}
