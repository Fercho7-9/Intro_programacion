    class Publicidad {
        private int anioPublicacion;
        private Autor  autor;
        Publicidad(){}
        Publicidad(int anioPublicacion,Autor autor){
            this.anioPublicacion = anioPublicacion;
            this.autor = autor;
        }
        public void setAnioPublicacion(int anioPublicacion){
            this.anioPublicacion = anioPublicacion;
        }
        public void setAutor(Autor autor){
            this.autor = autor;
        }
        public int getAnioPublicacion (){
            return this.anioPublicacion;
        }
        public Autor getAutor(){
            return this.autor;
        }
        @Override
        public String toString(){
            return String.format("PUBLICIDAD:"
                            +"\nAutor:%.100s"
                            +"\nAño de publicacion:%.100s"
                    ,this.getAutor().getNombre()+" "+getAutor().getApellido()
                    ,this.getAnioPublicacion());
        }
    }
    class Autor{
        private String nombre;
        private String apellido;
        Autor(){}
        Autor(String nombre,String apellido){
            this.nombre=nombre;
            this.apellido=apellido;
        }
        public void  setNombre(String nombre){
            this.nombre=nombre;
        }
        public void setApellido(String apellido){
            this.apellido=apellido;
        }
        public String getNombre(){
            return this.nombre;
        }
        public String getApellido(){
            return this.apellido;
        }

    }

        public class TestPublicidad {
            public static void main(String[] args) {
                Autor autor = new Autor("Pedro","Zuñiga");
                Publicidad publicidad =new  Publicidad(2000,autor);
                System.out.println(publicidad);
            }
        }
