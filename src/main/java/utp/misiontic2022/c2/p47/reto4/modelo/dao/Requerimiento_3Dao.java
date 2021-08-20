package utp.misiontic2022.c2.p47.reto4.modelo.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;
import utp.misiontic2022.c2.p47.reto4.util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3> requerimiento3() throws SQLException {
        ArrayList <Requerimiento_3> listar3= new ArrayList<>();
        Statement stmt = JDBCUtilities.getConnection().createStatement();
        ResultSet rs = stmt.executeQuery("SELECT ID_Proyecto, Fecha_Inicio from Proyecto p WHERE Banco_Vinculado LIKE 'B%' and Constructora LIKE 'H%'");
        while (rs.next()){
            int id_proyecto=rs.getInt("ID_Proyecto");
            String fecha=rs.getString("Fecha_Inicio");
            Requerimiento_3 proyecto3= new Requerimiento_3(id_proyecto,fecha);
            listar3.add(proyecto3);
        }
        return listar3;
    }
}