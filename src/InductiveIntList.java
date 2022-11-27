import java.util.NoSuchElementException;

public abstract class InductiveIntList extends AbstractIntList{
    public abstract AbstractIntList cons(int n);
    public abstract AbstractIntList emptyList();
    public abstract boolean isEmpty();
    public abstract AbstractIntList getTail();
    public abstract int getHead();
}
