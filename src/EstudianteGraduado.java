public final class EstudianteGraduado extends Estudiantes{
    private String tituloObtenido;
    private String proyectoGrado;
    private String directorTesis;

    public EstudianteGraduado(String nombre,String identificacion, String correo,String codigo, String carrera, String[] materiasInscritas, int totalMaterias,String tituloObtenido, String proyectoGrado,String directorTesis ){
        super(nombre, identificacion,  correo, codigo,  carrera, materiasInscritas,totalMaterias);
        this.tituloObtenido = tituloObtenido;
        this.proyectoGrado = proyectoGrado;
        this.directorTesis = directorTesis;
        
    }
@Override 
   public void presentarse(){
        System.out.println("Titulo obtenido:" + tituloObtenido);
        System.out.println("Proyecto de grado:  " + proyectoGrado);
        System.out.println("Director de tesis:" + directorTesis);

    }


}
