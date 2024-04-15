package com.main;
/*Libreria de postgreSQL*/
import java.sql.*;
import javax.swing.JOptionPane;
public class Connect {
    Connection conexion = null;
    /*Parametros de la conexion*/
    String user = "postgres";
    String password = "crypto";
    String database = "rainbow";
    String ip = "localhost";
    String port = "5432";
    
    /*Cadena que almacena todos las credenciales*/
    String credenciales = "jdbc:postgresql://"+ip+":"+port+"/"+database;
    
    /*FUncion de tipo coneccion que retorna variable de tipo conexion*/
    public Connection conexiondb(){
        try{
            /*Cadena que referencia a la dependencia de postgresql*/
            Class.forName("org.postgresql.Driver");
            /*Obtenemos los parametros de conexion*/
            conexion = DriverManager.getConnection(credenciales, user, password);
            JOptionPane.showMessageDialog(null,"Conexion realizada");
        }catch (Exception e){
            /*Ventana emergente*/
            JOptionPane.showMessageDialog(null,"Error al conectar, error:" + e.toString());
        }
        return conexion;
    }
}
