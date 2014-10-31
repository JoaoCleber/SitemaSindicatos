package br.com.sindicato.telas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.com.sindicato.daos.ContribuinteDao;
import br.com.sindicato.model.Contribuinte;
import br.com.sistemassindicato.hibernate.HibernateUtil;

public class PesquisarContribuinte extends JFrame {

	Contribuinte contribuinte = new Contribuinte();
	ContribuinteDao contribuinteDao = new ContribuinteDao();
	Session session = HibernateUtil.getSessionFactory();

	private JPanel contentPane;
	private JTextField idAtualizarContribuinte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PesquisarContribuinte frame = new PesquisarContribuinte();
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
	public PesquisarContribuinte() {
		setTitle("Pesquisar Contribuinte");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblId = new JLabel("Id");

		idAtualizarContribuinte = new JTextField();
		idAtualizarContribuinte.setColumns(10);

		JButton btnPesuisar = new JButton("Pesuisar");
		btnPesuisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Criteria consultaBanco = session
						.createCriteria(Contribuinte.class);
				int id = Integer.parseInt(idAtualizarContribuinte.getText());
				if (contribuinteDao.buscarPorId(id) != null) {
					AtualizarContribuinte atualiContribuinte = new AtualizarContribuinte();
					atualiContribuinte.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null,
							"ID invalido, tente novamente");
				}

			}
		});

		JSeparator separator = new JSeparator();

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(8)
																		.addComponent(
																				lblId)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				idAtualizarContribuinte,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				btnPesuisar)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				btnCancelar))
														.addComponent(
																separator,
																GroupLayout.DEFAULT_SIZE,
																414,
																Short.MAX_VALUE))
										.addContainerGap()));
		gl_contentPane
				.setVerticalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addContainerGap(11, Short.MAX_VALUE)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(lblId)
														.addComponent(
																idAtualizarContribuinte,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																gl_contentPane
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				btnPesuisar)
																		.addComponent(
																				btnCancelar)))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(separator,
												GroupLayout.PREFERRED_SIZE, 2,
												GroupLayout.PREFERRED_SIZE)
										.addGap(209)));
		contentPane.setLayout(gl_contentPane);
	}
}
