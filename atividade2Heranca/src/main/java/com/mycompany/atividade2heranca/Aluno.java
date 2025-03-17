/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividade2heranca;

/**
 *
 * @author Admin
 */
class Aluno extends Pessoa {
    String ra;
    String curso;

    // Construtor da classe Aluno
    public Aluno(String nome, String cpf, String dataNascimento, String ra, String curso) {
        super(nome, cpf, dataNascimento);
        this.ra = ra;
        this.curso = curso;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("RA: " + ra);
        System.out.println("Curso: " + curso);
    }
}
