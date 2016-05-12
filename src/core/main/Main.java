package core.main;

import java.util.Scanner;

class Main
{
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Game game = new Game();
        User user = new User();
        game.setWidth(in.nextInt());
        game.setHeight(in.nextInt());
        in.nextLine();
        user.setInput(in.nextLine());

    }
}