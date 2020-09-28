package tareafibosept2020;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class Fibonacci1 extends JFrame {

	private JPanel contentPane;
	private JTextField txtValorInicial;
	private JTextField txtIteraciones;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) 
	{
		
		EventQueue.invokeLater(new Runnable() 
		{
			public void run() 
			{
				try 
				{
					Fibonacci1 frame = new Fibonacci1();
					frame.setVisible(true);
				} catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Fibonacci1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblValorInicial = new JLabel("Valor Inicial");
		lblValorInicial.setBounds(22, 26, 60, 14);
		contentPane.add(lblValorInicial);
		
		
		
		
		JLabel lblNumeroIteraciones = new JLabel("Numero de Iteraciones");
		lblNumeroIteraciones.setBounds(22, 66, 115, 14);
		contentPane.add(lblNumeroIteraciones);
		
		txtValorInicial = new JTextField();
		txtValorInicial.setBounds(162, 23, 86, 20);
		contentPane.add(txtValorInicial);
		txtValorInicial.setColumns(10);
		
		txtIteraciones = new JTextField();
		txtIteraciones.setBounds(162, 63, 86, 20);
		contentPane.add(txtIteraciones);
		txtIteraciones.setColumns(10);
		
		JTextArea txtResultado = new JTextArea();
		txtResultado.setBounds(22, 128, 402, 122);
		contentPane.add(txtResultado);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int valor1=0;
			    int valor2=1;
			    int x = 0;
			    int Iteraciones = 0;
			    
			    valor1=Integer.parseInt(txtValorInicial.getText());
			    Iteraciones=Integer.parseInt(txtIteraciones.getText());
			    
			    for(int y = 1;y<=Iteraciones;y++) {
			    	
			    	int valor3=valor1+valor2;

			        //System.out.println(valor3);
			        
			        txtResultado.setText(Integer.toString(valor3));

			        x = x + 1;
			        valor1=valor2;
			        valor2=valor3;
			    }

			    
			    
				
				
			}
		});
		btnCalcular.setBounds(162, 94, 89, 23);
		contentPane.add(btnCalcular);
	}
}
