package screens;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

    private JMenuBar menuBar; // Barra de manu
    private JMenu menuAlumnos; // Menu Alumnos
    private JMenuItem menuInsertarAlumno; // Elemento insertar

    public VentanaPrincipal(String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 700);
        initComponents();

    }

    private void initComponents(){
        // Barra de menu
        menuBar = new JMenuBar();

        // Menu Alumnos
        menuAlumnos = new JMenu();
        menuAlumnos.setText("Alumnos");

        // Menu Insertar 
        menuInsertarAlumno = new JMenuItem();
        menuInsertarAlumno.setText("Insertar...");


    }
    
}
