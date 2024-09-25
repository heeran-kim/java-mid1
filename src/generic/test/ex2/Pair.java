package generic.test.ex2;

public class Pair<T1, T2> {
    private T1 first;
    private T2 second;

    public void setFirst(T1 item) {
        first = item;
    }

    public void setSecond(T2 item) {
        second = item;
    }

    public T1 getFirst() {
        return first;
    }

    public T2 getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
