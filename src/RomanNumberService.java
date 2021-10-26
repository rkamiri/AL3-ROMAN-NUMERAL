import java.util.TreeMap;

public class RomanNumberService {
    private final static TreeMap<Integer, String> romanNumbers = new TreeMap<Integer, String>();
    static {
        romanNumbers.put(1000, "M");
        romanNumbers.put(900, "CM");
        romanNumbers.put(500, "D");
        romanNumbers.put(400, "CD");
        romanNumbers.put(100, "C");
        romanNumbers.put(90, "XC");
        romanNumbers.put(50, "L");
        romanNumbers.put(40, "XL");
        romanNumbers.put(10, "X");
        romanNumbers.put(9, "IX");
        romanNumbers.put(5, "V");
        romanNumbers.put(4, "IV");
        romanNumbers.put(1, "I");
    }
    
    public static String toRoman(int arabicNumber) throws Exception {
        if(arabicNumber > 0){
            int closestUpperRomanNumber = romanNumbers.floorKey(arabicNumber);
            if(arabicNumber == closestUpperRomanNumber) {
                return romanNumbers.get(arabicNumber);
            }
            return romanNumbers.get(closestUpperRomanNumber) +
                    toRoman(arabicNumber - closestUpperRomanNumber);
        }
        else if(arabicNumber == 0){
            return "0";
        }
        else{
            throw new Exception(arabicNumber + " is not a valid number to be converted to roman");
        }
    }
}
