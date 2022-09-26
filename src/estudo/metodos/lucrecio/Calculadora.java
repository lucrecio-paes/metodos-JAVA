package estudo.metodos.lucrecio;

public class Calculadora {

    public static void soma(double numero1,double numero2){
        double resultado = numero1 + numero2;

        System.out.println("A soma de " + numero1 + " mais " + numero2 + " è igual há: " + resultado);
    }

    public static void subtracao(double numero1,double numero2){
        double resultado = numero1 - numero2;

        System.out.println("A subtração de " + numero1 + " menos " + numero2 + " è igual há: " + resultado);
    }

    public static void multplicacao(double numero1,double numero2){
        double resultado = numero1 * numero2;

        System.out.println("A multplicação de " + numero1 + " vezes " + numero2 + " è igual há: " + resultado);
    }

    public static void divisao(double numero1,double numero2){
        double resultado = numero1 / numero2;

        System.out.println("A Divisão de " + numero1 + " dividido por " + numero2 + " è igual há: " + resultado);
    }



}
