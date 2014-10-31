package br.com.sindicato.telas;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

import org.hibernate.Session;

import br.com.sindicato.daos.FuncionarioDao;
import br.com.sindicato.model.Funcionario;
import br.com.sistemassindicato.hibernate.HibernateUtil;

public class AtualizarFuncionario extends JFrame {

	Funcionario funcionario = new Funcionario();
	FuncionarioDao funcionarioDao = new FuncionarioDao();
	Session session = HibernateUtil.getSessionFactory();

	private JPanel contentPane;
	private JTextField idFuncionario;
	private JTextField nomeFuncionario;
	private JTextField cpfFuncionario;
	private JTextField rgFuncionario;
	private JTextField tituloFuncionario;
	private JTextField dataNascimentoFuncionario;
	private JTextField telefoneFuncionario;
	private JTextField dependeteFuncionario;
	private JTextField cidadeFuncionario;
	private JTextField ufFuncionario;
	private JTextField ruaFuncionario;
	private JTextField numeroFuncionario;
	private JTextField bairroFuncionario;
	private JTextField cargoFuncionario;
	private JTextField salarioFuncionario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtualizarFuncionario frame = new AtualizarFuncionario();
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
	public AtualizarFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 323);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblId = new JLabel("ID");

		idFuncionario = new JTextField();
		idFuncionario.setColumns(10);

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

		dataNascimentoFuncionario = new JTextField();
		dataNascimentoFuncionario.setColumns(10);

		JLabel lblTelefone = new JLabel("Telefone");

		telefoneFuncionario = new JTextField();
		telefoneFuncionario.setColumns(10);

		JLabel lblDependente = new JLabel("Dependente");

		dependeteFuncionario = new JTextField();
		dependeteFuncionario.setColumns(10);

		JLabel lblCidade = new JLabel("Cidade");

		cidadeFuncionario = new JTextField();
		cidadeFuncionario.setColumns(10);

		JLabel lblUf = new JLabel("UF");

		ufFuncionario = new JTextField();
		ufFuncionario.setColumns(10);

		JLabel lblRua = new JLabel("Rua");

		ruaFuncionario = new JTextField();
		ruaFuncionario.setColumns(10);

		JLabel lblNumero = new JLabel("Numero");

		numeroFuncionario = new JTextField();
		numeroFuncionario.setColumns(10);

		JLabel lblBairro = new JLabel("Bairro");

		bairroFuncionario = new JTextField();
		bairroFuncionario.setColumns(10);

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(idFuncionario.getText());
				Double salario = Double.parseDouble(salarioFuncionario
						.getText());

				funcionarioDao.atualizarFuncionario(session, id,
						nomeFuncionario.getText(), cpfFuncionario.getText(),
						rgFuncionario.getText(), tituloFuncionario.getText(),
						telefoneFuncionario.getText(),
						dependeteFuncionario.getText(),
						cargoFuncionario.getText(), salario);

			}
		});

		JButton btnCancelar = new JButton("Cancelar");

		JLabel lblCargo = new JLabel("Cargo");

		cargoFuncionario = new JTextField();
		cargoFuncionario.setColumns(10);

		JLabel lblSalario = new JLabel("Salario");

		salarioFuncionario = new JTextField();
		salarioFuncionario.setColumns(10);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane
				.setHorizontalGroup(gl_contentPane
						.createParallelGroup(Alignment.TRAILING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addContainerGap()
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
																								Alignment.LEADING)
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addComponent(
																												lblId)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												idFuncionario,
																												GroupLayout.PREFERRED_SIZE,
																												44,
																												GroupLayout.PREFERRED_SIZE)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												lblNome)
																										.addPreferredGap(
																												ComponentPlacement.UNRELATED)
																										.addComponent(
																												nomeFuncionario,
																												GroupLayout.PREFERRED_SIZE,
																												192,
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
																																				lblCidade)
																																		.addGap(18)
																																		.addComponent(
																																				cidadeFuncionario))
																														.addGroup(
																																gl_contentPane
																																		.createSequentialGroup()
																																		.addComponent(
																																				lblTelefone)
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED)
																																		.addComponent(
																																				telefoneFuncionario))
																														.addGroup(
																																gl_contentPane
																																		.createSequentialGroup()
																																		.addComponent(
																																				lblTitulo)
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED)
																																		.addComponent(
																																				tituloFuncionario))
																														.addGroup(
																																gl_contentPane
																																		.createSequentialGroup()
																																		.addComponent(
																																				lblCpf)
																																		.addPreferredGap(
																																				ComponentPlacement.RELATED)
																																		.addComponent(
																																				cpfFuncionario,
																																				GroupLayout.PREFERRED_SIZE,
																																				120,
																																				GroupLayout.PREFERRED_SIZE)))
																										.addPreferredGap(
																												ComponentPlacement.UNRELATED)
																										.addComponent(
																												lblNumero)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addGroup(
																												gl_contentPane
																														.createParallelGroup(
																																Alignment.LEADING)
																														.addGroup(
																																gl_contentPane
																																		.createParallelGroup(
																																				Alignment.LEADING,
																																				false)
																																		.addGroup(
																																				gl_contentPane
																																						.createSequentialGroup()
																																						.addComponent(
																																								lblDependente)
																																						.addPreferredGap(
																																								ComponentPlacement.RELATED)
																																						.addComponent(
																																								dependeteFuncionario))
																																		.addGroup(
																																				gl_contentPane
																																						.createSequentialGroup()
																																						.addComponent(
																																								lblRg)
																																						.addPreferredGap(
																																								ComponentPlacement.RELATED)
																																						.addComponent(
																																								rgFuncionario,
																																								GroupLayout.PREFERRED_SIZE,
																																								GroupLayout.DEFAULT_SIZE,
																																								GroupLayout.PREFERRED_SIZE))
																																		.addGroup(
																																				gl_contentPane
																																						.createSequentialGroup()
																																						.addComponent(
																																								lblDataDeNascimento)
																																						.addPreferredGap(
																																								ComponentPlacement.RELATED)
																																						.addComponent(
																																								dataNascimentoFuncionario,
																																								GroupLayout.PREFERRED_SIZE,
																																								GroupLayout.DEFAULT_SIZE,
																																								GroupLayout.PREFERRED_SIZE)))
																														.addComponent(
																																numeroFuncionario,
																																GroupLayout.PREFERRED_SIZE,
																																GroupLayout.DEFAULT_SIZE,
																																GroupLayout.PREFERRED_SIZE)))
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addComponent(
																												lblBairro)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												bairroFuncionario,
																												GroupLayout.PREFERRED_SIZE,
																												120,
																												GroupLayout.PREFERRED_SIZE)))
																		.addContainerGap(
																				32,
																				Short.MAX_VALUE))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				lblCargo)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				cargoFuncionario,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.LEADING)
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addPreferredGap(
																												ComponentPlacement.RELATED,
																												133,
																												Short.MAX_VALUE)
																										.addComponent(
																												btnSalvar)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												btnCancelar)
																										.addGap(18))
																						.addGroup(
																								gl_contentPane
																										.createSequentialGroup()
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												lblSalario)
																										.addPreferredGap(
																												ComponentPlacement.RELATED)
																										.addComponent(
																												salarioFuncionario,
																												GroupLayout.PREFERRED_SIZE,
																												GroupLayout.DEFAULT_SIZE,
																												GroupLayout.PREFERRED_SIZE)
																										.addGap(169))))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addComponent(
																				lblRua)
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				ruaFuncionario,
																				GroupLayout.PREFERRED_SIZE,
																				171,
																				GroupLayout.PREFERRED_SIZE)
																		.addGap(18)
																		.addComponent(
																				lblUf)
																		.addPreferredGap(
																				ComponentPlacement.UNRELATED)
																		.addComponent(
																				ufFuncionario,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)
																		.addContainerGap()))));
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
														.addComponent(lblId)
														.addComponent(
																idFuncionario,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblNome)
														.addComponent(
																nomeFuncionario,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
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
																				dataNascimentoFuncionario,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(
																lblTelefone)
														.addComponent(
																telefoneFuncionario,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(
																lblDependente)
														.addComponent(
																dependeteFuncionario,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												ComponentPlacement.UNRELATED)
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
														.addComponent(lblNumero)
														.addComponent(
																numeroFuncionario,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGap(18)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.BASELINE)
														.addComponent(lblRua)
														.addComponent(
																ruaFuncionario,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE)
														.addComponent(lblUf)
														.addComponent(
																ufFuncionario,
																GroupLayout.PREFERRED_SIZE,
																GroupLayout.DEFAULT_SIZE,
																GroupLayout.PREFERRED_SIZE))
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addGap(18)
																		.addComponent(
																				lblBairro))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addComponent(
																				bairroFuncionario,
																				GroupLayout.PREFERRED_SIZE,
																				GroupLayout.DEFAULT_SIZE,
																				GroupLayout.PREFERRED_SIZE)))
										.addGap(3)
										.addGroup(
												gl_contentPane
														.createParallelGroup(
																Alignment.LEADING)
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addPreferredGap(
																				ComponentPlacement.RELATED,
																				20,
																				Short.MAX_VALUE)
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.BASELINE)
																						.addComponent(
																								btnSalvar)
																						.addComponent(
																								btnCancelar)))
														.addGroup(
																gl_contentPane
																		.createSequentialGroup()
																		.addPreferredGap(
																				ComponentPlacement.RELATED)
																		.addGroup(
																				gl_contentPane
																						.createParallelGroup(
																								Alignment.BASELINE)
																						.addComponent(
																								lblCargo)
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
																		.addContainerGap()))));
		contentPane.setLayout(gl_contentPane);
	}

}
