/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package swing.model;

import java.text.SimpleDateFormat;
import java.util.Date;

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

    public Livro() {
        this.disponivel = true;
    }

    public Livro(int id, String isbn, String titulo, String autor) {
        this.id = id;
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }


    @Override
    public String toString() {
        String estado = disponivel ? "Disponivel" : "Emprestado";
        return "ID: " + id + ", ISBN: " + isbn + ", Titulo: " + titulo + ", Autor: " + autor + ", Estado: " + estado;
    }
}
        public class Membro {
            private int id;
            private String numeroSocio;
            private String primeiroNome;
            private String apelido;
            private String email;


            private static int contadorId = 1;

            public Membro(String numeroSocio, String primeiroNome, String apelido, String email) {
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

            public String getPrimeiroNome() {
                return primeiroNome;
            }

            public void setPrimeiroNome(String primeiroNome) {
                this.primeiroNome = primeiroNome;
            }
            public String getApelido() {
                return apelido;
            }
            public void setApelido(String apelido) {
                this.apelido = apelido;
            }
            public String getEmail() {
                return email;
            }
            public void setEmail(String email) {
                this.email = email;
            }
            public String getNomeCompleto(){
                return primeiroNome + " " + apelido;
            }
            @Override
            public String toString(){
                return "ID: " + id + ", Numero Socio: " + numeroSocio + ", Nome: " + getNomeCompleto(); + ", Email: " + email;
            }
        }

import java.util.Date;
import java.text.SimpleDateFormat;

public class Emprestimo {
    private int id;
    private int idLivro;
    private int idMembro;
    private Date dataEmprestimo;
    private Date dataDevolucaoPrevista;
    private Date dataDevolucaoEfetiva

            private static int contadorId = 1;

    public Emprestimo(int idLivro, int idMembro, Date dataEmprestimo, Date dataDevolucaoPrevista){
        this.id = contadorId++;
        this.idLivro = idLivro;
        this.idMembro = idMembro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.dataDevolucaoEfetiva = null;
    }

    public int getId() {
        return id;
    }
    public int getIdLivro() {
        return idLivro;
    }
    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }
    public int getIdMembro() {
        return idMembro;
    }
    public void setIdMembro(int idMembro) {
        this.idMembro = idMembro;
    }
    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }
    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }
    public Date getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }
    public void setDataDevolucaoPrevista(Date dataDevolucaoPrevista) {
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
    }
    public Date getDataDevolucaoEfetiva() {
        return dataDevolucaoEfetiva;
    }
    public void setDataDevolucaoEfetiva(Date dataDevolucaoEfetiva) {
        this.dataDevolucaoEfetiva = dataDevolucaoEfetiva;
    }

    public String getEstado(){
        Date hoje = new Date();
        if (dataDevolucaoEfetiva != null) {
            return "Devolvido com sucesso!";
        } else if (dataDevolucaoPrevista.before(hoje)) {
            return "Atrasado";
        } else {
            return "Ainda activo.";
        }
    }

    private String formatarData(Date data){
        if (data == null) {
            return "N/A";
        }
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(data);
    }

    @Override
    public String toString() {
        return "ID: " + id +
                ", ID Livro: " + idLivro +
                ", ID Membro: " + idMembro +
                ", Data Empréstimo: " + formatarData(dataEmprestimo) +
                ", Devolução Prevista: " + formatarData(dataDevolucaoPrevista) +
                ", Devolução Efetiva: " + formatarData(dataDevolucaoEfetiva) +
                ", Estado: " + getEstado();
    }
    }
}

