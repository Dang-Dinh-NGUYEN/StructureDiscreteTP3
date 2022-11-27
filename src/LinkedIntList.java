
public class LinkedIntList extends AbstractIntList{
    // variables d’instance
    private Cell first;
    /** Constructeur d’objets de classe LinkedIntList
     */
    public LinkedIntList()
    {
    // initialisation des variables d’instance
        first = null;
    }


    @Override
    public AbstractIntList cons(int n) {
        first.setData(n);
        first.setNextCell(first);
        return new NonEmptyIntList(first.getDataCell(), first.getNextCell());
    }

    @Override
    public AbstractIntList getTail() {
        return new NonEmptyIntList(this.first.getNextCell(),first.getNextCell());
    }

    @Override
    public AbstractIntList emptyList() {
        return new EmptyIntList();
    }

    @Override
    public int getHead() {
        return first.getDataCell();
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }
}
