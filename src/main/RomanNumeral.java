package main;

public class RomanNumeral {
    private final int number;

    public RomanNumeral(int i) {
        number = i;
    }

    public String getRomanNumeral() {
        String units = new String[]{"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"}[number % 10];
        String tens = new String[]{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"}[(number % 100) / 10];
        return tens + units;
    }
}