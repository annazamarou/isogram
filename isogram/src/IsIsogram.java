import java.util.Arrays;

public class IsIsogram {
    public static void main(String[] args) {
      String str = "gggkkslad";
        System.out.println(isIsogram(str));
        String str1 = "";
        System.out.println(isIsogram(str1));
        String str2 = "dfgh";
        System.out.println(isIsogram(str2));
    }
    public static boolean isIsogram(String str) {
        if (str.isEmpty()) {
            return true;
        }
        str = str.toLowerCase();
        int len = str.length();

        char [] arr = str.toCharArray();

        Arrays.sort(arr);
        for (int i = 0; i < len - 1; i++) {
            if (arr[i] == arr[i + 1])
                return false;
        }
        return true;
    }

}
