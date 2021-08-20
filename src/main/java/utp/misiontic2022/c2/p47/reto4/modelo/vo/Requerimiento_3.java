package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Requerimiento_3 {
    private int ID_proyecto;
    private String Fecha_Inicio;
    
    public Requerimiento_3 (int ID_proyecto, String Fecha_Inicio){
    this.ID_proyecto=ID_proyecto;
    this.Fecha_Inicio=Fecha_Inicio;
    }
    
    public int getID_proyecto() {
            return ID_proyecto;
    }
    public void setID_proyecto(int iD_proyecto) {
        ID_proyecto = iD_proyecto;
    }
        
    public String getFecha_Inicio() {
        return Fecha_Inicio;
    }
    public void setFecha_Inicio(String fecha_Inicio) {
        Fecha_Inicio = fecha_Inicio;
    }
}
