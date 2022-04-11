package com.company;

public class Veiculo {

    private String nome;
    private String marca;
    private String chassi;
    private int qtdRodas;
    private float qtdCombustivel = 3;

    public float getQtdCombustivel() {
        return qtdCombustivel;
    }

    public void abastecer(float litros){
        qtdCombustivel += litros;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public int getQtdRodas() {
        return qtdRodas;
    }

    public void setQtdRodas(int qtdRodas)
    {
        this.qtdRodas = qtdRodas;
    }

    public String getChassi()
    {
        return chassi;
    }

    public void setChassi(String chassi) {

        this.chassi = chassi;

    }

    public void Ligar(){

        System.out.println("Veiculo Ligou!");
    }

    public void Desligar(){

        System.out.println("Desligou o veiculo!");
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", chassi='" + chassi + '\'' +
                ", qtdRodas=" + qtdRodas +
                ", qtdCombustivel=" + qtdCombustivel +
                '}';
    }
}
