import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MyFrame extends JFrame implements ActionListener {
	MyPanel panelTop = new MyPanel("#73C379", 33, 36, 515, 85);
	MyPanel panelBottomLeft = new MyPanel("#73C379", 33, 141, 295, 234);
	MyPanel panelBottomRight = new MyPanel("#73C379", 348, 141, 200, 234);
	Border border = BorderFactory.createLineBorder(new Color(0x518C55),3);
	
	JTextField TempatAngka;
	
	double num1 = 0;
	double num2 = 0;
	String operator = "";
	double result = 0;
	
	MyFrame() {
		this.setTitle("Aplikasi Kalkulator");
		this.setLayout(null);
		//this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.setResizable(false);
		
		//TextField Angka
		TempatAngka = new JTextField();
		TempatAngka.setBounds(14, 10, 489, 65);
		TempatAngka.setEditable(false);
		TempatAngka.setFont(new Font("Poppins",Font.BOLD,42));
		TempatAngka.setBorder(border);
		
		//Button PanelBottomLeft
//		GridLayout layoutBBL = new GridLayout(4,3, 10, 10);
//		layoutBBL.setHgap(10); <- Buat gantiin gap yg ada didalam situ tuh bisa GridLayout(...)
//		layoutBBL.setVgap(10);
		panelBottomLeft.setLayout(new GridLayout(4,3, 10, 10)); // Gap atau Margin antar buttonnn
		panelBottomLeft.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // padding luar
		panelBottomLeft.add(new JButton("8"));
		panelBottomLeft.add(new JButton("7"));
		panelBottomLeft.add(new JButton("9"));
		panelBottomLeft.add(new JButton("4"));
		panelBottomLeft.add(new JButton("5"));
		panelBottomLeft.add(new JButton("6"));
		panelBottomLeft.add(new JButton("1"));
		panelBottomLeft.add(new JButton("2"));
		panelBottomLeft.add(new JButton("3"));
		panelBottomLeft.add(new JButton("."));
		panelBottomLeft.add(new JButton("0"));
		panelBottomLeft.add(new JButton("C"));
		for (Component c : panelBottomLeft.getComponents()) {
		    if (c instanceof JButton btn) {
		        btn.setFocusable(false);
		        btn.addActionListener(this);
		    }
		}
		
		
		//Button PanelBottomRight
		panelBottomRight.setLayout(new GridLayout(4,2, 10, 10)); // Gap atau Margin antar buttonnn AHHH
		panelBottomRight.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // padding luar
		panelBottomRight.add(new JButton("+"));
		panelBottomRight.add(new JButton("-"));
		panelBottomRight.add(new JButton("*"));
		panelBottomRight.add(new JButton("/"));
		panelBottomRight.add(new JButton("="));
		panelBottomRight.add(new JButton("%"));
		panelBottomRight.add(new JButton("B"));
		panelBottomRight.add(new JButton("E"));
		for (Component c : panelBottomRight.getComponents()) {
		    if (c instanceof JButton btn) {
		        btn.setFocusable(false);
		        btn.addActionListener(this);
		    }
		}
		
		
		//this.add(textField);
		this.setSize(600, 455);
		this.getContentPane().setBackground(new Color(0x1F1F1F));
		this.setVisible(true);
		
		//PanelAtas
		panelTop.setLayout(null);
		panelTop.add(TempatAngka);
		this.add(panelTop);
		
		//PanelKiriBawah
		this.add(panelBottomLeft);
		
		//PanelKananBawah
		this.add(panelBottomRight);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton btn = (JButton) e.getSource(); // ambil tombol yang diklik
	    String text = btn.getText(); // ambil isi tombol
	    
	 // CLEAR
	    if (text.equals("C")) {
	        TempatAngka.setText("");
	        num1 = 0;
	        operator = "";
	    }

	    // BACKSPACE
	    else if (text.equals("B")) {
	        String current = TempatAngka.getText();
	        if (!current.isEmpty()) {
	            TempatAngka.setText(current.substring(0, current.length() - 1));
	        }
	    }

	    // OPERATOR (+ - * /)
	    else if (text.equals("+") || text.equals("-") || text.equals("*") || text.equals("/")) {
	        if(!TempatAngka.getText().isEmpty()) {
	    		num1 = Double.parseDouble(TempatAngka.getText());
	        }
	        operator = text;
	        TempatAngka.setText(""); // siap input angka kedua
	    }
	    
	    // OPERATOR (%)
	    else if (text.equals("%")) {
	    	if(!TempatAngka.getText().isEmpty()) {
	    		num1 = Double.parseDouble(TempatAngka.getText());
	        }
	    	operator = text;
	    	result = num1 / 100;
	    	TempatAngka.setText(String.valueOf(result));
	    }

	    // EQUAL =
	    else if (text.equals("=")) {
	        num2 = Double.parseDouble(TempatAngka.getText());

	        switch (operator) {
	            case "+":
	                result = num1 + num2;
	                break;
	            case "-":
	                result = num1 - num2;
	                break;
	            case "*":
	                result = num1 * num2;
	                break;
	            case "/":
	                result = num1 / num2;
	                break;
	        }
	        TempatAngka.setText(String.valueOf(result));
	    }

	    // Huruf E atau EXIT (iya kan?)
	    else if (text.equals("E")) {
	    	System.exit(0);
	    }
	    
	    // ANGKA / TITIK
	    else {
	        TempatAngka.setText(TempatAngka.getText() + text);
	    }
	}
}
