package br.com.sindicato.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JSeparator;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JTextField;
import javax.swing.JButton;

import br.com.sindicato.daos.ContribuinteDao;
import br.com.sindicato.daos.FuncionarioDao;
import br.com.sindicato.model.Contribuinte;
import br.com.sindicato.model.Endereco;
import br.com.sindicato.model.Funcionario;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastrarFuncionario extends JFrame {

	Funcionario funcionario = new Funcionario();
	FuncionarioDao funcionarioDao = new FuncionarioDao();
	Endereco endereco = new Endereco();

	private JPanel contentPane;
	private JTextField nomeFuncionario;
	private JTextField cpfFuncionario;
	private JTextField rgFuncionario;
	private JTextField tituloFuncionario;
	private JTextField dtNasFuncionario;
	private JTextField telFuncionario;
	private JTextField cidadeFuncionario;
	private JTextField ufFuncionario;
	private JTextField ruaFuncionario;
	private JTextField bairroFuncionario;
	private JTextField numFuncionario;
	private JTextField cargoFuncionario;
	private JTextField salarioFuncionario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastrarFuncionario frame = new CadastrarFuncionario();
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
	public CadastrarFuncionario() {
		setTitle("Cadastrar Funcionario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 434);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblDadosPessoais = new JLabel("Dados Pessoais");

		JSeparator separator = new JSeparator();

		JLabel lblNome = new JLabel("Nome");

		nomeFuncionario = new JTextField();
		nomeFuncionario.setColumns(10);

		JLabel lblCpf = new JLabel("CPF");

		cpfFuncionario = new JTextField();
		cpfFuncionario.setColumns(10);

		JLabel lblRg = new JLabel("RG");

		rgFuncionario = new JTextField();
		rgFuncionario.setColumns(10);

		JLabel lblTitulo = new JLabel("Titulo");

		tituloFuncionario = new JTextField();
		tituloFuncionario.setColumns(10);

		JLabel lblDataDeNascimento = new JLabel("Data de Nascimento");

		dtNasFuncionario = new JTextField();
		dtNasFuncionario.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone");

		telFuncionario = new JTextField();
		telFuncionario.setColumns(10);

		JSeparator separator_1 = new JSeparator();

		JSeparator separator_2 = new JSeparator();

		JLabel lblEndereo = new JLabel("Endereço");

		JSeparator separator_3 = new JSeparator();

		JLabel lblCidade = new JLabel("Cidade");

		cidadeFuncionario = new JTextField();
		cidadeFuncionario.setColumns(10);

		JLabel lblUf = new JLabel("UF");

		ufFuncionario = new JTextField();
		ufFuncionario.setColumns(10);

		JLabel lblRua = new JLabel("Rua");

		ruaFuncionario = new JTextField();
		ruaFuncionario.setColumns(10);

		JLabel lblBairro = new JLabel("Bairro");

		bairroFuncionario = new JTextField();
		bairroFuncionario.setColumns(10);

		JLabel lblNumero = new JLabel("Numero");

		numFuncionario = new JTextField();
		numFuncionario.setColumns(10);

		JSeparator separator_4 = new JSeparator();

		JLabel lblDadosProfissionais = new JLabel("Dados Profissionais");

		JLabel lblCargo = new JLabel("Cargo");

		cargoFuncionario = new JTextField();
		cargoFuncionario.setColumns(10);

		JLabel lblSalario = new JLabel("Salario");

		salarioFuncionario = new JTextField();
		salarioFuncionario.setColumns(10);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Double salario = Double.parseDouble(salarioFuncionario
						.getText());

				funcionario.setNome(nomeFuncionario.getText());
				funcionario.setCpf(cpfFuncionario.getText());
				funcionario.setRg(rgFuncionario.getText());
				funcionario.setTitulo(tituloFuncionario.getText());
				funcionario.setTelefone(telFuncionario.getText());
				funcionario.setCargo(cargoFuncionario.getText());
				funcionario.setSalario(salario);

				endereco.setCidade(cidadeFuncionario.getText());
				endereco.setUf(ufFuncionario.getText());
				endereco.setRua(ruaFuncionario.getText());
				endereco.setBairro(bairroFuncionario.getText());
				endereco.setNumeroCasa(numFuncionario.getText());

				funcionarioDao.inserirFuncionario(funcionario);

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
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblDadosPessoais)
														.addComponent(
																separator,
																GroupLayout.PREFERRED_SIZE,
																426,
																GroupLayout.PREFERRED_SIZE)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				lblNome)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				nomeFuncionario,
																				GroupLayout.PREFERRED_SIZE,
																				376,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				lblCpf)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				cpfFuncionario,
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
																				rgFuncionario,
																				GroupLayout.PREFERRED_SIZE,
																				125,
																				GroupLayout.PREFERRED_SIZE))
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
																												lblTelefone)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												telFuncionario))
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addComponent(
																												lblTitulo)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												tituloFuncionario,
																												GroupLayout.PREFERRED_SIZE,
																												123,
																												GroupLayout.PREFERRED_SIZE)))
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				lblDataDeNascimento)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				dtNasFuncionario,
																				GroupLayout.PREFERRED_SIZE,
																				118,
																				GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(
												GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE))
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addContainerGap(11, Short.MAX_VALUE)
										.addComponent(separator_1,
												GroupLayout.PREFERRED_SIZE,
												415, GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
						.addGroup(
								Alignment.LEADING,
								gl_contentPane
										.createSequentialGroup()
										.addComponent(separator_2,
												GroupLayout.PREFERRED_SIZE,
												416, GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
						.addGroup(
								Alignment.LEADING,
								gl_contentPane.createSequentialGroup()
										.addComponent(lblEndereo)
										.addContainerGap())
						.addGroup(
								Alignment.LEADING,
								gl_contentPane
										.createSequentialGroup()
										.addComponent(separator_3,
												GroupLayout.PREFERRED_SIZE,
												423, GroupLayout.PREFERRED_SIZE)
										.addContainerGap())
						.addGroup(
								Alignment.LEADING,
								gl_contentPane
										.createSequentialGroup()
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.TRAILING,
																false)
														.addGroup(
																Alignment.LEADING,
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				lblBairro)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				bairroFuncionario))
														.addGroup(
																Alignment.LEADING,
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				lblRua)
																		.addGap(18)
																		.addComponent(
																				ruaFuncionario))
														.addGroup(
																Alignment.LEADING,
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				lblCidade)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				cidadeFuncionario,
																				GroupLayout.PREFERRED_SIZE,
																				191,
																				GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				lblUf)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				ufFuncionario,
																				GroupLayout.PREFERRED_SIZE,
																				50,
																				GroupLayout.PREFERRED_SIZE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				lblNumero)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				numFuncionario,
																				GroupLayout.PREFERRED_SIZE,
																				54,
																				GroupLayout.PREFERRED_SIZE)))
										.addGap(99))
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addComponent(separator_4,
												GroupLayout.DEFAULT_SIZE, 426,
												Short.MAX_VALUE)
										.addContainerGap())
						.addGroup(
								Alignment.LEADING,
								gl_contentPane.createSequentialGroup()
										.addComponent(lblDadosProfissionais)
										.addContainerGap())
						.addGroup(
								Alignment.LEADING,
								gl_contentPane
										.createSequentialGroup()
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.TRAILING)
														.addComponent(btnSalvar)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				lblCargo)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				cargoFuncionario,
																				GroupLayout.PREFERRED_SIZE,
																				155,
																				GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				lblSalario)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				salarioFuncionario,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(btnCancelar).addGap(5)));
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
												GroupLayout.PREFERRED_SIZE, 10,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblNome)
														.addComponent(
																nomeFuncionario,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblCpf)
														.addComponent(
																cpfFuncionario,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblRg)
														.addComponent(
																rgFuncionario,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(lblTitulo)
														.addGroup(
																gl_contentPane
																		.createParallelGroup(
																				Alignment.BASELINE)
																		.addComponent(
																				tituloFuncionario,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addComponent(
																				lblDataDeNascimento)
																		.addComponent(
																				dtNasFuncionario,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addComponent(
																lblTelefone)
														.addComponent(
																telFuncionario,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addComponent(separator_2,
												GroupLayout.PREFERRED_SIZE, 7,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(lblEndereo)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(separator_3,
												GroupLayout.PREFERRED_SIZE, 3,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblCidade)
														.addComponent(
																cidadeFuncionario,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblUf)
														.addComponent(
																ufFuncionario,
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
																ruaFuncionario,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblBairro)
														.addComponent(
																bairroFuncionario,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblNumero)
														.addComponent(
																numFuncionario,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(separator_4,
												GroupLayout.PREFERRED_SIZE, 4,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addComponent(lblDadosProfissionais)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblCargo)
														.addComponent(
																cargoFuncionario,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblSalario)
														.addComponent(
																salarioFuncionario,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.RELATED, 44,
												Short.MAX_VALUE)
										.addComponent(separator_1,
												GroupLayout.PREFERRED_SIZE, 0,
												GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												ComponentPlacement.RELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(btnSalvar)
														.addComponent(
																btnCancelar))));
		contentPane.setLayout(gl_contentPane);
	}
}
