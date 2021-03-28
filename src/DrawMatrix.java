import javax.swing.*;
import java.awt.*;

public class DrawMatrix extends JPanel {
    private LifeMatrix _mat;
    private int _sqrSize;

    /*  constructor */
    public DrawMatrix(int matSize, int sqrSize){
        _mat = new LifeMatrix(matSize);
        _sqrSize = sqrSize;
    }

    /* cleans the panel and draws the current matrix */
    public void paintComponent(Graphics g) {
        super.paintComponent(g); // clears the frame

        int matSize = _mat.get_size();
        g.setColor(Color.BLACK);

        for (int row = 0; row < matSize; row++) {
            for (int col = 0; col < matSize; col++) {
                g.drawRect(col * _sqrSize, row * _sqrSize, _sqrSize, _sqrSize); // to draw the outline of the square

                if (_mat.get_stat(row, col) == 1) { // if there is life in coordinate(row,col)
                    g.fillRect(col * _sqrSize, row * _sqrSize, _sqrSize, _sqrSize); // to fill the square
                }
            }
        }
    }

    // getters

    public LifeMatrix get_mat() {
        return _mat;
    }
    public int get_sqrSize(){
        return _sqrSize;
    }
}// end class
