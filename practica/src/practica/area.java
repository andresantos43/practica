package practica;

import java.awt.EventQueue;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class area {

	private JFrame frmAreaDelTriangulo;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JLabel lblResultado;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					area window = new area();
					window.frmAreaDelTriangulo.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public area() {
		initialize();
	}

	
	private void initialize() {
		frmAreaDelTriangulo = new JFrame();
		frmAreaDelTriangulo.setTitle("AREA DEL TRIANGULO");
		frmAreaDelTriangulo.setIconImage(Toolkit.getDefaultToolkit().getImage(calculadora.class.getResource("/img/minions.jpg")));
		frmAreaDelTriangulo.setBounds(100, 100, 402, 374);
		frmAreaDelTriangulo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAreaDelTriangulo.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Base");
		lblNewLabel.setBounds(42, 48, 102, 24);
		frmAreaDelTriangulo.getContentPane().add(lblNewLabel);
		
		txtBase = new JTextField();
		txtBase.setBounds(154, 44, 143, 33);
		frmAreaDelTriangulo.getContentPane().add(txtBase);
		txtBase.setColumns(10);
		
		JLabel lblAtura = new JLabel("Atura");
		lblAtura.setBounds(42, 83, 102, 24);
		frmAreaDelTriangulo.getContentPane().add(lblAtura);
		
		lblResultado = new JLabel("");
		lblResultado.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResultado.setBounds(84, 179, 199, 112);
		frmAreaDelTriangulo.getContentPane().add(lblResultado);
		
		txtAltura = new JTextField();
		txtAltura.setColumns(10);
		txtAltura.setBounds(154, 79, 143, 33);
		frmAreaDelTriangulo.getContentPane().add(txtAltura);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double base=Double.parseDouble(txtBase.getText().toString());
					double altura=Double.parseDouble(txtAltura.getText().toString());
					double area=(base*altura)/2;
					lblResultado.setText("El area del triangulo es: "+area);
				} catch (Exception ex2) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}
			}
		});
		btnNewButton.setBounds(42, 133, 89, 23);
		frmAreaDelTriangulo.getContentPane().add(btnNewButton);
		
		JButton btnCalcular = new JButton("Borrar");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtBase.setText("");
				txtAltura.setText("");
				lblResultado.setText("");
			}
		});
		btnCalcular.setBounds(174, 133, 89, 23);
		frmAreaDelTriangulo.getContentPane().add(btnCalcular);
		
		JLabel lblNewLabel_2_1 = new JLabel("AREA DEL TRIANGULO");
		lblNewLabel_2_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblNewLabel_2_1.setBounds(84, 11, 199, 24);
		frmAreaDelTriangulo.getContentPane().add(lblNewLabel_2_1);
	}
}
