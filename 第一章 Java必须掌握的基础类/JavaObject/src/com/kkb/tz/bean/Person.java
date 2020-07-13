package com.kkb.tz.bean;

import java.util.Objects;

public class Person {
	private String pname;
	private int page;

	public Person() {
	}

	public Person(String pname, int page) {
		this.pname = pname;
		this.page = page;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	@Override
	public boolean equals(Object otherObject) {
		// 1���жϱȽϵ��������������Ƿ���ȣ�������������ô��ʾ��ͬһ��������ô��Ȼ���
		if (this == otherObject) {
			return true;
		}
		// 2����� otherObject Ϊ null��ֱ�ӷ���false����ʾ�����
		if (otherObject == null) {// ����Ϊ�ջ��߲���Person���ʵ��
			return false;
		}
		// 3���Ƚ� this �� otherObject �Ƿ���ͬһ���ࣨע����������ֻ��ʹ��һ�֣�
		// 3.1����� equals ��������ÿ�����������иı䣬��ʹ�� getClass ���
		if (this.getClass() != otherObject.getClass()) {
			return false;
		}
		// 3.2��������е����඼��ͳһ�Ķ��壬��ôʹ�� instanceof ���
		if (!(otherObject instanceof Person)) {
			return false;
		}

		// 4���� otherObject ת���ɶ�Ӧ�������ͱ���
		Person other = (Person) otherObject;

		// 5�����Զ�������Խ��бȽϡ�ʹ�� == �Ƚϻ������ͣ�ʹ�� equals �Ƚ϶������������򷵻�true�����򷵻�false
		// ʹ�� Objects ������� equals ������ֹ�Ƚϵ�����������һ��Ϊ null��������Ϊ null.equals() �ǻ����쳣��
		return Objects.equals(this.pname, other.pname) && this.page == other.page;
	}

	public static void main(String[] args) {
		Person p1 = new Person("Tom", 21);
		Person p2 = new Person("Marry", 20);
		System.out.println(p1 == p2);// false
		System.out.println(p1.equals(p2));// false
		Person p3 = new Person("Tom", 21);
		System.out.println(p1.equals(p3));// true
	}
}
