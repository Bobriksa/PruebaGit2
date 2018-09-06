package com.company;

/**
 * Created by digitalhouse on 04/09/18.
 */
public class MedidorPulso extends Medidor {


    @Override
    public void notificar() {
        for(Suscriptor suscriptor : getListaSuscriptores()){
            suscriptor.recibirAlerta("---___--__-__-------------");
        }
    }
}
