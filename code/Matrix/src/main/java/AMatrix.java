public abstract class AMatrix implements IMatrix {
    private int nRows;
    private int nCols;

    public int getRows(){return nRows;}
    public int getCols(){return nCols;}
    public void setRows(int nRows){this.nRows=nRows;}
    public void setCols(int nCols){this.nCols=nCols;}

    protected abstract double getElement(int nRow,int nCol);
    protected abstract void setElement(int nRow,int nCol, double dVal);
    protected abstract AMatrix createMatrix(int nRows,int nCols);
    protected abstract AMatrix copyMatrix();

    @Override
    public String toString() {
        String s = "";
        char cUL = (char)0x250C;
        char cUR = (char)0x2510;
        char cLL = (char)0x2514;
        char cLR = (char)0x2518;
        char cVLine = (char)0x2502;

        //build the top row
        s += cUL;
        for (int j = 1; j <= this.getCols(); j++)
        {
            s += "\t\t";
        }
        s += cUR + "\n";

        //build the data rows
        for (int i = 1; i <= this.getRows(); i++)
        {
            s += cVLine;
            for (int j = 1; j <= this.getCols(); j++)
            {
                if (this.getElement(i, j) >= 0)
                {
                    s += " ";
                }
                s += String.format("%.2f", this.getElement(i, j)) + "\t";

            }
            s += cVLine + "\n";
        }
        //Build the bottom row
        s += cLL;
        for (int j = 1; j <= this.getCols(); j++)
        {
            s += "\t\t";
        }
        s += cLR + "\n";
        return s;
    }

    @Override
    public IMatrix Add(IMatrix mRight) throws IllegalArgumentException {
        AMatrix mLeftOp = this;
        AMatrix mRightOp = (AMatrix) mRight;
        AMatrix mRs = null;
        if(mLeftOp.getCols()!=mRightOp.getCols() ||
        mLeftOp.getRows()!=mRightOp.getRows())
        {
            throw new IllegalArgumentException("Matrices must be the same size for addition.");
        }
        mRs = createMatrix(mLeftOp.nRows, mLeftOp.nCols);
        //Because Matrix 1 based
        //So we follow the same rule here
        for(int r = 1;r<mLeftOp.nRows;r++)
        {
            for(int c=1;c<mLeftOp.nCols;c++)
            {
                mRs.setElement(r,c,mLeftOp.getElement(r,c)+mRightOp.getElement(r,c));
            }
        }
        return mRs;
    }

    @Override
    public IMatrix Subtract(IMatrix mRight) throws IllegalArgumentException {
        return null;
    }

    @Override
    public IMatrix Multiply(IMatrix mRight) throws IllegalArgumentException {
        return null;
    }

    @Override
    public IMatrix ScalarMultiply(double dScalar) {
        return null;
    }
}
