import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class M2 {

    static Scanner sc;

    // os comentários ocupam imenso espaço então apaga aqueles que deixares de necessitar porfa

    // troquei a ordem dos métodos, agr eles estão acima da main
    // e estão por ordem de uso

    // mudei os métodos para serem private, já que é o mais correto
    // sem estarmos a usar classes ( o main tem de ser public )

    // adicionei 2 métodos para ler o input e validar-lo, o nosso programa não pode crashar
    // se o utilizador for estupído

    private static int readIntInRange(int minInput, int maxInput){
        int userInput;

        do{ userInput = sc.nextInt(); } while(userInput < minInput || userInput > maxInput);

        return userInput;
    }

    private static String readNonEmptyLine(){
        String userInput;

        do{ userInput = sc.nextLine(); } while(userInput.isEmpty());

        return userInput;
    }

    // mudei o nome deste método de "extrairElementos" para "countStringElements"
    // de forma a indiciar o tipo de valor que retorna (int)

    private static int countStringElements(String frase) {
        // Contar quantas vírgulas existem para saber a dimensão do array (nº de elementos = nº de vírgulas + 1)
        int numOfElements = 1;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == ',') {
                numOfElements++;
            }
        }
        return numOfElements;
    }

    // mudei o nome deste método de "extractNames" para "extractStringElements"
    // de forma a ser mais explicito o parametro que recebe e para ser mais genérico
    // (com nomes de variaveis aproveita para ser o mais explicito possivel
    // ainda que o nome fique grande, hoje em dia esse é o standart por causa do
    // auto-complete)

    // mudei a variável local "peoplesName" para "string" para proceder com
    // o processo de tornar mais generico o método.

    // mudei a variável local "people" para "NumOfElements" pelo mesmo motivo

    //mudei a variável local "names" para "elementsArray"

    private static String[] extractStringElements(String string, int NumOfElements) {
        String[] elementsArray = new String[NumOfElements];

        for (int index = 0; index < NumOfElements - 1; index++) {
            int position = string.indexOf(",");
            elementsArray[index] = string.substring(0, position).trim();
            string = string.substring(position + 1);
        }
        elementsArray[NumOfElements - 1] = string.trim();

        return elementsArray;
    }

    // este método era chamado "saveData" que não é explícito para
    // "readMatrixData" sendo a matriz um array 2D

    // mudei o pârametro/variável local "socialMedia" para "matrixDimensions"

    // mudei o nome das variáveis de iteração de "people" e "app" para "collumn"
    // e "row" respetivamente

    //removi o parâmetro "Scanner sc" pois vamos optar por declarar um scanner global

    // mudei o método para ser do tipo int[][] ao invés de void

    // não percebo o porquê de teres posto um parametro para entrarem as dimensões
    // da matriz em que ele proprio é uma matriz então mandei isso fora e simplifiquei:
    // dois parametros: numOfCollumns, numOfRows

    private static int[][] readMatrixData(int numOfCollumns, int numOfRows){

        int[][] matrixData = new int[numOfCollumns][numOfRows];

        for (int collumn = 0; collumn <= numOfCollumns; collumn++) {
            for (int row = 0; row <= numOfRows; row++) {
                matrixData[collumn][row] = readIntInRange(0,Integer.MAX_VALUE);
            }
        }
        return matrixData;
    }
    // mudei várias coisas no main de tal forma que os métodos funcionassem
    // de acordo com o seu propósito.

    // mudei o array string "person" para "personList" e "socialMedia" para "socialMediaList"

    public static void main(String[] args){
        sc = new Scanner(System.in);
        System.out.println("Escolha o seu método de input: %n1 - Ficheiro de texto%n2 - Input do teclado");
        int choice = readIntInRange (1,2)
        if (choice == 1) sc = new Scanner(
        else sc = new Scanner (System.in);
        String peoplesNames = readNonEmptyLine();
        int numOfPeople = countStringElements(peoplesNames);
        String[] personList = extractStringElements(peoplesNames, numOfPeople);

        String socialMediaName = readNonEmptyLine();
        int numSocialMedia = countStringElements(socialMediaName);
        String[] socialMediaList = extractStringElements(socialMediaName, numSocialMedia);

        int[][] timeMatrix = readMatrixData(numSocialMedia,numOfPeople);
    }


}