class  Computador{
    private String tipoProcesaro;
    private UnidadDVD unidadDVD;
    public  Computador(){}
    public  Computador(String tipoProcesaro,UnidadDVD unidadDVD){
        this.tipoProcesaro = tipoProcesaro;
        this.unidadDVD = unidadDVD;
    }
    public void setTipoProcesaro(String tipoProcesaro){
        this.tipoProcesaro = tipoProcesaro;
    }
    public void setUnidadDVD(UnidadDVD unidadDVD){
        this.unidadDVD = unidadDVD;
    }
    public String getTipoProcesaro(){
        return this.tipoProcesaro;
    }
    public UnidadDVD getUnidadDVD(){
        return this.unidadDVD;
    }

    @Override
    public String toString() {
        return "computador{" +
                "tipoProcesaro='" + tipoProcesaro + '\'' +
                ", unidadDVD=" + unidadDVD +
                '}';
    }
}
class UnidadDVD{
    private String marca;
    public UnidadDVD(){}

    public UnidadDVD(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "UnidadDVD{" +
                "marca='" + marca + '\'' +
                '}';
    }
}

public class TestComputador2 {
    public static void main(String[] args) {
        UnidadDVD unidadDVD1 = new UnidadDVD("Thoshiba");
        Computador computador1 = new Computador ("Intel",unidadDVD1);
        System.out.println(computador1);
    }
}
