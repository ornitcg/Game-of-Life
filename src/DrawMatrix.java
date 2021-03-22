import javax.swing.*;
import java.awt.*;

public class DrawMatrix extends JPanel {
    private LifeMatrix _mat;

    public DrawMatrix(int size){
        _mat = new LifeMatrix(size);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g); // deletes the frame

        int matSize = _mat.get_size();
        int stat, sqrSize = 50;
        g.setColor(Color.BLACK);

        for (int row = 0; row < matSize; row++) {
            for (int col = 0; col < matSize; col++) {
                stat = _mat.get_stat(row, col);

                if (stat == 1) {
                    g.drawRect(col * sqrSize, row * sqrSize, sqrSize, sqrSize);
                    g.fillRect(col * sqrSize, row * sqrSize, sqrSize, sqrSize);
                } else
                    g.drawRect(col * sqrSize, row * sqrSize, sqrSize, sqrSize);
                System.out.print(stat + " ");

            }
            System.out.println("");
        }

    }

    public LifeMatrix get_mat() {
        return _mat;
    }
}// end class
