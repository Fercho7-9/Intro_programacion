package Estruturas;

public class SinglyLinkedList {
    class Node{
        int data;
        Node next;//puntero

        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    Node head;

    public SinglyLinkedList insert (SinglyLinkedList list, int data){
        Node new_node = new Node(data);
        //new_node.next = null;

        if (list.head == null){
            list.head = new_node;
        }else{
            Node last = list.head;
            while (last.next  != null){
                last = last.next;
            }
            //Insertar al final de la lista
            last.next = new_node;
        }
        return list;
    }
    public void print(SinglyLinkedList list) {
        Node currNode = list.head;
        System.out.print("\nLinkedList: ");
        while (currNode != null) {
            System.out.print(currNode.data + "");
            currNode = currNode.next;
        }
        System.out.println("\n");
    }

    public SinglyLinkedList delete(SinglyLinkedList list, int key) {
        Node currNode = list.head,prev = null;

        if (currNode != null && currNode.data == key) {
            list.head = currNode.next;
            System.out.println(key + "found and deleted");
            return list;
        }
        while (currNode != null && currNode.data != key) {
            prev = currNode;
            currNode = currNode.next;
        }
        if (currNode != null) {
            prev.next = currNode.next;
            System.out.println(key + "found and deleted");
        }
        if (currNode == null) {
            System.out.println(key + "not found");
        }
        return list;
    }
    public static void main(String[] args) {
        SinglyLinkedList list=new SinglyLinkedList();
        list=list.insert(list, 3);
        list=list.insert(list, 8);
        list=list.insert(list, 1);
        list.print(list);
    }
}