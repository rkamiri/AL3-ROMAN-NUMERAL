public class Main {
    public static void main(String[] args) {
        try {
            System.out.println(RomanNumberService.toRoman(854));
            System.out.println(RomanNumberService.toRoman(0));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
