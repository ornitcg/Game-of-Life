// Author: Ornit Cohen gindi
// programmer can play with sqrSize and matSize. chose frame size larger *1.5 since it tends to be smaller
// than panel, when smaller sizes of matrix ans squares are chosen

import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Tester {
    public static void main(String[] args) {
        int input = 0;
        int sqrSize = 50, matSize = 10; // sizes can be changed from here
        JFrame frame = new JFrame("Game of Life");
        DrawMatrix panel = new DrawMatrix(matSize, sqrSize ); // this draws the matrix
        frame.setSize((int)(sqrSize * matSize * 1.5) ,(int)(sqrSize * matSize * 1.5) );
        // chose 1.5, since for small  sqrSize it usually enables showing the whole matrix
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        input = JOptionPane.showConfirmDialog(null, "Press Yes for next generation");

        while (input == 0) { // 0 for Yes
            panel.get_mat().nextGeneration();
            panel.repaint();
            input = JOptionPane.showConfirmDialog(null, "Press Yes for next generation");
        }
    }

}
