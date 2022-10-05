public class App {
    public static void main(String[] args) {
        IFunction func1 = new Func1();
        func1.printTable(0.0,10.0,1.0);
        System.out.println(func1.leftRectRule(3.0,9.0,
                1E-6,20));
        System.out.println(func1.leftRectRule(0,    10.0,
                1E-6,35));
        System.out.println(func1.leftRectRuleEfficient(3.0,9.0,
                1E-6,20));
        System.out.println(func1.leftRectRuleEfficient(0,    10.0,
                1E-6,35));
    }
}
