import javax.swing.*;
import java.awt.*;

public class DrawMatrix extends JPanel {
    private LifeMatrix _mat;

    public DrawMatrix(int size){
        _mat = new LifeMatrix(size);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g); // deletes the frame

//        int matSize = mat.get_size();
//        int stat, sqrSize = 20;
//
//        for (int row = 0; row < matSize; row++)
//            for (int col = 0; col < matSize; col++) {
//                stat = mat.get_stat(row, col);
//                if (stat == 1)
//                    g.setColor(Color.BLACK);
//                else
//                    g.setColor(Color.WHITE);
//                g.fillRect(row * sqrSize, col * sqrSize,  sqrSize, sqrSize);
//            }
        g.setColor(Color.cyan);
        g.fillOval(0,0,50,50);
    }


}// end class
