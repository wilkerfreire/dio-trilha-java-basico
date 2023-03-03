package application;

import entities.SmartTV;

public class Program {
    public static void main(String[] args) {

        SmartTV smartTV = new SmartTV();
        System.out.println("Status da tv: ");
        System.out.println(smartTV.isLigada());
        System.out.println(smartTV.getCanal());
        System.out.println(smartTV.getVolume());

        smartTV.ligarTV();
        smartTV.aumentarCanal();
        smartTV.aumentarCanal();
        smartTV.aumentarVolume();
        smartTV.aumentarVolume();

        System.out.println("Novo status:");
        System.out.println(smartTV.isLigada());
        System.out.println(smartTV.getCanal());
        System.out.println(smartTV.getVolume());
    }

}