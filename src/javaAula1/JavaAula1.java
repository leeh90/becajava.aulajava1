package javaAula1;

import java.util.Scanner;

public class JavaAula1 {

    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner leitura = new Scanner(System.in);


        int i =0;
        System.out.println("digite um valor:");
        i = leitura.nextInt();

        switch(i){
        case 0:
            System.out.println("i é igual a 0");
            break;

        case 1:
            System.out.println("i é igual a 1");
            break;

        case 2:
            System.out.println("i é igual a 2");
            break;

        default:
            System.out.println("valor invalido");
            break;

        }



        /*int i = 0;
        int x =0;

        while( i <= 10) {
            System.out.println(i);
            ++i;
        }


        while( x <= 10) {
            System.out.println(x);
            ++x;
        }*/





        /*for(int i=0;i <= 10; i++ ) {
            System.out.println(i);
        }*/






        /*if( 2 > 1) {
        System.out.println("dois é maior que 1");

        }
        else {
            System.out.println("algo esta errado");
            }
        */}
}