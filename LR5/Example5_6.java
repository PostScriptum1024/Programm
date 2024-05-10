public class Example5_6 {
    public static void main(String[] args) {
        Example5_6_class obj = new Example5_6_class(0, 10);
        obj.onScreen();

        obj.setValue(100);
        obj.onScreen();

        obj.setValue(-100);
        obj.onScreen();

        obj.setValue(200, -200);
        obj.onScreen();

        obj.setValue(5, -250);
        obj.onScreen();

        obj.setValue(250, -10);
        obj.onScreen();
    }
    }

