package test.immdiateSmallerElement;

import org.junit.jupiter.api.Test;

import com.immdiateSmallerElement.ImmdiateSmallerElement;

public class ImmdiateSmallerElementTest {

	@Test
	public void immediateSmaller_whenAllDescendingArrayGiven_thenReturnsAllNextElements() {
	    int[] input = {9, 7, 5, 3};
	    ImmdiateSmallerElement.immediateSmaller(input);
	}

	@Test
	public void immediateSmaller_whenAllAscendingArrayGiven_thenReturnsAllMinusOne() {
	    int[] input = {1, 2, 3, 4};
	    ImmdiateSmallerElement.immediateSmaller(input);
	}

	@Test
	public void immediateSmaller_whenMixedElementsGiven_thenReturnsCorrectNextSmallerOrMinusOne() {
	    int[] input = {4, 2, 5, 1, 3};
	    ImmdiateSmallerElement.immediateSmaller(input);
	}

	@Test
	public void immediateSmaller_whenSingleElementArrayGiven_thenReturnsMinusOne() {
	    int[] input = {5};
	    ImmdiateSmallerElement.immediateSmaller(input);
	}
}
