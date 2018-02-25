/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.audio.*;

/**
 *
 * @author noor
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    /*public static class AL implements ActionListener
    {
        public final void actionPerformed(ActionEvent e) 
        {
            try {
                music();
            } catch (IOException ex) {
                Logger.getLogger(JavaApplication18.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public static void music() throws IOException
    {
        AudioPlayer MGP =AudioPlayer.player;
        AudioStream BGM;
        AudioData MD;
        ContinuousAudioDataStream loop=null;
        BGM =new AudioStream(new FileInputStream("music.mp3"));
        MD=BGM.getData();
        loop =new ContinuousAudioDataStream(MD);
        MGP.start(loop);
    }*/
}
