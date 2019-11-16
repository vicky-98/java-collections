package com.training.collections.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.training.collections.Car;
import com.training.collections.Laptop;

public class CarTest {
	Car car1,car2,car3,car4,car5;
	
	@Before
	public void objinitial()
	{
		car1=new Car("toyota", "Innova", 2017, 1200000);
		car2=new Car("benz", "E-class", 2018, 2500000);
		car3=new Car("nexa", "Ciaz", 2019, 800000);
		car4=new Car("hundai", "i20", 2019, 1000000);
		car5=new Car("benz", "E-class", 2018, 2500000);
	}

	@Test
	public void testSortCompareto() {
		List<Car> list=new ArrayList<Car>();
		list.add(car1);
		list.add(car2);
		list.add(car3);
		list.add(car4);
		Collections.sort(list);
		int i=0;
		for(Car c:list) {
			String[] cad= {"benz","hundai","nexa","toyota"};
			
			assertEquals(cad[i], c.getMake());
			i++;
		}
		
	}
	
	
	@Test
	public void testEquals(){
		assertTrue(car2.equals(car5));
	}
	
	@Test
	public void testHashcode() {
		assertEquals(car2.hashCode(), car5.hashCode());
	}
	
	@Test
	public void testInsertionofDuplicatesInSet() {
		Set<Car> set=new HashSet<Car>();
		set.add(car1);
		set.add(car2);
		set.add(car5);
		assertEquals(2, set.size());
		
	}
	
	@Test
	public void testInsertionofDuplicatesInList() {
		List<Car> list=new ArrayList<Car>();
		list.add(car1);
		list.add(car2);
		list.add(car5);
		assertEquals(3, list.size());
		
	}
	
	@Test
	public void testInsertionOrderinHashset() {
		Set<Car> set1=new HashSet<Car>();
		set1.add(car1);
		set1.add(car2);
		set1.add(car3);
		set1.add(car5);
		Car[] carz= {car5,car1,car3};
		int i=0;
			
		for(Car s:set1) {
			assertEquals(carz[i].toString(),s.toString());
			i++;
		}
		
		
	}
	
	@After
	public void destroyObject() {
		car1=null;
		car2=null;
		car3=null;
		car4=null;
		car5=null;
	}

}
