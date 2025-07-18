// Define o pacote onde a classe está localizada
package atividades.aula04;

// Importa a classe Scanner para permitir a leitura de dados do teclado
import java.util.Scanner;

// Declaração da classe principal com o nome Aula04_02
public class Aula04_02 {

    // Método que lê a temperatura digitada pelo usuário
    public static double lerTemperatura(Scanner scanner) {
        // Solicita ao usuário que digite a temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        // Retorna o valor digitado (tipo double)
        return scanner.nextDouble();
    }

    // Método que converte de Celsius para Fahrenheit
    public static double converterParaFahrenheit(double celsius) {
        // Aplica a fórmula da conversão e retorna o resultado
        return (celsius * 9 / 5) + 32;
    }

    // Método que converte de Celsius para Kelvin
    public static double converterParaKelvin(double celsius) {
        // Soma 273.15 ao valor em Celsius para obter Kelvin
        return celsius + 273.15;
    }

    // Método que exibe os resultados das conversões
    public static void exibirResultados(double fahrenheit, double kelvin) {
        // Mostra o resultado em Fahrenheit
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit + " °F");
        // Mostra o resultado em Kelvin
        System.out.println("Temperatura em Kelvin: " + kelvin + " K");
    }

    // Método principal do programa (ponto de entrada)
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler dados do teclado
        Scanner scanner = new Scanner(System.in);

        // Chama o método para ler a temperatura digitada e armazena em 'celsius'
        double celsius = lerTemperatura(scanner);

        // Converte para Fahrenheit usando o método correspondente
        double fahrenheit = converterParaFahrenheit(celsius);

        // Converte para Kelvin usando o método correspondente
        double kelvin = converterParaKelvin(celsius);

        // Chama o método que exibe os resultados das conversões
        exibirResultados(fahrenheit, kelvin);

        // Encerra o uso do Scanner para liberar recursos
        scanner.close();
    }

}
