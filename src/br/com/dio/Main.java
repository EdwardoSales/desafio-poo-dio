package br.com.dio;

import br.com.dio.dominio.desafio.*;

import java.time.LocalDate;

public class Main{
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargahoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso java");
        curso2.setDescricao("descrição curso java");
        curso2.setCargahoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        //System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setName("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEduardo = new Dev();
        devEduardo.setName("Eduardo");
        devEduardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devEduardo.getConteudosInscritos());
        devEduardo.progredir();
        System.out.println("..");
        System.out.println("Conteudos Inscritos" + devEduardo.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devEduardo.getConteudoConcluidos());
        System.out.println("XP" + devEduardo);

        System.out.println("........");

        Dev devLiliane = new Dev();
        devLiliane.setName("Liliane");
        devLiliane.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos" + devLiliane.getConteudosInscritos());
        devLiliane.progredir();
        devLiliane.progredir();
        System.out.println("..");
        System.out.println("Conteudos Inscritos" + devLiliane.getConteudosInscritos());
        System.out.println("Conteudos Concluidos" + devLiliane.getConteudoConcluidos());
        System.out.println("XP" + devLiliane);

        System.out.println("........");

    }
}
