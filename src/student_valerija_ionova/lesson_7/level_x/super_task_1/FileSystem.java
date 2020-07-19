package student_valerija_ionova.lesson_7.level_x.super_task_1;

/*Создать виртуальную файловую систему (FileSystem).

Основные поддерживаемые функции:
- создание виртуальных дисков (каждый диск обозначается одной английской буквой: C, D, F, etc ...)
- при создании виртуального диска указывается его размер в байтах
- на каждом виртуальном диске можно создавать папки и подпапки
- название каждой папки не должно быть больше 20 символов
- в названии каждой папки можно использовать только буквы, цифры и нижнее подчёркивание
- каждая папка или подпапка на виртуальном диске занимает 5 байтов
- на каждом виртуальном диске можно создавать файлы
- при создании файла указывается его размер в байтах и расширение (txt, exe, java)
- к названию каждого файла применяются те же требования, что и для названия папки
- реально занимаемое место файлом на диске равно 5 байтов + размер файла
- папки и файлы можно создавать и удалять
- если места на диске не достаточно для создания папки или файла указанного размера то
  создание новой папки или файла запрещается
- система должна контролировать расположение папок и файлов на виртуальном диске
  (какие байты какой файл или папка занимают). Для этого предлагается для каждого виртуального
  диска создавать массив целых чисел длиной равной размеру виртуального диска в байтах. Каждая
  ячейка этого массива - это один байт виртуального диска. Каждой папке или файлу присваивать
  свой уникальный номер: 1, 2, 3, 4 и так далее (автоинкремент начиная с 1). В массиве помечать
  ячейки занятые папкой или файлом номером файла или папки которым они принадлежат. Признак
  пустой ячейки (не занятой) - 0.

Самое интересное начинается тогда, когда файлы или папки начинают удалятся и создаваться.
В массиве (на виртуальном диске) начинают появляться дыры от удалённых файлов. Файл или
папка может занимать не только рядом стоящие байты (ячейки массива), но и быть расположенным
например 1, 2, 10, 20 и 50 ячейках массива.

Для устранения дыр появившихся после удаления папок или файлов и упорядочивания файлов и папок
на виртуальном диске можно реализовать функцию дефрагиентации, которая распологает все папки и файлы
так, что юы они занимали последовательные ячейки массива, а так же сдвигает все занятые ячейки массива
в начало массива, а в конце остаются свободные ячейки. Пример работы реального тула по дефрагментации
смотри на картинке: Defrag_example.png (картинка лежит рядом с заданием).*/

import java.util.ArrayList;

public class FileSystem {

    private ArrayList <Disk> listOfDisks = new ArrayList <Disk> ();

    public boolean createDisk(char name, int size) {
        if (Character.isLetter(name)) {
            listOfDisks.add(new Disk(Character.toUpperCase(name), size));
            return true;
        } else {
            System.out.println("Not valid name of Disk");
            return false;
        }
    }

    public ArrayList <Disk> getListOfDisks(){
        return listOfDisks;
    }





}
