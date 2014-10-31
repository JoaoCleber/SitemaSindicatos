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

public class OpcaoRemover extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpcaoRemover frame = new OpcaoRemover();
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
	public OpcaoRemover() {
		setTitle("Opção Remoer");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnContribuinte = new JButton("Contribuinte");
		btnContribuinte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				PesquisarContribuinte pC = new PesquisarContribuinte();
				pC.setVisible(true);

			}
		});

		JButton btnFuncionario = new JButton("Funcionario");
		btnFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				RemoverFuncionario removerFuncionario = new RemoverFuncionario();

				removerFuncionario.setVisible(true);
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
								.addComponent(btnContribuinte).addGap(32)
								.addComponent(btnFuncionario)
								.addContainerGap(204, Short.MAX_VALUE))
				.addGroup(
						Alignment.TRAILING,
						gl_contentPane.createSequentialGroup()
								.addContainerGap(274, Short.MAX_VALUE)
								.addComponent(btnVoltar).addGap(61)));
		gl_contentPane.setVerticalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING)
				.addGroup(
						gl_contentPane
								.createSequentialGroup()
								.addGap(20)
								.addGroup(
										gl_contentPane
												.createParallelGroup(
														Alignment.BASELINE)
												.addComponent(btnContribuinte)
												.addComponent(btnFuncionario))
								.addGap(165).addComponent(btnVoltar)
								.addContainerGap(20, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}

}
