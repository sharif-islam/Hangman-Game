

import java.awt.Image;
import javax.swing.JFrame;

class HangmanFrame {
    HangmanPanel panel;
	
	public HangmanFrame(){
		panel = new HangmanPanel();
		JFrame jf = new JFrame();
		jf.setTitle("Hangman");
		jf.setSize(715,530);
		jf.add(panel);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
	}
        public boolean imageUpdate(Image arg0,int agr1,int arg2,int arg3,int arg4,int arg5)
        {
            return false;
        }
    
}
