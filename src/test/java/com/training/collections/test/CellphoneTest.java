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

import com.training.collections.CellPhone;


public class CellphoneTest {

	CellPhone cell1,cell2,cell3,cell4;

	
	@Before
	public void objinitial() {
		cell1=new CellPhone("Apple", "IphoneXR", "Good Design", "IOS", 70000);
		cell2=new CellPhone("Apple", "IphoneXR", "Good Design", "IOS", 70000);	
		cell3=new CellPhone("Oneplus", "Oneplus7pro", "Fast Charging", "Android", 23000);
		cell4=new CellPhone("Samsung", "A50", "Camera", "Android", 22000);
		
	}
	
	@Test
	public void testEquals(){
		assertTrue(cell1.equals(cell2));
	}
	
	@Test
	public void testHashcode() {
		assertEquals(cell1.hashCode(), cell2.hashCode());
	}
	
	@Test
	public void testInsertionofDuplicatesInSet() {
		Set<CellPhone> set=new HashSet<CellPhone>();
		set.add(cell1);
		set.add(cell2);
		set.add(cell3);
		assertEquals(2, set.size());
		
	}
	
	@Test
	public void testInsertionofDuplicatesInList() {
		List<CellPhone> list=new ArrayList<CellPhone>();
		list.add(cell1);
		list.add(cell2);
		list.add(cell3);
		assertEquals(3, list.size());
		
	}
	
	@Test
	public void testInsertionOrder() {
		Set<CellPhone> set1=new HashSet<CellPhone>();
		set1.add(cell1);
		set1.add(cell2);
		set1.add(cell3);
		set1.add(cell4);
		CellPhone[] cell= {cell4,cell3,cell1};
		int i=0;
			
		for(CellPhone s:set1) {
			assertFalse(cell.toString().equals(s.toString()));
			i++;
		}
	}
	
	@After
	public void clear()
	{
		cell1=null;
		cell2=null;
		cell3=null;
		cell4=null;
	}
}
