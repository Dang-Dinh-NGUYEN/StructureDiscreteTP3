public abstract class AbstractIntList implements IntList {
    public abstract AbstractIntList cons(int n);
    public abstract AbstractIntList getTail();
    public abstract AbstractIntList emptyList();

    public String toString() {
        String stringBuilder = "";
        if(this.isEmpty()){
            stringBuilder += "vide";}
        else{
            stringBuilder = (this.getHead()) + "::" + this.getTail().toString();
        }
        return stringBuilder;
    }

    public int length() {
        if (this.isEmpty()) return 0;
        return 1 + getTail().length();
    }

    public int sum() {
        if (this.isEmpty()) return 0;
        return this.getHead() + this.getTail().sum();
    }

    public boolean equals(AbstractIntList list) {
        if(this.isEmpty() != list.isEmpty()) return false;
        if (this.isEmpty() && list.isEmpty()) return true;
        return (this.getHead() == list.getHead() && this.getTail().equals(list.getTail()));
    }

    public AbstractIntList concatenation(AbstractIntList list) {
        if(this.isEmpty()) return list;
        return this.getTail().concatenation(list).cons(this.getHead());

    }

    public AbstractIntList reverse() {
        if (this.isEmpty()) return this;
        return getTail().reverse().concatenation(new EmptyIntList().cons(this.getHead()));
    }
}

