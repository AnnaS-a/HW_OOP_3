import java.util.Iterator;

public class MyLinkedList implements Iterable<Integer> { // реализуем интерфейс Iterable
    private int size = 0; // счетчик = 0
    private Node head = null; // первый узел(голова), пустой
   

    public class Node { // класс Node с переменными
        private Integer elem;
        private Node next;

        public Node(Integer elem, Node node) { // конструктор (передаем элемент и ссылку на него)
            this.elem = elem;
            this.next = node;
        }

        public Node() {
            this(null, null); // конструктор без параметров
        }

        public Integer getElement() {
            return this.elem;
        }

        public void setElement(Integer elem) {
            this.elem = elem;
        }

        public Node getNext() {
            return this.next;
        }

        public void setNext(Node node) {
            this.next = node;
        }
    }

    public class LinkedListIterator implements Iterator<Integer> { // реализуем интерфейс Iterable
        private Node currentNode = null; // переменная типа Node (текущий узел пустой)
        private int counter = 0; // счетчик узлов = 0

        public LinkedListIterator(MyLinkedList linkedList) { // конструктор
            this.currentNode = linkedList.head; // переменная текущий Node
        }

        public boolean hasNext() { // метод, возвращает true, если следующий элемент существует
            return this.currentNode != null;
        }

        public Integer next() { // метод, переходим на следующий узел и возвращает элемент списка
            Integer object = this.currentNode.getElement();
            this.currentNode = this.currentNode.getNext();
            this.counter++;
            return object;
        }

        public int getCounter() {
            return this.counter;
        }
    }

    public Node getHead() {
        return this.head;
    }

    public void addFirst(Integer elem) {
        Node newNode = new Node(elem, this.head);
        this.head = newNode;
        this.size++;
    }

    public Integer getFirst() {
        return this.head.getElement();
    }

    public Integer removeFirst() { // метод, удаляет первый элемент в списке
        Integer elem = this.head.getElement();
        this.head = this.head.getNext(); // первым элементом(головой) стал следующий элемент (ссылка на следующий узел)
        return elem;
    }

    public int getSize() {
        return this.size;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator(this);
    }

    public String toString() {
        String output = " ";
        Iterator<Integer> it = this.iterator();
        while (it.hasNext()) {
            System.out.println(it.hasNext());
            output += it.next() + "\n";
        }
        return output;
    }
}
