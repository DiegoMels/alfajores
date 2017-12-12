package visual;

import controladores.ControladorCargar;
import controladores.ControladorSalir;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class IngresoDeDatos extends JFrame {
    
    private JLabel lblAlfajor_Chocolate = new JLabel("Cantidad de Alfajores de Chocolate");
    private JTextField txtAlfajor_Chocolate = new JTextField();
    private JLabel lblAlfajor_DulcedeLeche = new JLabel("Cantidad de Alfajores de Dulce de Leche");
    private JTextField txtAlfajor_DulcedeLeche = new JTextField();
    private JLabel lblAlfajor_Fruta = new JLabel("Cantidad de Alfajores de Fruta");
    private JTextField txtAlfajor_Fruta = new JTextField();
    private JLabel lblCantidad_Cajas = new JLabel("Cantidad de Cajas");
    private JTextField txtCantidad_Cajas = new JTextField();
    private JButton cargar = new JButton("Cargar");
    private JButton salir = new JButton("Salir");
    private GridLayout contenedor = new GridLayout(15,3);
    private ControladorCargar controladorCargar = new ControladorCargar(txtAlfajor_Chocolate, txtAlfajor_DulcedeLeche, txtAlfajor_Fruta, txtCantidad_Cajas);
    private ControladorSalir controladorSalir = new ControladorSalir();
    
    public IngresoDeDatos (){
        this.setLayout(contenedor);
            this.setTitle("Tienda De Alfajores");
            this.setLocation(200,300);
            this.setSize(800,600);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.add(lblAlfajor_Chocolate);
            this.add(txtAlfajor_Chocolate);
            this.add(lblAlfajor_DulcedeLeche);
            this.add(txtAlfajor_DulcedeLeche);
            this.add(lblAlfajor_Fruta);
            this.add(txtAlfajor_Fruta);
            this.add(cargar);
            this.add(lblCantidad_Cajas);
            this.add(txtCantidad_Cajas);
            this.add(salir);
            this.cargar.addMouseListener(controladorCargar);
            this.salir.addMouseListener(controladorSalir);
            this.setVisible(true);
    }
    
    
}
