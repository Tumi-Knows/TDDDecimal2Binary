package binaryconverter;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Our tests are written in this class.
 *
 * @author Tumelo Matima <tumi.knows@gmail.com>
 */
public class BinaryConverterTest {
    
    @Test
    public void testDecimalToBinaryConverter(){
        //Object under test
        BinaryConverter converter = new BinaryConverter();
        
        //The following statement tests for scenario #1
        assertEquals("B", converter.convert(0));
        
        //The following tests for scenario #2
        assertEquals("A", converter.convert(1));
        
        //Scenario 3 test
        assertEquals("AB", converter.convert(2));
        
        //Scenario 4 test
        assertEquals("AA", converter.convert(3));
        
        //Scenario 5 test
        assertEquals("ABAB", converter.convert(10));
    }
}
