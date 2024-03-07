package javaplus.collectionframework.ex12;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class TreeSetMethod_1 {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i =50; i>0; i-=2){
            treeSet.add(i);
        }
        System.out.println(treeSet.toString()); //[2,4,6,...,50]

        //#1. first()
        System.out.println(treeSet.first()); //2

        //#1. last()
        System.out.println(treeSet.last()); //50

        //#1. lower(E element)
        System.out.println(treeSet.lower(26)); //24

        //#1. higher()
        System.out.println(treeSet.higher(26)); //28

        //#1. floor()
        System.out.println(treeSet.floor(25)); //24
        System.out.println(treeSet.floor(26)); //26

        //#1. ceiling()
        System.out.println(treeSet.ceiling(25)); //26
        System.out.println(treeSet.ceiling(26)); //26

        //#7. pollFirst()
        int treeSetSize = treeSet.size();
        System.out.println(treeSetSize);
        for(int i =0; i< treeSetSize; i++){
            System.out.print(treeSet.pollFirst() + " ");
        }
        System.out.println();
        System.out.println(treeSet.size());//0

        //#8. pollLast()
        for (int i = 50; i>0; i-=2){
            treeSet.add(i);
        }
        treeSetSize = treeSet.size(); //25
        for(int i=0; i<treeSetSize; i++){
            System.out.print(treeSet.pollLast() + " ");
        }
        System.out.println();
        System.out.println(treeSet.size());

        //#9. SortedSet<E> headSet(E element)
        for (int i = 50; i>0; i-=2){
            treeSet.add(i);
        }
        SortedSet<Integer> sSet = treeSet.headSet(20);
        System.out.println(sSet);

        //#10. NavigableSet<E> headSet(E element, boolean inclusive)
        NavigableSet<Integer> nSet = treeSet.headSet(20, true);
        System.out.println(nSet);
        nSet = treeSet.headSet(20, false);
        System.out.println(nSet);

        //#11. SortedSet<E> tailSet(E element)
        nSet = treeSet.tailSet(20, true);
        System.out.println(nSet);

        //#11. SortedSet<E> subSet(E element, E element)
        sSet = treeSet.subSet(10, 20);
        System.out.println(sSet);

        //#12. NavigableSet<E> subSet(E element, boolean inclusive)
        nSet = treeSet.subSet(10, true, 20,false);
        System.out.println(nSet);

        nSet = treeSet.subSet(10, false, 20, true);
        System.out.println(nSet);

        //#15. NavigableSet<E> descendingSet()
        System.out.println(treeSet);

        NavigableSet<Integer> descendingSet = treeSet.descendingSet();
        System.out.println(descendingSet);
        NavigableSet<Integer> descendingedSet = descendingSet.descendingSet();
        System.out.println(descendingedSet);

    }
}
