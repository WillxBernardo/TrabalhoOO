package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import dados.*;
import project.Acessorio;

public class MenuAces {
    public JFrame frame;
    public JList<String> listaAces;
    public JScrollPane jscrlp;

    public MenuAces(Dados d) {
        frame = new JFrame("Menu Usuario");
        frame.setLayout(new BorderLayout());

        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for (Acessorio aces : d.getAcessorios()) {
            modeloLista.addElement(aces.exibir_acessorio());
        }

        listaAces = new JList<>(modeloLista);
        listaAces.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jscrlp = new JScrollPane(listaAces);
        
        Border borda = BorderFactory.createLineBorder(Color.YELLOW, 5);
        jscrlp.setBorder(borda);
        
        frame.add(jscrlp, BorderLayout.PAGE_START);

        frame.setBounds(400, 20, 600, 600);
        frame.setVisible(true);
    }
}
