package proyectovinculacion;
import java.time.LocalDate;//Fecha
import java.time.LocalTime;//Hora
import java.util.Scanner;//Agregar x Teclado
public class proyectovinculacion {
    public static void main(String[] args) {
     Scanner teclado = new Scanner(System.in);    
     int menu;        
//Obtener Hora Actual
LocalTime horaActual = LocalTime.now();
//System.out.println("Hora Actual: " + horaActual.getHour()+"h:" + horaActual.getMinute()+"min");
//Obtener Fecha Actual
LocalDate fechaActual = LocalDate.now();
//System.out.println("Fecha Actual: " + fechaActual);   
//1System.out.println("Fecha y Hora de la Publicacion: " + fechaActual + " a las  " + horaActual.getHour()+"h:" + horaActual.getMinute()+"min" ); 
         System.out.println("\033[36m*****Bienvenid@ al Modulo de Noticias/Eventos***");
        do{         
         System.out.println("                                                            "); //Salto de Linea
         System.out.println("******** MENU PRINCIPAL ********");
         System.out.println("   (1) Agregar Noticia/Evento                               "); 
         System.out.println("   (2) Editar Noticia/Evento                                "); 
         System.out.println("   (3) Salir del Sistema                                    "); 
         System.out.println("   Ingrese Una Opcion:                                      "); 
         menu = teclado.nextInt();    
         int busnot;      
              switch (menu){                   
                case 1: //Agrega
                int opcion1;
                    do{
                    System.out.println("******  - MENU DE AGREGACION - *******");//34 
                    System.out.println("   (1) Agregar Noticia            "); 
                    System.out.println("   (2) Agregar Evento             "); 
                    System.out.println("   (3) Salir al Menu Principal    ");
                    System.out.println("   (4) Buscar Noticia    "); 
                    System.out.println("   Ingrese Una Opcion:            "); 
                    opcion1 = teclado.nextInt(); 
                    DatosNoticia [] Noticias = new DatosNoticia[3];  
                    switch(opcion1){
                        case 1://agregar noticia
                            System.out.println("******** Prioridad *********");
                            System.out.println("1- Verde (Poco Importante)");
                            System.out.println("2- Amarillo (Importante)");
                            System.out.println("3- Rojo(Muy Importante)");
                            System.out.println("Seleccione Tipo de Noticia a Ingresar:");
                            int tipo = teclado.nextInt();
                            switch(tipo){                             
                                case 1:{//verde                                   
                                                                       
                                    for(int i = 0; i < Noticias.length ; i++){                                  
                                    System.out.println("-----------------------NUEVO NOTICIA------------------------");
                                    System.out.println("Ingrese Titulo:");
                                    String titulo = teclado.nextLine();
                                    System.out.println("Ingrese Descripcion:");                                   
                                    String descripcion = teclado.nextLine();
                                    Noticias[i]=new DatosNoticia(titulo, descripcion);
                                    }//llave for
                                    for(int i = 0; i < Noticias.length ; i++){
                                    System.out.println("*Noticia1 " + i + "*");                                   
                                    String tipo1 = ("\033[32mVERDE"); //texto de color verde                                                                    
                                    System.out.println("*******< Nueva Noticia #"+ (i+1) + " >*******");
                                    System.out.println("Fecha y Hora de la Publicacion: " + fechaActual + " a las  " + horaActual.getHour()+"h:" + horaActual.getMinute()+"min" ); 
                                    System.out.println(("Tipo de Noticia:")+ " " + tipo1);    
                                    System.out.println("Titulo de Noticia: " + Noticias [i].titulo);
                                    System.out.println("Descripcion de Noticia: " + Noticias[i].descripcion);    
                                    System.out.println("____________________");
                                    }//llave for                                    
                                break;
                                }case 2:{//Amarillo
                                                                       
                                    for(int i = 0; i < Noticias.length ; i++){                                  
                                    System.out.println("-----------------------NUEVO NOTICIA------------------------");
                                    System.out.println("Ingrese Titulo:");
                                    String titulo = teclado.nextLine();
                                    System.out.println("Ingrese Descripcion:");                                   
                                    String descripcion = teclado.nextLine();
                                    Noticias[i]=new DatosNoticia(titulo, descripcion);
                                    }//llave for
                                               
                                    for(int i = 0; i < Noticias.length ; i++){
                                    System.out.println("*Noticia1 " + i + "*");                                   
                                    String tipo1 = ("\033[33mAMARILLO"); //texto de color verde                                                                    
                                    System.out.println("*******< Nueva Noticia #"+ (i+1) + " >*******");
                                    System.out.println("Fecha y Hora de la Publicacion: " + fechaActual + " a las  " + horaActual.getHour()+"h:" + horaActual.getMinute()+"min" ); 
                                    System.out.println(("Tipo de Noticia:") + " "  + tipo1);                                        
                                    System.out.println("Titulo de Noticia: " + Noticias [i].titulo);                                
                                    System.out.println("Descripcion de Noticia: " + Noticias[i].descripcion);                       
                                    System.out.println("____________________");
                                    }//llave for   
                                break;
                                }case 3:{//Rojo
                                                                     
                                    for(int i = 0; i < Noticias.length ; i++){                                  
                                    System.out.println("-----------------------NUEVO NOTICIA------------------------");
                                    System.out.println("Ingrese Titulo:");
                                    String titulo = teclado.nextLine();
                                    System.out.println("Ingrese Dscripcion:");                                   
                                    String descripcion = teclado.nextLine();
                                    Noticias[i]=new DatosNoticia(titulo, descripcion);
                                    }//llave for
                                    for(int i = 0; i < Noticias.length ; i++){
                                    System.out.println("*Noticia1 " + i + "*");                                   
                                    String tipo1 = ("\033[31mROJO"); //texto de color verde                                                                        
                                    System.out.println("*******< Nueva Noticia #"+ (i+1) + " >*******");
                                    System.out.println("Fecha y Hora de la Publicacion: " + fechaActual + " a las  " + horaActual.getHour()+"h:" + horaActual.getMinute()+"min" ); 
                                    System.out.println(("Tipo de Noticia:") + " "  + tipo1);    
                                    System.out.println("Titulo de Noticia: " + Noticias [i].titulo);
                                    System.out.println("Descripcion de Noticia: " + Noticias[i].descripcion);    
                                    System.out.println("____________________");
                                    }//llave for     
                                                    //BUSCAR NOTICIAS                                   
                                    System.out.println("**Bucar**");
                                    System.out.println("Ingresar  por titulo a buscar: ");
                                    String buscar = teclado.next();      
                                    for (int i = 0; i < Noticias.length; i++) {
                                        if(Noticias[i].titulo.equals(buscar)){
                                            System.out.println("INDEX: " +i);
                                            System.out.println(Noticias);
                                        }
                                    }//TERMINA DE BUSCAR NOTICIA 
                                    }                               
                                }break; 
                                case 4:{
                                     
                                     //BUSCAR NOTICIAS
                                     
                                     System.out.println("**Bucar**");
                                     System.out.println("Ingresar  por titulo a buscar: ");
                                     String buscar = teclado.next();      
                                     for (int i = 0; i < Noticias.length; i++) {
                                     if(Noticias[i].titulo.equals(buscar)){
                                     System.out.println("INDEX: " +i);
                                     System.out.println(Noticias);                                       
                                    }                                
                                    }//TERMINA DE BUSCAR NOTICIA 
                                break;
                                }default:
                                    System.out.println("Error, Opcion NO Valida!");
                            //llave del switch de tipo                        
                            break;                          
                        case 2://agregar evento
                                    int contador = 1;
                                    do{
                                    DatosEventos [] Eventos = new DatosEventos[contador];                                                                       
                                    for(int i = 0; i < Eventos.length ; i++){                                  
                                    System.out.println("-----NUEVO EVENTO-----");
                                    System.out.println("Ingrese Nombre del Evento:");
                                    String nombre = teclado.nextLine();
                                    System.out.println("Ingrese Descripcion:");                                   
                                    String descripcion2 = teclado.nextLine();
                                    System.out.println("Ingrese fecha de Inicio:");                                   
                                    String FechaInicio = teclado.nextLine();
                                    System.out.println("Ingrese fecha de Fin del Evento:");                                   
                                    String FechaFin = teclado.nextLine();
                                    System.out.println("Ingrese Lugar del Evento:");                                   
                                    String Lugar= teclado.nextLine();
                                    System.out.println("¿Desea Publicar Evento?:");                              
                                    System.out.println("(1) SI");                                   
                                    System.out.println("(2) NO");                                                                          
                                    Eventos [i]=new DatosEventos (nombre, descripcion2, FechaInicio, FechaFin, Lugar);
                                    }//llave for
                                     //INICIO BUSCAR EVENTOS
                                     System.out.println("¿Desea buscar algun evento?");
                                     System.out.println("1.- Si      2.-No");
                                     busnot = teclado.nextInt();
                                     if(busnot == 1){
                                         System.out.println("**Bucar**");
                                     System.out.println("Ingresar  por titulo a buscar: ");
                                     String buscar = teclado.next();      
                                     for (int i = 0; i < Eventos.length; i++) {
                                         if(Eventos[i].nombre.equals(buscar)){
                                             System.out.println("INDEX: " +i);
                                             System.out.println(Eventos);
                                         }
                                     }
                                     }//TERMINA DE BUSCAR EVENTOS         
                                    for(int i = 0; i < Eventos.length ; i++){
                                    System.out.println("*******< Nuevo Evento #"+ (i+1) + " >*******");
                                    System.out.println("Fecha y Hora de la Publicacion: " + fechaActual + " a las  " + horaActual.getHour()+"h:" + horaActual.getMinute()+"min" );     
                                    System.out.println("Nombre del Evento: " + Eventos [i].nombre);
                                    System.out.println("Descripcion del Evento: " + Eventos[i].descripcion2);    
                                    System.out.println("Fecha de Inicio: " + Eventos [i].FechaInicio);
                                    System.out.println("Fecha Fin: " + Eventos[i].FechaFin);  
                                    System.out.println("Lugar del Evento: " + Eventos [i].Lugar);
                                    System.out.println("************************"); 
                                                               
                                    }//llave for                                                                              
                                    contador = contador++;
                                    }while(true);
                                    
                        case 3://salir al m principal
                            System.out.println("Saliendo al Menu Principal..."); 
                        break;                    
                         default:
                            System.out.println("Error, Opcion NO Valida!");     
                                    }    //llave del switch de agregar
                
               } while(opcion1 != 3 ); 
                break;
                case 2://Editar
                    System.out.println("*** MENU DE EDICION ***");
                    System.out.println("   (1) Editar Noticia            "); 
                    System.out.println("   (2) Editar Evento             "); 
                    System.out.println("   (3) Salir al Menu Principal   "); 
                    System.out.println("   Ingrese Una Opcion:              "); 
                    int opcion2 = teclado.nextInt();        
                break;
                case 3://Salir
                break;
                default:
                    System.out.println("Error, Opcion NO Valida!"); 
   
             }//llave dek switch principal
       }while(menu != 3);
    
 
    }//llave del public static void

}//llave de la clase