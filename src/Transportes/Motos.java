/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transportes;

import java.util.Scanner;

/**
 * Classe responsável por especificar os atributos e métodos das motos.
 * @author Carmem & Nathan
 */
public class Motos {
    private String cor;
    private String marca;
    private int cilindradas;
    
    /*Metodo para retornar a cor do carro
    @return String-cor */
    public String getCor() {
        return cor;
    }
    //Método para chamar a cor da moto
    public void setCor(String cor) {
        this.cor = cor;
    }

    /*Metodo para retornar a marca da moto
    @return String-marca */
    public String getMarca() {
        return marca;
    }
    //Método para chamar a cor da moto
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /*Metodo para retornar as cilindradas da moto
    @return int-cilindradas */
    public int getCilindradas() {
        return cilindradas;
    }
    //Método para chamar a cor da moto
    public void setCilindradas(int cilindradas) {
        this.cilindradas = cilindradas;
    }
    //Metodo sem retorno para o usuario informar a cor da moto
      public void cor(){
        System.out.println("Digite a cor: ");
        Scanner sc = new Scanner(System.in);
        String cor = sc.next();
        
}   //Metodo sem retorno para o usuario informar a marca da moto
        public void marca(){
        System.out.println("Digite a marca: ");
        Scanner sc = new Scanner(System.in);
        String marca = sc.next();
        
}   //Metodo sem retorno para o usuario informar as cilinradas da moto
          public void cilindradas(){
        System.out.println("Digite as cilindradas: ");
        Scanner sc = new Scanner(System.in);
        String cilindradas = sc.next();
        
}
}
