package com.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class ConclusionWindow extends JFrame {

	private JPanel contentPane;
	private JTextField compatibilityTextField;
	private JTextField propositionTextField;
	private JTextField incompatibilityTextField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConclusionWindow frame = new ConclusionWindow();
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
	public ConclusionWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel propositionLabel = new JLabel("Propozycja");
		contentPane.add(propositionLabel);
		
		compatibilityTextField = new JTextField();
		contentPane.add(compatibilityTextField);
		compatibilityTextField.setColumns(25);
		
		JLabel compatibilityLabel = new JLabel("Zgodnosc");
		contentPane.add(compatibilityLabel);
		
		propositionTextField = new JTextField();
		contentPane.add(propositionTextField);
		propositionTextField.setColumns(25);
		
		JLabel incompatibilityLabel = new JLabel("Niezgosnosc");
		contentPane.add(incompatibilityLabel);
		
		incompatibilityTextField = new JTextField();
		contentPane.add(incompatibilityTextField);
		incompatibilityTextField.setColumns(25);
		
		JButton acceptanceButton = new JButton("Akceptuje");
		contentPane.add(acceptanceButton);
		
		JButton discardButton = new JButton("Odrzuc");
		contentPane.add(discardButton);
		
		JButton askForMoreButton = new JButton("Pytaj dalej");
		contentPane.add(askForMoreButton);
	}

}
