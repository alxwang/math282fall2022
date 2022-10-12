public class App {
    public static double[][] dArray1 = { { 12.0, 3.0, 52.0 }, { -10.0, 45.0, 0.98 } };
    public static double[][] dArray2 = { { 1.0, 3.0 }, { -1.0, 2.0 } };
    public static double[][] dArray3 = { { -2.0, 2.0 }, { 7.0, 8.0 } };

    public static void main(String[] args) {
        System.out.println("Hello World");

        TestCreateMatrix();
        TestAdd();
    }

    public static void TestCreateMatrix()
    {
        System.out.println("Testing creating matrices");

        Matrix m = new Matrix(dArray1);
        dArray1[0][0] = 0.0; // shouldn't affect m
        // since our constructor makes a deep copy of the array

        System.out.println("Creating matrix from array:");
        System.out.println(m.toString());

        //System.out.println("Creating matrix from another matrix (copy constructor):");
        //IMatrix m2 = new Matrix((Matrix)m);
        //System.out.println(m2);

        dArray1[0][0] = 12.0; // set it back so it doesn't affect other tests

        try
        {
            m = new Matrix(new double[0][0]);
            System.out.println(m);
        }
        catch (Exception e)
        {
            System.out.println("Matrix could not be created\n" + e);
        }
    }

    public static void TestAdd()
    {
        IMatrix m1 = new Matrix(dArray1);
        IMatrix m2 = new Matrix(dArray2);
        IMatrix m3 = new Matrix(dArray3);

        System.out.println("\n\nTesting matrix addition");
        IMatrix mSum = m2.Add(m3);
        System.out.println(mSum);

        try
        {
            mSum = m1.Add(m2);
            System.out.println(mSum);
        }
        catch (Exception e)
        {
            System.out.println("Couldn't add\n" + e);
        }
    }

}
