package Asignaturas;

public class Asignatura {
    private int id = 0;
    private double calificacion = 0;

    class asignatura{
        String nombre = "";
        String profesor = "";
        double nota = 0;
        int horas = 0;

        public String getNombre() {
            return nombre;
        }

        public String getProfesor() {
            return profesor;
        }

        public double getNota() {
            return nota;
        }

        public int getHoras() {
            return horas;
        }

        public void setNota(double nota) {
            this.nota = nota;
        }
    }
    }



