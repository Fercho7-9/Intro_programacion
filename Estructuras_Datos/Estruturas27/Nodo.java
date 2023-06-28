package Estruturas;

public class Nodo {
    int dato;
    Nodo next;

    public Nodo() {
        this.dato = 0;
        this.next = null;
    }
    public Nodo(int a){
        dato = a;
        next = null;
    }
    public void ConcantinarNext(Nodo nod){
        next = nod;
    }
    public void cambiarDatos(int camdato,Nodo camdireccion){
        dato=camdato;
        next=camdireccion;
    }
    public void mostrarDatos(){
        System.out.println("Dato:"+dato+" "+" Direccion: "+next);
    }

    public static void main(String[] args) {
        Nodo objA = new Nodo(8);
        System.out.println(objA);
        Nodo objB= new Nodo(4);
        System.out.println(objB);
        objA.ConcantinarNext(objB);
        System.out.println("Next A:"+objA.next);
        objA.mostrarDatos();
        objA.cambiarDatos(9,objB.next);

        objA.ConcantinarNext(objB);
        objA.mostrarDatos();

    }
}
