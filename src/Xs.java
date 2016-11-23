import javax.swing.*;

/**
 * Created by Pawl on 11/22/2016.
 */
public class Xs {

    public static void main(String []args){


        String a =JOptionPane.showInputDialog("Enter num to add");
        String b = JOptionPane.showInputDialog("Ebter the other num to add");

                int ai = Integer.parseInt(a);
                int bi = Integer.parseInt(b);

        int result = ai + bi;
        JOptionPane.showMessageDialog(null,result);



    }

}
