/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author chris
 */

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

public class AI extends Thread {
    
    private Character pSW; //Personaje de Cn
    private Character pST; //Personaje de NK
    private int SWWin;
    private int STWin;
    private String state;
    private int WaitingTime;
    
     public AI () {
        this.pSW = null;
        this.pST = null;
        this.SWWin = 0;
        this.STWin = 0;
        this.state = "Esperando...";
        this.WaitingTime = 10000;
    }

    public Character getpSW() {
        return pSW;
    }

    public void setpSW(Character pSW) {
        this.pSW = pSW;
    }

    public Character getpST() {
        return pST;
    }

    public void setpST(Character pST) {
        this.pST = pST;
    }

     

    public int getWaitingTime() {
        return WaitingTime;
    }

    public void setWaitingTime(int WaitingTime) {
        this.WaitingTime = WaitingTime;
    }
    
    
     
    /*@Override
    
    public void run(){                    
        try {
//          
            int resultadonum= (int) (Math.random()*100) ; // se escoge el resultado de la batalla
            this.state = "Decidiendo";
            Interfaz.getIA_State().setText(this.state);
            sleep(this.WaitingTime); //duerme 10 segundos en los que "piensa"
            //ahora el resultado
            this.state = "Anunciando resultados";
            Interfaz.getIA_State().setText(this.state);
            
            Character ganador;
            System.out.println("decision: "+resultadonum);
            if(resultadonum<40) { //hay un ganador
                System.out.println("Hay un ganador, combatientes: "+p1.getName()+" "+p2.getName());
                System.out.println("personaje 1, id: "+p1.getId()+" nombre "+p1.getName()+" stats:\nAgilidad: "+p1.getAgilidad()+"\nFuerza: "+p1.getFuerza()+"\nHabilidad: "+p1.getHabilidad()+"\nHP: "+p1.getHp());
                System.out.println("personaje 2, id: "+p2.getId()+" nombre "+p2.getName()+" stats:\nAgilidad: "+p2.getAgilidad()+"\nFuerza: "+p2.getFuerza()+"\nHabilidad: "+p2.getHabilidad()+"\nHP: "+p2.getHp());
                Interfaz.getResultado_Combate().setText("Hubo un ganador!");
                
            if(p2.getName().compareTo("Aang estado avatar")==0) {
                ganador=p2;
                Interfaz.getListaGanadores().append("N-"+p2.getId()+'\n');
                Interfaz.getCharacter_Icon_Cn().setIcon(new ImageIcon(getClass().getResource("/InterfaceImages/Yugi.png"))); // Se quita la foto del Perdedor
                this.NickWins ++;
                Interfaz.getMarcadorNick().setText(Integer.toString(this.NickWins));
                
            } else {
                ganador=Ganador();
            }
                
                Global.getGanadores().insertBegin(ganador);

            }

            else if(resultadonum>=40 && resultadonum<67){ //hay empate
                System.out.println("Hubo empate");
                Interfaz.getResultado_Combate().setText("Hubo un empate!");
                Global.getCN().getPrioridad1().encolar(p1);
                Global.getNick().getPrioridad1().encolar(p2);
            }
            else if (resultadonum>=67 && resultadonum<100){//no sucede el combate
                System.out.println("Alquien tuvo una luxación y el combate no se puede hacer");
                Interfaz.getResultado_Combate().setText("Suspendido!");
                Global.getCN().getRefuerzo().encolar(p1);
                Global.getNick().getRefuerzo().encolar(p2); 
                Interfaz.getRefuerzoCN().setText(Global.getCN().getRefuerzo().imprimir());
                Interfaz.getRefuerzoNick().setText(Global.getNick().getRefuerzo().imprimir());
            }            

            sleep(3000); //Duerme 3 segundos para que el resultado se pueda ver reflejado en la interfaz, propenso a cambio
            
            this.state = "Esperando...";
            Interfaz.getIA_State().setText(this.state);
            Interfaz.getResultado_Combate().setText("Esperando...");
        } catch (InterruptedException ex) {
            Logger.getLogger(IA.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
   
    public Character Ganador(){ //determinar cual de los dos personajes gano 
        int ventaja_p1=0;
        int ventaja_p2=0;
                
        if(p1.getAgilidad()>p2.getAgilidad()){
            ventaja_p1++;
        }else {
            ventaja_p2++;
        }
                
        if(p1.getFuerza()>=p2.getFuerza()){
            ventaja_p1++;
        }else {
            ventaja_p2++;
        }
                
        if(p1.getHabilidad()>p2.getHabilidad()) {
            ventaja_p1++;
        }else {
            ventaja_p2++;
        }
        if(p1.getHp()>=p2.getHp()) {
            ventaja_p1++;
        }else {
            ventaja_p2++;
        }
        
        
        if(ventaja_p1>ventaja_p2){
            System.out.println(p1.getName()+" es el ganador");
            Interfaz.getListaGanadores().append("C-"+p1.getId()+'\n');
            Interfaz.getCharacter_Icon_Nick().setIcon(new ImageIcon(getClass().getResource("/InterfaceImages/Yugi.png"))); // Se quita la foto del perdedor
            this.CnWins ++;
            Interfaz.getMarcadorCartoon().setText(Integer.toString(this.CnWins));
            
            return p1;
        }else{
            System.out.println(p2.getName()+" es el ganador");
            Interfaz.getListaGanadores().append("N-"+p2.getId()+'\n');
            Interfaz.getCharacter_Icon_Cn().setIcon(new ImageIcon(getClass().getResource("/InterfaceImages/Yugi.png"))); // Se quita la foto del Perdedor
            this.NickWins ++;
            Interfaz.getMarcadorNick().setText(Integer.toString(this.NickWins));
            
            return p2;
        }*/
       
    }