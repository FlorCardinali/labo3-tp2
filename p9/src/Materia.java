public class Materia {
    private int id_materia;
    private String nombre;
    private int cuatrimestre;
    private String profesor;
    private Estado_materia estado = Estado_materia.NO_ASIGNADA;

    private int notaFinal;

    public Materia(String nombre, int cuatrimestre, String profesor,int id) {
        this.nombre = nombre;
        this.cuatrimestre = cuatrimestre;
        this.profesor = profesor;
        this.id_materia = id;
    }
    public void setEstado(Estado_materia estado) {
        this.estado = estado;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    public int get_id_materia() {
        return this.id_materia;
    }
    public String get_nombre(){
        return this.nombre;
    }

    public Estado_materia getEstado() {
        return estado;
    }

    @Override
    public String toString(){
        return this.nombre + ": " + this.estado + " con " + this.notaFinal;
    }
}
