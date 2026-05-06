import java.awt.Color;

import javax.swing.JPanel;

public class MyPanel extends JPanel {
	MyPanel(String hex, int x, int y, int width, int height) {
        this.setBackground(Color.decode(hex));
        this.setBounds(x, y, width, height);
    } 
}
