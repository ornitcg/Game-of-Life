
import javax.swing.*;

import static javax.swing.JOptionPane.*;

public class Tester {
    public static void main(String[] args) {
        int input = 0;
        JFrame frame = new JFrame("my first GUI");
        DrawMatrix panel = new DrawMatrix(10);
        frame.setSize(530,550);
        frame.add(panel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

//        frame.repaint();
        frame.setVisible(true);
        input = JOptionPane.showConfirmDialog(null, "Press Ok for next generation");

        while (input == 0) {
            System.out.println("input value = " + input);
            if (input == 0)
                panel.get_mat().nextGeneration();
            panel.repaint();
            input = JOptionPane.showConfirmDialog(null, "Press Yes for next generation");

        }
    }

}
