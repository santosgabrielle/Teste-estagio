
package testeestagio;

public class RepresentacaoEstados {
    public static void main(String[] args) {
        double faturamentoTotal = 67836.43 + 36678.66 + 29229.88 + 27165.48 + 19849.53;

        double percentualSP = (67836.43 / faturamentoTotal) * 100;
        double percentualRJ = (36678.66 / faturamentoTotal) * 100;
        double percentualMG = (29229.88 / faturamentoTotal) * 100;
        double percentualES = (27165.48 / faturamentoTotal) * 100;
        double percentualOutros = (19849.53 / faturamentoTotal) * 100;

        System.out.println("Percentual de representação de SP: " + percentualSP + "%");
        System.out.println("Percentual de representação de RJ: " + percentualRJ + "%");
        System.out.println("Percentual de representação de MG: " + percentualMG + "%");
        System.out.println("Percentual de representação de ES: " + percentualES + "%");
        System.out.println("Percentual de representação de Outros: " + percentualOutros + "%");
    }
}

