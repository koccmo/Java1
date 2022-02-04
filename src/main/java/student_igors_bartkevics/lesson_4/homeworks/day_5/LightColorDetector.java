/*
Разработать программу,
которая работает в соответствии с требованиями, описанными ниже.

Функциональные требования:
Программа должна определять цвет в зависимости
от длины волны в соответствии со следующими правилами:

380 ... 449 - Фиолетовый ("Violet")
450 ... 494 - Синий ("Blue")
495 ... 569 - Зеленый ("Green")
570 ... 589 - Желтый ("Yellow")
590 ... 619 - Оранжевый ("Orange")
620 ... 750 - Красный ("Red")
Вне диапазонов - невидимый спектр ("Invisible Light")

Логика с определением цвета должна быть реализована
в отдельном классе LightColorDetector:

class LightColorDetector {
​
  public String detect(int wavelength) {
    //TODO
  }
 */
package student_igors_bartkevics.lesson_4.homeworks.day_5;


class LightColorDetector {

    public String detect(int waveLength) {
        String result;
        if ((waveLength >= 380) && (waveLength <= 449)) {
            result = "Violet";
        }
        else if ((waveLength >= 450) && (waveLength <= 494)) {
            result = "Blue";
        }
        else if ((waveLength >= 495) && (waveLength <= 569)) {
            result = "Green";
        }
        else if ((waveLength >= 570) && (waveLength <= 589)) {
            result = "Yellow";
        }
        else if ((waveLength >= 590) && (waveLength <= 619)) {
            result = "Orange";
        }
        else if ((waveLength >= 620) && (waveLength <= 750)) {
            result = "Red";
        }
        else result = "Invisible Light";
        return result;
    }

}
