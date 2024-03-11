import java.util.Scanner;

public class CalculadoraDeIdade {
    public static void main(String[] args) {
        //entrada
        Scanner leitor = new Scanner(System.in);
        int anoNacimento = leitor.nextInt();

        //processamento
        int resultadoProcesamento = 2024 - anoNacimento;

        //saída
        System.out.print(resultadoProcesamento);
    }
}
