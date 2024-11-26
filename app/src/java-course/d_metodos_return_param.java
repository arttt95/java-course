class Funcionario {

    // Atributo
    double salario; // 1990,50

    double calcularSalarioComDesconto(double bonus) {

        /*
        1000 até 2000 (8%)
        2000 até 3000 (9%)
        */

        /*double desconto;

        if(salario <1000) {
            desconto = 1;
        } else if (salario >= 1000 && salario < 2000) {
            desconto = 0.08;
        } else if (salario >= 2000 && salario < 3000) {
            desconto = 0.09;
        } else {
            desconto = 0.1;
        }*/

        double salarioComDesconto = salario - 20;
//        System.out.println("Total com desconto: " + totalComDesconto);

        return salarioComDesconto + bonus;

    }

}

class CarrinhoCompras {

    double calcularValorFrete( String cep ) {

        // Calculo do frete
        return 20;

    }
}

class Scratch {
    public static void main(String[] args) {

        /*// Tela do Funcionário

        Funcionario cristiano = new Funcionario();
        cristiano.salario = 1000;
        double salarioTotal = cristiano.calcularSalarioComDesconto(80);

        System.out.println("Total salario: " + salarioTotal);*/

        CarrinhoCompras carshop = new CarrinhoCompras();
        double valorFrete = carshop.calcularValorFrete("13013-051");
        System.out.println(valorFrete);

    }
}