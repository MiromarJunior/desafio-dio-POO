package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descrição curso Java");
        curso.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("Descrição curso Js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());

        // System.out.println(curso);
        // System.out.println(curso2);
        // System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devMiromar = new Dev();
        devMiromar.setNome("Miromar");
        devMiromar.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devMiromar.getNome() + " : \n" + devMiromar.getConteudosInscritos());
        devMiromar.progredir();
        devMiromar.progredir();
        devMiromar.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos " + devMiromar.getNome() + " : \n" + devMiromar.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos " + devMiromar.getNome() + " : \n" + devMiromar.getConteudosConcluidos());
        System.out.println("XP : "+devMiromar.calcularTotalXp());
        System.out.println("------------------------");


        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos " + devCamila.getNome() + " : \n" + devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos " + devCamila.getNome() + " : \n" + devCamila.getConteudosInscritos());

        System.out.println("Conteúdos Concluídos " + devCamila.getNome() + " : \n" + devCamila.getConteudosConcluidos());
        System.out.println("XP : "+devCamila.calcularTotalXp());

    }
}
