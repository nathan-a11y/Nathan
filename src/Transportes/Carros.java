/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportes;

import java.util.Scanner;

/**
 * Classe responsável por informar as características do carro.
 * @author Carmem & Nathan
 */

public class Carros {
    private String cor;
    private String marca;
    private int capacidade;

    /*Metodo para retornar a cor do carro
    @return String-cor */
    public String getCor() {
        return cor;
    }
    
    //Metodo para chamar a cor do carro
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    /*Metodo para retornar a marca do carro
    @return String-marca 
    */
    public String getMarca() {
        return marca;
    }
    
    //Metodo para chamar a marca do carro
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    /*Metodo para retornar a capacidade do carro
    @return String-capacidade*/
    public int getCapacidade() {
        return capacidade;
    }
    
    //Metodo para chamar a capacidade do carro
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
    
    //Metodo sem retorno para o usuario informar a cor do carro
    public void cor(){
        System.out.println("Digite a cor: ");
        Scanner sc = new Scanner(System.in);
        String cor = sc.next();
        
    }
    
    //Metodo sem retorno para o usuario informar a marca
      public void marca(){
        System.out.println("Digite a marca: ");
        Scanner sc = new Scanner(System.in);
        String marca = sc.next();
        
}
      //Metodo sem retorno para informar a capacidade do carro
        public void capacidade(){
        System.out.println("Digite a capacidade: ");
        Scanner sc = new Scanner(System.in);
        String capacidade = sc.next();
        
}
}
