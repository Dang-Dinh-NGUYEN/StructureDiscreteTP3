import java.util.NoSuchElementException;

public class EmptyIntList extends InductiveIntList{
    public EmptyIntList(){}

    @Override
    public AbstractIntList cons(int n) {
        return new NonEmptyIntList(n,this);
    }

    @Override
    public AbstractIntList emptyList() {
        return new EmptyIntList();
    }

    @Override
    public boolean isEmpty() {
        return true;
    }

    @Override
    public AbstractIntList getTail() {
        throw new NoSuchElementException();
    }

    @Override
    public int getHead() {
        throw new NoSuchElementException();
    }
}
