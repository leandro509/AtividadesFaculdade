package lista14;



import java.util.Comparator;
import lista14.Municipio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author leandro
 */
public class OrdenacaoPorPopulacao implements Comparator<Municipio> {

    @Override
    public int compare(Municipio o1, Municipio o2) {

        if (o1.getPopulacao() > o2.getPopulacao()) {
            return 1;
        }

        if (o1.getPopulacao() < o2.getPopulacao()) {
            return -1;
        }

        return 0;
    }
}
