package BID.SWE;

public class cell extends Cell {
    public boolean IsAlive() {
        return true;
    }

    @Override
    public int Grow() {
        ++this._size;
        return this._size*2;
    }

}
