package BID.SWE;

import java.util.Date;

public class Exercise1Impl implements Exercise1
{
    @Override
    public Object Method1() {
        /*return new CellPrinter() {
            @Override
            public String PrintState(boolean b, Date date, String s) {
                return null;
            }

            @Override
            public String PrintPostion(int i, int i1) {
                return null;
            }
        };*/
        return new cellPrinter();
    }
}


