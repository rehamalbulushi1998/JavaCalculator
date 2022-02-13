import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author Reham Albulushi
 * @version JDK 17.0.2
 */
public class MyCalculator {
    /**
     * represents the swing Jpanel component that interfaces the calculator
     */
    private JPanel MyCalculator;
    /**
     * represents the swing textfield component that used to input the operands
     */
    private JTextField textField1;
    /**
     * represents the swing button component that used to perform multiplication operation
     */
    private JButton buttonmultiply;
    /**
     * represents the swing button component that used to input the number 1
     */
    private JButton Button1;
    /**
     * represents the swing button component that used to input the number 5
     */
    private JButton Button5;
    /**
     * represents the swing button component that used to input the number 2
     */
    private JButton Button2;
    /**
     * represents the swing button component that used to input the number 3
     */
    private JButton Button3;
    /**
     * represents the swing button component that used to input the number 4
     */
    private JButton Button4;
    /**
     * represents the swing button component that used to input the number 9
     */
    private JButton Button9;
    /**
     * represents the swing button component that used to input the number 6
     */
    private JButton Button6;
    /**
     * represents the swing button component that used to input the number 7
     */
    private JButton Button7;
    /**
     * represents the swing button component that used to input the number 8
     */
    private JButton Button8;
    /**
     * represents the swing button component that used to perform addition operation
     */
    private JButton buttonplus;
    /**
     * represents the swing button component that used to input the number 0
     */
    private JButton Button0;
    /**
     * represents the swing button component that used to dispaly the fractional point
     */
    private JButton buttonpoint;
    /**
     * represents the swing button component that used to delete the operands
     */
    private JButton Buttoncl;
    /**
     * represents the swing button component that used to perform subtraction operation
     */
    private JButton Buttonminus;
    /**
     * represents the swing button component that used to perform division operation
     */
    private JButton buttondevide;
    /**
     * represents the swing button component that used to display the result of the calculation
     */
    private JButton buttonequals;
    /**
     * represents the first operand
     */
    private double total1 = 0.0;
    /**
     * represents the result of the mathematical operation
     */
    private double total2 = 0.0;
    /**
     * represents the string of the mathematical operation performed
     */
    private String st;

    public MyCalculator() {
        Button1.addActionListener(new ActionListener() {
            /**
             *
             * This is a method used to store the text of button 1 and displaying it in the text field
             * @param e is a parameter that is taken as a reference by the listener to identify the event caught
             *
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + Button1.getText();
                textField1.setText(btnOneText);
            }
        });
        Button2.addActionListener(new ActionListener() {
            /**
             * This is a method used to store the text of button 2 and displaying it in the text field
             * @param e is a parameter that is taken as a reference by the listener to identify the event caught
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + Button2.getText();
                textField1.setText(btnOneText);
            }
        });
        Button3.addActionListener(new ActionListener() {
            /**
             *
             * This is a method used to store the text of button  3and displaying it in the text field
             * @param e is a parameter that is taken as a reference by the listener to identify the event caught
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + Button3.getText();
                textField1.setText(btnOneText);
            }
        });
        Button4.addActionListener(new ActionListener() {
            /**
             * This is a method used to store the text of button 4 and displaying it in the text field
             * @param e is a parameter that is taken as a reference by the listener to identify the event caught
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + Button4.getText();
                textField1.setText(btnOneText);
            }
        });
        Button5.addActionListener(new ActionListener() {
            /**
             *
             * This is a method used to store the text of button 5 and displaying it in the text field
             * @param e is a parameter that is taken as a reference by the listener to identify the event caught
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + Button5.getText();
                textField1.setText(btnOneText);
            }
        });
        Button6.addActionListener(new ActionListener() {
            /**
             *
             * This is a method used to store the text of button 6 and displaying it in the text field
             * @param e is a parameter that is taken as a reference by the listener to identify the event caught
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + Button6.getText();
                textField1.setText(btnOneText);
            }
        });
        Button7.addActionListener(new ActionListener() {
            /**
             *
             * This is a method used to store the text of button 7 and displaying it in the text field
             * @param e is a parameter that is taken as a reference by the listener to identify the event caught
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + Button7.getText();
                textField1.setText(btnOneText);
            }
        });
        Button8.addActionListener(new ActionListener() {
            /**
             *
             * This is a method used to store the text of button 8 and displaying it in the text field
             * @param e is a parameter that is taken as a reference by the listener to identify the event caught
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + Button8.getText();
                textField1.setText(btnOneText);
            }
        });
        Button9.addActionListener(new ActionListener() {
            /**
             *
             * This is a method used to store the text of button 9 and displaying it in the text field
             * @param e is a parameter that is taken as a reference by the listener to identify the event caught
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + Button9.getText();
                textField1.setText(btnOneText);
            }
        });
        Button0.addActionListener(new ActionListener() {
            /**
             *
             * This is a method used to store the text of button 0 and displaying it in the text field
             * @param e is a parameter that is taken as a reference by the listener to identify the event caught
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + Button0.getText();
                textField1.setText(btnOneText);
            }
        });
        buttonpoint.addActionListener(new ActionListener() {
            /**
             *
             * This is a method used to store the text of buttonpoint which a fractional point and displaying it in the text field
             * @param e is a parameter that is taken as a reference by the listener to identify the event caught
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + buttonpoint.getText();
                textField1.setText(btnOneText);
            }
        });
        buttonplus.addActionListener(new ActionListener() {
            /**
             *
             * This is a method used to convert the first operand from string to double and set the addition operation string
             * @param e is a parameter that is taken as a reference by the listener to identify the event caught
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = total1 + Double.parseDouble(textField1.getText());
                textField1.setText("");
                st = "add";
            }
        });
        buttonequals.addActionListener(new ActionListener() {
            /**
             *
             * This is a method used to perform the mathematical operation for the input operans based on the operation string, convert the type of result from double to string, and displaying the result
             * @param e is a parameter that is taken as a reference by the listener to identify the event caught
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (st == "add") {

                    total2 = total1 + Double.parseDouble(textField1.getText());
                    textField1.setText(Double.toString(total2));
                    total1 =0;

                }
                else if (st == "devide") {
                    total2 = total1 / Double.parseDouble(textField1.getText());
                    textField1.setText(Double.toString(total2));
                    total1 =0;


                }
                else if (st == "multiply") {
                    total2 = total1 * Double.parseDouble(textField1.getText());
                    textField1.setText(Double.toString(total2));
                    total1 =0;


                }
                else if (st == "sub") {
                    total2 = total1 - Double.parseDouble(textField1.getText());
                    textField1.setText(Double.toString(total2));
                    total1 =0;


                }

            }
        });
        Buttoncl.addActionListener(new ActionListener() {
            /**
             *
             * This is a method used to delete the operands and clear textfiel
             * @param e is a parameter that is taken as a reference by the listener to identify the event caught
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                total2=0;
                total1=0;
                textField1.setText("");

            }
        });
        buttondevide.addActionListener(new ActionListener() {
            /**
             *
             * This is a method used to convert the first operand from string to double and set the division operation string
             * @param e is a parameter that is taken as a reference by the listener to identify the event caught
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = total1 + Double.parseDouble(textField1.getText());
                textField1.setText("");
                st = "devide";

            }
        });
        buttonmultiply.addActionListener(new ActionListener() {
            /**
             * This is a method used to convert the first operand from string to double and set the multiplication operation string
             * @param e is a parameter that is taken as a reference by the listener to identify the event caught
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = total1 + Double.parseDouble(textField1.getText());
                textField1.setText("");
                st = "multiply";

            }
        });
        Buttonminus.addActionListener(new ActionListener() {
            /**
             *
             * This is a method used to convert the first operand from string to double and set the subtraction operation string
             * @param e is a parameter that is taken as a reference by the listener to identify the event caught
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = total1 + Double.parseDouble(textField1.getText());
                textField1.setText("");
                st = "sub";
            }
        });
    }


    public static void main(String[] args) {
        /**
         * calling the calculator
         */
        JFrame frame = new JFrame("MyCalculator");
        frame.setContentPane(new MyCalculator().MyCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
