package utp.misiontic2022.c2.p47.reto4.controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_1Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_2Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.dao.Requerimiento_3Dao;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class ControladorRequerimientos {
    Requerimiento_1Dao dao1= new Requerimiento_1Dao();
    Requerimiento_2Dao dao2= new Requerimiento_2Dao();
    Requerimiento_3Dao dao3= new Requerimiento_3Dao();
    
    public ArrayList<Requerimiento_1> consultarRequerimiento1() throws SQLException {
        return dao1.requerimiento1();
    }

    public ArrayList<Requerimiento_2> consultarRequerimiento2() throws SQLException {
        return dao2.requerimiento2();
    }

    public ArrayList<Requerimiento_3> consultarRequerimiento3() throws SQLException {
        return dao3.requerimiento3();
    }
}
