class Scratch {
    public static void main(String[] args) {

        String[] postagens = {
                "Fui a praia...",
                "Fazendo trilha",
                "Viagem para o Nordeste",
                "Estudando Java e Kotlin"
        };

        int num = 0;

        while(num <= 3) {
            System.out.println(" - " + postagens[num]);
            System.out.println("----------------------");
            num++;
        }

    }
}