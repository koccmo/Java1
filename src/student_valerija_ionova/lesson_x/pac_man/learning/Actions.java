package student_valerija_ionova.lesson_x.pac_man.learning;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

class Actions {
    static Frame frame = new Frame();
    static JFrame jFrame = frame.getFrame();
    static JPanel jPanel = new JPanel();

    public static void main (String [] args){
        jFrame.add(jPanel);
        AbstractAction myAction = new MyAction();
        JButton jButton = new JButton(myAction);
        jButton.setText("submit");
        jPanel.add(jButton);

        KeyStroke keyStroke = KeyStroke.getKeyStroke("ctrl B"); //Горячие клавиши
        InputMap inputMap = jPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        //JComponent when_focused на кнопке
        //JComponent when_in_focused_window фокус в том же окне
        //JComponent when_in_focused_window везде в окне
        inputMap.put(keyStroke, "changeColor");
        ActionMap actionMap = jPanel.getActionMap();
        actionMap.put("changeColor", myAction);
    }

    static class MyAction extends AbstractAction{
        MyAction(){
            //SHORT_DESCRIPTION надпись при наводе курсора
            putValue(AbstractAction.SHORT_DESCRIPTION, "My small action");
        }
        @Override
        public void actionPerformed(ActionEvent e){     //Действие при нажатии
            jPanel.setBackground(Color.blue);
        }
    }

}
