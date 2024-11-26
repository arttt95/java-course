class Scratch {
    public static void main(String[] args) {

        /*String nome = "Cristiano";
        String[] nomes = {
                "Cristiano",
                "Messi",
                "Itachi",
                "Shisui"
        };

        int[] numeros = {
                200,
                300,
                500,
                800
        };

        Integer[] numeros2 = {};*/

        String[] user1 = {
                "João",
                "25"
        };

        String[] user2 = {
                "Maria",
                "19"
        };

        String[] user3 = {
                "Pedro",
                "32"
        };

        String[][] conversas = {
                user1,
                user2,
                user3
        };

        System.out.println("Resultado: " + conversas[2][0]);

    }
}