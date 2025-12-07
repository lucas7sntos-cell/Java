package desafio.dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        /*System.out.println( curso1 );
        System.out.println( curso2 );
        System.out.println( mentoria );*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Lucas : " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos de Lucas  : " + devLucas.getConteudosInscritos());
        System.out.println("Conteudos Concluidos de Lucas : " + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularTotalXp());
        System.out.println("-------");

        Dev DevJhonatan = new Dev();
        DevJhonatan.setNome("Jhonatan");
        DevJhonatan.inscreverBootcamp(bootcamp);
        System.out.println("Conteudos inscritos de Jhonatan : " + DevJhonatan.getConteudosInscritos());
        DevJhonatan.progredir();
        DevJhonatan.progredir();
        DevJhonatan.progredir();
        System.out.println("-");
        System.out.println("Conteudos inscritos de Jhonatan : " + DevJhonatan.getConteudosInscritos());
        System.out.println("Conteudos concluidos de Jhonatan : " + DevJhonatan.getConteudosConcluidos());
        System.out.println("XP: " + DevJhonatan.calcularTotalXp());
        System.out.println("-------");
       
        

        }

    }
    

