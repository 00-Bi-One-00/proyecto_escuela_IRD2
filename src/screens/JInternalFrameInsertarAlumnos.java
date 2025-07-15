package screens;

import java.awt.Font;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class JInternalFrameInsertarAlumnos extends JInternalFrame {
    private JLabel lblId;
    private JLabel lblNombre;
    private JLabel lblApat;
    private JLabel lblAmat;
    private JTextField txtId;
    private JTextField txtNombre;
    private JTextField txtApat;
    private JTextField txtAmat;
    private JButton btnAceptar;
    private JButton btnCancelar;

    public JInternalFrameInsertarAlumnos(){
        super("Insertar alumnos", 
              true,  // resizable
              true,  // closable
              true,  // maximizable
              true); // iconifiable (minimizable)
        this.setTitle("Insertar nuevo alumno");
        this.setSize(400,400);
        initComponents();
    }

    private void initComponents(){
        // Creación de objetos
        lblId = new JLabel("Id:");
        lblNombre = new JLabel("Nombre:");
        lblApat = new JLabel("Apellido Paterno:");
        lblAmat =new JLabel("Apellido Materno");
        txtId = new JTextField();
        txtNombre = new JTextField();
        txtApat = new JTextField();
        txtAmat = new JTextField(); 
        btnAceptar = new JButton("Aceptar");
        btnCancelar = new JButton("Cancelar");

        // Etiquetas
        lblId.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblApat.setFont(new Font("Tahoma", Font.BOLD, 16));
        lblAmat.setFont(new Font("Tahoma", Font.BOLD, 16));
        //Botones 
        btnAceptar.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnCancelar.setFont(new Font("Tahoma", Font.BOLD, 16));

        btnCancelar.addActionListener(e -> this.dispose());

        GroupLayout layout = new GroupLayout(getContentPane());
        this.setLayout(layout);

        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                .addComponent(lblId)
                .addComponent(txtId)
                .addComponent(lblNombre)
                .addComponent(txtNombre)
                .addComponent(lblApat)
                .addComponent(txtApat)
                .addComponent(lblAmat)
                .addComponent(txtAmat)
                .addGroup(
                    layout.createSequentialGroup()
                        .addComponent(btnAceptar)
                        .addComponent(btnCancelar)
                )
        );

        layout.setVerticalGroup(
            layout.createSequentialGroup()
                .addComponent(lblId)
                .addComponent(txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(lblNombre)
                .addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(lblApat)
                .addComponent(txtApat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addComponent(lblAmat)
                .addComponent(txtAmat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGroup(
                    layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAceptar)
                        .addComponent(btnCancelar)
                )
        );
    }
}
