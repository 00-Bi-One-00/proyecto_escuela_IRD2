package screens;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame {

    private JMenuBar menuBar; // Barra de manu

    private JMenu menuAlumnos; // Menu Alumnos
    private JMenuItem menuVerAlumnos;  // Elemento ver
    private JMenuItem menuInsertarAlumno; // Elemento insertar
    private JMenuItem menuEliminarAlumnos;  // Elemento Eliminar

    private JMenu menuBachilleratos;
    private JMenuItem menuVerBachilleratos;  //Elemento ver
    private JMenuItem menuInsertarBachillerato;  // Elemento insertar
    private JMenuItem menuEliminarBachillerato;  // Elemento Eliminar
    

    public VentanaPrincipal(String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents(){
        // Barra de menu
        menuBar = new JMenuBar();

        // Menu Alumnos
        menuAlumnos = new JMenu();
        menuAlumnos.setText("Alumnos");

        // Menu Insertar Alumnos
        menuInsertarAlumno = new JMenuItem();
        menuInsertarAlumno.setText("Insertar alumnos...");

        // Menu ver Alumnos
        menuVerAlumnos = new JMenuItem("Ver todos los alumnos...");

        // Menu eliminar Alumnos
        menuEliminarAlumnos = new JMenuItem("Dar de baja alumno...");

        // Menu bachilleratos
        menuBachilleratos = new JMenu();
        menuBachilleratos.setText("Bachilleratos");

        //  Menu Ver Bachilleratos
        menuVerBachilleratos = new JMenuItem("Ver todos los bachilleratos...");
        
        //  Menu Insertar Bachilleratos
        menuInsertarBachillerato = new JMenuItem("Insertar bachilleratos...");

        //  Menu Eliminar Bachilleratos
        menuInsertarBachillerato = new JMenuItem("Eliminar un bachillerato...");


        // Agregando menu alumnos
        menuAlumnos.add(menuVerAlumnos);
        menuAlumnos.add(menuInsertarAlumno);
        menuAlumnos.add(menuEliminarAlumnos);
        menuBar.add(menuAlumnos);

        // Agregando menu Bachilleratos
        menuBachilleratos.add(menuVerBachilleratos);
        menuBachilleratos.add(menuInsertarBachillerato);
        menuBachilleratos.add(menuEliminarBachillerato);
        menuBar.add(menuBachilleratos);

        this.setJMenuBar(menuBar);  // menuBar es la unica barra del JFrame
        
        pack();  //  Empaquetar los componentes del JFrame
    }
    
}
