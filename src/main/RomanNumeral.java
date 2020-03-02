package main;

public class RomanNumeral {
    private final int number;

    public RomanNumeral(int i) {
        number = i;
    }

    public String getRomanNumeral() {
        String units = new String[]{"", "I", "II", "III", "IV", "V",}[number % 10];
        return units;
    }
}