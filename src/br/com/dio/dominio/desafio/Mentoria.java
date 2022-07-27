package br.com.dio.dominio.desafio;

import java.time.LocalDate;
import java.util.Date;

public class Mentoria extends Conteudo{
    private LocalDate data;

    @Override
    public double calcularxp() {
        return XP_PADRAO + 20d;
    }

    public Mentoria() {
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descrição='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
