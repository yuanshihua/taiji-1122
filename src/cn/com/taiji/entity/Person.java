package cn.com.taiji.entity;

public class Person {
	private int id;
	private double salary;
	private int age;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Person(int id, double salary, int age, String name) {
		super();
		this.id = id;
		this.salary = salary;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", salary=" + salary + ", age=" + age + ", name=" + name + "]";
	}
	
}
