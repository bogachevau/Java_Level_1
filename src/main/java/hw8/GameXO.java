package hw8;

import javax.swing.*;
import java.awt.*;

public class GameXO extends JFrame {

    private static final ImageIcon DEFAULT = new ImageIcon("def.png");
    public static final ImageIcon ICON_X = new ImageIcon("x.png");
    public static final ImageIcon ICON_O = new ImageIcon("O.png");
    private static JButton[][] map;

    public GameXO() throws HeadlessException {
        setSize(450,450);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        JPanel panel = new JPanel(new GridLayout(3,3));
        map = new JButton[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j <3; j++) {
                map[i][j] = new JButton();
                map[i][j].setIcon(DEFAULT);
                JButton cur = map[i][j];
                panel.add(cur);
                cur.addActionListener(a -> {
                    cur.setDisabledIcon(ICON_X);
                    cur.setIcon(ICON_X);
                    cur.setEnabled(false);
                    if (checkVictory(ICON_X)){
                        new EndGameDialog();
                        dispose();
                    }
                    movePC();
                    if (checkVictory(ICON_O)){
                        new EndGameDialog();
                        dispose();
                    }
                });
            }
            
        }
        add(panel);
        setVisible(true);
    }

    private void movePC() {
        int x, y;
        do {
            x = (int) (Math.random() * 3);
            y = (int) (Math.random() * 3);
        } while (!map[x][y].getIcon().equals(DEFAULT));
        map[x][y].setDisabledIcon(ICON_O);
        map[x][y].setIcon(ICON_O);
        map[x][y].setEnabled(false);

    }

    public static boolean checkVictory(ImageIcon x) {
        for (int i = 0; i < 3; i++) {
            boolean row = true, column = true, d1 = true, d2 = true;
            for (int j = 0; j < 3; j++) {
                row &= map[i][j].getIcon().equals(x);
                column &= map[j][i].getIcon().equals(x);
                d1 &= map[j][j].getIcon().equals(x);
                d2 &= map[j][3 - j - 1].getIcon().equals(x);
            }
            if (row || column || d1 || d2){
                return true;
            }

        }
        return false;
    }

    public static void main(String[] args) {
        new GameXO();
    }
}
