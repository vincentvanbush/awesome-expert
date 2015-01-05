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

import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.rule.RuleContext;

import com.control.Message;
import com.control.Religion;
import com.control.Message.MessageType;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConclusionWindow extends JFrame {

	private JPanel contentPane;
	private JTextField compatibilityTextField;
	private JTextField propositionTextField;
	private JTextField incompatibilityTextField;

	/**
	 * Create the frame.
	 */
	public ConclusionWindow(final RuleContext kcontext, Religion rel) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 152);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel propositionLabel = new JLabel("Propozycja");
		contentPane.add(propositionLabel);
		
		propositionTextField = new JTextField(rel.getReligionName().toString());
		contentPane.add(propositionTextField);
		propositionTextField.setColumns(25);
		
		JLabel compatibilityLabel = new JLabel("Odp. zgodne");
		contentPane.add(compatibilityLabel);
		
		compatibilityTextField = new JTextField(Integer.toString(rel.getHits()));
		contentPane.add(compatibilityTextField);
		compatibilityTextField.setColumns(25);
		
		JLabel incompatibilityLabel = new JLabel("Odp. niezgodne");
		contentPane.add(incompatibilityLabel);
		
		incompatibilityTextField = new JTextField(Integer.toString(rel.getMisses()));
		contentPane.add(incompatibilityTextField);
		incompatibilityTextField.setColumns(25);
		
		JButton acceptanceButton = new JButton("Akceptuje");
		acceptanceButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hide();
			}
		});
		contentPane.add(acceptanceButton);
		
		JButton discardButton = new JButton("Odrzuc");
		discardButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KieSession ks = (KieSession)kcontext.getKieRuntime();
				ks.insert(new Message(MessageType.SECOND_PHASE));
				ks.insert(new Message(MessageType.RETRACT_TOP_RELIGION));
				ks.fireAllRules();
				hide();
			}
		});
		contentPane.add(discardButton);
		
		JButton askForMoreButton = new JButton("Pytaj dalej");
		askForMoreButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KieSession ks = (KieSession)kcontext.getKieRuntime();
				ks.insert(new Message(MessageType.SECOND_PHASE));
				ks.insert(new Message(MessageType.SECOND_PHASE_QUESTION));
				ks.fireAllRules();
				hide();
			}
		});
		contentPane.add(askForMoreButton);
	}

}
