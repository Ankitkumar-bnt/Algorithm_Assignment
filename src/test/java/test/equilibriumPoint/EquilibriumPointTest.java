package test.equilibriumPoint;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.equilibriumPoint.EquilibriumPoint;

public class EquilibriumPointTest {

	@Test
	void equilibriumPoint_whenArrayContainsEquiPosition_thenReturnsPosition()
	{
		assertEquals(3, EquilibriumPoint.equilibriumPoint(new Integer[] {5, -2, 11, 0, 3}));
	}
	
	@Test
	void equilibriumPoint_whenArrayNotContainsEquiPosition_thenReturnsNegativeOne()
	{
		assertEquals(-1, EquilibriumPoint.equilibriumPoint(new Integer[] {5, -2, 11, 7, 3}));
	}
	
	@Test
	void equilibriumPoint_whenArrayContainsOneElement_thenReturnsOne()
	{
		assertEquals(1, EquilibriumPoint.equilibriumPoint(new Integer[] {5}));
	}
	
	@Test
	void equilibriumPoint_whenArrayContainsTwoElements_thenReturnsNegativeOne()
	{
		assertEquals(-1, EquilibriumPoint.equilibriumPoint(new Integer[] {5, -2}));
	}
}
