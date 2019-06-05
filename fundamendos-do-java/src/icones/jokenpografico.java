package icones;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class jokenpografico extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					jokenpografico frame = new jokenpografico();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 int jogador = 0;
 private JLabel lblComputador;
 private JLabel lblResultado;
	/**
	 * Create the frame.
	 */
	public jokenpografico() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 531, 348);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnPedra = new JButton("");
		btnPedra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador =1;
				jogo();
			}
		});
		btnPedra.setIcon(new ImageIcon(jokenpografico.class.getResource("/icones/pedra.png")));
		btnPedra.setBounds(10, 11, 123, 114);
		contentPane.add(btnPedra);
		
		JButton btnPapel = new JButton("");
		btnPapel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador =2;
				jogo();
			}
		});
		btnPapel.setIcon(new ImageIcon(jokenpografico.class.getResource("/icones/papel.png")));
		btnPapel.setBounds(183, 11, 116, 114);
		contentPane.add(btnPapel);
		
		JButton btnTesoura = new JButton("");
		btnTesoura.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jogador =3;
				jogo();
			}
		});
		btnTesoura.setIcon(new ImageIcon(jokenpografico.class.getResource("/icones/tesoura.png")));
		btnTesoura.setBounds(361, 11, 116, 114);
		contentPane.add(btnTesoura);
		
		lblComputador = new JLabel("");
		lblComputador.setBounds(243, 158, 214, 140);
		contentPane.add(lblComputador);
		
		lblResultado = new JLabel("");
		lblResultado.setBounds(20, 203, 135, 95);
		contentPane.add(lblResultado);
	}
	
	
	private void jogo() {
	int computador = (int)(Math.random() * 3 + 1);
	switch (computador ) {
	case 1:
		System.out.println("Computador escolheu  PEDRA");
		lblComputador.setIcon(new ImageIcon(jokenpografico.class.getResource("/icones/pcpedra.png")));
		break;
	case 2:   
		System.out.println("Computador escolheu PAPEL");
		lblComputador.setIcon(new ImageIcon(jokenpografico.class.getResource("/icones/pcpapel.png")));
		break;
	case 3:	
		System.out.println("Computador escolheu TESOURA");
		lblComputador.setIcon(new ImageIcon(jokenpografico.class.getResource("/icones/pctesoura.png")));
		break;
		
	default:
		System.out.println("Opção inválida");
		break;
    
}
	// LÓGICA PARA DETERMINAR O VENCEDOR OU EMPATE
	if (jogador == computador) {
		System.out.println("EMPATE");
		lblResultado.setText("EMPATE VENCEU");
	}else {
		if ((jogador == 1 && computador == 3) ||(jogador == 2 && computador == 1) || (jogador == 3 && computador == 2) ){
			System.out.println("JOGADOR VENCEU");
			lblResultado.setText("JOGADOR VENCEU");
		}else {
			System.out.println("COMPUTADOR VENCEU");
			lblResultado.setText("COMPUTADOR VENCEU");
}

	}
}
	
  }