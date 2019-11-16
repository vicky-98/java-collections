package com.training.collections.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.training.collections.Student;
import com.training.collections.Television;


public class StudentTest {

	Student st1,st2,st3,st4;
	
	@Before
	public void objinitial() {
		st1=new Student("Ram", "mango");
		st2=new Student("Vicky", "orange");
		st3=new Student("Ramesh", "grapee");
		st4=new Student("Hari", "watermelon");
		
	}
	
	@Test
	public void testInsertionOrderinSet() {
		Set<Student> set1=new HashSet<Student>();
		set1.add(st1);
		set1.add(st2);
		set1.add(st3);
		set1.add(st4);
		Student[] st= {st4,st3,st2,st1};
		int i=0;
			
		for(Student s:set1) {
			assertFalse(st.toString().equals(s.toString()));
			i++;
		}
	}
	
	@Test
	public void testInsertionOrderinList() {
		List<Student> list=new ArrayList<Student>();
		list.add(st1);
		list.add(st2);
		list.add(st3);
		list.add(st4);
		Student[] st= {st1,st2,st3,st4};
		int i=0;
		for(Student str:list) {
			assertEquals(st[i].toString(), str.toString());
			i++;
		}
		
	}
	
	@Test
	public void testMap() {
		Map<String,String> map=new HashMap<String,String>();
		map.put(st1.getStudent(), st1.getFruits());
		map.put(st2.getStudent(), st2.getFruits());
		map.put(st3.getStudent(), st3.getFruits());
		map.put(st4.getStudent(), st4.getFruits());
		assertEquals("mango", map.get("Ram"));
	}
}
