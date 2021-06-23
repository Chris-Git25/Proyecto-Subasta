/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Clases.Contacto;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Christian
 */
public class ContactoDAO {
    PreparedStatement pst;
    ResultSet rs;
    Connection con;
    
    public boolean agregarContacto(Contacto contacto) {
        String sql ="INSERT INTO contactos(identidad,"
                    + "primer_nombre,"
                    + "primer_apellido,"
                    + "segundo_apellido,"
                    + "cargo"
                    + "telefono,"
                    + "email,"
                    + "id_organizacion) values (?,?,?,?,?,?,?,?)";
        try
        {
          con=Conexion.getConnection();
          pst=con.prepareStatement(sql);
          pst.setInt(1, contacto.getIdentidad());
          pst.setString(2, contacto.getP_nombre());
          pst.setString(3, contacto.getP_apellido());
          pst.setString(4, contacto.getS_apellido());
          pst.setString(5, contacto.getCargo());
          pst.setInt(6, contacto.getTelefono());
          pst.setString(7, contacto.getEmail());
          pst.setInt(8, contacto.getId_organizacion());
          pst.executeUpdate();
          return true;
        }
        catch(SQLException ex)
        {
             Logger.getLogger(ContactoDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    
}
