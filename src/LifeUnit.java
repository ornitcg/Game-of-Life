public class LifeUnit {
    int _x;
    int _y;
    int _stat; // gets values of 0 and 1

    public LifeUnit(int x , int y, int stat){
        _x = x;
        _y = y;
        _stat = stat;
    }

    public int get_stat(){
        return _stat;
    }


}
