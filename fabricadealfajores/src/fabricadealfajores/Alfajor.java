/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fabricadealfajores;

/**
 *
 * @author Diego
 */
public class Alfajor {
    
    private Integer alfajorChoco = 16;
    private Integer alfajorDulce = 4;
    private Integer alfajorFruta = 4;
    private Integer acuCajas;
    private Integer contCajas;

    
    public Integer getAlfajorChoco() {
        return alfajorChoco;
    }

    public void setAlfajorChoco(Integer alfajorChoco) {
        this.alfajorChoco = alfajorChoco;
    }

    public Integer getAlfajorDulce() {
        return alfajorDulce;
    }

    public void setAlfajorDulce(Integer alfajorDulce) {
        this.alfajorDulce = alfajorDulce;
    }

    public Integer getAlfajorFruta() {
        return alfajorFruta;
    }

    public void setAlfajorFruta(Integer alfajorFruta) {
        this.alfajorFruta = alfajorFruta;
    }
    
    public Integer Alfajor(){
        contCajas = 0;
        while ((alfajorChoco >= 4) && (alfajorDulce >= 1) && (alfajorFruta >= 1)){
        alfajorChoco = alfajorChoco - 4;
        alfajorDulce = alfajorDulce - 1;
        alfajorFruta = alfajorFruta - 1;
        contCajas = contCajas + 1;
        }
        //acuCajas = contCajas + 1;
        System.out.println("cantidad de alfajor sobrante de choco "+alfajorChoco);
        System.out.println("cantidad de alfajor sobrante de choco "+alfajorDulce);
        System.out.println("cantidad de alfajor sobrante de choco "+alfajorFruta);
        return contCajas; 
    }  
}
