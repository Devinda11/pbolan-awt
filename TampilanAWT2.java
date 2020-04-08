package id.d3ti.oop1.AWT;

import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class TampilanAWT2 extends Frame implements WindowListener{
	String nim;
	String nama;
	String jk;
	String alamat;
	String tmp_lahir;
	String tgl_lahir;
	
	TextField cnim, cnama, ctmp_lahir, ctgl_lahir;
	Choice cjk1;
	TextArea calamat;
	Button b;
	
	private javax.swing.JLabel jLabell;
	
	public TampilanAWT2() {
		super("Data Diri");
		Panel p = new Panel();
		add(p);
		p.setLayout(new GridLayout(7, 2));
		
		p.add( new Label("nim"));
		p.add(cnim = new TextField());
		
		p.add( new Label("nama"));
		p.add(cnama = new TextField());
		
		p.add( new Label("Jenis Kelamin"));
		cjk1 = new Choice();
		cjk1.add("Laki-laki");
		cjk1.add("Perempuan");
		p.add(cjk1);
		
		p.add( new Label("Alamat"));
		p.add(calamat = new TextArea());
		
		p.add( new Label("Tempat Lahir"));
		p.add(ctmp_lahir = new TextField());
		
		p.add( new Label("Tanggal Lahir"));
		p.add(ctgl_lahir = new TextField());
		
		p.add( new Label(""));
		p.add(b=new Button("save"));
		//p.add(arg0);
		//p.add(cjk2 = new Checkbox("Perempuan"));
		setSize(250,300);
		setVisible(true);
		addWindowListener(this);
	}
	
	public boolean action(Event e, Object what)
	{
	if(what.equals("save")){
		nim = cnim.getText();
		nama = cnama.getText();
		jk = cjk1.getSelectedItem().toString();
		alamat = calamat.getText();
		tmp_lahir = ctmp_lahir.getText();
		tgl_lahir = ctgl_lahir.getText();
		
		 System.out.println(nim);
		 System.out.println(nama);
		 System.out.println(jk);
		 System.out.println(alamat);
		 System.out.println(tmp_lahir);
		 System.out.println(tgl_lahir);
		 
		 JFrame frame = new JFrame(); 
		 
		 //Untuk Menentukan Title bar di Frame
		 frame.setTitle("Belajar JFrame");
		 
		 //Untuk Menentukan Ukuran Frame
		 frame.setSize(400, 300);
		 
		 //Untuk Membuat Letak Frame berada di tengah ketika program dijalankan
		 frame.setLocationRelativeTo(null);
		 JLabel label1 = new JLabel("NIM= "+nim);
		 JLabel label2 = new JLabel("Nama= "+nama);
		 JLabel label3 = new JLabel("Jenis Kelamin= "+jk);
		 JLabel label4 = new JLabel("Alamat= "+alamat);
		 JLabel label5 = new JLabel("Tempat Lahir= "+tmp_lahir);
		 JLabel label6 = new JLabel("Tanggal Lahir= "+tgl_lahir);
	
		 //Untuk Menentukan Layout Frame
		 frame.setLayout(null);
		 
		 //Untuk Menentukan Label ke dalam Frame
		 frame.add(label1);
		 frame.add(label2);
		 frame.add(label3);
		 frame.add(label4);
		 frame.add(label5);
		 frame.add(label6);
		 
		 //Untuk menentukan posisi label di dalam Frame. Menentukan Width dan Height
		 label1.setBounds(20, 20, 150, 30);
		 label2.setBounds(20, 40, 150, 30);
		 label3.setBounds(20, 60, 150, 30);
		 label4.setBounds(20, 80, 150, 30);
		 label5.setBounds(20, 100, 150, 30);
		 label6.setBounds(20, 120, 150, 30);
		 
		 //Untuk Mengaktifkan event agar ketika frame di close maka program akan berhenti
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 //Untuk Menonaktifkan button maximize di Frame
		 //frame.setResizable(false);
		 
		 //Untuk Mengaktifkan Frame
		 frame.setVisible(true); 
	}
	
	return true;
		
	}
	
	public static void main(String args[])
	{ 
		new TampilanAWT2();
	}
	
	@Override
	public void windowActivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	}
	
	@Override
	public void windowClosed(WindowEvent arg0) {
	// TODO Auto-generated method stub
	}
	
	@Override
	public void windowClosing(WindowEvent arg0) {
	// TODO Auto-generated method stub
	System.exit(1);
	}
	
	@Override
	public void windowDeactivated(WindowEvent arg0) {
	// TODO Auto-generated method stub
	}
	
	@Override
	public void windowDeiconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	}
	
	@Override
	public void windowIconified(WindowEvent arg0) {
	// TODO Auto-generated method stub
	}
	
	@Override
	public void windowOpened(WindowEvent arg0) {
	// TODO Auto-generated method stub
	}
}
