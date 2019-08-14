/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportes;

import java.util.Scanner;

/**
 * Classe responsável por informar os métodos e atributos do Navio
 * @author Carmem & Nathan
 */
public class Navio {
    private String cor;
    private String marca;
    private int capacidade;

    //Retorna a cor do caminhão
    public String getCor() {
        return cor;
    }

    //Chama a cor do navio
    public void setCor(String cor) {
        this.cor = cor;
    }

    //Retorna a marca do navio
    public String getMarca() {
        return marca;
    }

    //Chama a marca do navio
    public void setMarca(String marca) {
        this.marca = marca;
    }

    //Retorna a capacidade do navio
    public int getCapacidade() {
        return capacidade;
    }

    //Chama a capacidade do navio
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    //Pede para o usuário informar a cor do navio
     public void cor(){
        System.out.println("Digite a cor: ");
        Scanner sc = new Scanner(System.in);
        String cor = sc.next();
        
}
     //Pede para o usuário informar a marca
        public void marca(){
        System.out.println("Digite a marca: ");
        Scanner sc = new Scanner(System.in);
        String marca = sc.next();
        
}
        //Pede para o usuário informar as cilindradas do navio
          public void cilindradas(){
        System.out.println("Digite as capacidade: ");
        Scanner sc = new Scanner(System.in);
        String capacidade = sc.next();
        
}
    
}
