package Strings.Easy;
import java.util.*;


public class BubbleArray {

    public static String reverse(String string) {
        String[] result = string.split(" ");
        StringBuffer sb = new StringBuffer();

        for (int i = result.length - 1; i >= 0; i--) {
            if (!result.equals("")) {
                sb.append(result[i]).append(" ");
            }

        }


        if (sb.length() == 0) return "";

        return sb.substring(0, sb.length() - 1);
    }

    public static void main(String[] args) {
//        String str="hel'lo th:'is!@#$ is pranith";
//        /**using regular expressions and converting a string to character array*/
//        str=str.replaceAll("[^a-zA-Z0-9]","");
//        char[] ch=str.toCharArray();
//        System.out.println(Arrays.toString(ch));
//        /**[h, e, l, l, o, t, h, i, s, i, s, p, r, a, n, i, t, h]*/

        int string = 345;
        System.out.println(String.valueOf(string));


    }

    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ch[ch.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }

    public String reverseString(String s) {

        char[] word = s.toCharArray();
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char temp = word[i];
            word[i] = word[j];
            word[j] = temp;
            i++;
            j--;
        }
        return new String(word);
    }

    public int romanToInt(String s) {

        if (s.length() == 0 || s == null) return 0;
        int result = 0;
        Map<Character, Integer> map = new HashMap<>();


        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        result = map.get(s.charAt(s.length() - 1));

        for (int i = s.length() - 2; i >= 0; i--) {
            if (map.get(s.charAt(i + 1)) <= map.get(s.charAt(i)))
                result += map.get(s.charAt(i));
            else
                result -= map.get(s.charAt(i));

        }

        return result;
    }

    public String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                sb.append(strs[i]);
            }
        }

        return sb.toString();
    }

    public int myAtoi(String str) {

        str = str.trim();
        if (str.length() == 0 || str == null) return 0;
        char flag = '+';

        int i = 0;
        double result = 0;

        if (str.charAt(0) == '-') {
            flag = '-';
            i++;
        } else if (str.charAt(0) == '+') {
            i++;
        }

        while (i < str.length() && str.charAt(i) >= '0' && str.charAt(i) <= '9') {
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }

        if (flag == '-')
            result = -result;


        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;

        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;

        return (int) result;
    }

    public String validIPAddress(String IP) {
        if (IP.length() == 0) return "Neither";
        if (IPV4Check(IP)) return "IPv4";

        if (isIP6(IP)) return "IPv6";

        return "Neither";
    }

    public boolean IPV4Check(String str) {
        if (str.charAt(0) == '.' || str.charAt(str.length() - 1) == '.') return false;
        String[] temp = str.split("\\.");
        if (temp.length != 4) return false;

        for (int i = 0; i < temp.length; i++) {
            try {
                if (temp[i].startsWith("0") && temp[i].length() > 1) return false;
                if (Integer.parseInt(temp[i]) > 255 || temp[i].charAt(0) == '-' || temp[i].charAt(0) == '+')
                    return false;
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }

    public boolean isIP6(String IP) {
        if (IP.charAt(0) == ':' || IP.charAt(IP.length() - 1) == ':') return false;
        String[] temp = IP.split(":");
        if (temp.length != 8) return false;
        for (int i = 0; i < 8; i++) {
            if (temp[i].length() > 4 || temp[i].length() == 0) return false;
            for (int j = 0; j < temp[i].length(); j++) {
                if ((temp[i].charAt(j) >= '0' && temp[i].charAt(j) <= '9') || (temp[i].charAt(j) >= 'a' && temp[i].charAt(j) <= 'f') || (temp[i].charAt(j) >= 'A' && temp[i].charAt(j) <= 'F')) {
                } else return false;
            }
        }
        return true;
    }

    public String reverseVowels(String s) {

        List<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        list.add('A');
        list.add('E');
        list.add('I');
        list.add('O');
        list.add('U');


        char[] my = s.toCharArray();

        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (!list.contains(my[i])) {
                i++;
                continue;
            }

            if (!list.contains(my[j])) {
                j--;
                continue;
            }

            char temp = my[i];
            my[i] = my[j];
            my[j] = temp;

            i++;
            j--;


        }

        return new String(my);
    }
    }

    