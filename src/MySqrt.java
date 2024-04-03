public class MySqrt {

    public int mySqrt(int x) {

        int num = 1;
        while (num * num <= x){

            if (num * num == x)
                return num;
            num++;

        }

        return num - 1;
    }

}
