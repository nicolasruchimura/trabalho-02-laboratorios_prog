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
        
        /**
         * 
         * @id
         * @isbn
         * @titulo
         * @autor
         * @disponivel
         * Uma vez que os parâmetros foram devidamente declarados, realizar-se-ão os getters e setters.
         */
        
        public int getId(){
            return id;
        }

        public void setId(int id){
            this.id = id;
        }
        
        public String getIsbn(){
            return isbn;
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

        public boolean isDisponivel(){
            return disponivel;
        }

        public void setDisponivel(boolean disponivel){
            this.disponivel = disponivel;
        }

    public static void main(String args[]) {
        // TODO code application logic here
    }
}
