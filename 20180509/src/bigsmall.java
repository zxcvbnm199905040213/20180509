import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class bigsmall extends JFrame {
    private JButton jButton1 = new JButton("BIG");
    private JButton jButton2 = new JButton("SMALL");
    private JButton jButton3 = new JButton("EXIT");
    private JLabel jLabel = new JLabel("哈");
    private int x = 50;
    public bigsmall(){
        init();
    }
    private void init(){
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(100,50);
        this.setSize(800,600);
        add(jButton1);
        add(jButton2);
        add(jButton3);
        add(jLabel);
        jLabel.setFont(new Font(null,Font.PLAIN,x));
        /////////////////////////////////////////////////////////////////////////////
        jLabel.setBounds(300,300,100,100);
        jButton1.setSize(100,50);
        jButton1.setLocation(120,30);

        jButton2.setSize(100,50);
        jButton2.setLocation(240,30);

        jButton3.setSize(100,50);
        jButton3.setLocation(360,30);
        /////////////////////////////////////////////////////////////////////////////
        jButton1.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x+=3;
                jLabel.setFont(new Font(null,Font.PLAIN,x));
            }
        });
        jButton2.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x-=3;
                jLabel.setFont(new Font(null,Font.PLAIN,x));
            }
        });
        jButton3.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}

