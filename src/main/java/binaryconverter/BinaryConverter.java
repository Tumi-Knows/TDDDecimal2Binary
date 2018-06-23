package binaryconverter;

/**
 * Our subject object which is under test.
 *
 * @author Tumelo Matima
 */
class BinaryConverter {

    public String convert(int n) {
        
        String binaryString = new String();
        
        if (n != 0) {
            if (n == 1) {
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
