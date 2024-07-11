public class Main {
    public static void main(String[] args) {
        System.out.println(StringToInt("1234"));


    }
    public static int StringToInt(String str) {
        int newNum = 0, multiply = 1;
        for (int i = str.length()-1; i >= 0; i--) {
            newNum += (str.charAt(i) - '0') * multiply;
            multiply *= 10;
        }
        return newNum;
    }
}