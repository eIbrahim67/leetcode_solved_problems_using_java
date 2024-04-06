public class StrStr {

    public int strStr(String haystack, String needle) {

        if (!haystack.contains(needle))
            return -1;

        int str = 0;
        String temp = "";
        for (int i = str; i < haystack.length(); i++){

            temp += String.valueOf(haystack.charAt(i));

            if (needle.contains(temp)){
                if (needle.equals(temp))
                    return str;
            }
            else {
                i = str;
                str++;
                temp = "";
            }
        }

        return -1;

    }

}
