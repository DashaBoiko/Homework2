import java.util.Scanner;

public class Exercise7 {

        // Output field 3 * 3
        public static void printBoard(char[] field) {
            System.out.println(field[0] + " " + field[1] + " " + field[2]);
            System.out.println(field[3] + " " + field[4] + " " + field[5]);
            System.out.println(field[6] + " " + field[7] + " " +field[8]);
        }

        // Checking a free element of the field
        public static boolean isAvailable(char[] field, int x) {
            if (field[x - 1] == 'X' || field[x - 1] == '0') return false;
            else return true;
        }

        // Return the user's position
        public static int getPositionFromUser(char[] field) {
            Scanner scn = new Scanner(System.in);

            while (true) {
                System.out.println("Enter a position from 1 to 9");
                int pos = scn.nextInt();
                if (pos < 1 || pos > 9) {
                    System.out.println("Incorrect position entry");
                    continue;
                }

                if (!isAvailable(field, pos)) {
                    System.out.println("Position already taken");
                    continue;
                }

                return pos;
            }


        }

        // Function for determining the winner
        //0 1 2
        //3 4 5
        //6 7 8
        public static char checkWinner(char[] field) {
            int i;
            // Checking rows and columns
            for (i = 0; i< 3; i++) {
                if (field[3 * i + 0] == '0' && field[3 * i + 1] == '0' && field[3 * i + 2] == '0') return '0';
                if (field[3 * i + 0] == 'X' && field[3 * i + 1] == 'X' && field[3 * i + 2] == 'X') return 'X';

                if (field[i + 0] == '0' && field[i + 3] == '0' && field[i + 6] == '0') return '0';
                if (field[i + 0] == 'X' && field[i + 3] == 'X' && field[i + 6] == 'X') return 'X';
            }

            // Checking the diagonals
            if (field[0] == '0' && field[4] == '0' && field[8] == '0') return '0';
            if (field[0] == 'X' && field[4] == 'X' && field[8] == 'X') return 'X';

            if (field[2] == '0' && field[4] == '0' && field[6] == '0') return '0';
            if (field[2] == 'X' && field[4] == 'X' && field[6] == 'X') return 'X';

            return '-';
        }

        // Function of placing an icon on the playing field
        public static boolean placeSymbolOnBoard(char[] field, int pos, char x) {
            field[pos - 1] = x;
            printBoard(field);
            char s = checkWinner(field);
            if (s == 'X') {
                System.out.println("X is a winner");
                return true;
            }
            if (s == '0') {
                System.out.println("0 is a winner");
                return true;
            }

            return false;
        }

        // Main function
        public static void main(String[] args) {
            char[] pole = {'.', '.', '.', '.', '.', '.', '.', '.', '.'};

            int pos;
            boolean win;
            while (true) {
                System.out.println("Enter the position of the 1st player ");
                pos = getPositionFromUser(pole);
                win = placeSymbolOnBoard(pole, pos, 'X');
                if (win) break;
                System.out.println("Enter the position of the 2nd player");
                pos = getPositionFromUser(pole);
                win = placeSymbolOnBoard(pole, pos, '0');
                if (win) break;
            }

        }

    }
