import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;
import java.util.ConcurrentModificationException;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descricao curso java");
        curso1.setCargaHoraria(8);

//        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descricao curso js");
        curso2.setCargaHoraria(4);

//        System.out.println(curso2);

//        Conteudo conteudo = new Curso(); // exemplo de Polimorfismo

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());

//        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRene = new Dev();
        devRene.setName("Rene");
        devRene.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Rene: " + devRene.getConteudosInscritos());
        devRene.progredir();
        devRene.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Rene: " + devRene.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Rene: " + devRene.getConteudosConcluidos());
        System.out.println("XP: " + devRene.calcularTotalXp());

        System.out.println("------");;

        Dev devJoao = new Dev();
        devJoao.setName("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Joao: " + devJoao.getConteudosInscritos());
        System.out.println("XP: " + devJoao.calcularTotalXp());

        System.out.println("Conteudos Concluidos Joao: " + devJoao.getConteudosConcluidos());
    }
}