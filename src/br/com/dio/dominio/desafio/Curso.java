package br.com.dio.dominio.desafio;

public class Curso extends Conteudo{
    private int cargahoraria;

    @Override
    public double calcularxp() {
        return XP_PADRAO + cargahoraria;
    }

    public Curso() {
    }

    public int getCargahoraria() {
        return cargahoraria;
    }

    public void setCargahoraria(int cargahoraria) {
        this.cargahoraria = cargahoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descrição='" + getDescricao() + '\'' +
                ", cargahoraria=" + cargahoraria +
                '}';
    }
}
