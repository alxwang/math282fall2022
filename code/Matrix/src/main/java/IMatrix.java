public interface IMatrix {
    IMatrix Add(IMatrix mRight) throws IllegalArgumentException ;
    IMatrix Multiply(IMatrix mRight)throws IllegalArgumentException ;
    IMatrix ScalarMultiply(double dScalar);
    IMatrix Subtract(IMatrix mRight)throws IllegalArgumentException ;
}
