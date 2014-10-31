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

public class Principal extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Principal frame = new Principal();
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
	public Principal() {
		setTitle("Sindicato");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JButton btnCadastrar = new JButton("Cadastrar ");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OpcaoCadastro t = new OpcaoCadastro();
				t.setVisible(true);

			}
		});

		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OpcaoRemover opRemover = new OpcaoRemover();
				opRemover.setVisible(true);
			}
		});

		JButton btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OpcaoEditar opEditar = new OpcaoEditar();
				opEditar.setVisible(true);

			}
		});

		JButton btnListar = new JButton("Listar");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_contentPane.createSequentialGroup().addContainerGap()
						.addComponent(btnCadastrar)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnRemover)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnEditar).addGap(18)
						.addComponent(btnListar)
						.addContainerGap(102, Short.MAX_VALUE)));
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
												.addComponent(btnCadastrar)
												.addComponent(btnRemover)
												.addComponent(btnEditar)
												.addComponent(btnListar))
								.addContainerGap(217, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
