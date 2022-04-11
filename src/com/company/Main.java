package com.company;

public class Main {

    public static void main(String[] args) {
     
     Animal cachorro = new Animal();
     cachorro.cor = "preto";
     cachorro.nome = "tica";
     cachorro.raca = "Pinscher";
     cachorro.idade = 11;
     cachorro.peso = 2.200;
     cachorro.Comeu();
     System.out.println(cachorro);

      Veiculo veiculo1 = new Veiculo();
      veiculo1.setNome("Kadete");
      veiculo1.setMarca("Chevrolet");
      veiculo1.setChassi("09827372372323");
      veiculo1.setQtdRodas(4);
      System.out.println(veiculo1);
      veiculo1.Ligar();
      veiculo1.Desligar();

    }
}
