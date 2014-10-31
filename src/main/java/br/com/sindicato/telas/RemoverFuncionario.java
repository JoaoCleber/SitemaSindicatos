package br.com.sindicato.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import org.hibernate.Session;

import br.com.sindicato.daos.ContribuinteDao;
import br.com.sindicato.daos.FuncionarioDao;
import br.com.sindicato.model.Contribuinte;
import br.com.sindicato.model.Funcionario;
import br.com.sistemassindicato.hibernate.HibernateUtil;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoverFuncionario extends JFrame {

	Session session = HibernateUtil.getSessionFactory();
	Funcionario funcionario = new Funcionario();
	FuncionarioDao funcionarioDao = new FuncionarioDao();

	private JPanel contentPane;
	private JTextField idFuncionario;
	private JButton btnCancelar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoverFuncionario frame = new RemoverFuncionario();
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
	public RemoverFuncionario() {
		setTitle("Remover Funcionario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblId = new JLabel("ID");

		idFuncionario = new JTextField();
		idFuncionario.setColumns(10);

		JButton btnNewButton = new JButton("Remover");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int id = Integer.parseInt(idFuncionario.getText());
				funcionarioDao.deletarFuncionario(session, id);

			}
		});

		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane
				.createParallelGroup(Alignment.TRAILING)
				.addGroup(
						gl_contentPane.createSequentialGroup()
								.addContainerGap(183, Short.MAX_VALUE)
								.addComponent(btnNewButton)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(btnCancelar).addGap(71))
				.addGroup(
						gl_contentPane
								.createSequentialGroup()
								.addGap(12)
								.addComponent(lblId)
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addComponent(idFuncionario,
										GroupLayout.PREFERRED_SIZE, 198,
										GroupLayout.PREFERRED_SIZE)
								.addContainerGap(193, Short.MAX_VALUE)));
		gl_contentPane
				.setVerticalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGap(65)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																idFuncionario,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblId))
										.addPreferredGap(
												ComponentPlacement.RELATED,
												132, Short.MAX_VALUE)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																btnNewButton)
														.addComponent(
																btnCancelar))
										.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}

}
