package proyectovinculacion;
    public class DatosNoticia {
            //Noticias Atributos
        String titulo;
        String descripcion;    
        public DatosNoticia(String titu, String descrip){
        this.titulo = titu;
        this.descripcion = descrip;
    }
    @Override
    public String toString()
    {
        return "Titutlo de la noticia: "+titulo+" , Descripcion de la noticia "+descripcion;
    }
}
