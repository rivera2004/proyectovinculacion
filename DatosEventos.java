package proyectovinculacion;

public class DatosEventos {
        String nombre;
        String descripcion2;
        String FechaInicio;  
        String FechaFin;
        String Lugar;
     public  DatosEventos(String nom, String descrip,String fechai,String fechaf,String lug){
     this.nombre = nom;
     this.descripcion2 = descrip;
     this.FechaInicio = fechai;
     this.FechaFin= fechaf;
     this.Lugar = lug;
     }
    @Override
    public String toString()
    {
        return "Titulo :"+nombre+" ,Descripcion:  "+descripcion2+" Fecha de inicio: "+FechaInicio+" Fecha de fin: "+FechaFin+" Lugar del evento: "+Lugar;
    }
}
