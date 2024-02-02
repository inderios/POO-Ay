package emAula.br.dcx.ayla.quiz;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProgramaQuiz {
    private static List<PerguntaME> perguntas = new LinkedList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        boolean continuar = true;
        while (continuar) {
            System.out.println("Digite uma opção: \n1.Cadastrar pergunta \n2.Responder quiz");
            String opcao = sc.nextLine();
            if (opcao.equals("1")) {
                PerguntaME pergunta = new PerguntaME();
                System.out.println("Digite o enunciado da pergunta");
                pergunta.setEnunciado(sc.nextLine());
                System.out.println("Quantas alternativas tem essa pergunta?");
                int quantAlt = Integer.parseInt(sc.nextLine());
                String [] alternativas = new String[quantAlt];
                for (int i = 0; i < quantAlt; i++ ) {
                    System.out.println("Digite a proxima alternativa");
                    if (i == quantAlt-1) {
                        System.out.println("Digite a última alternativa");
                    }
                    alternativas[i] = sc.nextLine();
                }
                pergunta.setAlternativas(alternativas);
                System.out.println("Digite a resposta correta");
                pergunta.setRespostaCorreta(sc.nextLine());
                perguntas.add(pergunta);
                System.out.println("Pergunta cadastrada com sucesso");
            } else if (opcao.equals("2")) {
                if (perguntas.size()== 0) {
                    System.out.println("Nenhuma pergunta foi cadastrada!");
                    continue;
                } else if (perguntas.size() >= 1) {
                    for(PerguntaME s: perguntas) {
                        int numero = 0;
                        System.out.println( numero + "" + s.getEnunciado());
                        numero++;
                    }
                    int input = Integer.parseInt(sc.nextLine());
                    quiz(perguntas.get(input));
                }
            } else if (opcao.equals("3")) {
                continuar = false;
            }
        }
        sc.close();
    }
    public static void quiz(PerguntaME quiz) {
        System.out.println(quiz.getEnunciado());
        int quantAlternativas = quiz.getAlternativas().length;
        for (int i = 0; i < quantAlternativas; i++) {
            System.out.println(i + "" + quiz.getAlternativas()[i]);
        }
        int input = Integer.parseInt(sc.nextLine());
        while (true){
            System.out.println();
            if (input > quantAlternativas || input < quantAlternativas) {
                System.out.println("Essa alternativa não exister");
                continue;
            } else {
                if (quiz.getAlternativas()[input].equals(quiz.getRespostaCorreta())) {
                    System.out.println("Parabens, você acertou");
                }else {
                    System.out.println("Errada!");
                }
            }
        }
    }
}
