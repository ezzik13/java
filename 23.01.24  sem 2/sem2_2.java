public class sem2_2 {
    public static void main(String[] args) {
        String str1 = "aaabbbcddad";
        System.out.println(CompresString(str1));


    }
    public static String CompresString(String a) {
        String result = "";
        // charAt(i) и indefOf(s)
        for (int i = 0; i < a.length(); i++) {
            if(result.indexOf(a.charAt(i)) == -1) result += a.charAt(i);
        }
            return result;
    }
}
