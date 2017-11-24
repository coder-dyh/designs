package singleton;

import javax.swing.*;

public class SubFrame {

    private static SubFrame f = new SubFrame();

    private SubFrame(){
        JFrame f = new JFrame("win");
        f.setSize(300,200);
        f.setVisible(true);
    }

    public static SubFrame getInstance(){
        return f;
    }
}
