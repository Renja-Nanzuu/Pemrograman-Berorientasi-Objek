import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.Border;
//implements ActionListener
public class MyFrame extends JFrame implements ActionListener {
	MyPanel panelTop = new MyPanel("#73C379", 33, 36, 515, 125);
	MyPanel panelMid = new MyPanel("#73C379", 33, 171, 515, 80);
	MyPanel panelBottom = new MyPanel("#73C379", 33, 261, 515, 50);
	Border border = BorderFactory.createLineBorder(new Color(0x518C55),3);
	
	JLabel Tahun = new JLabel();
	JLabel Bulan = new JLabel();
	JLabel Output;
	JTextField InputTahun;
	JComboBox PilihBulan;
	
	MyFrame() {
		this.setTitle("Aplikasi Hitung Jumlah Hari!"); //sets title of this
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); // exit ot of application - Normally : Jthis.HIDE_ON_CLOSE 
		this.setLayout(null);
		this.setResizable(false); // prevent this from being resize
		this.setSize(600, 397); // sets the x and y dimension of this
		this.getContentPane().setBackground(new Color(0x1F1F1F));
		
		//PanelTopContent
		//->layout
		panelTop.setLayout(new GridLayout(2,1,10,10));
		//->TextField InputTahun
		InputTahun = new JTextField();
		//->setTextLabel
		Tahun.setPreferredSize(new Dimension(200,30));
		Tahun.setText("<html>Tahun</html>");
		Tahun.setFont(new Font("Poppins",Font.BOLD,20));
		Bulan.setPreferredSize(new Dimension(200,30));
		Bulan.setText("<html>Bulan</html>");
		Bulan.setFont(new Font("Poppins",Font.BOLD,20));
		InputTahun.setPreferredSize(new Dimension(250,30));
		InputTahun.setFont(new Font("Poppins",Font.PLAIN,20));
		//->ComboBox PilihBulan
		String[] bulan = {"Januari","Februari","Maret","April","Mei","Juni","Juli","Agustus","September","Oktober","November","Desember"};
		PilihBulan = new JComboBox(bulan);
		PilihBulan.setPreferredSize(new Dimension(250,30));
		
		//BikinPanelBaruBuatMisahinKeduaElemenLahPokoknya
		//->rowTahun
		JPanel rowTahun = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 20));
		rowTahun.setBackground(new Color(0,0,0,0));
		rowTahun.add(Tahun);
		rowTahun.add(InputTahun);
		
		//->rowBulan
		JPanel rowBulan = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 5));
		rowBulan.setBackground(new Color(0,0,0,0));
		rowBulan.add(Bulan);
		rowBulan.add(PilihBulan);
		
		//AddingPanelTopContent
		panelTop.add(rowTahun);
		panelTop.add(rowBulan);
		this.add(panelTop);
		
		//PanelMidContent
		Output = new JLabel();
		panelMid.setLayout(new GridLayout(1,0,0,0));
		panelMid.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10)); // padding luar
		Output.setText("<html>Lorem Ipsum Dolor sit amet</html>");
		Output.setFont(new Font("Poppins",Font.BOLD,20));
		panelMid.add(Output);
		this.add(panelMid);
		
		//PanelBottomContent
		panelBottom.setLayout(new GridLayout(1,0,10,10));
		panelBottom.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10)); // padding luar
		panelBottom.add(new JButton("Hitung"));
		panelBottom.add(new JButton("Hapus"));
		panelBottom.add(new JButton("Simpan"));
		panelBottom.add(new JButton("Keluar"));
		for (Component c : panelBottom.getComponents()) {
		    if (c instanceof JButton btn) {
		        btn.setFocusable(false);
		        btn.addActionListener(this);
		    }
		}
		this.add(panelBottom);
		
		
		this.setVisible(true); // Make this Visible
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton) e.getSource(); // ambil tombol yang diklik
	    String text = btn.getText(); // ambil isi tombol
	    
	    if (text.equals("Hitung")) {
	    	HitungHari hh = new HitungHari();
	    	if (InputTahun.getText().isEmpty()) {
	    	    Output.setText("Tahun belum diisi!");
	    	    return;
	    	}
	    	int tahun = Integer.parseInt(InputTahun.getText());
	    	String bulan = PilihBulan.getSelectedItem().toString();
	    	int hasil = hh.hitung(tahun, bulan);
	    	Output.setText("<html>Jumlah hari pada bulan " + bulan + " tahun " + tahun + " adalah " + hasil + " hari</html>");
	    } else if (text.equals("Hapus")) {
	    	InputTahun.setText("");
	        PilihBulan.setSelectedIndex(0);
	        Output.setText("<html>Lorem Ipsum Dolor sit amet</html>");
	    } else if (text.equals("Simpan")) {
	    	try {
                    File file = new File("hasil.txt");
                    FileWriter writer = new FileWriter(file,true);
                    String FinalText = Output.getText().replaceAll("<[^>]*>", "");
	    	    writer.write(FinalText + System.lineSeparator());
	    	    writer.close();
	    	    System.out.println(file.getAbsolutePath());
	    	} catch (IOException a) {
	    	    a.printStackTrace();
	    	}
	    } else if (text.equals("Keluar")) {
	    	System.exit(0);
	    } else {
	    	System.out.println("Tombol tidak dikenali");
	    }
	}
}
