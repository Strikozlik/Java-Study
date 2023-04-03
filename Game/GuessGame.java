package Game;

public class GuessGame {
    Player p1;     // три змінні екземпляра класу
    Player p2;
    Player p3;

    public void startGame() {
        p1 = new Player();     // створюєм три обєкти для цих змінних класу Player;
        p2 = new Player();
        p3 = new Player();

        int guessp1 = 0;      // Створюєм три змінні для збереження варіанту кожного гравця
        int guessp2 = 0;
        int guessp3 = 0;

        boolean p1isRight = false;   // Створюєм булеві змінні для зберігання правильності чи не правильності  відповіді гравців
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10);           // створюєм число яке гравці повинні вгадати
        System.out.println("Я загадую  число від 0 до 9...");

        while (true) {
            System.out.println("Число яке потрібно вгадати" + targetNumber);
            p1.guess();
            p2.guess();        //викликаєм метод для створення рандомного числа для кожного з гравців
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Перший гравець думає що це число " + guessp1);   // Витягаєм для кожного гравця його число
            guessp2 = p2.number;
            System.out.println("Другий гравець думає що це число " + guessp2);
            guessp3 = p3.number;
            System.out.println("Третій гравець думає шо це число " + guessp3);

            if (guessp1 == targetNumber) {          // Перевіряєм чи числа гравців збігаються з заданим числом і якщо так
                p1isRight = true;                //  то присвоюєм  значення true
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            if (p1isRight || p2isRight || p3isRight) {
                System.out.println("В нас є переможець");
                System.out.println("Перший гравець вгадав? " + p1isRight);
                System.out.println("Другий гравець вгадав? " + p2isRight);
                System.out.println("Третій гравець вгадав? " + p3isRight);
                System.out.println("Кінець гри");
                break;
            } else {
                System.out.println("Спробуйте ще раз");
            }
        }
    }
}
