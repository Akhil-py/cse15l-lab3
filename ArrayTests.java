import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    int[] input2 = { 1, 2, 3 };
    ArrayExamples.reverseInPlace(input1);
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3 }, input1);
    assertArrayEquals(new int[]{ 3, 2, 1 }, input2);
  }


  @Test
  public void testReversed() {
    int[] input3 = { };
    int[] input4 = { 1, 2, 3, 4, 5 };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input3));
    assertArrayEquals(new int[]{ 5, 4, 3, 2, 1 }, ArrayExamples.reversed(input4));
  }

  @Test
  public void testAverageWithoutLowest(){
    double[] input5 = { 10.0, 9.0, 10.0 };
    double[] input6 = { 10, 10, 10 };
    double[] input7 = { 20 };
    double[] input8 = { };
    
    assertEquals(10.0, ArrayExamples.averageWithoutLowest(input5), 0.001);
    assertEquals(10.0, ArrayExamples.averageWithoutLowest(input6), 0.001);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input7), 0.001);
    assertEquals(0.0, ArrayExamples.averageWithoutLowest(input8), 0.001);
  }
}
