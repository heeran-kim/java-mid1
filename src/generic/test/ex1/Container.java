package generic.test.ex1;

public class Container<T> {
    private T value;

    public Container() {
        value = null;
    }

    public boolean isEmpty() {
        return (value == null);
    }

    public T getItem() {
        return value;
    }

    public void setItem(T value) {
        this.value = value;
    }
}