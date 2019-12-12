package BID.SWE;

public class MapImpl extends Map {
    int _count;
    float _amount;
    String name;
    @Override
    public String GetMapName() {
        return name;
    }

    @Override
    public float GetMapSize(float amount) {
        this._amount = amount;
        return _amount;
    }

    @Override
    public int AddNewCells(int count) {
        this._count = count;
        return _count;
    }
}
