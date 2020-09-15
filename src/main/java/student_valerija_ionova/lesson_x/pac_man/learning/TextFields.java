package student_valerija_ionova.lesson_x.pac_man.learning;

import javax.swing.*;

class TextFields {

    static Frame frame = new Frame();
    static JFrame jFrame = frame.getFrame();
    static JPanel jPanel = new JPanel();

    public static void main (String [] args) throws Exception{
        jFrame.add(jPanel);

        JLabel jLabel = new JLabel("this is label");
        jPanel.add(jLabel); //Надрись около текста

        jPanel.add(new JTextField("default value", 20));
        JTextField jTextField = new JTextField();
        jTextField.getText(); //Получить текст из окна

        jPanel.add(new JPasswordField(20));

        JTextArea jTextArea = new JTextArea (5, 20);
        jTextArea.setLineWrap(true);
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jPanel.add(jScrollPane);

        jPanel.revalidate();
    }

}
