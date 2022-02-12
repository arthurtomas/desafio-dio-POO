package src;

import src.br.com.dio.desafio.dominio.Bootcamp;
import src.br.com.dio.desafio.dominio.Curso;
import src.br.com.dio.desafio.dominio.Dev;
import src.br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso de Javascript");
        curso2.setDescricao("Descrição curso Javascript");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Descrição mentoria de Java");
        mentoria.setData(LocalDate.now());

//        System.out.println(curso1);
//        System.out.println(curso2);
//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devArthur = new Dev();
        devArthur.setNome("Arthur Barzilay");
        devArthur.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Arthur: "+devArthur.getConteudosInscritos());
        devArthur.progredir();
        devArthur.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Arthur: "+devArthur.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Arthur: "+devArthur.getConteudosConcluidos());
        System.out.println("XP: "+devArthur.calcularTotalXp());

        System.out.println("---------------------------------");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila Cavalcati");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos de Camila: "+devCamila.getConteudosInscritos());
        devCamila.progredir();
        devCamila.progredir();
        devCamila.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos de Camila: "+devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos de Camila: "+devCamila.getConteudosConcluidos());
        System.out.println("XP: "+devCamila.calcularTotalXp());



    }
}
