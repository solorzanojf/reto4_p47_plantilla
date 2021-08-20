package utp.misiontic2022.c2.p47.reto4.vista;

import java.util.ArrayList;

import utp.misiontic2022.c2.p47.reto4.controlador.ControladorRequerimientos;

import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_1;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_2;
import utp.misiontic2022.c2.p47.reto4.modelo.vo.Requerimiento_3;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static ArrayList <Requerimiento_1> requerimiento1(){ArrayList <Requerimiento_1> lista= new ArrayList <Requerimiento_1>();
        try {
            lista= controlador.consultarRequerimiento1();
          
        } catch (Exception e) {
            System.err.println(e);
        }
        return lista;
    }

    public static ArrayList <Requerimiento_2> requerimiento2(){ArrayList <Requerimiento_2> lista= new ArrayList <Requerimiento_2>();
        try {
            lista= controlador.consultarRequerimiento2();
        } catch (Exception e) {
            System.err.println(e);
        }
        return lista;
    }

    public static ArrayList <Requerimiento_3> requerimiento3(){ArrayList <Requerimiento_3> lista= new ArrayList <Requerimiento_3>();
        try {
            lista= controlador.consultarRequerimiento3();
        } catch (Exception e) {
            System.err.println(e);
        }
        return lista;
    }
    
}
