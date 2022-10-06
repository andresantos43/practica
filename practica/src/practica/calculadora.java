package practica;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class calculadora {

	private JFrame frmCalculadora;
	JLabel lblSuma, lblResta, lblMulti, lblDivision, lblResiduo;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora window = new calculadora();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	 calculadora() {
		initialize();
	}

	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setIconImage(Toolkit.getDefaultToolkit().getImage(calculadora.class.getResource("/img/minions.jpg")));
		frmCalculadora.setTitle("CALCULADORA");
		frmCalculadora.setBounds(100, 100, 393, 344);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JButton btnResta = new JButton("RESATA");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a=Integer.parseInt(JOptionPane.showInputDialog("Introduce Numero 1:"));
					int b=Integer.parseInt(JOptionPane.showInputDialog("Introduce Numero 2:"));
					lblResta.setText("La resta es: "+(a-b));
					}catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "ERROR");
					}
			}
		});
		btnResta.setBounds(10, 67, 89, 23);
		frmCalculadora.getContentPane().add(btnResta);
		
		lblSuma = new JLabel("");
		lblSuma.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSuma.setBounds(130, 15, 194, 19);
		frmCalculadora.getContentPane().add(lblSuma);
		
		JButton btnSuma_1 = new JButton("SUMA");
		btnSuma_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
				int a=Integer.parseInt(JOptionPane.showInputDialog("Introduce Numero 1:"));
				int b=Integer.parseInt(JOptionPane.showInputDialog("Introduce Numero 2:"));
				lblSuma.setText("La suma es: "+(a+b));
				}catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "ERROR");
				}
			}
		});
		btnSuma_1.setBounds(10, 15, 89, 23);
		frmCalculadora.getContentPane().add(btnSuma_1);
		
		JButton btnMulti = new JButton("MULTI");
		btnMulti.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a=Integer.parseInt(JOptionPane.showInputDialog("Introduce Numero 1:"));
					int b=Integer.parseInt(JOptionPane.showInputDialog("Introduce Numero 2:"));
					lblMulti.setText("La multiplicacion es: "+(a*b));
					}catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "ERROR");
					}
			}
		});
		btnMulti.setBounds(10, 113, 89, 23);
		frmCalculadora.getContentPane().add(btnMulti);
		
		JButton btnDivision = new JButton("DIVICION");
		btnDivision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a=Integer.parseInt(JOptionPane.showInputDialog("Introduce Numero 1:"));
					int b=Integer.parseInt(JOptionPane.showInputDialog("Introduce Numero 2:"));
					lblDivision.setText("La dividion es: "+(a/b));
					}catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "ERROR");
					}
			}
		});
		btnDivision.setBounds(10, 159, 89, 23);
		frmCalculadora.getContentPane().add(btnDivision);
		
		JButton btnResiduo = new JButton("RESIDUO");
		btnResiduo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a=Integer.parseInt(JOptionPane.showInputDialog("Introduce Numero 1:"));
					int b=Integer.parseInt(JOptionPane.showInputDialog("Introduce Numero 2:"));
					lblResiduo.setText("El residuo es: "+(a%b));
					}catch(Exception ex) {
						JOptionPane.showMessageDialog(null, "ERROR");
					}
			}
		});
		btnResiduo.setBounds(10, 211, 89, 23);
		frmCalculadora.getContentPane().add(btnResiduo);
		
		lblResta = new JLabel("");
		lblResta.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResta.setBounds(130, 71, 194, 19);
		frmCalculadora.getContentPane().add(lblResta);
		
		lblMulti = new JLabel("");
		lblMulti.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblMulti.setBounds(130, 117, 194, 19);
		frmCalculadora.getContentPane().add(lblMulti);
		
		lblDivision = new JLabel("");
		lblDivision.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblDivision.setBounds(130, 163, 194, 19);
		frmCalculadora.getContentPane().add(lblDivision);
		
		lblResiduo = new JLabel("");
		lblResiduo.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblResiduo.setBounds(130, 215, 194, 19);
		frmCalculadora.getContentPane().add(lblResiduo);
		
		JButton btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSuma.setText("");
				lblResta.setText("");
				lblMulti.setText("");
				lblDivision.setText("");
				lblResiduo.setText("");
			}
		});
		btnBorrar.setBounds(125, 257, 89, 23);
		frmCalculadora.getContentPane().add(btnBorrar);
	}
}
