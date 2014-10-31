package br.com.sindicato.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.com.sindicato.daos.ContribuinteDao;
import br.com.sindicato.daos.FuncionarioDao;
import br.com.sindicato.model.Contribuinte;
import br.com.sindicato.model.Funcionario;
import br.com.sistemassindicato.hibernate.HibernateUtil;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PesquisarFuncionario extends JFrame {

	Funcionario funcionario = new Funcionario();
	FuncionarioDao funcionarioDao = new FuncionarioDao();
	Session session = HibernateUtil.getSessionFactory();

	private JPanel contentPane;
	private JTextField idFuncionario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PesquisarFuncionario frame = new PesquisarFuncionario();
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
	public PesquisarFuncionario() {
		setTitle("Pesquisar Funcionario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JLabel lblId = new JLabel("Id");

		idFuncionario = new JTextField();
		idFuncionario.setColumns(10);

		JButton btnPesquisar = new JButton("Pesquisar");
		btnPesquisar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Criteria consultaBanco = session
						.createCriteria(Funcionario.class);
				int id = Integer.parseInt(idFuncionario.getText());
				if (funcionarioDao.buscarPorId(id) != null) {
					AtualizarFuncionario atualizarFuncionario = new AtualizarFuncionario();
					atualizarFuncionario.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null,	"ID invalido, tente novamente");
				}

			}
		});

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(gl_contentPane.createParallelGroup(
				Alignment.LEADING).addGroup(
				gl_contentPane
						.createSequentialGroup()
						.addContainerGap()
						.addComponent(lblId)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(idFuncionario,
								GroupLayout.PREFERRED_SIZE,
								GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(btnPesquisar)
						.addPreferredGap(ComponentPlacement.UNRELATED)
						.addComponent(btnCancelar)
						.addContainerGap(130, Short.MAX_VALUE)));
		gl_contentPane
				.setVerticalGroup(gl_contentPane
						.createParallelGroup(Alignment.LEADING)
						.addGroup(
								gl_contentPane
										.createSequentialGroup()
										.addGap(20)
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
														.addComponent(
																btnPesquisar)
														.addComponent(
																btnCancelar))
										.addContainerGap(217, Short.MAX_VALUE)));
		contentPane.setLayout(gl_contentPane);
	}
}
