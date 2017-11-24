package singleton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame {

    public static void main(String[] args) {
        JFrame f = new JFrame("Main");
        JButton b = new JButton("弹窗");
        f.add(b, BorderLayout.CENTER);
        f.setSize(200,100);
        f.setVisible(true);

        //注册监听器
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SubFrame s = SubFrame.getInstance();
            }
        });
    }
}
