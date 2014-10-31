package br.com.sindicato.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class OpcaoEditar extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpcaoEditar frame = new OpcaoEditar();
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
	public OpcaoEditar() {
		setTitle("Escolha");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnContribuinte = new JButton("Contribuinte");
		btnContribuinte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PesquisarContribuinte pesqContribuinte = new PesquisarContribuinte();
				pesqContribuinte.setVisible(true);

			}
		});

		JButton btnFuncionario = new JButton("Funcionario");
		btnFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PesquisarFuncionario pesqFuncionario = new PesquisarFuncionario();
				pesqFuncionario.setVisible(true);

			}
		});

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane
				.createParallelGroup(Alignment.LEADING)
				.addGroup(
						gl_contentPane.createSequentialGroup()
								.addContainerGap()
								.addComponent(btnContribuinte)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnFuncionario)
								.addContainerGap(228, Short.MAX_VALUE))
				.addGroup(
						Alignment.TRAILING,
						gl_contentPane.createSequentialGroup()
								.addContainerGap(303, Short.MAX_VALUE)
								.addComponent(btnVoltar).addGap(32)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING)
				.addGroup(
						gl_contentPane
								.createSequentialGroup()
								.addContainerGap()
								.addGroup(
										gl_contentPane
												.createParallelGroup(
														Alignment.BASELINE)
												.addComponent(btnContribuinte)
												.addComponent(btnFuncionario))
								.addPreferredGap(ComponentPlacement.RELATED,
										183, Short.MAX_VALUE)
								.addComponent(btnVoltar).addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}

}
