import java.util.Scanner;

public class S11_Authentification {
    public static void main(String[] args) {
        String login = "Admin";
        String password = "P@ssw0rd";
        // На 10 строке создаём объект класса Scanner для обработки ввода с клавиатуры
        Scanner in = new Scanner(System.in);

        System.out.print("Введите login: ");

        // На 19 строке создаем строкову локальную переменную с именем usersLogin
        // и принимаем в нее ввод от пользователя

        String usersLogin = in.next();

        if (login.equals(usersLogin)) {
            System.out.print("Введите password: ");
            String usersPassword = in.next();

            if (password.equals(usersPassword)) {
                System.out.println("Здравствуйте " + usersLogin + ", Вы вошли в систему.");
            } else {
                System.out.println("Вы ввели неверный пароль!");
            }
        } else {
            System.out.println("Нет пользователя с таким именем!");
        }
    }
}
