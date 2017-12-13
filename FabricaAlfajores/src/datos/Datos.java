package datos;

import javax.swing.JTextField;

public class Datos {
    private JTextField alfajor_Chocolate;
    private JTextField alfajor_DulcedeLeche;
    private JTextField alfajor_Fruta;
    private JTextField cantidad_Cajas;
    private Datos datos;
    private Double contCajas;
    
     ////////// CONSTRUCTOR ///////////

    public Datos(JTextField alfajor_Chocolate, JTextField alfajor_DulcedeLeche, JTextField alfajor_Fruta, JTextField cantidad_Cajas) {
    
        this.alfajor_Chocolate = alfajor_Chocolate;
        this.alfajor_DulcedeLeche = alfajor_DulcedeLeche;
        this.alfajor_Fruta = alfajor_Fruta;
        this.cantidad_Cajas = cantidad_Cajas;
        
    }
    public void Datos(){
        double choco = Double.parseDouble(alfajor_Chocolate.getText());
                double dulce = Double.parseDouble(alfajor_DulcedeLeche.getText());
                double fruta = Double.parseDouble(alfajor_Fruta.getText());
                contCajas = 0.0;
                    while ((choco >= 4) && (dulce >= 1) && (fruta >= 1)){
                     contCajas = contCajas + 1;
                     choco = choco - 4;
                     dulce = dulce - 1;
                     fruta = fruta - 1;
                    }
                cantidad_Cajas.setText(contCajas.toString());
                System.out.println("Cantidad de cajas realizadas: "+ contCajas);
                System.out.println("     ");
                System.out.println("Sobrantes de Chocolate: "+ choco);
                System.out.println("Sobrantes de Dulce de Leche: "+ dulce);
                System.out.println("Sobrantes de Fruta: "+ fruta);
    }
}
