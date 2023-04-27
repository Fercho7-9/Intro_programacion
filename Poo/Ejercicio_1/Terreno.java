package Ejercicio_1;

class Terreno {
    private double costoTerreno;
    private double anchoTerreno ;
    private double largoTerreno;
    private double areaTerreno;
    private double valorMetroCuadrado;

    public Terreno(){}
    public Terreno(double anchoTerreno,double largoTerreno,double valorMetroCuadrado){
        this.anchoTerreno=anchoTerreno;
        this.largoTerreno=largoTerreno;
        this.valorMetroCuadrado=valorMetroCuadrado;
    }
    public void setAnchoTerreno(double anchoTerreno){
        this.anchoTerreno=anchoTerreno;
    }

    public double getAnchoTerreno() {
        return this.areaTerreno;
    }
    public void setLargoTerreno(double largoTerreno){
        this.largoTerreno=largoTerreno;
    }
    public double getLargoTerreno(){
        return this.anchoTerreno;
    }
}
