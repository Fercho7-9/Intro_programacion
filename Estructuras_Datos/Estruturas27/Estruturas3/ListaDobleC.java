package Estruturas3;

public class ListaDobleC {

    void add() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    class Nodo {
        int data;
        Nodo previous;
        Nodo next;

        public Nodo(int data){
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }

    Nodo head = null;
    Nodo tail = null;

    public void insert (int data){
        Nodo nuevo = new Nodo(data);
        if (head == null){
            head = tail = nuevo;
            head.previous = tail;
            tail.next = head;
        }
        else{
            tail.next = nuevo;
            nuevo.previous = tail;
            tail = nuevo;
            tail.next = head;
            head.previous = tail;
        }
    }

    public void print() {
        Nodo current = head;
        if(head == null) {
            System.out.println("Lista está vacía");
            return;
        }
        System.out.println("Nodes de doble linked: ");
        while(current!= null ) {
            if(current.next!=head){
                System.out.print(current.data + " ");
                current = current.next;
            }else{
                System.out.print(current.data + " ");
                return;
            }
        }
        System.out.println("\n");
    } public class MainListaDobleC {
        public static void main(String[] args) {
            ListaDobleC listac=new ListaDobleC();
            listac.insert(1);
            listac.insert(2);
            listac.insert(3);
            listac.insert(4);
            listac.insert(5);
            listac.print();


        }
    }
}