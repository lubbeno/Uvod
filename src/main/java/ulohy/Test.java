package ulohy;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        Set<Integer> ttest = new SortedSet<Integer>() {
            @Override
            public Comparator<? super Integer> comparator() {
                return null;
            }

            @Override
            public SortedSet<Integer> subSet(Integer fromElement, Integer toElement) {
                return null;
            }

            @Override
            public SortedSet<Integer> headSet(Integer toElement) {
                return null;
            }

            @Override
            public SortedSet<Integer> tailSet(Integer fromElement) {
                return null;
            }

            @Override
            public Integer first() {
                return null;
            }

            @Override
            public Integer last() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        }

        ttest.add(300);
        //ttest.add(40);
        ttest.add(1);
        ttest.add(2);
        ttest.add(50);

        System.out.println(ttest);
    }
}
