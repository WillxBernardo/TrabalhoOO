package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import dados.*;
import project.Motocicleta;

public class MenuMoto {
    public JFrame frame;
    public JList<String> listaMotos;
    public JScrollPane jscrlp;

    public MenuMoto(Dados d) {
        frame = new JFrame("Menu motocicleta");
        frame.setLayout(new BorderLayout());

        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for (Motocicleta moto : d.getMotocicletas()) {
            modeloLista.addElement(moto.exibir_moto());
        }
        
        
        listaMotos = new JList<>(modeloLista);
        listaMotos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jscrlp = new JScrollPane(listaMotos);
        jscrlp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jscrlp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        Border borda = BorderFactory.createLineBorder(Color.BLUE, 5);
        jscrlp.setBorder(borda);  
        jscrlp.setMaximumSize(new Dimension(200, 200));
        frame.add(jscrlp, BorderLayout.PAGE_START);

        frame.setBounds(400, 20, 600, 600);
        frame.setVisible(true);
    }
}
