
package faturamento;

public class Faturamento {

    public static void main(String[] args) {
      
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

      
        double Total = sp + rj + mg + es + outros;

       
System.out.printf("SP: %.2f%%\n", (sp / Total) * 100);
        System.out.printf("RJ: %.2f%%\n", (rj / Total) * 100);
        System.out.printf("MG: %.2f%%\n", (mg / Total) * 100);
        System.out.printf("ES: %.2f%%\n", (es / Total) * 100);
        System.out.printf("Outros: %.2f%%\n", (outros / Total) * 100);
    }
    
}
