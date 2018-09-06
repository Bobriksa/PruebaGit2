package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Medidor medidor = new MedidorPulso();

        Medico medico = new Medico();
        Medico medico2 = new Medico();

        medidor.suscribir(medico);
        medidor.suscribir(medico2);



        Suscriptor suscriptorNuevo =  new Suscriptor() {

            @Override
            public void recibirAlerta(String valor) {
                System.out.println("JAJAJA No me importa el paciente: " + valor);
            }
        };

        medidor.suscribir(suscriptorNuevo);

        medidor.notificar();

    }
}
