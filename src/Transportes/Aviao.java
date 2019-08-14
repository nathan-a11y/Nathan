/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportes;

import java.util.Scanner;

/**
 * Classe responsável por mostrar os métodos e atributos do avião
 * @author Carmem & Nathan
 */
public class Aviao {
    private String cor;
    private String companhia;
    private int capacidade;

    //Retorna a cor do navio
    public String getCor() {
        return cor;
    }

    //Chama a cor do navio
    public void setCor(String cor) {
        this.cor = cor;
    }

    //Retorna a companhia do avião
    public String getCompanhia() {
        return companhia;
    }

    //Chama a companhia do avião
    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    //Retorna a capacidade do avião
    public int getCapacidade() {
        return capacidade;
    }

    //Chama a capacidade do avião
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    //Pede para o usuário informar a cor do avião
     public void cor(){
        System.out.println("Digite a cor: ");
        Scanner sc = new Scanner(System.in);
        String cor = sc.next();
        
}
     //Pede para o usuário informar a companhia do avião
        public void companhia(){
        System.out.println("Digite a companhia: ");
        Scanner sc = new Scanner(System.in);
        String marca = sc.next();
        
}
        //Pede para o usuário informar as cilindradas do avião
          public void cilindradas(){
        System.out.println("Digite as capacidade: ");
        Scanner sc = new Scanner(System.in);
        String capacidade = sc.next();
        
}
}
