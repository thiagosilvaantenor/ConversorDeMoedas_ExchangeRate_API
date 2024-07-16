package br.com.alura.desafios.conversor_moedas.view;

import br.com.alura.desafios.conversor_moedas.controller.ConsumoApi;
import br.com.alura.desafios.conversor_moedas.model.ConversaoMoedas;

import java.io.IOException;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws IOException, InterruptedException {
        String moedaBase,moedaAlvo;
        Double valor;
        ConsumoApi consumoApi = new ConsumoApi();
        ConversaoMoedas conversao;
        Scanner leitura = new Scanner(System.in);

        String inputValor = "Informe o valor que deseja converter: ";
        int opc = 0;
        while(opc != 7){
            System.out.println("*************************************" +
                    "\nBem vindo/a ao Conversor de Moedas");
            System.out.println("Digite o número da conversão desejada:\n"
                    + "1) Dólar americano para Real brasileiro\n"
                    + "2) Real brasileiro para Dólar\n"
                    + "3) Dólar americano para Peso argentino\n"
                    + "4) Peso argentino para Dólar americano\n"
                    + "5) Dólar americano para Peso columbiano\n"
                    + "6) Peso columbiano para Dólar americano\n"
                    + "7) Sair\n"
                            +"***************************************");
            opc = leitura.nextInt();

            switch (opc){
                case 1:
                    System.out.println(inputValor);
                    valor = leitura.nextDouble();
                    conversao = consumoApi.conversaoDeMoedas("USD","BRL", valor);
                    System.out.println("Valor : " + valor +" [" +conversao.moedaBase() + "]"
                            + " coresponde ao valor => " + conversao.resultadoConversao() +" [" +conversao.moedaAlvo() + "]");
                    break;

                case 2:
                    System.out.println(inputValor);
                    valor = leitura.nextDouble();
                    conversao = consumoApi.conversaoDeMoedas("BRL","USD", valor);
                    System.out.println("Valor : " + valor +" [" +conversao.moedaBase() + "]"
                            + " coresponde ao valor => " + conversao.resultadoConversao() +" [" +conversao.moedaAlvo() + "]");
                    break;
                case 3:
                    System.out.println(inputValor);
                    valor = leitura.nextDouble();
                    conversao = consumoApi.conversaoDeMoedas("USD","ARS", valor);
                    System.out.println("Valor : " + valor +" [" +conversao.moedaBase() + "]"
                            + " coresponde ao valor => " + conversao.resultadoConversao() +" [" +conversao.moedaAlvo() + "]");
                    break;
                case 4:
                    System.out.println(inputValor);
                    valor = leitura.nextDouble();
                    conversao = consumoApi.conversaoDeMoedas("ARS","USD", valor);
                    System.out.println("Valor : " + valor +" [" +conversao.moedaBase() + "]"
                            + " coresponde ao valor => " + conversao.resultadoConversao() +" [" +conversao.moedaAlvo() + "]");
                    break;
                case 5:
                    System.out.println(inputValor);
                    valor = leitura.nextDouble();
                    conversao = consumoApi.conversaoDeMoedas("USD","COP", valor);
                    System.out.println("Valor : " + valor +" [" +conversao.moedaBase() + "]"
                            + " coresponde ao valor => " + conversao.resultadoConversao() +" [" +conversao.moedaAlvo() + "]");
                    break;
                case 6:
                    System.out.println(inputValor);
                    valor = leitura.nextDouble();
                    conversao = consumoApi.conversaoDeMoedas("COP","USD", valor);
                    System.out.println("Valor : " + valor +" [" +conversao.moedaBase() + "]"
                            + " coresponde ao valor => " + conversao.resultadoConversao() +" [" +conversao.moedaAlvo() + "]");
                    break;
                case 7:
                    break;
                default:
                    System.out.println("Erro, opção invalida, tente novamente!");
            }
        }
    }
}
