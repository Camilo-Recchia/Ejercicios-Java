package EjercicioHashSet;

import java.util.Comparator;

public class ComparadorPorGrupoYNombreHS implements Comparator<RegistroHS> {

    @Override
    public int compare(RegistroHS o1, RegistroHS o2) {
        int r = o1.getGrupo().compareTo(o2.getGrupo());
        if (r == 0) {
            r = o1.getNombre().compareTo(o2.getNombre());
        }
        return r;
    }
}