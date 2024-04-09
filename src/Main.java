
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{9,8,7,6,5,4,3,2,1,0};
        plusOne(arr);
    }

    public static int[] plusOne(int[] digits) {

        int num = 0;
        int len = 0;

        for (int i = 0; i < digits.length; i++) {

            num += digits[i];

            if (i != digits.length - 1)
                num *= 10;
            len++;

        println(num);
        }

        if (String.valueOf(num + 1).length() > String.valueOf(num).length())
            len++;

        num++;

        int[] arr = new int[len];


        for (int i = arr.length - 1; i > -1; i--) {

            arr[i] = num % 10;
            num /= 10;

        }
        

        return arr;
    }

    public static void print(Object s){
        System.out.print(s);
    }

    public static void println(Object s){
        System.out.println(s);
    }

}