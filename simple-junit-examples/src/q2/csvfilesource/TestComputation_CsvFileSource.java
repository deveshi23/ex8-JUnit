package q2.csvfilesource;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import q1.computation.Computation;

public class TestComputation_CsvFileSource {

   private int input1, input2, expected;
   
   public static Collection<Object[]> data() {
	      return Arrays.asList(new Object[][] { //
	    	  {1, 1, 2},
	    	  {2, 1, 3},
	    	  {2, 3, 5}
	    	  }
	      );
	   }
   
   public TestComputation_CsvFileSource(int input1, int input2, int expected) {
	   this.input1 = input1;
	   this.input2 = input2;
	   this.expected = expected;
   }
   
   @ParameterizedTest
   @CsvFileSource(resources = "")
   public void testGetDiscount() throws Exception {
	   Computation com = new Computation();
	   int result = com.getDiscount(input1, input2);
      Assert.assertEquals(expected, result);

   }
}
