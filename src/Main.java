

public class Main {
    public static void main(String args[]){
        UI ui = new UI();
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                ui.createAndShowGUI();
            }
        });
    }
}
