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
            if (result == 1) {
                binaryString = "A";
            }
            
            while(result >= 1){
                if (result == 1){
                    "A".concat(binaryString);
                    result = 0;
                    break;
                }
                
                remainder = result % divisor;
                if(remainder == 1)
                    "A".concat(binaryString);
                else
                    "B".concat(binaryString);
                result = result / divisor;
            }   
        } else {
            binaryString = "B";
        }
        
        return binaryString;
    }

}
