// public class Bot extends Player {
// }

public class Bot {
        public static int getInput(int sticks) {
                // The bot wants the final state to be between 1 and 3
                // The bot wants the turn before that to be between 4 and 6
                // The bot wants the turn before that to be between 7 and 9

                // Simplifies to divisible by 4

                if (sticks % 4 == 0) {
                        return (int) (Math.random() * 3 + 1);
                } else {
                        return sticks % 4;
                }
        }
}
