import curso.Curso;
import curso.Disciplina;
import curso.Semestre;
import curso.Aluno;

import java.util.Scanner;

public class Main {

    private static Scanner sc;
    public static void main(String[] args) {
        String userName = "", matricula = "";
        String retStr;
        Aluno aluno;
        //Preenche infromações padrão do curso
        Curso curso = preencheMateriasNoCurso();
        char sexo = 0;
        int idade;
        char SouN = 0;
        int opcoes, automaticoOuManual;
        int semestreAtual, semestreTemp;

        sc = new Scanner(System.in);

        //Coleta de nome do usuário
        do {
            System.out.println("Olá, por favor, insira seu nome:");
            userName = sc.nextLine();
        } while(userName.isEmpty());

        //Coleta de idade do usuário
        do {
            System.out.println(userName + ", por favor, insira sua idade:");
            try {
                idade = sc.nextInt();
                sc.nextLine();
            } catch (Exception e) {
                System.out.println("Por favor, insira um valor numérico válido!");
                idade = -1;
                sc.nextLine();
            }

        } while(idade <= 0);

        //Checagem de idade
        if (idade > 150) {
            System.out.println("Uau, " + idade + "anos! Você deve ter passado por muita coisa na vida...");
            System.out.println("Infelizmente, consideraremos que você possui apenas 150 anos.");
            idade = 150;
        } else if (idade < 18) {
            do {
                System.out.println(userName + ", seus pais deixam você estudar aqui com essa idade? (S ou N)");
                retStr = sc.nextLine();
                if (retStr.length() > 0) {
                    SouN = retStr.charAt(0);
                }
            } while(SouN != 's' && SouN != 'S' && SouN != 'n' && SouN != 'N');

            if (SouN == 's' || SouN == 'S') {
                System.out.println("Ainda bem, pode prosseguir.");
            } else {
                System.out.println("Você não está autorizado, saindo...");
                return;
            }
        }

        //Coleta de sexo do usuário
        do {
            System.out.println("Olá " + userName + ", por favor, insira seu sexo (M ou F):");
            retStr = sc.nextLine();
            if (retStr.length() > 0) {
                sexo = retStr.charAt(0);
            }
        } while(sexo != 'm' && sexo != 'M' && sexo != 'f' && sexo != 'F');

        //Verifica se será utilizado um aluno pré-preenchido, ou se será utilizada as informações atuais do usuário
        do {
            System.out.println(userName + ", escolha uma das opções abaixo:");
            System.out.println("1) Utilizar informações de aluno pré-preenchido;");
            System.out.println("2) Utilizar minhas informações atuais;");

            automaticoOuManual = sc.nextInt();
            sc.nextLine();
        } while(automaticoOuManual < 1 || automaticoOuManual > 2);


        if (automaticoOuManual == 1) {
            aluno = getAlunoDefault();
            getCursoInfoDefault(curso);


        } else {

        }

        do {
            do {
                System.out.println(userName + ", por favor, escolha uma das opções abaixo:");
                System.out.println("1) Listar todas as matérias de um semestre");
                System.out.println("2) Listar todas as matérias de todos os semestres");
                System.out.println("3) Listar matérias concluídas de um semestre");
                System.out.println("4) Listar matérias concluídas de todos os semestres");
                System.out.println("5) Listar matérias em curso de um semestre");
                System.out.println("6) Listar matérias em curso de todos os semestres");
                System.out.println("7) Listar matérias não concluídas de um semestre");
                System.out.println("8) Listar matérias não concluídas de todos os semestres");
                System.out.println("9) Editar semestre");
                System.out.println("0) Sair");
                try {
                    opcoes = sc.nextInt();
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println("Por favor, insira um valor numérico válido!");
                    opcoes = -1;
                    sc.nextLine();
                }
            } while (opcoes < 0);

            switch (opcoes) {
                case 0:
                    System.out.println("Saindo da aplicação...");
                    break;
                case 1:
                    do {
                        System.out.println(userName + ", selecione o semestre (de 1 a 8):");
                        semestreTemp = sc.nextInt();
                        sc.nextLine();
                    } while(semestreTemp < 1 || semestreTemp > 8);
                    curso.getSemestre(semestreTemp).listarDisciplinasSemestre();

                    break;
                case 2:
                    curso.listarTodasDisciplinas();
                    break;
                case 3:
                    do {
                        System.out.println(userName + ", selecione o semestre (de 1 a 8):");
                        semestreTemp = sc.nextInt();
                        sc.nextLine();
                    } while(semestreTemp < 1 || semestreTemp > 8);
                    curso.getSemestre(semestreTemp).listarDisciplinasCompletas();
                    break;
                case 4:
                    curso.listarDisciplinasCursadas();
                    break;
                case 5:
                    do {
                        System.out.println(userName + ", selecione o semestre (de 1 a 8):");
                        semestreTemp = sc.nextInt();
                        sc.nextLine();
                    } while(semestreTemp < 1 || semestreTemp > 8);
                    curso.getSemestre(semestreTemp).listarDisciplinasEmCurso();
                    break;
                case 6:
                    curso.listarDisciplinasEmCurso();
                    break;
                case 7:
                    do {
                        System.out.println(userName + ", selecione o semestre (de 1 a 8):");
                        semestreTemp = sc.nextInt();
                        sc.nextLine();
                    } while(semestreTemp < 1 || semestreTemp > 8);
                    curso.getSemestre(semestreTemp).listarDisciplinasEmFalta();
                    break;
                case 8:
                    curso.listarDisciplinasQueFaltam();
                    break;
                case 9:
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while(opcoes > 0);

        System.out.println("Adeus, " + userName);

        sc.close();
    }

    //Retorna informações predefinidas de um aluno
    private static Aluno getAlunoDefault(){
        Aluno tmpAluno;

        //Aluno predefinido
        tmpAluno = new Aluno("Gustavo", 2, "123123123", 20, 'M');

        return tmpAluno;
    }

    //Preenche com informações predefinidas as informações do aluno
    private static void getCursoInfoDefault(Curso curso) {

        curso.concluirDisciplina(1, 1);
        curso.concluirDisciplina(1, 2);
        curso.concluirDisciplina(1, 3);
        curso.concluirDisciplina(1, 4);
        curso.concluirDisciplina(1, 5);
        curso.concluirDisciplina(1, 6);
        curso.concluirDisciplina(1, 7);

        curso.concluirDisciplina(2, 1);
        curso.concluirDisciplina(2, 2);
        curso.concluirDisciplina(2, 3);
        curso.concluirDisciplina(2, 4);
        curso.concluirDisciplina(2, 5);
        curso.concluirDisciplina(2, 6);
        curso.concluirDisciplina(2, 7);

        curso.inscreverNaDisciplinaEmCurso(3, 1);
        curso.inscreverNaDisciplinaEmCurso(3, 2);
        curso.inscreverNaDisciplinaEmCurso(3, 3);

        return;
    }

    //Preenche as matérias do curso nos semestres do curso
    private static Curso preencheMateriasNoCurso()
    {
        //Preenche informação dos 8 semestres
        Curso tmpCurso;
        Semestre semestreA;
        Semestre semestreB;
        Semestre semestreC;
        Semestre semestreD;
        Semestre semestreE;
        Semestre semestreF;
        Semestre semestreG;
        Semestre semestreH;
        Disciplina discA, discB, discC, discD, discE, discF, discG;

        //Primeiro semestre:
        discA = new Disciplina("Raciocínio Lógico", 4, "60963");
        discB = new Disciplina("Algoritmos e Programação: Fundamentos", 8, "60964");
        discC = new Disciplina("Computação: Conceitos e Tendências da Profissão", 4, "60965");
        discD = new Disciplina("Fundamentos de Álgebra Linear", 4, "60803");
        discE = new Disciplina("Pensamento Computacional", 4, "30850");
        discF = new Disciplina("Desenvolvimento Pessoal e Profissional: Colaboração", 4, "10539");
        discG = new Disciplina("", 0, "");
        semestreA = new Semestre(1, discA, discB, discC, discD, discE, discF, discG, "2023-1");

        //Segundo semestre:
        discA = new Disciplina("Matemática para Computação", 4, "60662");
        discB = new Disciplina("Algoritmos e Programação: Estruturas Lineares", 8, "60966");
        discC = new Disciplina("Probabilidade e Inferência Estatística", 4, "99274");
        discD = new Disciplina("Projeto de Sistemas Digitais", 4, "60967");
        discE = new Disciplina("Comunicação da Ciência", 4, "10534");
        discF = new Disciplina("Ética e Tecnocultura", 4, "10536");
        discG = new Disciplina("Desenvolvimento Pessoal e Profissional: Liderança", 1, "10540");
        semestreB = new Semestre(2, discA, discB, discC, discD, discE, discF, discG, "2023-2");

        //Terceiro semestre:
        discA = new Disciplina("Fundamentos de Sistemas Operacionais", 4, "60968");
        discB = new Disciplina("Análise e Projeto de Algoritmos", 4, "60969");
        discC = new Disciplina("Algoritmos e Programação: Árvores e Ordenação", 4, "60970");
        discD = new Disciplina("Engenharia de Software: Requisitos", 4, "60971");
        discE = new Disciplina("Cálculo Diferencial", 4, "60800");
        discF = new Disciplina("Empreendedorismo e Solução de Problemas", 4, "50758");
        discG = new Disciplina("Desenvolvimento Pessoal e Profissional: Protagonismo", 1, "10541");
        semestreC = new Semestre(3, discA, discB, discC, discD, discE, discF, discG, "2024-1");

        //Quarto semestre
        discA = new Disciplina("Algoritmos e Programação: Grafos, Hashing e Heaps", 4, "60972");
        discB = new Disciplina("Redes de Computadores: Aplicação e Transporte", 4, "60973");
        discC = new Disciplina("Fundamentos de Banco de Dados", 4, "60974");
        discD = new Disciplina("Análise e Aplicação de Sistemas Operacionais", 4, "60975");
        discE = new Disciplina("Engenharia de Software: Análise", 4, "60976");
        discF = new Disciplina("Análise de dados para tomada de decisão", 4, "10533");
        discG = new Disciplina("Desenvolvimento Pessoal e Profissional: Interfaces", 1, "10542");
        semestreD = new Semestre(4, discA, discB, discC, discD, discE, discF, discG, "2024-2");

        //Quinto semestre
        discA = new Disciplina("Linguagens Formais e Autômatos", 4, "60977");
        discB = new Disciplina("Paradigmas de Programação", 4, "60023");
        discC = new Disciplina("Processamento Gráfico", 4, "60375");
        discD = new Disciplina("Inteligência Artificial e Aprendizado de Máquina", 4, "60978");
        discE = new Disciplina("Engenharia de Software: Projeto", 4, "60979");
        discF = new Disciplina("Cálculo Integral", 4, "60801");
        discG = new Disciplina("Desenvolvimento Pessoal e Profissional: Conexões", 1, "10543");
        semestreE = new Semestre(5, discA, discB, discC, discD, discE, discF, discG, "2025-1");

        //Sexto semestre
        discA = new Disciplina("Teoria da Computação", 4, "60031");
        discB = new Disciplina("Redes de Computadores: Internetworking, Roteamen", 4, "60980");
        discC = new Disciplina("Sistemas de Gerência de Banco de Dados", 4, "60981");
        discD = new Disciplina("Arquitetura de Sistemas Digitais", 4, "60982");
        discE = new Disciplina("Teoria da Informação: Compressão e Criptografia", 4, "60983");
        discF = new Disciplina("Elaboração de Projetos", 4, "93903");
        discG = new Disciplina("Engenharia de Software: Implementação e Teste", 4, "60984");
        semestreF = new Semestre(6, discA, discB, discC, discD, discE, discF, discG, "2025-2");

        //Sétimo semestre
        discA = new Disciplina("Tradutores", 4, "93926");
        discB = new Disciplina("Sistemas Distribuídos", 4, "93923");
        discC = new Disciplina("Design de Interação Humano-Computador", 4, "60985");
        discD = new Disciplina("Computação de Alto Desempenho", 4, "60986");
        discE = new Disciplina("Computação Gráfica", 4, "60381");
        discF = new Disciplina("Projeto Aplicado I (Trilha)", 4, "---");
        discG = new Disciplina("Optativa (Trilha)", 4, "---");
        semestreG = new Semestre(7, discA, discB, discC, discD, discE, discF, discG, "2026-1");

        //Oitavo semestre
        discA = new Disciplina("Internet das Coisas: Sensores, Protocolos e Aplicações", 4, "60988");
        discB = new Disciplina("Ciência de Dados e Big Data", 4, "60989");
        discC = new Disciplina("Simulação e Modelagem de Sistemas", 4, "65072");
        discD = new Disciplina("Projeto Aplicado II (Trilha)", 4, "---");
        discE = new Disciplina("Optativa (Trilha)", 4, "---");
        discF = new Disciplina("Optativa", 4, "---");
        discG = new Disciplina("", 0, "");
        semestreH = new Semestre(8, discA, discB, discC, discD, discE, discF, discG, "2026-2");

        //Preenche o curso com os semestres
        tmpCurso = new Curso("Ciências da Computação", "Noturno", semestreA, semestreB, semestreC, semestreD, semestreE, semestreF, semestreG, semestreH);

        //Retorna o curso com os semestres preenchidos
        return tmpCurso;
    }
}