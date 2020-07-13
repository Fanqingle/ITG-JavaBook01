package com.kkb.tz.bean;

public class Man extends Person {

	private String sex;

	public Man(String pname, int page, String sex) {
		super(pname, page);
		this.sex = sex;
	}

	@Override
	public boolean equals(Object obj) {
		if (!super.equals(obj)) {
			return false;
		}
		if (obj == null || !(obj instanceof Man)) {// ����Ϊ�ջ��߲���Person���ʵ��
			return false;
		}
		Man man = (Man) obj;
		return sex.equals(man.sex);
	}

	public static void main(String[] args) {
		Person p = new Person("Tom", 22);
		Man m = new Man("Tom", 22, "��");

		System.out.println("p.equals(m):"+p.equals(m));// true
		System.out.println("m.equals(p):"+m.equals(p));// false
	}
}
