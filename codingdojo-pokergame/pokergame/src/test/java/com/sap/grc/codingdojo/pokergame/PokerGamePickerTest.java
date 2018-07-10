package com.sap.grc.codingdojo.pokergame;

import static org.junit.Assert.assertEquals;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class PokerGamePickerTest {

	private PokerGamePicker picker = new PokerGamePicker();

	@Test
	public void test01_pick() {

		int n = 1;
		int[] ret = { 1 };

		int[] output = picker.doPick(n);

		assertEquals(1, output.length);
		assertEquals(1, output[0]);
	}

	@Test
	public void test02_pick() {

		int n = 2; // 1,2
		int[] ret = { 1, 2 };

		int[] output = picker.doPick(n);

		assertEquals(2, output.length);
		assertEquals(1, output[0]);
		assertEquals(2, output[1]);
	}

	@Test
	public void test03_pick() {

		int n = 3; // 1,2,3
		int[] ret = { 1, 3, 2 };

		int[] output = picker.doPick(n);

		assertEquals(3, output.length);
		assertEquals(1, output[0]);
		assertEquals(3, output[1]);
		assertEquals(2, output[2]);
	}

	@Test
	public void test04_pick() {

		int n = 4; // 1,2,3,4
		int[] ret = { 1, 3, 2, 4 };

		int[] output = picker.doPick(n);

		assertEquals(4, output.length);
		assertEquals(1, output[0]);
		assertEquals(3, output[1]);
		assertEquals(2, output[2]);
		assertEquals(4, output[3]);
	}

	@Test
	public void test05_pick() {

		int n = 4; // 1,2,3,4
		int[] inputArray = { 1, 3, 2, 4 };

		int[] output = picker.doPick2(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 });
		int[] ret = picker.getOrderInput(output);

		int[] ret2 = picker.doPick2(ret);

		// int[] x = picker.doPick(ret);

		// a = x.length;
	}

}
