
    class Estudiante1 {
        private  String nombreEstudiante;
        private double nota1;
        private double nota2;
        private double nota3;
        private double promedio;
        private Universidad universidad;

        public Estudiante1(String nombreEstudiante, double nota1, double nota2, double nota3,Universidad universidad) {
            this.nombreEstudiante = nombreEstudiante;
            this.nota1 = nota1;
            this.nota2 = nota2;
            this.nota3 = nota3;
            this.universidad = universidad;
        }
        public void setNombreEstudiante(String nombreEstudiante) {
            this.nombreEstudiante = nombreEstudiante;
        }

        public String getNombreEstudiante() {
            return nombreEstudiante;
        }
        public void setNota1(double nota1) {
            this.nota1 = nota1;
        }

        public double getNota1() {
            return nota1;
        }
        public void setNota2(double nota2) {
            this.nota2 = nota2;
        }

        public double getNota2() {
            return nota2;
        }
        public void setNota3(double nota3) {
            this.nota3 = nota3;
        }

        public double getNota3() {
            return nota3;
        }


        public void CalcularPromedio(){
            this.promedio =(this.nota1+this.nota2+this.nota3)/3;
        }
        public double getPromedio(){
            return this.promedio;
        }
        public void setUniversidad(Universidad universidad) {
            this.universidad = universidad;
        }

        public Universidad getUniversidad() {
            return universidad;
        }



        @Override
        public String toString(){
            return String.format("Estudiante:"
                            +"\nNombre Estudiante:%.100s"
                            +"\nNota 1 :%.100f"
                            +"\nNota 2 :%.100f"
                            +"\nNota 3 :%.100f"
                            +"\nPromedio :%.100f"
                            +"\nUniversidad :%.100s"
                            +"\nDirección Universidad :%.100s"
                    ,this.getNombreEstudiante()
                    ,this.getNota1()
                    ,this.getNota2()
                    ,this.getNota3()
                    ,this.getPromedio()
                    ,this.getUniversidad().getNombreUniversidad()
                    ,this.getUniversidad().getDirrecionUniversiad()
                   );
        }
    }
    class Universidad{
    private String nombreUniversidad;
    private String dirrecionUniversiad;
        public Universidad(){}

        public Universidad(String nombreUniversidad, String dirrecionUniversiad) {
            this.nombreUniversidad = nombreUniversidad;
            this.dirrecionUniversiad = dirrecionUniversiad;
        }
        public void setNombreUniversidad(String nombreUniversidad) {
            this.nombreUniversidad = nombreUniversidad;
        }

        public String getNombreUniversidad() {
            return nombreUniversidad;
        }
        public void setDirrecionUniversiad(String dirrecionUniversiad) {
            this.dirrecionUniversiad = dirrecionUniversiad;
        }
        public String getDirrecionUniversiad() {
            return dirrecionUniversiad;
        }

    }

