package view;

import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Dimension;
import project.*;
import dados.*;

public class MenuMoto {
	public JFrame frame;
	JLabel modelo, cor, valor, cilindrada, acessorio;
	
	public JButton bVoltar, bCadastrar, bExcluir, bEditar, bListar,
	bExibir, bAddMotoGaragem, bRemMotoGaragem;
	
	public JList<String> listaMotos; 
	public JScrollPane jscrlp; 
	
	public MenuMoto(Dados d) {
		ArrayList<String> modelos = new ArrayList<>();
		for (Motocicleta moto : d.getMotocicletas()) {
			modelos.add(moto.getModelo());
		}
		
		
		frame = new JFrame("Menu motocicleta");
		frame.setLayout(null);
		frame.setBounds(400, 20, 600, 600);
		
		Motocicleta moto = d.getMotocicletas().get(1);
		
		modelo = new JLabel(moto.getModelo());
		cor = new JLabel(moto.getCor());
		valor = new JLabel(String.valueOf(moto.getValor()));
		cilindrada = new JLabel(moto.getCilindrada());
		acessorio = new JLabel(moto.getAcessorio().getNome());
		
		modelo.setBounds(10, 10, 200, 30);
		cor.setBounds(10, 60, 200, 30);
		valor.setBounds(10, 110, 200, 30);
		cilindrada.setBounds(10, 160, 200, 30);
		acessorio.setBounds(10, 210, 200, 30);
		
		listaMotos = new JList<String>(modelos.toArray(new String[0]));
		listaMotos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		jscrlp = new JScrollPane(listaMotos);
		jscrlp.setPreferredSize(new Dimension(120, 200)); 
		 
		frame.add(modelo);
		frame.add(cor);
		frame.add(valor);
		frame.add(cilindrada);
		frame.add(acessorio);
		
		frame.setVisible(true);
		
		
	}
}
