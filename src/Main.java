public class Main {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        System.out.println("Baralho original:");
        baralho.imprimirBaralho();

        baralho.embaralhar();
        System.out.println("\nBaralho embaralhado:");
        baralho.imprimirBaralho();

        System.out.println("\nDistribuindo cartas:");
        while (baralho.hasCarta()) {
            System.out.println("Carta distribuída: " + baralho.distribuirCarta());
        }

        System.out.println("\nVerificando se ainda há cartas no baralho: " + baralho.hasCarta());
    }
}