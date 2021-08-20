package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1> requerimiento1() throws SQLException {
        ArrayList <Requerimiento_1> listar1= new ArrayList<>();
        Statement stmt = JDBCUtilities.getConnection().createStatement();
        ResultSet rs = stmt.executeQuery("SELECT ID_Proyecto, Constructora from Proyecto p WHERE ID_Tipo =1 and Acabados= 'Si'");
        while (rs.next()){
            int id_proyecto=rs.getInt("ID_Proyecto");
            String cosntructora=rs.getString("Constructora");
            Requerimiento_1 proyecto1= new Requerimiento_1(id_proyecto,cosntructora);
            listar1.add(proyecto1);
        }
        return listar1;
        
    }
    
}