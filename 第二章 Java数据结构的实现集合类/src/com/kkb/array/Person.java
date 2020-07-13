package com.kkb.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Person {

	private String pname;
	private Integer page;

	public Person() {
	}

	public Person(String pname, Integer page) {
		this.pname = pname;
		this.page = page;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	@Override
	public String toString() {
		return "Person{" + "pname='" + pname + '\'' + ", page=" + page + '}';
	}

	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		personList.add(new Person("����", 20));
		personList.add(new Person("����", 10));
		personList.add(new Person("����", 30));
		System.out.println("ԭʼ˳��Ϊ��" + personList.toString());
		Collections.sort(personList, new Comparator<Person>() {
			@Override
			public int compare(Person o1, Person o2) {
				// ����
				// return o1.getPage()-o2.getPage();
				// ����
				return o2.getPage() - o1.getPage();
				// ����
				// return 0
			}
		});
		System.out.println("�����˳��Ϊ��" + personList.toString());
	}
}
