public class Main {
        public static void main(String[] args) {
                printWelcome();
                int sticks = 35;
                while (sticks > 0) {
                        sticks -= Player.getInput();
                        if (sticks <= 0) {
                                System.out.println("Player 1 wins");
                                break;
                        }
                        System.out.println("There are " + sticks + " sticks left");
                        sticks -= Bot.getInput(sticks);
                        if (sticks <= 0) {
                                System.out.println("Player 2 (bot) wins");
                                break;
                        }
                        System.out.println("There are " + sticks + " sticks left");
                }
                System.out.println("Game over!");
        }

        public static void printWelcome() {
                System.out.println("Welcome to the game of Nim!");
                System.out.println("The rules are simple: ");
                System.out.println("You and your opponent will take turns removing 1-3 sticks from a pile of 12.");
                System.out.println("The player who removes the last stick wins!");
        }
}