package notas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.util.Scanner;

import javax.swing.JTextField;

public class Notabimestral extends JFrame {

	private JPanel contentPane;
	private static JTextField txtMatum;
	private static JTextField txtMatdois;
	private static JTextField txtMattres;
	private static JTextField txtMatqua;
	private JTextField txtPortum;
	private JTextField txtPortdois;
	private JTextField txtPorttres;
	private JTextField txtPortqua;
	private JTextField txtHisum;
	private JTextField txtHisdois;
	private JTextField txtHistres;
	private JTextField txtHisqua;

	/**
	 * Launch the application.
	 */
	static double conta (int a, int b, int d){
		int c = a*b/d;
		return c;
	}
	public static void main(String[] args) {
		
		int Matm = Integer.parseInt(txtMatum.getText());
		int Matd = Integer.parseInt(txtMatdois.getText());
		int Matt = Integer.parseInt(txtMattres.getText());
		int MatQ = Integer.parseInt(txtMatqua.getText());
		int resultado = Matm +Matd + Matt + MatQ;
		
		conta(resultado,100,40);
		JTextComponent lblMat = null;
		lblMat.setText("resultado");
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Notabimestral frame = new Notabimestral();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
		
	}

	/**
	 * Create the frame.
	 */
	public Notabimestral() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 944, 489);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblBimestre = new JLabel("MATEMATICA");
		lblBimestre.setFont(new Font("Arial", Font.PLAIN, 17));
		lblBimestre.setHorizontalAlignment(SwingConstants.CENTER);
		lblBimestre.setBounds(12, 68, 115, 20);
		contentPane.add(lblBimestre);
		
		JLabel lblA = new JLabel("2 Bimestre");
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		lblA.setFont(new Font("Arial", Font.PLAIN, 17));
		lblA.setBounds(338, 20, 105, 15);
		contentPane.add(lblA);
		
		JLabel lblBimestre_1 = new JLabel("3 Bimestre");
		lblBimestre_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBimestre_1.setFont(new Font("Arial", Font.PLAIN, 17));
		lblBimestre_1.setBounds(482, 20, 115, 15);
		contentPane.add(lblBimestre_1);
		
		JLabel lblBimestre_2 = new JLabel("4 Bimestre");
		lblBimestre_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblBimestre_2.setFont(new Font("Arial", Font.PLAIN, 17));
		lblBimestre_2.setBounds(658, 17, 115, 20);
		contentPane.add(lblBimestre_2);
		
		JLabel label = new JLabel("1 Bimestre");
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.PLAIN, 17));
		label.setBounds(186, 17, 90, 20);
		contentPane.add(label);
		
		JLabel lblPortugues = new JLabel("PORTUGUES");
		lblPortugues.setHorizontalAlignment(SwingConstants.CENTER);
		lblPortugues.setFont(new Font("Arial", Font.PLAIN, 17));
		lblPortugues.setBounds(12, 203, 115, 20);
		contentPane.add(lblPortugues);
		
		JLabel lblHistoria = new JLabel("HISTORIA");
		lblHistoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblHistoria.setFont(new Font("Arial", Font.PLAIN, 17));
		lblHistoria.setBounds(12, 335, 115, 20);
		contentPane.add(lblHistoria);
		
		JLabel lblruse = new JLabel("Resultado");
		lblruse.setHorizontalAlignment(SwingConstants.CENTER);
		lblruse.setFont(new Font("Arial", Font.PLAIN, 17));
		lblruse.setBounds(809, 20, 105, 20);
		contentPane.add(lblruse);
		
		JLabel lblMat = new JLabel("0");
		lblMat.setHorizontalAlignment(SwingConstants.CENTER);
		lblMat.setFont(new Font("Arial", Font.PLAIN, 17));
		lblMat.setBounds(809, 68, 105, 20);
		contentPane.add(lblMat);
		
		JLabel label_2 = new JLabel("100%");
		label_2.setHorizontalAlignment(SwingConstants.CENTER);
		label_2.setFont(new Font("Arial", Font.PLAIN, 17));
		label_2.setBounds(809, 206, 105, 20);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("100%");
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setFont(new Font("Arial", Font.PLAIN, 17));
		label_3.setBounds(809, 338, 105, 20);
		contentPane.add(label_3);
		
		txtMatum = new JTextField();
		txtMatum.setFont(new Font("Arial", Font.BOLD, 13));
		txtMatum.setHorizontalAlignment(SwingConstants.CENTER);
		txtMatum.setBounds(186, 69, 90, 22);
		contentPane.add(txtMatum);
		txtMatum.setColumns(10);
		
		txtMatdois = new JTextField();
		txtMatdois.setHorizontalAlignment(SwingConstants.CENTER);
		txtMatdois.setFont(new Font("Arial", Font.BOLD, 13));
		txtMatdois.setColumns(10);
		txtMatdois.setBounds(354, 69, 90, 22);
		contentPane.add(txtMatdois);
		
		txtMattres = new JTextField();
		txtMattres.setHorizontalAlignment(SwingConstants.CENTER);
		txtMattres.setFont(new Font("Arial", Font.BOLD, 13));
		txtMattres.setColumns(10);
		txtMattres.setBounds(507, 69, 90, 22);
		contentPane.add(txtMattres);
		
		txtMatqua = new JTextField();
		txtMatqua.setHorizontalAlignment(SwingConstants.CENTER);
		txtMatqua.setFont(new Font("Arial", Font.BOLD, 13));
		txtMatqua.setColumns(10);
		txtMatqua.setBounds(683, 69, 90, 22);
		contentPane.add(txtMatqua);
		
		txtPortum = new JTextField();
		txtPortum.setHorizontalAlignment(SwingConstants.CENTER);
		txtPortum.setFont(new Font("Arial", Font.BOLD, 13));
		txtPortum.setColumns(10);
		txtPortum.setBounds(186, 201, 90, 22);
		contentPane.add(txtPortum);
		
		txtPortdois = new JTextField();
		txtPortdois.setHorizontalAlignment(SwingConstants.CENTER);
		txtPortdois.setFont(new Font("Arial", Font.BOLD, 13));
		txtPortdois.setColumns(10);
		txtPortdois.setBounds(354, 201, 90, 22);
		contentPane.add(txtPortdois);
		
		txtPorttres = new JTextField();
		txtPorttres.setHorizontalAlignment(SwingConstants.CENTER);
		txtPorttres.setFont(new Font("Arial", Font.BOLD, 13));
		txtPorttres.setColumns(10);
		txtPorttres.setBounds(507, 201, 90, 22);
		contentPane.add(txtPorttres);
		
		txtPortqua = new JTextField();
		txtPortqua.setHorizontalAlignment(SwingConstants.CENTER);
		txtPortqua.setFont(new Font("Arial", Font.BOLD, 13));
		txtPortqua.setColumns(10);
		txtPortqua.setBounds(683, 201, 90, 22);
		contentPane.add(txtPortqua);
		
		txtHisum = new JTextField();
		txtHisum.setHorizontalAlignment(SwingConstants.CENTER);
		txtHisum.setFont(new Font("Arial", Font.BOLD, 13));
		txtHisum.setColumns(10);
		txtHisum.setBounds(186, 333, 90, 22);
		contentPane.add(txtHisum);
		
		txtHisdois = new JTextField();
		txtHisdois.setHorizontalAlignment(SwingConstants.CENTER);
		txtHisdois.setFont(new Font("Arial", Font.BOLD, 13));
		txtHisdois.setColumns(10);
		txtHisdois.setBounds(354, 333, 90, 22);
		contentPane.add(txtHisdois);
		
		txtHistres = new JTextField();
		txtHistres.setHorizontalAlignment(SwingConstants.CENTER);
		txtHistres.setFont(new Font("Arial", Font.BOLD, 13));
		txtHistres.setColumns(10);
		txtHistres.setBounds(507, 333, 90, 22);
		contentPane.add(txtHistres);
		
		txtHisqua = new JTextField();
		txtHisqua.setHorizontalAlignment(SwingConstants.CENTER);
		txtHisqua.setFont(new Font("Arial", Font.BOLD, 13));
		txtHisqua.setColumns(10);
		txtHisqua.setBounds(683, 333, 90, 22);
		contentPane.add(txtHisqua);
	}
}
