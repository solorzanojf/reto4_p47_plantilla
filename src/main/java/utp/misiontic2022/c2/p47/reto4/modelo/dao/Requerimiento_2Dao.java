package utp.misiontic2022.c2.p47.reto4.modelo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2> requerimiento2() throws SQLException {
        ArrayList <Requerimiento_2> listar2= new ArrayList<>();
        Statement stmt = JDBCUtilities.getConnection().createStatement();
        ResultSet rs = stmt.executeQuery("SELECT p.ID_Proyecto , p.Constructora FROM Proyecto p natural join Tipo t WHERE t.Estrato = 2 ");
        while (rs.next()){
            int id_proyecto=rs.getInt("ID_Proyecto");
            String cosntructora=rs.getString("Constructora");
            Requerimiento_2 proyecto2= new Requerimiento_2(id_proyecto,cosntructora);
            listar2.add(proyecto2);
        }
        return listar2;
        
    
    
    }
}