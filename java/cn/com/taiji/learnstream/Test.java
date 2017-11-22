package cn.com.taiji.learnstream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import cn.com.taiji.entity.Person;

public class Test {
	public static void main(String[] args) {
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
	//使用stream实现findMatchPerson
	public static List<Person> findMatchPerson(List<Person> listPerson , Predicate<Person> p) {
		List<Person> collect = listPerson.stream().filter(p).collect(Collectors.toList());
		return collect;
	}
}
