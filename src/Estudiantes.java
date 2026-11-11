public class Estudiantes extends Persona{

    private String codigo;
    private String carrera;
    private String[] materiasInscritas;
    private int totalMaterias;


    public Estudiantes(String nombre,String identificacion, String correo,String codigo, String carrera, String[] materiasInscritas, int totalMaterias){
    super(nombre,identificacion,correo);
    this.codigo = codigo;
    this.carrera = carrera;
    this.materiasInscritas = materiasInscritas;
    this.totalMaterias = totalMaterias;

}
    @Override 
    public void presentarse(){
    System.out.println("Codigo estudiantil de: " + codigo);
    System.out.println("Soy estudiante de: " + carrera);
    System.out.println("Materias inscritas:" + totalMaterias);
}
    public void inscribir(String materia){
    if(totalMaterias >= 10 ){
        System.out.println("Limite de materias alcanzado(Máximo 10)");
     return;
    }else{
        materiasInscritas[totalMaterias] = materia;
        totalMaterias = totalMaterias++;
        System.out.println("Materia inscrita: " + materia + "(Sin grupo especifico)");
    }

}
    String registro;
    public void inscribir(String materia,String grupo){
    if(totalMaterias >= 10 ){
        System.out.println("Limite de materias alcanzado(Máximo 10)");
     return;
    }else{
      registro = materia + "- grupo" + grupo;
      materiasInscritas[totalMaterias] = registro;
      totalMaterias = totalMaterias++;
      System.out.println("Materia inscrita: " + registro);
    }
}
    
public void mostrarMaterias(){
    if(totalMaterias == 0){
        System.out.println("No hay materias inscritas");
      return;
    }else{
        System.out.println("Materias de:" + getNombre() + ":");
        for(int i = 0; i <= totalMaterias - 1; i++){
            System.out.println(" " + (i + 1) + ". " + materiasInscritas[i]);
        }
    }
}
}

