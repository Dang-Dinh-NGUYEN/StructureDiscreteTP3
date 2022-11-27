public class Main {
    public static void main(String[] args) {
    // Tests des listes inductives
    // construction d’une liste vide
        AbstractIntList lvide = new EmptyIntList();
        //Vérifiez que la liste lvide est vide
        //System.out.println(lvide.isEmpty());
        //System.out.println(lvide.toString());

    // construction d’une liste de longueur 1
        AbstractIntList l1 = lvide.cons(1);
        /*
        System.out.println(l1);
        System.out.println(l1.isEmpty());
        System.out.println(l1.getHead());
        System.out.println(l1.getTail());
*/
        // construction d’une liste de longueur 2
        AbstractIntList l2 = l1.cons(2);
        /*
        System.out.println(l2);
        System.out.println(l2.isEmpty());
        System.out.println(l2.getHead());
        System.out.println(l2.getTail());
*/
        // construction d’une liste de longueur 3
        AbstractIntList l3 = l2.cons(3);
/*
        System.out.println(l3);
        System.out.println(l3.isEmpty());
        System.out.println(l3.getHead());
        System.out.println(l3.getTail());

        System.out.println(l3.toString());
        System.out.println(l3.length());
        System.out.println(l3.sum());
        System.out.println(l3.equals(l3));
        System.out.println(l3.concatenation(l2));
        System.out.println(l3.reverse());
 */
        AbstractIntList linkedList = new LinkedIntList();
        System.out.println(linkedList.isEmpty());
        System.out.println(linkedList.getTail());

        //System.out.println(linkedList.cons(2));
        //System.out.println(linkedList.getHead());
    }
}
