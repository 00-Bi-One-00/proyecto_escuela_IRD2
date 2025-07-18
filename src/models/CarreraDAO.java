package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

//  CarreraDAO: contiene todos los metodos para interactuar con la tabla carreras 
//  como insertar, select, update y delate

public class CarreraDAO {
    private Connection conn;

    public CarreraDAO(Connection conn){
        this.conn = conn;
    }

    public int insertarCarrera(Carrera carrera){
        int rows = 0;
        String sql = "INSERT INTO carreras(idcarrera, nombre, monto) VALUES (?,?,?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)){
            stmt.setInt(1, carrera.getId());
            stmt.setString(2, carrera.getNombre());
            stmt.setDouble(3, carrera.getMonto());
            rows = stmt.executeUpdate();
        } catch (SQLException e){
            System.out.println("Error al insertar carrera: " + e.getMessage());
        }
        return rows;
    }
    
}
