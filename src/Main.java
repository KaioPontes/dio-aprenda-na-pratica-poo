import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição Curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição Curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria em Java");
        mentoria.setDescricao("Descrição mentoria Java");
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

        Dev devKaio = new Dev();
        devKaio.setNome("Kaio");
        devKaio.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Kaio" + devKaio.getConteudosInscritos());

        devKaio.progredir();
        devKaio.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Kaio" + devKaio.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Kaio" + devKaio.getConteudosConcluidos());
        System.out.println("XP:" + devKaio.calcularTotalXp());

        System.out.println("-------");

        Dev devOlivia = new Dev();
        devOlivia.setNome("Olivia");
        devOlivia.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos Inscritos Olivia" + devOlivia.getConteudosInscritos());
        devOlivia.progredir();
        devOlivia.progredir();
        devOlivia.progredir();
        System.out.println("-");
        System.out.println("Conteudos Inscritos Olivia" + devOlivia.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Olivia" + devOlivia.getConteudosConcluidos());
        System.out.println("XP:" + devOlivia.calcularTotalXp());



    }
}
