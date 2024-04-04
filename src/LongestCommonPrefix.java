public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1)
            return strs[0];

        Boolean doBreak = false;
        String prefix = "";
        String main = strs[0];
        for (char c: main.toCharArray()) {
            prefix += String.valueOf(c);
            //.contains(prefix)
            for (int i = 1; i < strs.length; i++) {
                if (strs[i].length() >= prefix.length()){
                    if (!strs[i].substring(0, prefix.length()).equals(prefix)){
                        prefix = prefix.substring(0, prefix.length() - 1);
                        doBreak = true;
                        break;
                    }
                }
                else {
                    prefix = prefix.substring(0, prefix.length() - 1);
                    doBreak = true;
                    break;
                }
            }
            if (doBreak)
                break;
        }
        return prefix;
    }

}
