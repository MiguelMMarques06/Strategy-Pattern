public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE CÁLCULO DE MÉDIAS - PADRÃO STRATEGY ===\n");

        System.out.println("=== MÉDIA ARITMÉTICA ===");
        testarEstrategia(new Aritmetica());

        System.out.println("\n=== MÉDIA GEOMÉTRICA ===");
        testarEstrategia(new Geometrica());
    }

    private static void testarEstrategia(MediaStrategy estrategia) {
        Disciplina disciplina = new Disciplina(estrategia);
        disciplina.setNome("Padrões de Desenvolvimento");
        disciplina.setP1(10);
        disciplina.setP2(5);
        disciplina.calcularMedia();
        System.out.printf("P1: %.2f P2: %.2f Média: %.2f Situação: %s%n",
                disciplina.getP1(), disciplina.getP2(), disciplina.getMedia(), disciplina.getSituacao());
    }
}