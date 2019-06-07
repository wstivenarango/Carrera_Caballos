
package carreracaballos.logica;

import java.awt.*;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.*;
import static javafx.scene.text.FontPosture.ITALIC;

public class IconoInicio extends Canvas {
    public IconoInicio() {
        setBackground(Color.blue);
            }
    @Override
    public void paint (Graphics p) {
        Font fuente=new Font("TimesRoman", Font.BOLD, 20);
        p.drawString("Iniciar Carrera", 35 , 40);
        p.setFont(fuente);
  
            
    }
}

