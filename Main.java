public class Main {
    public static void main(String[] args) {
        StaticList list = new StaticList(5);
        list.add(5);
        list.add(7);
        list.add("a");
        list.add(2, 3);
        list.add(8);
        list.clear();
        list.add(1);

        list.printList();
    }
}