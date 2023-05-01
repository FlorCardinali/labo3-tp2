import java.util.*;

public class Main {
    public static void main(String[] args) {
        int opcion = 0;
        List<Persona> alumnos_cargados = new ArrayList<>();
        
        //hardcodeando para la consigna
        Persona p0 = new Persona("Pepito","Sanchez",212);
        Persona p1 = new Persona("Juanita","Ortega",210);
        Persona p2 = new Persona("Andres","Trozado",201);
        Persona p3 = new Persona("Armando","Bronca Segura.",202);
        Persona p4 = new Persona("Elba","Surero",203);
        Persona p5 = new Persona("Helen","Chufe",204);
        Persona p6 = new Persona("Lola","Mento",205);
        Persona p7 = new Persona("Matias","Queroso",206);
        Persona p8 = new Persona("Zacarias","Flores Del Monte",207);
        Persona p9 = new Persona("Aitor","Tilla",209);



        Materia laboratorio_3 = new Materia("Laboratorio 3",3,"Luciano Salotto",1);
        Materia laboratorio_2 = new Materia("Laboratorio 2",2,"Carlos Berger",2);
        Materia prog_3 = new Materia("Programacion 3",3,"Marco Ustarroz",4);
        Materia prog_2 = new Materia("Programacion 2",2,"Mauro Torre",5);
        Materia prog_1 = new Materia("Programacion 1",1,"Ricardo Coppo",6);
        Materia ingles_2 = new Materia("Ingles 2",2,"Carla Allende",8);
        Materia matematica = new Materia("Matematica",1,"Lorena Cofre",9);
        Materia estadistica = new Materia("Estadistica",2,"Lorena Cofre",10);

        ArrayList<Materia> materias_agregadas = new ArrayList<>();
        materias_agregadas.add(laboratorio_2);
        materias_agregadas.add(laboratorio_3);
        materias_agregadas.add(prog_1);
        materias_agregadas.add(prog_2);
        materias_agregadas.add(prog_3);
        materias_agregadas.add(ingles_2);
        materias_agregadas.add(matematica);
        materias_agregadas.add(estadistica);


        p0.agregar_materia(new Materia("Programacion 1",1,"Ricardo Coppo",6),Estado_materia.APROBADA,9);
        p0.agregar_materia(new Materia("Ingles 2",2,"Carla Allende",8),Estado_materia.APROBADA,10);
        p0.agregar_materia(new Materia("Laboratorio 3",3,"Luciano Salotto",1),Estado_materia.APROBADA,8);
        p0.agregar_materia(new Materia("Matematica",1,"Lorena Cofre",9),Estado_materia.CURSADA,6);

        p1.agregar_materia(new Materia("Laboratorio 2",2,"Carlos Berger",2),Estado_materia.CURSADA,7);
        p1.agregar_materia(new Materia("Ingles 2",2,"Carla Allende",8),Estado_materia.CURSADA,8);
        p1.agregar_materia(new Materia("Laboratorio 3",3,"Luciano Salotto",1),Estado_materia.APROBADA,10);
        p1.agregar_materia(new Materia("Estadistica",2,"Lorena Cofre",10),Estado_materia.CURSADA,6);

        p2.agregar_materia(new Materia("Laboratorio 3",3,"Luciano Salotto",1),Estado_materia.CURSADA,6);
        p2.agregar_materia(new Materia("Estadistica",2,"Lorena Cofre",10),Estado_materia.CURSADA,6);
        p2.agregar_materia(new Materia("Programacion 2",2,"Mauro Torre",5),Estado_materia.CURSADA,7);
        p2.agregar_materia(new Materia("Matematica",1,"Lorena Cofre",9),Estado_materia.APROBADA,10);

        p3.agregar_materia(new Materia("Programacion 2",2,"Mauro Torre",5),Estado_materia.APROBADA,9);
        p3.agregar_materia(new Materia("Programacion 3",3,"Marco Ustarroz",4)   ,Estado_materia.CURSADA,7);
        p3.agregar_materia(new Materia("Ingles 2",2,"Carla Allende",8),Estado_materia.APROBADA,6);
        p3.agregar_materia(new Materia("Laboratorio 3",3,"Luciano Salotto",1),Estado_materia.CURSADA,8);

        p4.agregar_materia(new Materia("Laboratorio 2",2,"Carlos Berger",2),Estado_materia.CURSADA,7);
        p4.agregar_materia(new Materia("Estadistica",2,"Lorena Cofre",10),Estado_materia.APROBADA,10);
        p4.agregar_materia(new Materia("Laboratorio 3",3,"Luciano Salotto",1),Estado_materia.CURSADA,7);
        p4.agregar_materia(new Materia("Matematica",1,"Lorena Cofre",9),Estado_materia.APROBADA,10);

        p5.agregar_materia(new Materia("Programacion 2",2,"Mauro Torre",5),Estado_materia.CURSADA,7);
        p5.agregar_materia(new Materia("Matematica",1,"Lorena Cofre",9),Estado_materia.CURSADA,8);
        p5.agregar_materia(new Materia("Programacion 3",3,"Marco Ustarroz",4),Estado_materia.APROBADA,10);
        p5.agregar_materia(new Materia("Ingles 2",2,"Carla Allende",8),Estado_materia.APROBADA,6);

        p6.agregar_materia(new Materia("Programacion 3",3,"Marco Ustarroz",4),Estado_materia.CURSADA,6);
        p6.agregar_materia(new Materia("Programacion 2",2,"Mauro Torre",5),Estado_materia.CURSADA,7);
        p6.agregar_materia(new Materia("Matematica",1,"Lorena Cofre",9),Estado_materia.CURSADA,9);
        p6.agregar_materia(new Materia("Estadistica",2,"Lorena Cofre",10),Estado_materia.APROBADA,10);

        p7.agregar_materia(new Materia("Estadistica",2,"Lorena Cofre",10),Estado_materia.CURSADA,6);
        p7.agregar_materia(new Materia("Programacion 3",3,"Marco Ustarroz",4),Estado_materia.CURSADA,7);
        p7.agregar_materia(new Materia("Laboratorio 2",2,"Carlos Berger",2),Estado_materia.CURSADA,8);
        p7.agregar_materia(new Materia("Ingles 2",2,"Carla Allende",8),Estado_materia.APROBADA,9);

        p8.agregar_materia(new Materia("Laboratorio 3",3,"Luciano Salotto",1),Estado_materia.APROBADA,10);
        p8.agregar_materia(new Materia("Laboratorio 2",2,"Carlos Berger",2),Estado_materia.CURSADA,8);
        p8.agregar_materia(new Materia("Matematica",1,"Lorena Cofre",9),Estado_materia.CURSADA,7);
        p8.agregar_materia(new Materia("Estadistica",2,"Lorena Cofre",10),Estado_materia.APROBADA,6);

        p9.agregar_materia(new Materia("Matematica",1,"Lorena Cofre",9),Estado_materia.APROBADA,10);
        p9.agregar_materia(new Materia("Estadistica",2,"Lorena Cofre",10),Estado_materia.CURSADA,7);
        p9.agregar_materia(new Materia("Programacion 1",1,"Ricardo Coppo",6),Estado_materia.CURSADA,6);
        p9.agregar_materia(new Materia("Programacion 3",3,"Marco Ustarroz",4),Estado_materia.APROBADA,9);


        alumnos_cargados.add(p0);
        alumnos_cargados.add(p1);
        alumnos_cargados.add(p2);
        alumnos_cargados.add(p3);
        alumnos_cargados.add(p4);
        alumnos_cargados.add(p5);
        alumnos_cargados.add(p6);
        alumnos_cargados.add(p7);
        alumnos_cargados.add(p8);
        alumnos_cargados.add(p9);



        Scanner scan = new Scanner(System.in);
        scan.useDelimiter("\n");
        while (opcion!=7) {
            System.out.println("Bienvenido al gestor de alumnos.");
            System.out.println("1) ingresar alumno.");
            System.out.println("2) Asignar materias.");
            System.out.println("3) Ver alumnos.");
            System.out.println("4) Materias aprobadas por los alumnos:");
            System.out.println("5) Ordenar alumnos por nombre/legajo:");
            System.out.println("6) Ordenar alumnos por materias aprobadas:");
            System.out.println("7) salir");
            opcion = scan.nextInt();
            if (opcion == 1) {
                System.out.println("--------------------");
                System.out.println("Ingrese el legajo del alumno:");
                int legajo = scan.nextInt();
                //comprobar que no este
                for (Persona p : alumnos_cargados) {
                    if (legajo == p.get_legajo()) {
                        System.out.println("El alumno ya existe");
                        System.out.println(p.toString());
                        continue;
                    }
                }
                System.out.println("Ingrese el nombre del alumno:");
                String nombre = scan.next();
                System.out.println("Ingrese el apellido del alumno:");
                String apellido = scan.next();

                alumnos_cargados.add(new Persona(nombre, apellido, legajo));
                continue;
            } else if (opcion == 2) {
                System.out.println("--------------------");
                System.out.println("ingrese el numero de legajo a buscar:");
                int legajo_a_buscar = scan.nextInt();
                for (Persona alumno : alumnos_cargados) {
                    if (legajo_a_buscar == alumno.get_legajo()) {
                        System.out.println("se encontro al alumno " + alumno.toString() + ", Agregar materias a este alumno? Y o N");
                        String op_aux = scan.next();
                        if (op_aux.equals("Y") || op_aux.equals("y")) {
                            System.out.println("ingrese el nombre de la materia: ");
                            String n_materia = scan.next();
                            System.out.println("ingrese el profesor de la materia: ");
                            String p_materia = scan.next();
                            System.out.println("Ingrese el cuatrimenstre de la materia en un entero: ");
                            int c_materia = scan.nextInt();
                            System.out.println("Ingrese el estado de la materia: A -> aprobada, C --> cursada ");
                            String op_estado = scan.next();
                            Estado_materia estado_materia;
                            if (op_estado.equals("A") || op_estado.equals("a")) {
                                estado_materia = Estado_materia.APROBADA;
                            } else {
                                estado_materia = Estado_materia.CURSADA;
                            }
                            System.out.println("ingrese la nota final obtenida: ");
                            int n_final = scan.nextInt();
                            alumno.agregar_materia(new Materia(n_materia, c_materia, p_materia, 1), estado_materia, n_final);
                            System.out.println("materias asiganada.");
                            continue;
                        } else {
                            System.out.println("Se cancelo la carga.");
                            continue;
                        }
                    }
                }
                System.out.println("No se encontro el alumno, carguelo y vuelva a intentar");
                continue;
            } else if (opcion == 3) {
                for (Persona alumno : alumnos_cargados) {
                    System.out.println(alumno.toString());
                }
            } else if (opcion == 4) {
                Set<String> set_materias = new HashSet<>();
                for (Persona a : alumnos_cargados) {
                    ArrayList<Materia> mat = a.get_aprobadas();
                    for (Materia m : mat) {
                        set_materias.add(m.get_nombre());
                    }
                }
                System.out.println(set_materias);
            } else if (opcion == 5) {
                Collections.sort(alumnos_cargados);
                System.out.println(alumnos_cargados);
            } else if (opcion == 6) {
                for (int i = 0; i < alumnos_cargados.size(); i++) {
                    int indice = i;
                    for (int j = i + 1; j < alumnos_cargados.size(); j++) {
                        if (alumnos_cargados.get(j).promedio() > alumnos_cargados.get(indice).promedio()) {
                            indice = j;
                        }
                    }
                    Persona temp = alumnos_cargados.get(i);
                    alumnos_cargados.set(i, alumnos_cargados.get(indice));
                    alumnos_cargados.set(indice, temp);
                }
                for (Persona g: alumnos_cargados){
                    System.out.println(g.promedio()+ " " + g.get_legajo() + " " + g.get_nombre());
                }
            }
        }
    }
}