package view;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import dados.*;
import project.Usuario;

public class MenuUsuario {
    public JFrame frame;
    public JList<String> listaUsers;
    public JScrollPane jscrlp;

    public MenuUsuario(Dados d) {
        frame = new JFrame("Menu Usuario");
        frame.setLayout(new BorderLayout());

        DefaultListModel<String> modeloLista = new DefaultListModel<>();
        for (Usuario user : d.getUsuarios()) {
            modeloLista.addElement(user.exibir_usuario());
        }

        listaUsers = new JList<>(modeloLista);
        listaUsers.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jscrlp = new JScrollPane(listaUsers);
        
        Border borda = BorderFactory.createLineBorder(Color.GREEN, 5);
        jscrlp.setBorder(borda);

        frame.add(jscrlp, BorderLayout.PAGE_START);

        frame.setBounds(400, 20, 600, 600);
        frame.setVisible(true);
    }
}