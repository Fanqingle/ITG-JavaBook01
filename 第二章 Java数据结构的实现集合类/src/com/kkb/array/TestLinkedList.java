package com.kkb.array;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class TestLinkedList {

	@Test
	void testFor() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
		for(int i = 0 ; i < linkedList.size() ; i++){
		    System.out.print(linkedList.get(i)+" ");//A B C D
		}
	}
	
	

	@Test
	void testIterator() {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("A");
		linkedList.add("B");
		linkedList.add("C");
		linkedList.add("D");
	  
		Iterator<String> listIt = linkedList.listIterator();
		 while(listIt.hasNext()){
		    System.out.print(listIt.next()+" ");//A B C D
		}
		 
		 //ͨ��������ģʽʵ�ֵĽӿڣ������ǵ����ӡ����
		Iterator<String> it = linkedList.descendingIterator();
		 while(it.hasNext()){
		     System.out.print(it.next()+" ");//D C B A
		 }
		 
		 
	}
	
	
	 @Test
	 void testForVsIterator() {
		 LinkedList<Integer> linkedList = new LinkedList<>();
		  for(int i = 0 ; i < 10000 ; i++){//�����������һ���Ԫ��
		      linkedList.add(i);
		  }
		  long beginTimeFor = System.currentTimeMillis();
		  for(int i = 0 ; i < 10000 ; i++){
		      System.out.print(linkedList.get(i));
		  }
		  long endTimeFor = System.currentTimeMillis();
		 System.out.println("ʹ����ͨforѭ������10000��Ԫ����Ҫ��ʱ�䣺"+ (endTimeFor - beginTimeFor));
		 
		 
		 long beginTimeIte = System.currentTimeMillis();
		 Iterator<Integer> it = linkedList.listIterator();
		 while(it.hasNext()){
		     System.out.print(it.next()+" ");
		 }
		 long endTimeIte = System.currentTimeMillis();
		System.out.println("ʹ�õ���������10000��Ԫ����Ҫ��ʱ�䣺"+ (endTimeIte - beginTimeIte));
		 
	 }

}
