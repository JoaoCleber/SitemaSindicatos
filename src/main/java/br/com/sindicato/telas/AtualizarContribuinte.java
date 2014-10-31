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
import br.com.sindicato.model.Contribuinte;
import br.com.sistemassindicato.hibernate.HibernateUtil;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AtualizarContribuinte extends JFrame {

	Contribuinte contribuinte = new Contribuinte();
	ContribuinteDao contribuinteDao = new ContribuinteDao();
	Session session = HibernateUtil.getSessionFactory();

	private JPanel contentPane;
	private JTextField nomeContribuinte;
	private JTextField cpfContribuinte;
	private JTextField rgContribuinte;
	private JTextField tituloContribuinte;
	private JTextField dataNasContribuinte;
	private JTextField telContribuinte;
	private JTextField cidadeContribuinte;
	private JTextField ufContribuinte;
	private JTextField ruaContribuite;
	private JTextField numContribuinte;
	private JTextField bairroContribuinte;
	private JTextField dependetesContribuinte;
	private JTextField idContribuinte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtualizarContribuinte frame = new AtualizarContribuinte();
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
	public AtualizarContribuinte() {
		setTitle("Atualizar Contribuinte");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 484, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblNome = new JLabel("Nome");

		nomeContribuinte = new JTextField();
		nomeContribuinte.setColumns(10);

		JLabel lblCpf = new JLabel("CPF");

		cpfContribuinte = new JTextField();
		cpfContribuinte.setColumns(10);

		JLabel lblRg = new JLabel("RG");

		rgContribuinte = new JTextField();
		rgContribuinte.setColumns(10);

		JLabel lblTitulo = new JLabel("Titulo");

		tituloContribuinte = new JTextField();
		tituloContribuinte.setColumns(10);

		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");

		dataNasContribuinte = new JTextField();
		dataNasContribuinte.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone");

		telContribuinte = new JTextField();
		telContribuinte.setColumns(10);

		JLabel lblCidade = new JLabel("Cidade");

		cidadeContribuinte = new JTextField();
		cidadeContribuinte.setColumns(10);

		JLabel lblUf = new JLabel("UF");

		ufContribuinte = new JTextField();
		ufContribuinte.setColumns(10);

		JLabel lblRua = new JLabel("Rua");

		ruaContribuite = new JTextField();
		ruaContribuite.setColumns(10);

		JLabel lblNumero = new JLabel("Numero");

		numContribuinte = new JTextField();
		numContribuinte.setColumns(10);

		JLabel lblBairro = new JLabel("Bairro");

		bairroContribuinte = new JTextField();
		bairroContribuinte.setColumns(10);

		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int id = Integer.parseInt(idContribuinte.getText());
				contribuinteDao.atualizarContribuinte(session, id,
						nomeContribuinte.getText(), cpfContribuinte.getText(),
						rgContribuinte.getText(), tituloContribuinte.getText(),
						telContribuinte.getText(),
						dependetesContribuinte.getText());
			}
		});

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});

		JLabel lblNewLabel = new JLabel("Dependentes");

		dependetesContribuinte = new JTextField();
		dependetesContribuinte.setColumns(10);

		JLabel idContrinbuinte = new JLabel("Id");

		idContribuinte = new JTextField();
		idContribuinte.setColumns(10);
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
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING,
																								false)
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addComponent(
																												lblTitulo)
																										.addPreferredGap(
																												ComponentPlacement.UNRELATED)
																										.addComponent(
																												tituloContribuinte))
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addComponent(
																												lblCpf)
																										.addGap(18)
																										.addComponent(
																												cpfContribuinte,
																												GroupLayout.PREFERRED_SIZE,
																												121,
																												GroupLayout.PREFERRED_SIZE)))
																		.addGap(18)
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addComponent(
																												lblRg)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												rgContribuinte,
																												GroupLayout.PREFERRED_SIZE,
																												114,
																												GroupLayout.PREFERRED_SIZE))
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addComponent(
																												lblDataDeNascimento)
																										.addGap(10)
																										.addComponent(
																												dataNasContribuinte,
																												GroupLayout.PREFERRED_SIZE,
																												GroupLayout.DEFAULT_SIZE,
																												GroupLayout.PREFERRED_SIZE))))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				lblBairro)
																		.addGap(18)
																		.addComponent(
																				bairroContribuinte,
																				GroupLayout.PREFERRED_SIZE,
																				128,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addContainerGap()
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.TRAILING)
																						.addComponent(
																								btnAtualizar)
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addGroup(
																												gl_contentPane
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addComponent(
																																lblTelefone)
																														.addComponent(
																																lblCidade)
																														.addComponent(
																																lblRua))
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addGroup(
																												gl_contentPane
																														.createParallelGroup(
																																Alignment.LEADING,
																																false)
																														.addComponent(
																																ruaContribuite)
																														.addGroup(
																																gl_contentPane
																																		.createSequentialGroup()
																																		.addGroup(
																																				gl_contentPane
																																						.createParallelGroup(
																																								Alignment.LEADING)
																																						.addComponent(
																																								cidadeContribuinte,
																																								GroupLayout.PREFERRED_SIZE,
																																								117,
																																								GroupLayout.PREFERRED_SIZE)
																																						.addComponent(
																																								telContribuinte,
																																								GroupLayout.PREFERRED_SIZE,
																																								102,
																																								GroupLayout.PREFERRED_SIZE))
																																		.addPreferredGap(
																																				ComponentPlacement.UNRELATED)
																																		.addGroup(
																																				gl_contentPane
																																						.createParallelGroup(
																																								Alignment.LEADING)
																																						.addGroup(
																																								gl_contentPane
																																										.createSequentialGroup()
																																										.addComponent(
																																												lblNewLabel)
																																										.addPreferredGap(
																																												ComponentPlacement.RELATED)
																																										.addComponent(
																																												dependetesContribuinte,
																																												GroupLayout.PREFERRED_SIZE,
																																												GroupLayout.DEFAULT_SIZE,
																																												GroupLayout.PREFERRED_SIZE))
																																						.addGroup(
																																								gl_contentPane
																																										.createSequentialGroup()
																																										.addComponent(
																																												lblUf)
																																										.addPreferredGap(
																																												ComponentPlacement.RELATED)
																																										.addComponent(
																																												ufContribuinte,
																																												GroupLayout.PREFERRED_SIZE,
																																												64,
																																												GroupLayout.PREFERRED_SIZE)))))
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												lblNumero)))
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								btnCancelar)
																						.addComponent(
																								numContribuinte,
																								GroupLayout.PREFERRED_SIZE,
																								76,
																								GroupLayout.PREFERRED_SIZE))))
										.addContainerGap(
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
						.addGroup(
								Alignment.TRAILING,
								gl_contentPane
										.createSequentialGroup()
										.addComponent(idContrinbuinte)
										.addPreferredGap(
												ComponentPlacement.RELATED, 13,
												Short.MAX_VALUE)
										.addComponent(idContribuinte,
												GroupLayout.PREFERRED_SIZE, 72,
												GroupLayout.PREFERRED_SIZE)
										.addGap(18)
										.addComponent(lblNome)
										.addGap(18)
										.addComponent(nomeContribuinte,
												GroupLayout.PREFERRED_SIZE,
												263, GroupLayout.PREFERRED_SIZE)
										.addGap(49)));
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
																nomeContribuinte,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblNome)
														.addComponent(
																idContrinbuinte)
														.addComponent(
																idContribuinte,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(lblCpf)
														.addGroup(
																gl_contentPane
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				cpfContribuinte,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				lblRg)
																		.addComponent(
																				rgContribuinte,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)))
										.addGap(18)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				lblTitulo)
																		.addComponent(
																				tituloContribuinte,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				dataNasContribuinte,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				lblDataDeNascimento)))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				lblTelefone)
																		.addComponent(
																				telContribuinte,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				lblNewLabel)
																		.addComponent(
																				dependetesContribuinte,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																cidadeContribuinte,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblCidade)
														.addComponent(lblUf)
														.addComponent(
																ufContribuinte,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblRua)
														.addComponent(
																ruaContribuite,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblNumero)
														.addComponent(
																numContribuinte,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(lblBairro)
														.addComponent(
																bairroContribuinte,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED, 14,
												Short.MAX_VALUE)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																btnAtualizar)
														.addComponent(
																btnCancelar))));
		contentPane.setLayout(gl_contentPane);
	}

}
