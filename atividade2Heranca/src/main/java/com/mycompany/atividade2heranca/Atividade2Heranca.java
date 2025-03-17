/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade2heranca;

/**
 *
 * @author Admin
 */
public class Atividade2Heranca {

    public static void main(String[] args) {
        // Instanciando os objetos conforme solicitado
        Pessoa pessoa = new Pessoa("Carlos Silva", "123.456.789-00", "10/05/1985");
        Aluno aluno = new Aluno("Ana Souza", "987.654.321-00", "15/02/2000", "20231001", "Engenharia");
        Professor professor = new Professor("Marcos Lima", "111.222.333-44", "20/07/1975", "Matemática", "RF12345");
        Funcionario funcionario = new Funcionario("Laura Mendes", "555.666.777-88", "03/11/1990", "Secretária", "RGM98765");

        // Exibindo informações
        System.out.println("--- Pessoa ---");
        pessoa.exibirInformacoes();

        System.out.println("\n--- Aluno ---");
        aluno.exibirInformacoes();

        System.out.println("\n--- Professor ---");
        professor.exibirInformacoes();

        System.out.println("\n--- Funcionário ---");
        funcionario.exibirInformacoes();
    }
}
