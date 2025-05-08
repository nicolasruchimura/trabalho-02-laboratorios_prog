/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package swing.model;

/**
 *
 * @author nicol
 */
public class Livro {

        private int id;
        private String isbn;
        private String titulo;
        private String autor;
        private boolean disponivel;

        private static int contadorId = 0;

        public Livro(){
            this.disponivel = true;
        }

        public Livro(int id, String isbn, String titulo, String autor)
        {
            this.id = id;
            this.isbn = isbn;
            this.titulo = titulo;
            this.autor = autor;
            this.disponivel = true;           
        }
        public int getId(){
            return id;
        }

        public void setId(int id){
            this.id = id;
        }
        
        public String getIsbn(){
            return isbn;
        }

        public void setIsbn(String isbn){
            this.isbn = isbn;
        }

        public String getTitulo(){
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getAutor(){
            return autor;
        }

        public String setAutor(String autor){
            this.autor = autor;
        }

        public boolean isDisponivel(){
            return disponivel;
        }

        public void setDisponivel(boolean disponivel){
            this.disponivel = disponivel;
        }


        @Override
        public String toString(){
            String estado = disponivel ? "Disponivel" : "Emprestado";
            return "ID: " + id + ", ISBN: " + isbn + ", Titulo: " + titulo + ", Autor: " + autor + ", Estado: " + estado;
        }

        public class Membro {
            private int id;
            private String numeroSocio;
            private String primeiroNome;
            private String apelido;
            private String email;
        }

        private static int contadorId = 1;

        public Membro(String numeroSocio, String primeiroNome, String apelido, String email){
            this.id = contadorId++;
            this.numeroSocio = numeroSocio;
            this.primeiroNome = primeiroNome;
            this.apelido = apelido;
            this.email = email;
        }

        public int getId() {
            return id;
        }

        public String getNumeroSocio() {
            return NumeroSocio();
        }
        public void setNumeroSocio(String numeroSocio) {
            this.numeroSocio = numeroSocio;
        }

    public static void main(String args[]) {
        // TODO code application logic here
    }
}
