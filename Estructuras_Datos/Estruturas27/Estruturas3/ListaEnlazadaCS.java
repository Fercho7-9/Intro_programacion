package Estruturas3;

 class SinglyLinkedListCc{
    public Nodo head = null;
    public Nodo tail = null;


    public class Nodo {
        int data;
        Nodo next;

        // Constructor
        Nodo(int a){
            data = a;
            next = null;
        }
    }

    public void add(int data){
        Nodo nuevoNodo = new Nodo(data);
        if (head == null){
            head = nuevoNodo;
            tail = nuevoNodo;
            nuevoNodo.next = head;
        }else{
            tail.next = nuevoNodo;
            tail = nuevoNodo;
            nuevoNodo.next = head;
        }
    }

    public void print(){
        Nodo current = head;
        if (head == null){
            System.out.println("List is empty");
        }else{
            System.out.println("Nodes of the circular linked list: ");
            do{
                System.out.print(" "+ current.data);
                current = current.next;
            }while (current!= head);
            System.out.println();
        }
    }
}
public class ListaEnlazadaCS {
    public static void main(String[] args) {
        SinglyLinkedListCc lista= new SinglyLinkedListCc();
        lista.add(1);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.print();
    }

}