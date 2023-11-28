package menus.opcoes;

import java.util.Scanner;

import menus.dominio.Aluno;

public class opcao1 extends Aluno {



public opcao1(int codigo, String nome, double notaA1, double notaP1, double notaA2, double notaP2, double media) {
        super(codigo, nome, notaA1, notaP1, notaA2, notaP2, media);
        
    }

public static void opcao1 (String[] args) {

    Scanner menu = new Scanner (System.in);

    System.out.println("## Teste Menu ##\n\n");
    System.out.println("----------------------------\n");
    System.out.println("Opção 1: Gerenciar Alunos");
        System.out.println("Opção 1: Adicionar Aluno.");
        System.out.println("Opção 2: Alterar nome do Aluno.");
        System.out.println("Opção 3: Excluir Aluno.");
        System.out.println("Opção 4: Listar Alunos.");
        System.out.println("Opção 5: Selecionar Aluno para:");
            System.out.println("Opção 1: Adicionar nota A1 para o aluno selecionado.");
            System.out.println("Opção 2: Adicionar nota P1 para aluno selecionado.");
            System.out.println("Opção 3: Adicionar nota A2 para aluno selecionado.");
            System.out.println("Opção 4: Adicionar nota P2 para aluno selecionado.");
            System.out.println("Opção 5: calcular média para aluno selecionado.");
    
    System.out.println("Opção 2: Rendimento escolar: ");
        System.out.println("Opção 1: Selecionar Aluno da lista para: ");
            System.out.println("Exibir notas de provas, atividades e sua média.");
        System.out.println("Opção 2: Exibir Rendimento da turma(Exibe notas de todos os alunos da lista, todas as médias.)");
    
    System.out.println("Opção 3: Finalizar Menu.");
    System.out.println("----------------------------\n");

    }



}