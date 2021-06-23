/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataBase;

import Clases.Coleccionista;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Christian
 */
public class ColeccionistaDAO {
    PreparedStatement pst;
    ResultSet rs;
    Connection con;
    
    public boolean agregarColeccionista(Coleccionista coleccionista){
        String sql ="INSERT INTO coleccionistas(identidad, "
                    + "primer_nombre, "
                    + "primer_apellido, "
                    + "segundo_apellido, "
                    + "telefono, "
                    + "email, "
                    + "fecha_nacimiento, "
                    + "segundo_nombre, "
                    + "id_pais) values (?,?,?,?,?,?,?,?,?)";
        try
        {
          con=Conexion.getConnection();
          pst=con.prepareStatement(sql);
          pst.setInt(1, coleccionista.getIdentidad());
          pst.setString(2, coleccionista.getP_nombre());
          pst.setString(3, coleccionista.getP_apellido());
          pst.setString(4, coleccionista.getS_apellido());
          pst.setInt(5, coleccionista.getTelefono());
          pst.setString(6, coleccionista.getEmail());
          pst.setDate(7, (Date) coleccionista.getF_nacimiento());
          pst.setString(8, coleccionista.getS_nombre());
          pst.setInt(9, coleccionista.getNacionalidad());
          pst.executeUpdate();
          return true;
        }
        catch(SQLException ex)
        {
             Logger.getLogger(ColeccionistaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean actualizarColeccionista(Coleccionista coleccionista){
        String sql="UPDATE coleccionistas set primer_nombre=?, "
                + "primer_apellido=?, "
                + "segundo_apellido=?, "
                + "telefono=?, "
                + "email=?, "
                + "fecha_nacimiento=?, "
                + "segundo_nombre=?, "
                + "id_pais=?, "
                + "WHERE identidad="+coleccionista.getIdentidad();
        try
        {
          con=Conexion.getConnection();
          pst=con.prepareStatement(sql);
          pst.setString(1, coleccionista.getP_nombre());
          pst.setString(2, coleccionista.getP_apellido());
          pst.setString(3, coleccionista.getS_apellido());
          pst.setInt(4, coleccionista.getTelefono());
          pst.setString(5, coleccionista.getEmail());
          pst.setDate(6, (Date) coleccionista.getF_nacimiento());
          pst.setString(7, coleccionista.getS_nombre());
          pst.setInt(8, coleccionista.getNacionalidad());
          pst.executeUpdate();
          return true;
        }
        catch(SQLException ex)
        {
             Logger.getLogger(ColeccionistaDAO.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public Coleccionista buscarColeccionista (int identidad){
        String sql="SELECT * FROM coleccionistas WHERE identidad= ?";
        Coleccionista coleccionista = new Coleccionista();
        try
        {
          con=Conexion.getConnection();
          pst=con.prepareStatement(sql);
          pst.setInt(1, identidad);
          rs=pst.executeQuery();
          if(rs.next()){
              coleccionista.setIdentidad(rs.getInt("IDENTIDAD"));
              coleccionista.setP_nombre(rs.getString("primer_nombre"));
              coleccionista.setS_nombre(rs.getString("segundo_nombre"));
              coleccionista.setP_apellido(rs.getString("primer_apellido"));
              coleccionista.setS_apellido(rs.getString("segundo_apellido"));
              coleccionista.setTelefono(rs.getInt("telefono"));
              coleccionista.setEmail(rs.getString("email"));
              coleccionista.setF_nacimiento(rs.getDate("fecha_nacimiento"));
              coleccionista.setNacionalidad(rs.getInt("id_pais"));
          }
        }
        catch(SQLException ex)
        {
             Logger.getLogger(ColeccionistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return coleccionista;
    }
    
    public boolean borrarColeccionista (int identidad){
        String sql="DELETE FROM coleccionistas WHERE identidad="+identidad;
        try {
            con=Conexion.getConnection();
            pst=con.prepareStatement(sql);
            return pst.executeUpdate()==1;
        }    
        catch(SQLException ex)
        {
             Logger.getLogger(ColeccionistaDAO.class.getName()).log(Level.SEVERE, null, ex);
             return false;   
        }
    }
    
    public ArrayList <Coleccionista> listaColeccionista(){
        ArrayList<Coleccionista> coleccionistas = new ArrayList<>();
        String sql = "SELECT * FROM coleccionistas";
        try
        {
          con=Conexion.getConnection();
          pst=con.prepareStatement(sql);
          rs=pst.executeQuery();
          while(rs.next()){
              Coleccionista coleccionista = new Coleccionista();
              coleccionista.setIdentidad(rs.getInt("IDENTIDAD"));
              coleccionista.setP_nombre(rs.getString("primer_nombre"));
              coleccionista.setS_nombre(rs.getString("segundo_nombre"));
              coleccionista.setP_apellido(rs.getString("primer_apellido"));
              coleccionista.setS_apellido(rs.getString("segundo_apellido"));
              coleccionista.setTelefono(rs.getInt("telefono"));
              coleccionista.setEmail(rs.getString("email"));
              coleccionista.setF_nacimiento(rs.getDate("fecha_nacimiento"));
              coleccionista.setNacionalidad(rs.getInt("id_pais"));
              coleccionistas.add(coleccionista);
          }
        }
        catch(SQLException ex)
        {
             Logger.getLogger(ColeccionistaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return coleccionistas;
    }
    
    
}
