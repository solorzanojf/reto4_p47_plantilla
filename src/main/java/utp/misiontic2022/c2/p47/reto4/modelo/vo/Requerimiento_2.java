package utp.misiontic2022.c2.p47.reto4.modelo.vo;

public class Requerimiento_2 {
    private int ID_proyecto;
    private String Costructora;
    
    public Requerimiento_2 (int ID_proyecto, String Costructora){
        this.ID_proyecto=ID_proyecto;
        this.Costructora=Costructora;
    }

    public int getID_proyecto() {
        return ID_proyecto;
    }
    public void setID_proyecto(int iD_proyecto) {
        ID_proyecto = iD_proyecto;
    }
    public String getCostructora() {
        return Costructora;
    }
    public void setCostructora(String costructora) {
        Costructora = costructora;
    }
}
