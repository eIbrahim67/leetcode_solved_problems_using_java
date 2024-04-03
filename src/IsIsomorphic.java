import java.util.Scanner;

public class IsIsomorphic {

    public static boolean isIsomorphic(String s, String t) {

        String s1 = "";
        String s2 = "";

        for (char c :s.toCharArray()) {

            if (s1.indexOf(c) == -1)
                s1 += c;

        }

        for (char c :t.toCharArray()) {
            if (s2.indexOf(c) == -1)
                s2 += String.valueOf(c);

        }

        System.out.println(s1);
        System.out.println(s2);

        return s1.length() == s2.length();
    }


}
