package binaryconverter;

/**
 * Our subject object which is under test.
 *
 * @author Tumelo Matima
 */
class BinaryConverter {

    public String convert(int n) {
        if (n != 0) {
            if (n == 1) {
                return "A";
            }
            return "AA";
        } else {
            return "B";
        }
    }

}
