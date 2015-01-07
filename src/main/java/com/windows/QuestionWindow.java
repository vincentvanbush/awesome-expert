package com.windows;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultButtonModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JTextField;

import java.awt.GridLayout;
import java.awt.Component;

import javax.swing.Box;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.RuleContext;

import com.control.Answer;
import com.control.Question;
import com.control.QuestionsAndAnswersConverter;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Array;
import java.util.Arrays;

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
	public QuestionWindow(final RuleContext kcontext, final Question question, final Object answers[]) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
		
		JTextArea QuestionArea = new JTextArea();
		QuestionArea.setColumns(25);
		QuestionArea.setRows(3);
		QuestionArea.setFont(new Font("Dialog", Font.PLAIN, 16));
		//QuestionArea.setText(question.getType().toString());
		QuestionArea.setText(QuestionsAndAnswersConverter.getQuestionString(question.getType()));
		contentPane.add(QuestionArea);
		
		final JComboBox answerCombo = new JComboBox();
		for (Object a : answers) {
			//answerCombo.addItem(a);
			answerCombo.addItem(QuestionsAndAnswersConverter.getAnswerString(a));
		}
		contentPane.add(answerCombo);
		/*
		JRadioButton[] radioButtonsWithAnswers = new JRadioButton[answers.length];
		ButtonGroup radioButtonsGroup = new ButtonGroup();
		for(int i=0; i<answers.length; i++) {
			JRadioButton jRadio = new JRadioButton(answers[i].toString());
			radioButtonsWithAnswers[i] = jRadio;
			//radioButtonsWithAnswers[i].setText(answers[i]);
			contentPane.add(radioButtonsWithAnswers[i]);
			radioButtonsGroup.add(radioButtonsWithAnswers[i]);
		}
		*/
		JButton submitButton = new JButton();
		submitButton.setText("OK");
		submitButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				KieSession ks = (KieSession)kcontext.getKieRuntime();
				ks.insert(new Answer(question, answers[answerCombo.getSelectedIndex()]));
				ks.fireAllRules();
				
				hide();
			}
		});
		contentPane.add(submitButton);
		
		
	}

}
