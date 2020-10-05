package student_anvars_intezars.home_tasks.lesson_12.task_5;

class Diver {

    String name;
    boolean isMaskPutOn;
    boolean isFlippersPutOn;
    boolean isOxygenPutOn;

    public Diver(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Diver diver = new Diver("John");
        diver.putMask();
        diver.putFlippers();
        try {
            diver.dive();
        } catch (DiverIsNotReadyException e) {
            System.out.println(e.getMessage());
            System.out.println("Checking all equipment." + "\r\n Mask is on? " + diver.isMaskPutOn + "\r\n flippers are on? "
                    + diver.isFlippersPutOn + "\r\n oxygen is on? " + diver.isOxygenPutOn);
        }
    }

    public void putMask() {
        System.out.println("Mask is on");
        this.isMaskPutOn = true;
    }

    public void putFlippers() {
        System.out.println("Flippers is on");
        this.isFlippersPutOn = true;
    }

    public void putOxygen() {
        System.out.println("Oxygen is on");
        this.isOxygenPutOn = true;
    }

    public void dive() throws DiverIsNotReadyException {
        if (isMaskPutOn && isFlippersPutOn && isOxygenPutOn) {
            System.out.println("Diver " + name + " is ready to go underwater");
        } else {
            throw new DiverIsNotReadyException ("Diver " + name + " is not ready to go underwater");
        }
    }
}
