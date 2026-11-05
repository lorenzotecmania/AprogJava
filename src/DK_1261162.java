import java.util.Scanner;

public class DK_1261162 {

    static Scanner sc = new Scanner(System.in);

    final static int MIN_BARRACAS = 1;
    final static int MAX_BARRACAS = 80;

    final static int MIN_COLABORADORES = 2;
    final static int MAX_COLABORADORES = 10;

    public static boolean validarQnt(int qnt,int min, int max){
        boolean valido = false;
        if (qnt >= min && qnt <= max) valido = true;
        return valido;
    }

    public static double calcularValorTotal(int qntBarracas, int qntTotalColaboradores){
        return (qntBarracas*300)+(qntTotalColaboradores*25);
    }

    public static double calcularMediaColabBarraca(int qntBarracas, int qntTotalColaboradores){
        return (double) qntTotalColaboradores /qntBarracas;
    }

    public static void mostrarResultado(double valorTotal, double mediaColabBarraca){
        System.out.printf(
                "valor total a receber: %.2f €%nMédia de colaboradores por barraca: %.2f%nPercentagem de barracas pequenas: ", valorTotal, mediaColabBarraca);
    }

    public static void main(String[] args){

        int qntBarracas = 0;
        int qntColaboradores = 0;
        int qntTotalColaboradores = 0;
        double valorTotal = 0;
        double mediaColabBarraca = 0;

        while (!validarQnt(qntBarracas,MIN_BARRACAS,MAX_BARRACAS)) {qntBarracas = sc.nextInt();}

        for (int i = qntBarracas; i > 0; i--) {
            qntBarracas = 0;
            System.out.println(qntBarracas);
            while (!validarQnt(qntColaboradores, MIN_COLABORADORES, MAX_COLABORADORES)) {
                qntColaboradores = sc.nextInt();
            }
            qntTotalColaboradores += qntColaboradores;
        }
        valorTotal = calcularValorTotal(qntBarracas,qntTotalColaboradores);
        mostrarResultado(valorTotal,mediaColabBarraca);

    }
}
