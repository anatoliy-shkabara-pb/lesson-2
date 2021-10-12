public class S10_IfOperator {
    public static void main(String[] args) {
        // Оператор if
        int x = 10;
        if (x < 20) {
            System.out.print("Это оператор if");
        }

        // Оператор if...else
        if (x < 5) {
            System.out.print("Это оператор if");
        } else {
            System.out.print("Это оператор else");
        }

        // Оператор if...else if...else
        int y = 30;
        if (y == 10) {
            System.out.print("Значение Y = 10");
        } else if (y == 20) {
            System.out.print("Значение Y = 20");
        } else if (y == 30) {
            System.out.print("Значение Y = 30");
        } else {
            System.out.print("Это оператор else");
        }

        // Вложенный оператор if
        if (x == 10) {
            if (y == 30) {
                System.out.print("X = 10 и Y = 30");
            }
        }
    }
}
