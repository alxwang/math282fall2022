public class App {


    public static void main(String[] args) {
//        IFunction func1 = new Function1();
//        func1.printTable(-1.0,1.0,1.0);
//
        IFunction func2 = new Function2();
        func2.printTable(-5.0,5.0,0.5);
        System.out.println(func2.findZero(2.5,2.0,
                1E-7));
    }
}
