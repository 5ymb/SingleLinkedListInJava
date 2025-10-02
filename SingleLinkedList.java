public class SingleLinkedList {
    public static void main(String[] args){
        SingleLinkedListApp sll = new SingleLinkedListApp();
        sll.insertFirst(15);
        sll.displayList();
        sll.insertFirst(25);
        sll.displayList();
        sll.insertLast(35);
        sll.displayList();
        sll.insertLast(45);
        sll.displayList();
        sll.displayList();
        sll.displayList();
        sll.displayList();
        sll.insertFirst(75);
        sll.displayList();
        sll.deleteFirst();
        sll.displayList();
        sll.deleteLast();
        sll.displayList();
        sll.deleteAfterNode(55);
        sll.displayList();
        sll.deleteAfterNode(25);
        sll.displayList();
        sll.count();
    }
}
