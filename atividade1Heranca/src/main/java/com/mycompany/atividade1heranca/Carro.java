/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade1heranca;

/**
 *
 * @author Admin
 */
class Carro extends Veiculo {
    String tipoDeCombustivel;

    // Construtor da classe Carro
    public Carro(String marca, String modelo, int ano, String tipoDeCombustivel) {
        super(marca, modelo, ano); // Chamada ao construtor da classe base
        this.tipoDeCombustivel = tipoDeCombustivel;
    }

    // Sobrescrevendo o método para incluir o tipo de combustível
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Tipo de Combustível: " + tipoDeCombustivel);
    }
}
