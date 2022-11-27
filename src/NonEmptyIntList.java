public class NonEmptyIntList extends InductiveIntList{
    private int head;
    private AbstractIntList tail;

    public NonEmptyIntList(int head, AbstractIntList tail){
        this.head = head;
        this.tail = tail;
    }

    @Override
    public AbstractIntList getTail() {
        return this.tail;
    }

    @Override
    public int getHead() {
        return this.head;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public AbstractIntList cons(int n) {
        return new NonEmptyIntList(n,this);
    }

    @Override
    public AbstractIntList emptyList() {
        return new EmptyIntList();
    }
}
