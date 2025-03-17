/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2heranca;

/**
 *
 * @author Admin
 */
class Professor extends Pessoa {
    String disciplina;
    String rf;

    // Construtor da classe Professor
    public Professor(String nome, String cpf, String dataNascimento, String disciplina, String rf) {
        super(nome, cpf, dataNascimento);
        this.disciplina = disciplina;
        this.rf = rf;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Disciplina: " + disciplina);
        System.out.println("RF: " + rf);
    }
}
