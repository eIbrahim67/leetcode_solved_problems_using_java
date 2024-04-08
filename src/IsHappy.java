public class IsHappy {

    public boolean isHappy(int n) {

        while (n > 6 || n == 1){
            int temp = 0;
            while (n != 0){

                temp += ((n % 10) * (n % 10));
                n /= 10;
            }
            n = temp;

            if (n == 1)
                return true;
        }

        return false;
    }

}
