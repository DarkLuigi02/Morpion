import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Morpion extends JDialog{
    private JPanel contentPane;
    private JButton buttonRestart;
    private JButton button1;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;
    private JButton button2;
    private JButton button7;
    private JButton button8;
    private JButton button9;
    private JLabel gagne;
    int impair =1;
    ArrayList<JButton> Listebutton = new ArrayList<JButton>();
    int tours =0;

    public Morpion() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonRestart);

        buttonRestart.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onRestart();
            }
        });
        initListeBtn();
        for(JButton bouton:Listebutton){
                bouton.setText("");
                bouton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                verifierfin();
                onClick(bouton);
                if (verifierfin()==true){
                    for(JButton button: Listebutton){
                        button.setEnabled(false);
                    }
                }
            }
        });
        }
        contentPane.registerKeyboardAction(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        }, KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);

    }

    public boolean verifierfin() {
        boolean fin =false;
        boolean egalité=false;
        if (this.button1.getText().equals("X")) {
            if (this.button2.getText().equals("X")) {
                if (this.button3.getText().equals("X")) {
                    gagne.setVisible(true);
                    gagne.setText("le joueur 1 a gagné");
                    fin = true;
                }
            }else if (this.button5.getText().equals("X")) {
                if (this.button9.getText().equals("X")) {
                    gagne.setVisible(true);
                    gagne.setText("le joueur 1 a gagné");
                    fin=true;
                }
            }else if (this.button4.getText().equals("X")) {
                if (this.button7.getText().equals("X")) {
                    gagne.setVisible(true);
                    gagne.setText("le joueur 1 a gagné");
                    fin= true;
                }
            }
        }
        else if (this.button5.getText().equals("X")){
            if (this.button4.getText().equals("X")) {
                if (this.button6.getText().equals("X")) {
                    gagne.setVisible(true);
                    gagne.setText("le joueur 1 a gagné");
                    fin = true;
                }
            }else if (this.button2.getText().equals("X")) {
                if (this.button8.getText().equals("X")) {
                    gagne.setVisible(true);
                    gagne.setText("le joueur 1 a gagné");
                    fin=true;
                }
            }else if (this.button3.getText().equals("X")) {
                if (this.button7.getText().equals("X")) {
                    gagne.setVisible(true);
                    gagne.setText("le joueur 1 a gagné");
                    fin= true;
                }
            }
        }
        else if (this.button9.getText().equals("X")){
            if (this.button8.getText().equals("X")) {
                if (this.button7.getText().equals("X")) {
                    gagne.setVisible(true);
                    gagne.setText("le joueur 1 a gagné");
                    fin = true;
                }
            }else if (this.button5.getText().equals("X")) {
                if (this.button1.getText().equals("X")) {
                    gagne.setVisible(true);
                    gagne.setText("le joueur 1 a gagné");
                    fin=true;
                }
            }else if (this.button6.getText().equals("X") ) {
                if (this.button3.getText().equals("X")) {
                    gagne.setVisible(true);
                    gagne.setText("le joueur 1 a gagné");
                    fin= true;
                }
            }
        }
        if (this.button1.getText().equals("o")) {
            if (this.button2.getText().equals("o")) {
                if (this.button3.getText().equals("o")) {
                    gagne.setVisible(true);
                    gagne.setText("le joueur 2 a gagné");
                    fin = true;
                }
            }else if (this.button5.getText().equals("o")) {
                if (this.button9.getText().equals("o")) {
                    gagne.setVisible(true);
                    gagne.setText("le joueur 2 a gagné");
                    fin=true;
                }
            }else if (this.button4.getText().equals("o")) {
                if (this.button7.getText().equals("o")) {
                    gagne.setVisible(true);
                    gagne.setText("le joueur 2 a gagné");
                    fin= true;
                }
            }
        }
        else if (this.button5.getText().equals("o")){
            if (this.button4.getText().equals("o")) {
                if (this.button6.getText().equals("o")) {
                    gagne.setVisible(true);
                    gagne.setText("le joueur 2 a gagné");
                    fin = true;
                }
            }else if (this.button2.getText().equals("o")) {
                if (this.button8.getText().equals("o")) {
                    gagne.setVisible(true);
                    gagne.setText("le joueur 2 a gagné");
                    fin = true;
                }
            }else if (this.button3.getText().equals("o")) {
                if (this.button7.getText().equals("o")) {
                    gagne.setVisible(true);
                    gagne.setText("le joueur 2 a gagné");
                    fin= true;
                }
            }
        }
        else if (this.button9.getText().equals("o")){
            if (this.button8.getText().equals("o")) {
                if (this.button7.getText().equals("o")) {
                    gagne.setVisible(true);
                    gagne.setText("le joueur 2 a gagné");
                    fin = true;
                }
            }else if (this.button5.getText().equals("o")) {
                if (this.button1.getText().equals("o")) {
                    gagne.setVisible(true);
                    gagne.setText("le joueur 2 a gagné");
                    fin=true;
                }
            }else if (this.button6.getText().equals("o") ) {
                if (this.button3.getText().equals("o")) {
                    gagne.setVisible(true);
                    gagne.setText("le joueur 2 a gagné");
                    fin= true;
                }
            }
        }
        for (JButton button:Listebutton){
                button.getText();
                if (!button.getText().equals("")) {
                    egalité=true;
                }else{
                    egalité=false;
                    break;
                }
        }if (egalité == true){
            gagne.setVisible(true);
            gagne.setText("egalité");
            fin= true;
        }
        return fin;
    }

    public void player(JButton button) {
        if (tours == impair) {
            button.setText("X");
            impair=impair+2;
        } else {
            button.setText("o");
        }
    }

    public void onClick(JButton button) {
            if (button.getText().equals("")) {
                String btnName = button.getName();
                this.tours++;
                player(button);
            }
    }

    public void onRestart(){
    for(JButton button: Listebutton){
        button.setEnabled(true);
        gagne.setVisible(false);
        gagne.setText("");
        button.setText("");
        this.tours=0;
        this.impair=1;
        }
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        Morpion dialog = new Morpion();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }

    private void initListeBtn(){
    Listebutton = new ArrayList<>();
    Listebutton.add(button1);
    Listebutton.add(button2);
    Listebutton.add(button3);
    Listebutton.add(button4);
    Listebutton.add(button5);
    Listebutton.add(button6);
    Listebutton.add(button7);
    Listebutton.add(button8);
    Listebutton.add(button9);
}

    private void initEncouteurBtn(){
        for (JButton Bouton: Listebutton){ // pour chq bouton
            Bouton.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    onClick(Bouton);
                }
            });
        }
}


}