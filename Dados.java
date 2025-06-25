public class Dados {
    public static void main(String[] args) {
        int quantidade = 1;

        // Lê quantidade de dados se passada como argumento
        if (args.length > 0) {
            try {
                quantidade = Integer.parseInt(args[0]);
                if (quantidade <= 0) throw new NumberFormatException();
            } catch (NumberFormatException e) {
                System.out.println("Quantidade inválida. Usando 1 dado por padrão.");
                quantidade = 1;
            }
        }

        System.out.println("Lançando " + quantidade + " dado(s):\n");

        for (int i = 1; i <= quantidade; i++) {
            int resultado = (int) (Math.random() * 6) + 1;
            System.out.println("Dado " + i + ": " + resultado);
            desenharDado(resultado);
        }
    }

    public static void desenharDado(int numero) {
        String[][] faces = {
            {
                "+-------+",
                "|       |",
                "|   *   |",
                "|       |",
                "+-------+"
            },
            {
                "+-------+",
                "| *     |",
                "|       |",
                "|     * |",
                "+-------+"
            },
            {
                "+-------+",
                "| *     |",
                "|   *   |",
                "|     * |",
                "+-------+"
            },
            {
                "+-------+",
                "| *   * |",
                "|       |",
                "| *   * |",
                "+-------+"
            },
            {
                "+-------+",
                "| *   * |",
                "|   *   |",
                "| *   * |",
                "+-------+"
            },
            {
                "+-------+",
                "| *   * |",
                "| *   * |",
                "| *   * |",
                "+-------+"
            }
        };

        for (String linha : faces[numero - 1]) {
            System.out.println(linha);
        }
        System.out.println();
    }
}