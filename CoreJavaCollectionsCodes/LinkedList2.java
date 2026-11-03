package Com.globalQuest.CoreJavaCollectionsCodes;

import java.util.LinkedList;
public class LinkedList2 {

    // Push method
    static void push(LinkedList al, int value) {
        al.push(value);
    }

    // Pop method
    static void pop(LinkedList al) {
        if (al.isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Popped element: " + al.pop());
        }
    }

    public static void main(String[] args) {
        LinkedList al = new LinkedList();
        al.add(100);
        al.add(50);
        al.add(150);
        al.add(25);
        al.add(70);
        al.add(175);
        System.out.println("Original List: " + al);
        System.out.println("--------------------");

        // Push
        push(al, 200);
        push(al, 300);
        System.out.println("After Push: " + al);
        System.out.println("--------------------");

        // Pop
        pop(al);
        pop(al);
        System.out.println("After Pop: " + al);
        System.out.println("--------------------");

        // Clear
        al.clear();
        System.out.println("After Clear: " + al);
        System.out.println("--------------------");

        // Clone
        LinkedList al1 = (LinkedList) al.clone();
        System.out.println("Cloned List: " + al1);
        System.out.println("--------------------");

        // Contains
        boolean res = al.contains(100);
        System.out.println("Contains 100: " + res);
        res = al.contains(1001);
        System.out.println("Contains 1001: " + res);
        System.out.println("--------------------");

        // AddAll
        LinkedList al2 = new LinkedList();
        al2.add('s');
        al2.add('g');
        al.addAll(al2);
        System.out.println("After addAll: " + al);
    }
}