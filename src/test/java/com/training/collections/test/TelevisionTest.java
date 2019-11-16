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

import com.training.collections.Television;

public class TelevisionTest {

	Television tv1,tv2,tv3,tv4;

	
	@Before
	public void objinitial() {
		tv1=new Television("Samsung", "led", "yes", 50000);
		tv2=new Television("Samsung", "led", "yes", 50000);	
		tv3=new Television("Oneplus", "lcd", "yes",  67000);
		tv4=new Television("Sony", "led", "no", 80000);
		
	}
	
	@Test
	public void testEquals(){
		assertTrue(tv1.equals(tv2));
	}
	
	@Test
	public void testHashcode() {
		assertEquals(tv1.hashCode(), tv2.hashCode());
	}
	
	@Test
	public void testInsertionofDuplicatesInSet() {
		Set<Television> set=new HashSet<Television>();
		set.add(tv1);
		set.add(tv2);
		set.add(tv3);
		assertEquals(2, set.size());
		
	}
	
	@Test
	public void testInsertionofDuplicatesInList() {
		List<Television> list=new ArrayList<Television>();
		list.add(tv1);
		list.add(tv2);
		list.add(tv3);
		assertEquals(3, list.size());
		
	}
	
	@Test
	public void testInsertionOrder() {
		Set<Television> set1=new HashSet<Television>();
		set1.add(tv1);
		set1.add(tv2);
		set1.add(tv3);
		set1.add(tv4);
		Television[] tv= {tv4,tv3,tv1};
		int i=0;
			
		for(Television s:set1) {
			assertFalse(tv.toString().equals(s.toString()));
			i++;
		}
	}
	
	@After
	public void clear()
	{
		tv1=null;
		tv2=null;
		tv3=null;
		tv4=null;
	}
}
