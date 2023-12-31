package EX3_TP1;

public class Main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1, 4);
        System.out.println("Size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());
        System.out.println("Is in: " + list.isIn(3));
        System.out.println("Is in: " + list.isIn(5));
        System.out.println("Element at index 0: " + list.get(0));
        System.out.println("Element at index 1: " + list.get(1));
        System.out.println("Element at index 2: " + list.get(2));
        System.out.println("Element at index 3: " + list.get(3));
        System.out.println("Element at index 4: " + list.get(4));
        System.out.println("Element at index 5: " + list.get(5));
        System.out.println("Position of 1: " + list.find(1));
        System.out.println("Position of 2: " + list.find(2));
        System.out.println("Position of 3: " + list.find(3));
        System.out.println("Position of 4: " + list.find(4));
        System.out.println("Position of 5: " + list.find(5));
        list.remove(1);
        System.out.println("Size: " + list.size());
        System.out.println("Is empty: " + list.isEmpty());
        System.out.println("Is in: " + list.isIn(3));
    }
}
