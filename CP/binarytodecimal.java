public class binarytodecimal {
    public static void binaryToDecimal(String binary) {
        int dec = 0;
        int pow = 0;

      
        for (int i = binary.length() - 1; i >= 0; i--) {
            char bit = binary.charAt(i); 
            if (bit == '1') { 
                dec += Math.pow(2, pow);
            }
            pow++;
        }

        System.out.println(dec); 
    }

    public static void main(String[] args) {
        binaryToDecimal("0111");
    }
}
