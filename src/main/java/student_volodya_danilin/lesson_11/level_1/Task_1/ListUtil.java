package student_volodya_danilin.lesson_11.level_1.Task_1;

/*
Для создания простых списков применяется интерфейс List, который расширяет функцональность
интерфейса Collection.

По умолчанию в Java есть встроенная реализация этого интерфейса - класс ArrayList.
ArrayList представляет простой список, аналогичный массиву, за тем исключением, что
количество элементов в нем не фиксировано.  (но мы можем задать начальную
ёмкость используя конструктор ArrayList(int capacity)).
Также ArrayList не синхронизируется сам.

Если мы знаем что ёмкость нашего ArrayList не будет превышать некое число, то
желательно сразу обозначить размер массива, чтобы снизить нагрузку на систему.


Также у нас есть LinkedList, который вместо массивов, использует ссылки на объекты.
Это позволяет легко добавлять\удалять\вставлять элементы листа, но, по сравнению с
ArrayList делает получение этих элементов сложнее.
Также LinkedList не синхронизируется сам.

В целом если нам надо больше добавлять чем считывать, то лучше использовать LinkedList.
 */

import java.util.ArrayList;
import java.util.LinkedList;

import teacher.codereview.CodeReview;

@CodeReview(approved = true)
class ListUtil {

    LinkedList<String> userLinkedList = new LinkedList<>(); //создание LinkedList
    LinkedList<Integer> passLinkedList = new LinkedList<>();

    public static void main(String[] args) {

        ArrayList<Integer> integerArrayList = new ArrayList<>(); //создание ArrayList


        LinkedList<Integer> integerLinkedList = new LinkedList<>(); //создание LinkedList




    }

}