package barrasswing;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Barrasprogreso extends JFrame {
	private Thread ProgressThread;
	private int progressvalue;

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Barrasprogreso frame = new Barrasprogreso();
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
	public Barrasprogreso() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setContentPane(contentPane);
		
		
		JProgressBar miBarra = new JProgressBar();
		miBarra.setStringPainted(true);
		contentPane.add(miBarra);
		
		
		JButton btnBoton = new JButton("Empezar");
		btnBoton.addActionListener(new ActionListener() {
			 		
			public void actionPerformed(ActionEvent e) 
			{
				ProgressThread = new Thread() {
					@SuppressWarnings("static-access")
					@Override
					public void run() {
						for(progressvalue = 1;progressvalue <= 100;progressvalue++) {
							miBarra.setValue(progressvalue);
							try {
								ProgressThread.sleep(100);
							} catch (InterruptedException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
							
						}
					}
					
				};
				ProgressThread.start();
				
			}
		});
		contentPane.add(btnBoton);
		
	}

}
