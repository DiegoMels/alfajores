package controladores;

import datos.Datos;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTextField;

public class ControladorCargar implements MouseListener {
    private JTextField alfajor_Chocolate;
    private JTextField alfajor_DulcedeLeche;
    private JTextField alfajor_Fruta;
    private JTextField cantidad_Cajas;
    private Datos datos;
    private Double contCajas;
    
        public ControladorCargar(JTextField txtAlfajor_Chocolate, JTextField txtAlfajor_DulcedeLeche, JTextField txtAlfajor_Fruta, JTextField txtCantidad_Cajas){
            this.alfajor_Chocolate = txtAlfajor_Chocolate;
            this.alfajor_DulcedeLeche = txtAlfajor_DulcedeLeche;
            this.alfajor_Fruta = txtAlfajor_Fruta;
            this.cantidad_Cajas = txtCantidad_Cajas;
        }

        @Override
        public void mouseClicked(MouseEvent me) {
                
                datos = new Datos(alfajor_Chocolate, alfajor_DulcedeLeche, alfajor_Fruta, cantidad_Cajas);
                datos.Datos();
                
                /*double choco = Double.parseDouble(alfajor_Chocolate.getText());
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
                System.out.println("Sobrantes de Fruta: "+ fruta);*/
        }

        @Override
        public void mousePressed(MouseEvent me) {
        }

        @Override
        public void mouseReleased(MouseEvent me) {
        }

        @Override
        public void mouseEntered(MouseEvent me) {
        }

        @Override
        public void mouseExited(MouseEvent me) {
        }

    
    
}
