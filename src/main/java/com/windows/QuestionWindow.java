package com.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JTextPane;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.Component;

import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import java.awt.FlowLayout;
import java.awt.Font;

public class QuestionWindow extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					QuestionWindow frame = new QuestionWindow();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public QuestionWindow(String question, String answers[]) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JTextArea QuestionArea = new JTextArea();
		QuestionArea.setColumns(25);
		QuestionArea.setRows(3);
		QuestionArea.setFont(new Font("Dialog", Font.PLAIN, 16));
		QuestionArea.setText(question);
		contentPane.add(QuestionArea);
		
		
		JRadioButton[] radioButtonsWithAnswers = new JRadioButton[answers.length];
		ButtonGroup radioButtonsGroup = new ButtonGroup();
		for(int i=0; i<answers.length; i++) {
			JRadioButton jRadio = new JRadioButton(answers[i]);
			radioButtonsWithAnswers[i] = jRadio;
			//radioButtonsWithAnswers[i].setText(answers[i]);
			contentPane.add(radioButtonsWithAnswers[i]);
			radioButtonsGroup.add(radioButtonsWithAnswers[i]);
		}
		
		
	}

}
