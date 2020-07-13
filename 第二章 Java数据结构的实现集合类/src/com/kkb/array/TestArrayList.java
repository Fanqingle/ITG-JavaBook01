package com.kkb.array;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import org.junit.jupiter.api.Test;

class TestArrayList {

	@Test
	void testFor() {
		 ArrayList list = new ArrayList();
		 list.add("a");
		 list.add("b");
		 list.add("c");
		 for(int i = 0 ; i < list.size() ; i++){
		     System.out.print(list.get(i)+" ");
		 }
	}
	
	@Test
   void testiterator() {
		 ArrayList<String> list = new ArrayList<>();
		 list.add("a");
		 list.add("b");
		 list.add("c");
		 Iterator<String> it = list.iterator();
		 while(it.hasNext()){
		     String str = it.next();
		     System.out.print(str+" ");
		 }
	   
   }
	
	@Test
	void testiterator2() {
		  ArrayList<String> list = new ArrayList<>();
		  list.add("a");
		  list.add("b");
		  list.add("c");
		  Iterator<String> it = list.iterator();
		  while(it.hasNext()){
		      String str = it.next();
		      System.out.print(str+" ");
		     
		      list.remove(str);//���ϱ���ʱ����ɾ���������������������׳� ConcurrentModificationException �쳣
//		     list.add(str);
//		     list.set(0, str);//�޸Ĳ�����������쳣
//		      it.remove();
		 }
	}
	
	@Test
	void testforEach() {
		 ArrayList<String> list = new ArrayList<>();
		 list.add("a");
		 list.add("b");
		 list.add("c");
		 for(String str : list){
		    System.out.print(str + " ");
		 }
	}
	
	@Test
	void testforEach2() {
		 ArrayList<String> list = new ArrayList<>();
		 list.add("a");
		 list.add("b");
		 list.add("c");
		 String str;
		for (Iterator iterator1 = list.iterator(); iterator1.hasNext(); System.out.print((new StringBuilder(String.valueOf(str))).append(" ").toString()))
		             str = (String)iterator1.next();
		  
	}
	
	@Test
	void testListIterator() {
		 ArrayList<String> list = new ArrayList<>();
		 list.add("a");
		 list.add("b");
		 list.add("c");
		 ListIterator<String> listIt = list.listIterator();
		  
		 //������
		 while(listIt.hasNext()){
		     System.out.print(listIt.next()+" ");//a b c
		 }
		 System.out.println("==============");
		//���ǰ����,��ʱ����������������������α��Ѿ�ָ�������һ��Ԫ�أ����Դ˴���ǰ��������ֵ
		 while(listIt.hasPrevious()){
		     System.out.print(listIt.previous()+" "); //c b a
		 }
		 
	}
	@Test
   void testListIterator2() {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		ListIterator<String> listIt = list.listIterator();
 
		//������
	    while(listIt.hasNext()){
		     System.out.print(listIt.next()+" ");//a b c
		     listIt.add("1");//��ÿһ��Ԫ�غ�������һ��Ԫ�� "1"
		 }
	    
	    System.out.println("####");
	 
	    //���ǰ����,��ʱ����������������������α��Ѿ�ָ�������һ��Ԫ�أ����Դ˴���ǰ��������ֵ
		while(listIt.hasPrevious()){
	      System.out.print(listIt.previous()+" ");//1 c 1 b 1 a 
		 }
		
	}
	
	@Test
	void testSubList() {
		 ArrayList<String> list = new ArrayList<>();
		 list.add("a");
		 list.add("b");
		 list.add("c");
		 
		 List<String> subList = list.subList(0, 1);
		 for(String str : subList){
		     System.out.print(str + " ");//a
		 }
		
	}
	
	@Test
	void tsetSubList2() {
		 ArrayList<String> list = new ArrayList<>();
		 list.add("a");
		 list.add("b");
		 list.add("c");
		  
		 List<String> subList = list.subList(0, 1);
		 for(String str : subList){
		      System.out.print(str + " ");//a
		 }
		 subList.add("d");
		 System.out.println(subList.size());//2
		 System.out.println(list.size());//4,ԭʼ���ϳ���Ҳ������
	}
	
	
	
}
