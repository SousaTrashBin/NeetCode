package core.skills;

import aux.Pair;

import java.util.ArrayList;
import java.util.List;

public class InsertionSort {

    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> result = new ArrayList<>();
        if (pairs.isEmpty()) return result;

        result.add(new ArrayList<>(pairs));
        for (int i = 1; i < pairs.size(); i++) {
            Pair current = pairs.remove(i);
            insertAux(pairs, current);
            result.add(new ArrayList<>(pairs));
        }
        return result;
    }

    public void insertAux(List<Pair> list, Pair pair) {
        insertAuxRecursive(list, pair, 0);
    }

    private void insertAuxRecursive(List<Pair> list, Pair pair, int index) {
        if (index == list.size()) {
            list.add(index, pair);
            return;
        }
        if (pair.key < list.get(index).key) {
            list.add(index, pair);
            return;
        }
        insertAuxRecursive(list, pair, index + 1);
    }
}
