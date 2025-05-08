/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author grsilva
 */
public class Cao {
    public String nome;
    public int idade;
    public String raca;
    public String cor;
    
    public Cao(String nome, int idade, String raca, String cor){
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.cor = cor;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public int getIdade(){
        return this.idade;
    }
        
    public String getRaca(){
        return this.raca;
    }
        
    public String getCor(){
        return this.cor;
    }
    
    public String getInformacao(){
        return "Nome: " + this.nome + " Raca: " + this.raca + " Cor: " + this.cor + " Idade: " + this.idade + "\n";
    }
}
