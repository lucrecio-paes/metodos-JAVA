package estudo.metodos.lucrecio;

public class Main {
    public static void main(String[] args){

        //Calculadora
        System.out.println("Exercicio Calculadora");
        Calculadora.soma(5,5);
        Calculadora.subtracao(10,2);
        Calculadora.multplicacao(2,5);
        Calculadora.divisao(10,100);


    // Mensagem
        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

    // Empréstimo
        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

}
    }
