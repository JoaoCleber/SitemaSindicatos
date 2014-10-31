package br.com.sindicato.telas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class OpcaoCadastro extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OpcaoCadastro frame = new OpcaoCadastro();
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
	public OpcaoCadastro() {
		setTitle("Escolha sua opção");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnCadastrarContribuinte = new JButton("Cadastrar Contribuinte");
		btnCadastrarContribuinte.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastrarContribuinte cadContri = new CadastrarContribuinte();
				cadContri.setVisible(true);
			}
		});

		JButton btnCadastarFuncionario = new JButton("Cadastar Funcionario");
		btnCadastarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				CadastrarFuncionario cf = new CadastrarFuncionario();
				cf.setVisible(true);
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
								.addComponent(btnCadastrarContribuinte)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnCadastarFuncionario)
								.addContainerGap(140, Short.MAX_VALUE))
				.addGroup(
						Alignment.TRAILING,
						gl_contentPane.createSequentialGroup()
								.addContainerGap(283, Short.MAX_VALUE)
								.addComponent(btnVoltar).addGap(52)));
		gl_contentPane
				.setVerticalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																btnCadastrarContribuinte)
														.addComponent(
																btnCadastarFuncionario))
										.addPreferredGap(
												ComponentPlacement.RELATED,
												183, Short.MAX_VALUE)
										.addComponent(btnVoltar)
										.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}

}
