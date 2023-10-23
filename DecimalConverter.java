public class DecimalConverter {
    public static String decimalToBinary(int decimalNum) {
        return Integer.toBinaryString(decimalNum);
    }

    public static String decimalToOctal(int decimalNum) {
        return Integer.toOctalString(decimalNum);
    }
  DecimalConverterTest.java
  public class DecimalConverterTest {
    public static void main(String[] args) {
        testDecimalToBinary();
        testDecimalToOctal();
    }

    public static void testDecimalToBinary() {
        int[] testCases = {10, 42, 123, 255};

        for (int decimalNum : testCases) {
            String binaryResult = DecimalConverter.decimalToBinary(decimalNum);
            String expectedBinary = Integer.toBinaryString(decimalNum);

            if (binaryResult.equals(expectedBinary)) {
                System.out.println("Decimal: " + decimalNum + ", Binary: " + binaryResult + " - Conversion Verified!");
            } else {
                System.out.println("Binary conversion failed for " + decimalNum + ": expected " + expectedBinary + ", got " + binaryResult);
            }
        }
    }

    public static void testDecimalToOctal() {
        int[] testCases = {10, 42, 123, 255};

        for (int decimalNum : testCases) {
            String octalResult = DecimalConverter.decimalToOctal(decimalNum);
            String expectedOctal = Integer.toOctalString(decimalNum);

            if (octalResult.equals(expectedOctal)) {
                System.out.println("Decimal: " + decimalNum + ", Octal: " + octalResult + " - Conversion Verified!");
            } else {
                System.out.println("Octal conversion failed for " + decimalNum + ": expected " + expectedOctal + ", got " + octalResult);
            }
        }
    }
}
