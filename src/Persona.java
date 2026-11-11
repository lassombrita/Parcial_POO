

public class Persona { 
    private String nombre;
    private String identificacion;
    private String correo;

    public Persona(String nombre, String identificacion, String correo){
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.correo = correo;

        

    }
    
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
        if (nombre != null && !nombre.isEmpty()){
            this.nombre = nombre;
        }else {
            System.out.println("No definido");
        }
    }
    public String getIdentificacion(){
        return identificacion;
    }
    public void setIdentificacion(String identificacion){
        this.identificacion = identificacion;
        if (identificacion != null && !identificacion.isEmpty()){
            this.identificacion = identificacion;
        }else {
            System.out.println("No definido");
        }
    }
    public String getCorreo(){
        return correo;
    }
    public void setCorreo(String correo){
        this.correo = correo;
        if (correo != null && !correo.isEmpty()){
            this.correo = correo;
        }else {
            System.out.println("No definido");
        }
    }
    public void presentarse(){
        System.out.println("Hola, soy: " + nombre);
        System.out.println("Mi Identificacion es: " + identificacion);
        System.out.println("Mi Correo es:" + correo);
    }
    public void ActualizarCorreo(String nuevoCorreo){
        if(nuevoCorreo.contains("@") && nuevoCorreo.contains(".")){
            correo = nuevoCorreo;
            System.out.println("Correo Actualizado a: " + nuevoCorreo );
        }else{
           System.out.println("Correo inválido. No se realizo el cambio"); 
        }

    }
    

    
    
    
    
}
