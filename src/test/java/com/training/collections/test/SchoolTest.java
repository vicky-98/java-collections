package com.training.collections.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.collections.School;

public class SchoolTest {

	School school1,school2,school3,school4;

	
	@Before
	public void objinitial() {
		school1=new School("AVB","Coimbatore","Coimbatore",1);
		school2=new School("AVB","Coimbatore","Coimbatore",1);	
		school3=new School("Sathyabama","Sathy","Erode",4);
		school4=new School("Avila","Madurai","Salem",2);
		
	}
	
	@Test
	public void testEquals(){
		assertTrue(school1.equals(school2));
	}
	
	@Test
	public void testHashcode() {
		assertEquals(school1.hashCode(), school2.hashCode());
	}
	
	@Test
	public void testInsertionofDuplicatesInSet() {
		Set<School> set=new HashSet<School>();
		set.add(school1);
		set.add(school2);
		set.add(school3);
		assertEquals(2, set.size());
		
	}
	
	@Test
	public void testInsertionofDuplicatesInList() {
		List<School> list=new ArrayList<School>();
		list.add(school1);
		list.add(school2);
		list.add(school3);
		assertEquals(3, list.size());
		
	}
	
	@Test
	public void testInsertionOrder() {
		Set<School> set1=new HashSet<School>();
		set1.add(school1);
		set1.add(school2);
		set1.add(school3);
		set1.add(school4);
		School[] sch= {school4,school3,school1};
		int i=0;
			
		for(School s:set1) {
			assertFalse(sch.toString().equals(s.toString()));
			i++;
		}
	}
	
	@After
	public void clear()
	{
		school1=null;
		school2=null;
		school3=null;
		school4=null;
	}
}
