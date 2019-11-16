package com.training.collections.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.training.collections.Laptop;



public class LaptopTest {

	Laptop lap1,lap2,lap3,lap4;

	
	@Before
	public void objinitial() {
		lap1=new Laptop("lenovo", "g50", "windows", "intel") ;
		lap2=new Laptop("lenovo", "g50", "linux", "amd") ;	
		lap3=new Laptop("hp", "lk39", "windows", "amd") ;
		lap4=new Laptop("asus", "gt32", "windows", "intel") ;
		
	}
	
	@Test
	public void testEquals(){
		assertTrue(lap1.equals(lap2));
	}
	
	@Test
	public void testHashcode() {
		assertEquals(lap1.hashCode(), lap2.hashCode());
	}
	
	@Test
	public void testInsertionofDuplicatesInSet() {
		Set<Laptop> set=new HashSet<Laptop>();
		set.add(lap1);
		set.add(lap2);
		set.add(lap3);
		assertEquals(2, set.size());
		
	}
	
	@Test
	public void testInsertionofDuplicatesInList() {
		List<Laptop> list=new ArrayList<Laptop>();
		list.add(lap1);
		list.add(lap2);
		list.add(lap3);
		assertEquals(3, list.size());
		
	}
	
	@Test
	public void testInsertionOrder() {
		Set<Laptop> set1=new HashSet<Laptop>();
		set1.add(lap1);
		set1.add(lap2);
		set1.add(lap3);
		set1.add(lap4);
		Laptop[] lap= {lap4,lap3,lap1};
		int i=0;
			
		for(Laptop s:set1) {
			assertEquals(lap[i].toString(),s.toString());
			i++;
		}
	}
	
	@After
	public void clear()
	{
		
	}
	
	
}
			
				
				
		

	

