
public class Main {
    public static void main(String[] args) {


    }
//    public static String addBinary(String a, String b) {
//
//        String sum = "";
//        String rem = "";
//
//        for (int i = 0; i < a.length(); i++) {
//
//            if (b.length() > i){
//
//                if (rem.isEmpty() || rem.equals("0")){
//                    if (a.charAt(i) == '1' && b.charAt(i) == '1' ){
//                        sum += "0";
//                        rem = "1";
//                    }
//                    else if (a.charAt(i) == '0' && b.charAt(i) == '0' ){
//                        sum += "0";
//                    }
//                    else{
//                        sum += "1";
//                        rem = "";
//                    }
//                }
//                else {
//                    if (a.charAt(i) == '1' && b.charAt(i) == '1' ){
//                        sum += "1";
//                        rem = "1";
//                    }
//                    else if (a.charAt(i) == '0' && b.charAt(i) == '0' ){
//                        sum += "1";
//                        rem = "";
//                    }
//                    else{
//                        sum += "0";
//                        rem = "1";
//                    }
//                }
//            }
//            else
//            {
//                if (rem.isEmpty() || rem.equals("0")){
//                    sum += a.charAt(i);
//                    rem = "";
//                }
//                else {
//                    if (a.charAt(i) == '1'){
//                        sum += "0";
//                        rem = "1";
//                    }
//                    else {
//                        sum += "1";
//                        rem = "";
//                    }
//                }
//            }
//
//            System.out.println(sum);
//            System.out.println(rem);
//
//
//        }
//
//        if (rem.equals("0") || rem.equals("1")){
//            sum += rem;
//        }
//
//        StringBuilder reversed = new StringBuilder();
//
//        // Append characters of the original string in reverse order
//        for (int i = sum.length() - 1; i >= 0; i--) {
//            reversed.append(sum.charAt(i));
//        }
//
//        return reversed.toString();
//
//    }



    public static void print(String s){
        System.out.println(s);
    }
}