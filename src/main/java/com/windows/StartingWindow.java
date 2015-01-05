package com.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.sample.ExpertSystem;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StartingWindow extends JFrame {

	private JPanel contentPane;
	private QuestionWindow questionWindow;
	//StartingWindow frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StartingWindow frame = new StartingWindow();
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
	public StartingWindow() {
		ExpertSystem system = new ExpertSystem();
		system.initializeSystem();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel programNameLabel = new JLabel("RELIGIOZNAWCA");
		programNameLabel.setFont(new Font("Dialog", Font.BOLD, 40));
		contentPane.add(programNameLabel);
		
		JButton StartButton = new JButton("Start");
		StartButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//rozpoczęcie wnioskowania
				questionWindow = new QuestionWindow("pytanie pierwsze", new String[] {"huj", "dupa", "kamieni kupa"});
				questionWindow.setVisible(true);
				
				
			}
		});
		contentPane.add(StartButton);

	}
	
	
	
	
}
