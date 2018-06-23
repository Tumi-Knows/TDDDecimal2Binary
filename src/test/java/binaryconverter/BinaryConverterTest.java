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
        assertSame("B", converter.convert(0));
        
        //The following tests for scenario #2
        assertSame("A", converter.convert(1));
        
        //Scenario 3 test
        assertSame("AB", converter.convert(2));
        
        //Scenario 4 test
        assertSame("AA", converter.convert(3));
    }
}
