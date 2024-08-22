public class StaticList<T> {
    private T[] data;
    private int size;

    public StaticList(int size) {
        data = (T[]) new Object[size];
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            data[i] = null;
        }
        size = 0;
    }

    public void add(T element) {
        if (isFull()) {
            throw new IllegalStateException("Lista Cheia");
        }
        data[size++] = element;
    }

    public void add(T element, int pos) {
        if (pos < 0 || pos > size || isFull()) {
            throw new IndexOutOfBoundsException("Posição Inválida ou Lista Cheia");
        }
        for (int i = size; i > pos; i--) {
            data[i] = data[i - 1];
        }
        data[pos] = element;
        size++;
    }

    public T remove(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Posição Inválida");
        }
        T removedElement = data[pos];
        for (int i = pos; i < size - 1; i++) {
            data[i] = data[i + 1];
        }
        data[size - 1] = null;
        size--;
        return removedElement;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == data.length;
    }

    public void setData(T element, int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Posicão Inválida");
        }
        data[pos] = element;
    }

    public T getData(int pos) {
        if (pos < 0 || pos >= size) {
            throw new IndexOutOfBoundsException("Posição Inválida");
        }
        return data[pos];
    }

    public int getSize() {
        return size;
    }

    public int find(T element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public void printList() {
        System.out.println("Conteúdo da lista:");
        for (int i = 0; i < size; i++) {
            System.out.println("Elemento na posição " + i + ": " + data[i]);
        }
    }
}
