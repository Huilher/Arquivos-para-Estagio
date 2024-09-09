package xml;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Element;
import java.io.File;


public class XML {

  
    public static void main(String[] args) {
 try {
            // Caminho do arquivo XML
            File arquivoXML = new File("C:\\Users\\guilh\\OneDrive\\Área de Trabalho\\JOBS\\JAVA\\Pergunta 4\\dados.xml");

            // Ler o arquivo XML
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(arquivoXML);

            // Normalizar o XML
            doc.getDocumentElement().normalize();

            // Obter a lista de elementos "row"
            NodeList listaRows = doc.getElementsByTagName("row");

            // Inicializando variáveis
            double menorValor = Double.MAX_VALUE;
            double maiorValor = Double.MIN_VALUE;
            double somaFaturamento = 0.0;
            int diasComFaturamento = 0;

            // Percorrer os elementos do XML para calcular menor, maior e somar os valores
            for (int i = 0; i < listaRows.getLength(); i++) {
                Element row = (Element) listaRows.item(i);
                double valor = Double.parseDouble(row.getElementsByTagName("valor").item(0).getTextContent());

                if (valor > 0) { // Ignorar dias sem faturamento
                    if (valor < menorValor) {
                        menorValor = valor;
                    }
                    if (valor > maiorValor) {
                        maiorValor = valor;
                    }
                    somaFaturamento += valor;
                    diasComFaturamento++;
                }
            }

            // Calcular a média mensal de faturamento
            double mediaFaturamento = somaFaturamento / diasComFaturamento;

            // Contar quantos dias tiveram faturamento acima da média
            int diasAcimaDaMedia = 0;
            for (int i = 0; i < listaRows.getLength(); i++) {
                Element row = (Element) listaRows.item(i);
                double valor = Double.parseDouble(row.getElementsByTagName("valor").item(0).getTextContent());

                if (valor > mediaFaturamento) {
                    diasAcimaDaMedia++;
                }
            }

            // Exibir os resultados
            System.out.printf("Menor valor de faturamento: %.2f\n", menorValor);
            System.out.printf("Maior valor de faturamento: %.2f\n", maiorValor);
            System.out.printf("Número de dias com faturamento acima da média: %d\n", diasAcimaDaMedia);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
