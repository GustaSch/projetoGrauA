import curso.Disciplina;
import curso.Semestre;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private static void preencheSemestresAlunos()
    {
        //Preenche informação dos 8 semestres
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

        //Segundo semestre:
        discA = new Disciplina("Matemática para Computação", 4, "60662");
        discB = new Disciplina("Algoritmos e Programação: Estruturas Lineares", 8, "60966");
        discC = new Disciplina("Probabilidade e Inferência Estatística", 4, "99274");
        discD = new Disciplina("Projeto de Sistemas Digitais", 4, "60967");
        discE = new Disciplina("Comunicação da Ciência", 4, "10534");
        discF = new Disciplina("Ética e Tecnocultura", 4, "10536");
        discG = new Disciplina("Desenvolvimento Pessoal e Profissional: Liderança", 1, "10540");


        //Terceiro semestre:
        discA = new Disciplina("Fundamentos de Sistemas Operacionais", 4, "60968");
        discB = new Disciplina("Análise e Projeto de Algoritmos", 4, "60969");
        discC = new Disciplina("Algoritmos e Programação: Árvores e Ordenação", 4, "60970");
        discD = new Disciplina("Engenharia de Software: Requisitos", 4, "60971");
        discE = new Disciplina("Cálculo Diferencial", 4, "60800");
        discF = new Disciplina("Empreendedorismo e Solução de Problemas", 4, "50758");
        discG = new Disciplina("Desenvolvimento Pessoal e Profissional: Protagonismo", 1, "10541");


        //Quarto semestre
        discA = new Disciplina("Algoritmos e Programação: Grafos, Hashing e Heaps", 4, "60972");
        discB = new Disciplina("Redes de Computadores: Aplicação e Transporte", 4, "60973");
        discC = new Disciplina("Fundamentos de Banco de Dados", 4, "60974");
        discD = new Disciplina("Análise e Aplicação de Sistemas Operacionais", 4, "60975");
        discE = new Disciplina("Engenharia de Software: Análise", 4, "60976");
        discF = new Disciplina("Análise de dados para tomada de decisão", 4, "10533");
        discG = new Disciplina("Desenvolvimento Pessoal e Profissional: Interfaces", 1, "10542");

        //Quinto semestre
        discA = new Disciplina("Linguagens Formais e Autômatos", 4, "60977");
        discB = new Disciplina("Paradigmas de Programação", 4, "60023");
        discC = new Disciplina("Processamento Gráfico", 4, "60375");
        discD = new Disciplina("Inteligência Artificial e Aprendizado de Máquina", 4, "60978");
        discE = new Disciplina("Engenharia de Software: Projeto", 4, "60979");
        discF = new Disciplina("Cálculo Integral", 4, "60801");
        discG = new Disciplina("Desenvolvimento Pessoal e Profissional: Conexões", 1, "10543");

        //Sexto semestre
        discA = new Disciplina("Teoria da Computação", 4, "60031");
        discB = new Disciplina("Redes de Computadores: Internetworking, Roteamen", 4, "60980");
        discC = new Disciplina("Sistemas de Gerência de Banco de Dados", 4, "60981");
        discD = new Disciplina("Arquitetura de Sistemas Digitais", 4, "60982");
        discE = new Disciplina("Teoria da Informação: Compressão e Criptografia", 4, "60983");
        discF = new Disciplina("Elaboração de Projetos", 4, "93903");
        discG = new Disciplina("Engenharia de Software: Implementação e Teste", 4, "60984");

        //Sétimo semestre
        discA = new Disciplina("Tradutores", 4, "93926");
        discB = new Disciplina("Sistemas Distribuídos", 4, "93923");
        discC = new Disciplina("Design de Interação Humano-Computador", 4, "60985");
        discD = new Disciplina("Computação de Alto Desempenho", 4, "60986");
        discE = new Disciplina("Computação Gráfica", 4, "60381");
        discF = new Disciplina("Projeto Aplicado I (Trilha)", 4, "---");
        discG = new Disciplina("Optativa (Trilha)", 4, "---");

        //Oitavo semestre
        discA = new Disciplina("Internet das Coisas: Sensores, Protocolos e Aplicações", 4, "60988");
        discB = new Disciplina("Ciência de Dados e Big Data", 4, "60989");
        discC = new Disciplina("Simulação e Modelagem de Sistemas", 4, "65072");
        discD = new Disciplina("Projeto Aplicado II (Trilha)", 4, "---");
        discE = new Disciplina("Optativa (Trilha)", 4, "---");
        discF = new Disciplina("Optativa", 4, "---");
        discG = new Disciplina("", 0, "");


    }
}