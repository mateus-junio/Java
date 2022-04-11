package com.company;

public class Animal {

    String nome;
    String raca;
    String cor;
    int idade;
    double peso;

    public void Comeu(){

        System.out.println("O animal comeu!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", raca='" + raca + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                ", peso=" + peso +
                '}';
    }
}
