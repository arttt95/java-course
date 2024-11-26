class Jogador { // Modelo utiliza Upper Camel Case

    // Atributos utilizam Lower Camel Case
    String kart;
    String pneu;
    String planador;

    void acelerar() { // Métodos utilizam Lower Camel Case
        System.out.println("Acelerar: " + pneu);
    }

}

class Scratch {
    public static void main(String[] args) {

        Jogador jogador1 = new Jogador();
        jogador1.kart = "Esportivo";
        jogador1.pneu = "Pneu de ferro";
        jogador1.planador = "Planador de gelo";

        jogador1.acelerar();

        /* Pista */
        Jogador computador = new Jogador();
        computador.kart = "Clássico";
        computador.pneu = "Avançado";
        computador.planador = "Planador de terra";

        computador.acelerar();

    }
}

// Modelo
// Entidade
// Identidade
// Características (atributos)
// Ações (métodos)