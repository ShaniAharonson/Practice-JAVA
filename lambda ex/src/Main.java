public class Main {
    public static void main(String[] args) {
Calc c1 = (a,b) -> a+b;
Calc c2 = (a,b) -> a-b;
Calc c3 = (a,b) -> a*b;
Calc c4 = (a,b) -> a/b;
        System.out.println(c1.fun1(2,4));
        System.out.println(c2.fun1(2,4));
        System.out.println(c3.fun1(2,4));
        System.out.println(c4.fun1(2,4));
    }
     interface Calc{
        int fun1(int a, int b);
    }
}