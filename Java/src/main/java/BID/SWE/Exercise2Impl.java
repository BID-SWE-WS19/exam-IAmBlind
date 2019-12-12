package BID.SWE;

public class Exercise2Impl implements Exercise2
{
    public int size;

    @Override
    public Object Method1() {
        //Cell cell = new Cell();
        return new cell();
    }

    @Override
    public int Method2() {
        cell cellGrowth = new cell();
        return cellGrowth.Grow();
    }

    @Override
    public boolean Method3(int i) {
        int Neighbours = i;
        boolean even = true;
        boolean odd = false;

        //Cell cellState = new Cell();
        cell cellState = new cell();
        //cellState.isAlive();

        // check if even or not
        if(Neighbours % 2 == 0){
            return even;
            //return even;
        } else{
            return odd;
            //return odd;
        }
    }
}
