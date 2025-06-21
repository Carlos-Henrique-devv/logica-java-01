package org.example;

import java.util.ArrayList;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("MENU PRODUTO");
            System.out.println("1. Adicionar produto");
            System.out.println("2. listar produtos");
            System.out.println("3. remover produto");
            System.out.println("4. sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.println("Digite o nome do produto:");
                String nomeProduto = scanner.nextLine();

                System.out.println("Digite o preço do produto");
                Double precoProduto = Double.parseDouble(scanner.nextLine());

                Produto produto = new Produto(nomeProduto, precoProduto);
                produtos.add(produto);
                System.out.println("Produto adicionado");

            } else if (opcao == 2) {
                if (produtos.isEmpty()) {
                    System.out.println("nenhum produto encotrado");
                } else {
                    for (int i = 0; i < produtos.size(); i++) {
                        System.out.println("[" + (i + 1) + "] " + produtos.get(i).toString() + " - " + produtos.get(i).getPreco() + " R$");
                    }
                }
            } else if (opcao == 3) {
                System.out.println("Digite o número do produto para remover");

                int numero = scanner.nextInt();
                scanner.nextLine();

                if (numero >= 1 && numero <= produtos.size()) {
                    produtos.remove(numero - 1);
                    System.out.println("Produto removido");
                } else {
                    System.out.println("Número invalido");
                }
            } else if (opcao == 4) {
                System.out.println("Saindo do programa...");
                break;
            } else {
                System.out.println("Nenhuma opção valida");
            }
        }
    }
}