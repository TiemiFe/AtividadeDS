/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade1heranca;

/**
 *
 * @author Admin
 */
public class Atividade1Heranca {

    public static void main(String[] args) {
        // Instanciando os objetos conforme solicitado
        Veiculo veiculo = new Veiculo("Toyota", "Corolla", 2020);
        Carro carro = new Carro("Honda", "Civic", 2021, "Gasolina");
        CarroEletrico carroEletrico = new CarroEletrico("Tesla", "Model 3", 2023, "Elétrico", 75);

        // Exibindo informações
        System.out.println("--- Veículo ---");
        veiculo.exibirInformacoes();

        System.out.println("\n--- Carro ---");
        carro.exibirInformacoes();

        System.out.println("\n--- Carro Elétrico ---");
        carroEletrico.exibirInformacoes();
    }
}
