package test.uniqueSubset;

import org.junit.jupiter.api.Test;

import com.uniqueSubset.UniqueSubset;

public class UniqueSubsetTest {

	 @Test
	    public void testSubset_123() {
	        int[] arr = {1, 2, 3};
	        int size = arr.length;
	        java.util.Arrays.sort(arr); // your original code sorts the array
	        UniqueSubset.getSubset(arr, size);
	 }
	 
	 @Test
	    public void testSubset_122() {
	        int[] arr = {1, 2, 2};
	        int size = arr.length;
	        java.util.Arrays.sort(arr);
	        UniqueSubset.getSubset(arr, size);
	    }

	    @Test
	    public void testSubset_empty() {
	        int[] arr = {};
	        int size = arr.length;
	        UniqueSubset.getSubset(arr, size);
	    }
}
