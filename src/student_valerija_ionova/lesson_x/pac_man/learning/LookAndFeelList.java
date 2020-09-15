package student_valerija_ionova.lesson_x.pac_man.learning;

import javax.swing.*;

class LookAndFeelList {

    public static void main (String [] args){

        UIManager.LookAndFeelInfo[] lookAndFeelInfos = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo lookAndFeelInfo : lookAndFeelInfos){
            System.out.println(lookAndFeelInfo.getName());
            System.out.println(lookAndFeelInfo.getClassName());
        }

    }

}
