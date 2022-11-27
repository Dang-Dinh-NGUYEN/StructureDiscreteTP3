public interface IntList {
    /** @return la tête de la liste si elle est non-vide
     */
    int getHead();

    /** @return la queue de la liste si elle est non-vide
     */
    IntList getTail();

    /** @return vrai si la liste est vide et faux sinon
     */
    boolean isEmpty();

    /** @param n l’entier à ajouter dans la liste
     * @return la liste n :: this
     */
    IntList cons(int n);

    /** @return une liste vide
     */
    IntList emptyList();

}
