package home_work_5.api;

import home_work_5.DataContainer;

import java.util.Comparator;

public interface IContainer<T> {

    /**
     * Добавить элемент в свободную (хранящую null) ячейку массива data,
     * либо расширить массив и добавить элемент в ячейку с последним индексом.
     * @param item добавляемый элемент (не null)
     * @return индекс ячейки, в которую был добавлен элемент; -1, если добавление не произошло
     */
    public int add (T item);

    /**
     * Получить элемент массива data из ячейки по указанному индексу.
     * @param index индекс получаемого элемента.
     * @return полученный элемент массива; null, если принят индекс, выходящий за границы массива.
     */
    public T get (int index);
    /**
     * Получить содержимое массива data
     * @return массив с элементами, хранящимися в data
     */
    public T [] getItems ();

    /**
     * Удалить элемент массива data по принятому индексу, сжать массив
     * @param index индекс элемента, который нужно удалить
     * @return произошло ли удаление
     */
    public boolean delete(int index);

    /**
     * Удалить из data элементы, эквивалентные принятому
     * @param element элемент, эквивалентные которому нужно удалить из массива
     * @return произошло ли удаление
     */
    public boolean delete(T element);

    /**
     * Выполнить сортировку data, используя принятый Comparator для определения приоритета
     * @param comparator реализация Comparator, используемая для определения приоритетов
     */
    public void sort (Comparator<? super T> comparator);
}
