package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by digitalhouse on 04/09/18.
 */
public abstract class Medidor {
    // ATRIBUTOS
    private List<Suscriptor> listaSuscriptores = new ArrayList<>();


    // GETTER
    protected List<Suscriptor> getListaSuscriptores() {
        return listaSuscriptores;
    }

    // METODOS
    public void suscribir(Suscriptor suscriptor){
        listaSuscriptores.add(suscriptor);
    }

    public void desuscribir(Suscriptor suscriptor){
        listaSuscriptores.remove(suscriptor);
    }

    public abstract void notificar();



}
