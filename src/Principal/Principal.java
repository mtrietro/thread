package Principal;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Número de threads: " + Thread.activeCount()
                + "\n" + Thread.currentThread());
        System.out.println("Número de threads: " + Thread.activeCount());
        System.out.println(Thread.currentThread());
    }

}
