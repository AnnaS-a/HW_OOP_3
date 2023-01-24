// Создать список по аналогии LinkedList (список связанных элементов), 
// реализовать в нем iterable интерфейс. 
// Список должен содержать элементы со ссылкой на следующий элемент 
// (если показалось мало, то реализовать ссылку и на предыдущий элемент)
public class Main {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addFirst(2);
        linkedList.addFirst(5);
        linkedList.addFirst(7);
        linkedList.addFirst(9);
        linkedList.addFirst(100);
        for (Integer item : linkedList) {
            System.out.println(item);
        }

        System.out.println("Первый элемент списка: " + linkedList.getFirst()+"\n"); 
        linkedList.removeFirst();                 // удаление первого элемента
        System.out.println("метод hasNext() проверяет, что следующий узел существует");
        System.out.println("\nСписок после, удаления первого элемента: \n" + linkedList);
    }    
}
