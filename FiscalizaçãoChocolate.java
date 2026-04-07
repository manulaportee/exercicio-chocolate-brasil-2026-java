import java.util.Scanner;

public class FiscalizaçãoChocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double teorcacau;
        String tipoChocolate;
        int quantidadeAçúcar;

        System.out.println("Insira a porcentagem de sólidos de cacau encontrada na amostra (SOMENTE NÚMEROS): ");
        teorcacau = scanner.nextDouble();

        //A estrutura if else a seguir calcula a porcentagem do teor do cacau das amnostras. Se for menor que 25 = Produto fake. Entre 25 ou 35 = Comum. Maior que 35 = Alta Qualidade.
        if (teorcacau < 25){
            System.out.println("ALERTA: Produto 'Fake'. 'Sabor Chocolate'.");
        } else if (teorcacau >= 25 && teorcacau <= 35){
            System.out.println("Chocolate Comum (Padrão Nacional Atual)");
        } else {
            System.out.println("Chocolate de Alta Qualidade (Padrão Internacional/UE)");
        }

        System.out.println("Insira o tipo de chocolate (AO_LEITE ou AMARGO): ");
        tipoChocolate = scanner.nextLine();

        scanner.nextLine();
       
        System.out.println("Insira a quantidade de açúcar (SOMENTE NÚMERO):");
        quantidadeAçúcar = scanner.nextInt();

        //A estrutura if else a seguir traz o status do chocolate, através da análise do seu tipo e a quantidade de açúcar, recebendo as classificações abaixo:
        if (tipoChocolate.equalsIgnoreCase("AO_LEITE") && quantidadeAçúcar > 15){
            System.out.println("Doce de leite com cacau (Excesso de açúcar)");
        } else {
            System.out.println("Chocolate balanceado");
        }

        System.out.println("Insira o valor do ovo de páscoa (SOMENTE NÚMEROS): ");
        double valor = scanner.nextDouble();
        System.out.println("Qual a nota de pureza? ");
        double pureza = scanner.nextDouble();

        //A estrutura if else a seguir calcula o valor do ovo de páscoa e a nota de pureza. Após isso classifica entre REJEITADO e APROVADO:
        if (valor > 100 || pureza < 5){
            System.out.println("REJEITADO PARA EXPORTAÇÃO: Custo-benefício fora dos padrões");
        } else {
            System.out.println("APROVADO: Produto competitivo para o mercado externo");
        }

        scanner.close();
    }
}
