import framework.NumbersKihonBase;

import javax.naming.OperationNotSupportedException;

public class NumbersKihon extends NumbersKihonBase {
    @Override
    protected int returnTheMaximumValueOfInt() {
        return
    }

    @Override
    protected int returnTheMinimumValueOfInt() {
        return 0;
    }

    @Override
    protected int returnTheRemainderOfADividedByB(int a, int b) {
        return Integer.remainderUnsigned(a,b);
    }

    @Override
    protected double returnTheMaximumValueOfDouble() {
        return 0;
    }

    @Override
    protected double returnTheMinimumValueOfDouble() {
        return 0;
    }

    @Override
    protected boolean returnTrueIfAIsNotANumber(double a) {
        return Double.isNaN(a);
    }

    @Override
    protected boolean returnTrueIfAIsAnInfinite(double a) {
        return Double.isInfinite(a);
    }
}
