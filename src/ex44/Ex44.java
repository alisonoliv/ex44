package ex44;

import javax.swing.SwingUtilities;

public class Ex44 {

   
    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            
            Cadastro cad = new Cadastro();
            cad.setVisible(true);           
        });


    }
    
}
