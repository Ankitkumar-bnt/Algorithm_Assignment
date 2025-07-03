package test.uniqueSubset;

import org.junit.jupiter.api.Test;

import com.uniqueSubset.UniqueSubset;

public class UniqueSubsetTest {

	@Test
	public void testSubset_withDistinctElements() {
	    int[] arr = {1, 2, 3};
	    int size = arr.length;
	    java.util.Arrays.sort(arr);
	    UniqueSubset.getSubset(arr, size);
	}

	@Test
	public void testSubset_withDuplicates() {
	    int[] arr = {1, 2, 2};
	    int size = arr.length;
	    java.util.Arrays.sort(arr);
	    UniqueSubset.getSubset(arr, size);
	}

	@Test
	public void testSubset_withEmptyArray() {
	    int[] arr = {};
	    int size = arr.length;
	    UniqueSubset.getSubset(arr, size);
	}

	@Test
	public void testSubset_singleElement() {
	    int[] arr = {5};
	    int size = arr.length;
	    UniqueSubset.getSubset(arr, size);
	}

	@Test
	public void testSubset_allDuplicates() {
	    int[] arr = {7, 7, 7};
	    int size = arr.length;
	    java.util.Arrays.sort(arr);
	    UniqueSubset.getSubset(arr, size);
	}

	@Test
	public void testSubset_largeInput() {
	    int[] arr = {1, 2, 2, 3, 3};
	    int size = arr.length;
	    java.util.Arrays.sort(arr);
	    UniqueSubset.getSubset(arr, size);
	}

}
