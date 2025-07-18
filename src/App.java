
import java.sql.Connection;
import java.sql.SQLException;
import models.Conexion;
import screens.VentanaPrincipal;

public class App {
    public static void main(String[] args) throws Exception {
        Connection conn = null;
        try{
            conn = Conexion.conectar();{
                System.out.println("Conexion exitosa a la BD");
            }
        } catch (SQLException e){
            System.out.println("Error en conxion a la BD" + e.getMessage());
        }
        
        //  Solo para asegurar que la apariencia sea consistente ed windows
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error al establecer look and fell; " + e.getMessage());
        }
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal("Proyecto Escuela", conn);
        ventanaPrincipal.setSize(500,500);
        ventanaPrincipal.setVisible(true);
    }
}