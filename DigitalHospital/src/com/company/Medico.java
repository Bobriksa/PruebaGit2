package com.company;

/**
 * Created by digitalhouse on 04/09/18.
 */
public class Medico implements Suscriptor {

    @Override
    public void recibirAlerta(String valor) {
        System.out.println("Medico: " + valor);
    }
}
