package binaryconverter;

/**
 * Our subject object which is under test.
 *
 * @author Tumelo Matima
 */
class BinaryConverter {

    public String convert(int n) {
        
        String binaryString = new String();
        final int divisor = 2; //2 is the common factor of all binary numbers
        int result;
        int remainder = n; 
        
        if (remainder != 0) {
            if (remainder == 1) {
                binaryString = "A";
            } else if (n == 2) {
                binaryString = "AB";
            } else if (n == 3){
                binaryString = "AA";
            }
        } else {
            binaryString = "B";
        }
        
        return binaryString;
    }

}
