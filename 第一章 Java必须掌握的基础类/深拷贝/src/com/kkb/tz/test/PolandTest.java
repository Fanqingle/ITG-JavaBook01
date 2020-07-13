package com.kkb.tz.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class PolandTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testShallowClone() throws Exception{
	    Person p1 = new Person("zhangsan",21);
	    p1.setAddress("����ʡ", "�人��");
	    Person p2 = (Person) p1.clone();
	    System.out.println("p1:"+p1);
	    System.out.println("p1.getPname:"+p1.getPname().hashCode());
	    
	    System.out.println("p2:"+p2);
	    System.out.println("p2.getPname:"+p2.getPname().hashCode());
	    
	    p1.display("p1");
	    p2.display("p2");
	    p2.setAddress("����ʡ", "������");
	    System.out.println("������֮��Ķ����ַ�޸ģ�");
	    p1.display("p1");
	    p2.display("p2");
	}
	
}
