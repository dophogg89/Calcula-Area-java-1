
import java.text.DecimalFormat;
import javax.swing.JOptionPane;


public class CalculArea {
    public static void main(String[] args){
        double  metreQuadri, area, price, areaM;
        
        area = Double.parseDouble(JOptionPane.showInputDialog(" Quantos M² tem o imovel? "));
       
        metreQuadri = 11.00;
               
        price = area * metreQuadri;
        
        DecimalFormat decimal = new DecimalFormat("0,000.00");
        String priceForm = decimal.format(price);
        
        
        JOptionPane.showMessageDialog(null, " O imovel tem " + area + "M² \n O valor do aluguel é aproximadamente R$" + priceForm + " No Rio de janeiro.");
        
    }
}
