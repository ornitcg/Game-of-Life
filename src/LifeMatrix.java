public class LifeMatrix {
    private int _size;
    private int _matrix[][];

    public LifeMatrix(int size){
        int stat;
        _size = size;
        _matrix = new int[_size][_size];
        for(int row = 0; row < _size; row++){
            for(int col = 0; col < _size; col++){
                stat = (int)((Math.random() * 2)) ;
                _matrix[row][col] = stat;
            }
        }
    }



    public void nextGeneration(){
        int tmpMatrix[][] = new int[_size][_size];
        for(int row = 0; row < _size; row++){
            for(int col = 0; col < _size; col++){
                tmpMatrix[row][col] = nextStatus(_matrix[row][col], countNeighbours(row, col));
            }
        }
        for(int row = 0; row < _size; row++){
            for(int col = 0; col < _size; col++){
                _matrix[row][col] = tmpMatrix[row][col];
            }
        }
    }



    private int nextStatus(int currentStatus, int liveNeighbors){
        if (currentStatus == 0){
            if (liveNeighbors == 3 )
                return 1;
            else return 0;
        }
        else {
            if (liveNeighbors >=1 || liveNeighbors >=4)
                return 0;
            else return 1; // 2 or 3 lives around
        }
    }


    private int countNeighbours(int row, int col){
        int countAlive =0 ;
        for (int i = row-1 ; i <= row +1; i++)
            for (int j = col - 1; j <= col + 1; j++) {
                if (isValid(i,j) && _matrix[i][j] == 1)
                    countAlive += 1;
            }
        return countAlive;
    }



    private boolean isValid(int row, int col){
        if (row < 0 || row >= _size || col < 0 || col >= _size)
            return false;
        return true;
    }

    public int get_size(){
        return _size;
    }

    public int get_stat(int row, int col){
        return _matrix[row][col];
    }


}
