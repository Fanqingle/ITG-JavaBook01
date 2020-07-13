package com.kkb.array;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;

class TestHashMap {
	
	HashMap<String,Object> map = new HashMap<>();
	
	{
		map.put("A","1");
		map.put("B","2");
		map.put("C","3");

	}
	
	@Test
	void testFor() {
		//�ֱ��ȡkey��value�ļ���
		 for(String key : map.keySet()){
		     System.out.println(key);
		 }
		 System.out.println("====");
		 for(Object value : map.values()){
		     System.out.println(value);
		 }
	}
	
	@Test
	void testForGet() {
		 //2����ȡkey���ϣ�Ȼ�����key������key�õ� value
		 Set<String> keySet = map.keySet();
		 for(String str : keySet){
		     System.out.println(str+"-"+map.get(str));
		 }
	}
	
	
	@Test
	void testForEntry() {
		 //3���õ� Entry ���ϣ�Ȼ����� Entry
		 Set<Map.Entry<String,Object>> entrySet = map.entrySet();
		 for(Map.Entry<String,Object> entry : entrySet){
		     System.out.println(entry.getKey()+"-"+entry.getValue());
		 }
	}
	
	@Test
	void testForIterator(){
		 Iterator<Map.Entry<String,Object>> iterator = map.entrySet().iterator();
		 while(iterator.hasNext()){
		    Map.Entry<String,Object> mapEntry = iterator.next();
		    System.out.println(mapEntry.getKey()+"-"+mapEntry.getValue());
	    }
	}
	
	

}
