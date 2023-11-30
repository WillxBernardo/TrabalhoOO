package view;

import javax.swing.*;
import dados.Dados;
import java.awt.event.*;

public class Tela implements ActionListener{
	private static JFrame f;
	private static JButton bMenuMoto;
	private static JButton bMenuUsuario;
	private static JButton bMenuAcessorio;
	
	public Tela() {
		 f = new JFrame("Hello world!");
		 bMenuMoto = new JButton("Menu motocicleta");
		 bMenuUsuario = new JButton("Menu usuario");
		 bMenuAcessorio = new JButton("Menu acessorio");
		 
		 f.setVisible(true);
		 f.setBounds(400, 20, 600, 600);
		 f.setLayout(null);
		 
		 f.add(bMenuMoto);
		 bMenuMoto.setVisible(true);
		 bMenuMoto.setBounds(200, 80, 200, 50);
		 
		 f.add(bMenuUsuario);
		 bMenuUsuario.setVisible(true);
		 bMenuUsuario.setBounds(200, 160, 200, 50);
		 
		 f.add(bMenuAcessorio);
		 bMenuAcessorio.setVisible(true);
		 bMenuAcessorio.setBounds(200, 240, 200, 50);
	}
	public static void main (String[] args) {
		Tela triumph = new Tela();
		bMenuMoto.addActionListener(triumph);
		bMenuUsuario.addActionListener(triumph);
		bMenuAcessorio.addActionListener(triumph);
	}
	
	public void actionPerformed(ActionEvent e) {
		Dados d = new Dados();
		d.preencherDados();
		if (e.getSource() == bMenuMoto) {			
			MenuMoto menumoto = new MenuMoto(d);
		} else if (e.getSource() == bMenuUsuario) {
			System.out.println("O botao DELETAR foi clicado");
		} else if (e.getSource() == bMenuAcessorio) {
			System.out.println("O botao EDITAR foi clicado");
		}	
	}
	
}
	