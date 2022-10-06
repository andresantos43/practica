package practica;

import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;

public class signo {

	private JFrame frame;
	private JLabel lblResultado;
	private JComboBox cboDia;
	private JComboBox cboMes;
	private JLabel lblSigno;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					signo window = new signo();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public signo() {
		initialize();
		calcularsigno();
	}
public void calcularsigno() {
	int dia=Integer.parseInt(cboDia.getSelectedItem().toString());
	String mes=cboMes.getSelectedItem().toString();
	lblResultado.setText(dia+" de "+mes);
	Image aries=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/aries.jpg"));
	Image tauro=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/tauro.jpg"));
	Image geminis=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/geminis.jpg"));
	Image cancer=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/cancer.jpg"));
	Image leo=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/leo.jpg"));
	Image virgo=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/virgo.png"));
	Image libra=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/libra.jpg"));
	Image escorpion=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/escorpion.jpg"));
	Image sagitario=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/sagitario.jpg"));
	Image capricornio=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/capricornio.jpg"));
	Image acuario=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/acuario.jpg"));
	Image pisis=Toolkit.getDefaultToolkit().getImage(getClass().getResource("/signos/pisis.jpg"));
	int ancho=lblSigno.getWidth();
	int alto=lblSigno.getHeight();
	switch(mes) {
	case "Enero":
		if(dia<=20) {
			lblSigno.setIcon(new ImageIcon(capricornio.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}else {
			lblSigno.setIcon(new ImageIcon(acuario.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}
		break;
	case "Febrero":
		if(dia<=19) {
			lblSigno.setIcon(new ImageIcon(acuario.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}else {
			lblSigno.setIcon(new ImageIcon(pisis.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}
		break;
	case "Marzo":
		if(dia<=20) {
			lblSigno.setIcon(new ImageIcon(pisis.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}else {
			lblSigno.setIcon(new ImageIcon(aries.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}
		break;
	case "Abril":
		if(dia<=20) {
			lblSigno.setIcon(new ImageIcon(aries.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}else {
			lblSigno.setIcon(new ImageIcon(tauro.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}
		break;
	case "Mayo":
		if(dia<=20) {
			lblSigno.setIcon(new ImageIcon(tauro.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}else {
			lblSigno.setIcon(new ImageIcon(geminis.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}
		break;
	case "Junio":
		if(dia<=21) {
			lblSigno.setIcon(new ImageIcon(geminis.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}else {
			lblSigno.setIcon(new ImageIcon(cancer.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}
		break;
	case "Julio":
		if(dia<=22) {
			lblSigno.setIcon(new ImageIcon(cancer.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}else {
			lblSigno.setIcon(new ImageIcon(leo.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}
		break;
	case "Agosto":
		if(dia<=23) {
			lblSigno.setIcon(new ImageIcon(leo.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}else {
			lblSigno.setIcon(new ImageIcon(virgo.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}
		break;
	case "Septiembre":
		if(dia<=22) {
			lblSigno.setIcon(new ImageIcon(virgo.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}else {
			lblSigno.setIcon(new ImageIcon(libra.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}
		break;
	case "Octubre":
		if(dia<=22) {
			lblSigno.setIcon(new ImageIcon(libra.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}else {
			lblSigno.setIcon(new ImageIcon(escorpion.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}
		break;
	case "Noviembre":
		if(dia<=22) {
			lblSigno.setIcon(new ImageIcon(escorpion.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}else {
			lblSigno.setIcon(new ImageIcon(sagitario.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}
		break;
	case "Diciembre":
		if(dia<=21) {
			lblSigno.setIcon(new ImageIcon(sagitario.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}else {
			lblSigno.setIcon(new ImageIcon(capricornio.getScaledInstance(ancho, alto, Image.SCALE_SMOOTH)));
		}
		break;
	}
}
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 495, 484);
		frame.setTitle("SIGNOS ZODIACALES");
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(calculadora.class.getResource("/img/minions.jpg")));
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Dia");
		lblNewLabel.setBounds(34, 11, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Mes");
		lblNewLabel_1.setBounds(34, 53, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		
		cboDia = new JComboBox();
		cboDia.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblResultado.setText("Hoy es "+cboDia.getSelectedItem().toString()+" De "+cboMes.getSelectedItem().toString());
				calcularsigno();
			}
		});
		cboDia.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
		cboDia.setBounds(137, 7, 92, 22);
		frame.getContentPane().add(cboDia);
		
		cboMes = new JComboBox();
		cboMes.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				lblResultado.setText("Hoy es "+cboDia.getSelectedItem().toString()+" De "+cboMes.getSelectedItem().toString());
				calcularsigno();
			}
		});
		cboMes.setModel(new DefaultComboBoxModel(new String[] {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre ", "Diciembre"}));
		cboMes.setBounds(137, 53, 97, 22);
		frame.getContentPane().add(cboMes);
		
		lblResultado = new JLabel("1 de Enero");
		lblResultado.setBounds(293, 33, 133, 28);
		frame.getContentPane().add(lblResultado);
		
		lblSigno = new JLabel("");
		lblSigno.setBorder(new LineBorder(new Color(0, 0, 0)));
		lblSigno.setBounds(52, 111, 393, 287);
		frame.getContentPane().add(lblSigno);
	}
}
