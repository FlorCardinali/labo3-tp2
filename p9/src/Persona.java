
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class Persona implements Comparable<Persona>{
    private String nombre;
    private String apellido;
    private int legajo;
    private ArrayList<Materia> materias_del_alumno = new ArrayList<>();

    public Persona(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public void agregar_materia(Materia p_mat, Estado_materia p_estado, int nota_final) {
        boolean materia_existente = false;
        for (Materia m : this.materias_del_alumno) {
            if (p_mat.get_id_materia() == m.get_id_materia()) {
                System.out.println("La materia ya existe, se actualizará su estado y nota.");
                m.setEstado(p_estado);
                m.setNotaFinal(nota_final);
                materia_existente = true;
                break;
            }
        }
        if (!materia_existente) {
            p_mat.setEstado(p_estado);
            p_mat.setNotaFinal(nota_final);
            this.materias_del_alumno.add(p_mat);
        }
    }

    public String get_nombre(){
        return this.nombre + " " + this.apellido;
    }
    public int get_legajo (){
        return  legajo;
    }

    public float promedio(){
        int cont = 0;
        for (Materia m: materias_del_alumno){
            if (m.getEstado() == Estado_materia.APROBADA)
                cont +=1;
        }
        return  materias_del_alumno.size() / cont;
    }


    public ArrayList<Materia> get_aprobadas() {
        ArrayList<Materia> aprobados = new ArrayList<>();
        for (Materia materia: materias_del_alumno){
            if (materia.getEstado() == Estado_materia.APROBADA){
                aprobados.add(materia);
            }
        }
        //System.out.println(this.nombre + ": " + aprobados);
        return aprobados;
    }

    @Override
    public String toString (){

        String str =  this.nombre + " " + this.apellido + ": " + this.legajo + "\n";
        for (Materia m : materias_del_alumno){
            str += m.toString() + "\n";
        }
        return str;
    }

    @Override
    public int compareTo(Persona o) {
        int comparacionPorNombre = this.nombre.compareTo(o.nombre);
        if (comparacionPorNombre == 0) {
            return Integer.compare(this.legajo, o.legajo);
        } else {
            return comparacionPorNombre;
        }
    }
}
