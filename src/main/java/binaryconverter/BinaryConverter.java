package binaryconverter;

/**
 * Our subject object which is under test.
 *
 * @author Tumelo Matima
 */
class BinaryConverter {

    public String convert(int n) {
        
        String binaryString = "";
        final int divisor = 2; //2 is the common factor of all binary numbers
        int result = n;
        int remainder; 
        
        if (result != 0) {
            while(result >= 1){
                remainder = result % divisor;
                if(remainder == 1)
                    binaryString = "A".concat(binaryString);
                else
                   binaryString = "B".concat(binaryString);
                result = result / divisor;
            }   
        } else {
            binaryString = "B";
        }
        
        return binaryString;
    }

}
