/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade1heranca;

/**
 *
 * @author Admin
 */
class CarroEletrico extends Carro {
    int capacidadeBateria;

    // Construtor da classe CarroEletrico
    public CarroEletrico(String marca, String modelo, int ano, String tipoDeCombustivel, int capacidadeBateria) {
        super(marca, modelo, ano, tipoDeCombustivel); // Chamada ao construtor da classe Carro
        this.capacidadeBateria = capacidadeBateria;
    }

    // Sobrescrevendo o método para incluir a capacidade da bateria
    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Capacidade da Bateria: " + capacidadeBateria + " kWh");
    }
}
