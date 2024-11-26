class Scratch {
    public static void main(String[] args) {

        /*
        < 200 -> Não tem desconto
        201 e 400 -> 20% de desconto
        401 e 800 - 30% de desconto
        > 800 - 40% de desconto
        */

        /*
        byte numero1 = 10;
        byte numero2 = 20;

        double compras = 801;

        //Testando o desconto
        if (compras <= 200) {
            System.out.println("Não tem desconto!");
        } else if (compras > 200 && compras <= 400) {
            System.out.println("Desconto de 20%");
        } else if (compras > 400 && compras <= 800) {
            System.out.println("Desconto de 30%");
        } else {
            System.out.println("Desconto de 40%");
        }*/

        double compras = 400;
        int idade = 12;

        /*if (idade >= 18) {
            System.out.println("Maior idade");
        } else {
            System.out.println("Menor idade");
        }*/

//        String texto = idade >= 18 ? "Maior idade" : "Menor idade";
        /*
        int desconto = compras >= 200 ? 20 : 0;
        System.out.println("Resultado: " + desconto);*/

        int opcao = 4;

        switch (opcao) {
            case 1 :
                System.out.println("Saldo atual");
                break;
            case 2 :
                System.out.println("Extrato");
                break;
            case 3 :
                System.out.println("Cartões de crédito");
                break;
            default :
                System.out.println("Nenhuma opção selecionada");

        }


    }
}