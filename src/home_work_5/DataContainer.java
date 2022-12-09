package home_work_5;

import home_work_5.api.IContainer;

import java.util.*;

public class DataContainer <T> implements IContainer<T>, Iterable<T>{

    private T [] data;

    public DataContainer (T[] items) {
        this.data = items;
    }

    public int add (T item) {

        if (item == null) {return -1;}

        for (int i = 0; i < data.length; i++) {
            if (data[i] == null) {
                data[i] = item;
                return i;
            }
        }

        data = Arrays.copyOf(data, data.length+1);
        data [data.length-1] = item;
        return data.length-1;
    }

    public T get (int index) {
        if (index > data.length-1) {return null;}
        return data[index];
    }

    public T [] getItems () {
        return Arrays.copyOf(data, data.length);
    }

    public boolean delete(int index) {

        if (index >= data.length) {return false;}

        for (int i = index + 1; i < data.length; i++) {
            data[i-1] = data[i];
        }

        data = Arrays.copyOfRange(data, 0, data.length-1);

        return true;
    }

    public boolean delete(T element) {
        
        if (element == null) {return false;}

            for (int i = 0; i < data.length; i++) {
                if (data[i].equals(element)) {
                    delete(i);
                    return true;
                }
            }
        return false;
    }

    public void sort (Comparator <? super T> comparator) {

        T buffer;

        for (int i = 0; i < data.length; i++) {
            for (int j = data.length - 1; j > i; j--) {
                if (comparator.compare(data[j], data[j - 1]) < 0) {
                    buffer = data[j];
                    data[j] = data[j - 1];
                    data[j - 1] = buffer;
                }
            }
        }
    }

    /**
     * Получить строку, содержащую все элементы data, за исключением null
     * @return строка с элементами массива
     */
    @Override
    public String toString() {

        if (data.length == 0) {
            return "[]";
        }

        StringBuilder builder = new StringBuilder();

        boolean isFirstIter = true;

        builder.append("[");
        for (T datum : data) {
            if (datum != null) {
                if (isFirstIter) {
                    builder.append(datum);
                    isFirstIter = false;
                } else {
                    builder.append(", ");
                    builder.append(datum);
                }
            }
        }
        builder.append("]");
        return builder.toString();
    }

    /**
     * Отсортировать массив data переданного объекта класса DataContainer
     * @param container объект DataContainer, для которого необходимо выполнить сортировку
     * @param <E> тип хранимых в data элементов
     */
    public static <E extends Comparable <? super E>> void sort (DataContainer <E> container) {

        E [] array = container.getItems();
        E buffer;

        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                if (array[j].compareTo(array[j-1]) < 0) {
                    buffer = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = buffer;
                }
            }
        }

        for (E e : array) {
            container.delete(0);
            container.add(e);
        }
    }

    /**
     * Отсортировать массив data переданного объекта класса DataContainer,
     * используя реализацию сравнения переданного объекта класса Comparator
     * @param container объект DataContainer, для которого необходимо выполнить сортировку
     * @param c объекта класса Comparator, реализующий алгоритм сравнения
     * @param <E> тип хранимых в data элементов
     */
    public static <E> void sort(DataContainer <E> container, Comparator <? super E> c) {
        container.sort(c);
    }

    @Override
    public Iterator<T> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator <T> {

        int cursor;

        @Override
        public boolean hasNext() {
            return cursor != data.length;
        }

        @Override
        public T next() {
            int i = cursor;
            cursor++;
            return data[i];
        }
    }
}
