package exemplo09;

public class Principal {

    public static void main(String[] args) {

        String segmento = "eletrônico";
        double valor = 500;

        if (segmento.equals("eletrônico")) {
            if (valor >= 500) {
                System.out.println("Desconto de 20%, total R$ " + valor * 0.8);
            } else {
                System.out.println("Desconto de 10%, total R$" + valor * 0.9);
            }

        } else {
            if (valor >= 500) {
                System.out.println("Desconto de 5%, total R$ " + valor * 0.95);
            } else {
                System.out.println("Sem desconto, total" + valor);
            }
        }
    }
}
