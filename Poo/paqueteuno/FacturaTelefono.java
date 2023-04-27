/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paqueteuno;

/**
 *
 * @author reroes
 */
public class FacturaTelefono {
    private String numeroTelefono;
    private double minutosMes;
    private double valorMinuto;
    private double valorFactura;
    public FacturaTelefono(){
    }
    public FacturaTelefono(String numeroTelefono,double minutosMes,double valorMinuto){
        this.numeroTelefono = numeroTelefono;
        this.minutosMes = minutosMes;
        this.valorMinuto =valorMinuto;
    }
    
    public void establecerNumeroTelefono(String c){

        this.numeroTelefono = c;
    }
    
    public void establecerMinutosMes(double c){

        this.minutosMes = c;
    }
    
    public void establecerValorMinuto(double c){

        this.valorMinuto = c;
    }
    
    // public void establecerValorFactura(){
    public void calcularValorFactura(){

        this.valorFactura = minutosMes * valorMinuto;
    }
    
    public String obtenerNumeroTelefono(){

        return numeroTelefono;
    }
    
    public double obtenerMinutosMes(){

        return minutosMes;
    }
    
    public double obtenerValorMinuto(){

        return valorMinuto;
    }
    
    public double obtenerValorFactura(){

        return valorFactura;
    }
   /* public String toSring(){
        String msj;
        msj=String.format(("SU FACTURA ES"
                +"\nNumero de Telefono: "
                +"\nSus minutos son: "
                +"\nSu costo por minuto es: "
                +"\nEl Costo de su Factura es: ")
                ,this.obtenerNumeroTelefono()
                ,this.obtenerMinutosMes()
                ,this.obtenerValorMinuto()
                ,this.obtenerValorFactura());
        return msj;

    */
    }
