package br.com.sindicato.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

import br.com.sindicato.daos.ContribuinteDao;
import br.com.sindicato.model.Contribuinte;
import br.com.sindicato.model.Endereco;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarContribuinte extends JFrame {

	Contribuinte contribuinte = new Contribuinte();
	ContribuinteDao contribuinteDao = new ContribuinteDao();
	Endereco endereco = new Endereco();

	private JPanel contentPane;
	private JTextField nomeContribuinte;
	private JTextField cpfContribuinte;
	private JTextField rgContribuinte;
	private JTextField tituloContribuinte;
	private JTextField datanascimentoCont;
	private JTextField telContribuinte;
	private JTextField cidadeContribuinte;
	private JTextField ufContribuinte;
	private JTextField ruaContribuinte;
	private JTextField bairroContribuinte;
	private JTextField numeroContribuinte;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarContribuinte frame = new CadastrarContribuinte();
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
	public CadastrarContribuinte() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblDadosPessoais = new JLabel("Dados Pessoais");

		JSeparator separator = new JSeparator();

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

		JLabel lblDataNascimento = new JLabel("Data Nascimento");

		datanascimentoCont = new JTextField();
		datanascimentoCont.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone");

		telContribuinte = new JTextField();
		telContribuinte.setColumns(10);

		JLabel label = new JLabel("");

		JLabel lblDataFiliao = new JLabel("Data Filiação");

		JSeparator separator_1 = new JSeparator();

		JLabel lblEndereo = new JLabel("Endereço");

		JSeparator separator_2 = new JSeparator();

		JLabel lblCidade = new JLabel("Cidade");

		cidadeContribuinte = new JTextField();
		cidadeContribuinte.setColumns(10);

		JLabel lblUf = new JLabel("UF");

		ufContribuinte = new JTextField();
		ufContribuinte.setColumns(10);

		JLabel lblRua = new JLabel("Rua");

		ruaContribuinte = new JTextField();
		ruaContribuinte.setColumns(10);

		JLabel lblBairro = new JLabel("Bairro");

		bairroContribuinte = new JTextField();
		bairroContribuinte.setColumns(10);

		JLabel lblNumero = new JLabel("Numero");

		numeroContribuinte = new JTextField();
		numeroContribuinte.setColumns(10);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				contribuinte.setNome(nomeContribuinte.getText());
				contribuinte.setCpf(cpfContribuinte.getText());
				contribuinte.setRg(rgContribuinte.getText());
				contribuinte.setTitulo(tituloContribuinte.getText());
				// contribuinte.setDataNascimento(datanascimentoCont.getText());
				contribuinte.setTelefone(telContribuinte.getText());

				endereco.setCidade(cidadeContribuinte.getText());
				endereco.setUf(ufContribuinte.getText());
				endereco.setRua(ruaContribuinte.getText());
				endereco.setBairro(bairroContribuinte.getText());
				endereco.setNumeroCasa(numeroContribuinte.getText());

				contribuinte.setEndereco(endereco);
				contribuinteDao.inserirContribuinte(contribuinte);

			}
		});

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
								gl_contentPane.createSequentialGroup()
										.addComponent(lblDadosPessoais)
										.addContainerGap(350, Short.MAX_VALUE))
						.addComponent(separator, GroupLayout.DEFAULT_SIZE, 432,
								Short.MAX_VALUE)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.TRAILING)
														.addGroup(
																Alignment.LEADING,
																gl_contentPane
																		.createParallelGroup(
																				Alignment.TRAILING,
																				false)
																		.addGroup(
																				Alignment.LEADING,
																				gl_contentPane
																						.createSequentialGroup()
																						.addComponent(
																								lblCpf)
																						.addPreferredGap(
																								ComponentPlacement.UNRELATED)
																						.addComponent(
																								cpfContribuinte,
																								GroupLayout.PREFERRED_SIZE,
																								153,
																								GroupLayout.PREFERRED_SIZE)
																						.addPreferredGap(
																								ComponentPlacement.RELATED)
																						.addComponent(
																								lblRg)
																						.addPreferredGap(
																								ComponentPlacement.RELATED)
																						.addComponent(
																								rgContribuinte))
																		.addGroup(
																				Alignment.LEADING,
																				gl_contentPane
																						.createSequentialGroup()
																						.addComponent(
																								lblNome)
																						.addPreferredGap(
																								ComponentPlacement.RELATED)
																						.addComponent(
																								nomeContribuinte,
																								GroupLayout.PREFERRED_SIZE,
																								366,
																								GroupLayout.PREFERRED_SIZE)))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				lblTitulo)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				tituloContribuinte,
																				GroupLayout.DEFAULT_SIZE,
																				125,
																				Short.MAX_VALUE)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				lblDataNascimento)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addComponent(
																								lblDataFiliao)
																						.addComponent(
																								datanascimentoCont,
																								GroupLayout.PREFERRED_SIZE,
																								118,
																								GroupLayout.PREFERRED_SIZE))
																		.addGap(43)))
										.addGap(27))
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addComponent(lblTelefone)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(telContribuinte,
												GroupLayout.PREFERRED_SIZE,
												138, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(label).addGap(213))
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(separator_1,
												GroupLayout.PREFERRED_SIZE,
												405, GroupLayout.PREFERRED_SIZE)
										.addContainerGap(
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
						.addGroup(
								gl_contentPane.createSequentialGroup()
										.addComponent(lblEndereo)
										.addContainerGap())
						.addGroup(
								Alignment.TRAILING,
								gl_contentPane
										.createSequentialGroup()
										.addComponent(separator_2,
												GroupLayout.DEFAULT_SIZE, 423,
												Short.MAX_VALUE)
										.addContainerGap())
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addComponent(lblCidade)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(cidadeContribuinte,
												GroupLayout.PREFERRED_SIZE,
												165, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addComponent(lblUf)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(ufContribuinte,
												GroupLayout.PREFERRED_SIZE, 53,
												GroupLayout.PREFERRED_SIZE)
										.addGap(143))
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addComponent(lblRua)
										.addGap(18)
										.addComponent(ruaContribuinte,
												GroupLayout.PREFERRED_SIZE,
												278, GroupLayout.PREFERRED_SIZE)
										.addGap(110))
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addComponent(lblBairro)
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addComponent(bairroContribuinte,
												GroupLayout.PREFERRED_SIZE,
												172, GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(lblNumero)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(numeroContribuinte,
												GroupLayout.PREFERRED_SIZE, 69,
												GroupLayout.PREFERRED_SIZE)
										.addGap(101))
						.addGroup(
								Alignment.TRAILING,
								gl_contentPane.createSequentialGroup()
										.addContainerGap(243, Short.MAX_VALUE)
										.addComponent(btnSalvar).addGap(34)
										.addComponent(btnCancelar)
										.addContainerGap()));
		gl_contentPane
				.setVerticalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addComponent(lblDadosPessoais)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(separator,
												GroupLayout.PREFERRED_SIZE, 2,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblNome)
														.addComponent(
																nomeContribuinte,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblCpf)
														.addComponent(
																cpfContribuinte,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblRg)
														.addComponent(
																rgContribuinte,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblTitulo)
														.addComponent(
																tituloContribuinte,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblDataNascimento)
														.addComponent(
																datanascimentoCont,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
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
																GroupLayout.PREFERRED_SIZE)
														.addComponent(label)
														.addComponent(
																lblDataFiliao))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(separator_1,
												GroupLayout.PREFERRED_SIZE, 3,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(lblEndereo)
										.addGap(7)
										.addComponent(separator_2,
												GroupLayout.PREFERRED_SIZE,
												GroupLayout.DEFAULT_SIZE,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblCidade)
														.addComponent(
																cidadeContribuinte,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblUf)
														.addComponent(
																ufContribuinte,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblRua)
														.addComponent(
																ruaContribuinte,
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
														.addGroup(
																gl_contentPane
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				bairroContribuinte,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				lblNumero)
																		.addComponent(
																				numeroContribuinte,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												ComponentPlacement.RELATED, 38,
												Short.MAX_VALUE)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																btnCancelar)
														.addComponent(btnSalvar))
										.addContainerGap()));
		contentPane.setLayout(gl_contentPane);
	}
}
