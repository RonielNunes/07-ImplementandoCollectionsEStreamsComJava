package comparators;

import java.util.Comparator;

public class EstudanteOrdemIdadeReversaComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante t1, Estudante t2) {
        return t2.getIdade() - t1.getIdade();
    }
}
