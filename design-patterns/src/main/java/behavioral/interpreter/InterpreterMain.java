package behavioral.interpreter;

import javax.swing.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class InterpreterMain {

    //When TEST enter for example "1 pint to tablespoons"
    public static void main(String[] args) {
        // Create pop up window that asks for a question
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        String questionAsked = JOptionPane.showInputDialog(frame, "What is your question");

        // Add the question to the context for analysis
        ConversionContext question = new ConversionContext(questionAsked);
        String fromConversion = question.getFromConversion();
        String toConversion = question.getToConversion();

        double quantity = question.getQuantity();
        try {
            System.out.println(fromConversion);
            // Get class based on the from conversion string
            Class tempClass = Class.forName("behavioral.interpreter." + fromConversion);
            // Get the constructor dynamically for the conversion string
            Constructor con = tempClass.getConstructor();

            // Create a new instance of the object you want to convert from
            Object convertFrom = con.newInstance();

            // Define the method parameters expected by the method that
            // will convert to your chosen unit of measure
            Class[] methodParams = new Class[]{Double.TYPE};

            // Get the method dynamically that will be needed to convert
            // into your chosen unit of measure
            Method conversionMethod = tempClass.getMethod(toConversion, methodParams);

            // Define the method parameters that will be passed to the above method
            Object[] params = new Object[]{quantity};
            // Get the quantity after the conversion
            String toQuantity = (String) conversionMethod.invoke(convertFrom, params);

            // Print the results
            String answerToQues = question.getResponse() +
                    toQuantity + " " + toConversion;

            JOptionPane.showMessageDialog(null, answerToQues);
            // Closes the frame after OK is clicked
            frame.dispose();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
