public class PlusOne {

    public int[] plusOne(int[] digits) {

        int rem;
        int i = digits.length - 2;

        if (digits[digits.length - 1] + 1 > 9){
            digits[digits.length - 1] = 0;
            rem = 1;
        }else{
            digits[digits.length - 1]++;
            return digits;
        }

        while (rem == 1){


            if (i < 0){

                int[] arr = new int[digits.length + 1];

                arr[0] = 1;

                return arr;

            }
            else {

                if (digits[i] + 1 > 9){
                    digits[i] = 0;
                    rem = 1;
                    i--;
                }else{
                    digits[i]++;
                    return digits;
                }

            }
        }


        return digits;
    }

}
