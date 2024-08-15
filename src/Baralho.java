import java.util.Random;

class Baralho {

    private Carta[] cartas;
    private int topo;

    public Baralho() {
        cartas = new Carta[56];  // 52 cartas + 4 coringas
        topo = 0;
        String[] naipes = {"Copas", "Ouros", "Espadas", "Paus"};
        String[] nomes = {"Ás", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};

        // Inicializando as 52 cartas
        for (String naipe : naipes) {
            for (String nome : nomes) {
                cartas[topo++] = new Carta(nome, naipe);
            }
        }

        // Adicionando os 4 coringas
        for (int i = 0; i < 4; i++) {
            cartas[topo++] = new Carta("Coringa", "Coringa");
        }

        // Resetando o topo para o início do baralho
        topo = 0;
    }

    public void embaralhar() {
        Random random = new Random();
        for (int i = 0; i < cartas.length; i++) {
            int j = random.nextInt(cartas.length);
            Carta temp = cartas[i];
            cartas[i] = cartas[j];
            cartas[j] = temp;
        }
    }

    public Carta distribuirCarta() {
        if (hasCarta()) {
            return cartas[topo++];
        } else {
            return null;
        }
    }

    public boolean hasCarta() {
        return topo < cartas.length;
    }

    public void imprimirBaralho() {
        for (int i = topo; i < cartas.length; i++) {
            System.out.println(cartas[i]);
        }
    }
}