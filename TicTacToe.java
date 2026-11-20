import java.util.Scanner;
public class TicTacToe
{
    static char[][] board = {
        {'1', '2', '3'},
        {'4', '5', '6'},
        {'7', '8', '9'}
    };

    static void displayBoard()
    {
        System.out.println();
        System.out.println(" " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println("---|---|---");
        System.out.println(" " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println("---|---|---");
        System.out.println(" " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println();
    }

    static boolean checkWin(char player)
    {
        for(int i = 0; i < 3; i++)
        {
            if(board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;

            if(board[0][i] == player && board[1][i] == player && board[2][i] == player)
                return true;
        }

        if(board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;

        if(board[0][2] == player && board[1][1] == player && board[2][0] == player)
            return true;

        return false;
    }

    static boolean placeMove(int position, char player)
    {
        switch(position)
        {
            case 1:
                if(board[0][0] == '1') { board[0][0] = player; return true; }
                break;
            case 2:
                if(board[0][1] == '2') { board[0][1] = player; return true; }
                break;
            case 3:
                if(board[0][2] == '3') { board[0][2] = player; return true; }
                break;
            case 4:
                if(board[1][0] == '4') { board[1][0] = player; return true; }
                break;
            case 5:
                if(board[1][1] == '5') { board[1][1] = player; return true; }
                break;
            case 6:
                if(board[1][2] == '6') { board[1][2] = player; return true; }
                break;
            case 7:
                if(board[2][0] == '7') { board[2][0] = player; return true; }
                break;
            case 8:
                if(board[2][1] == '8') { board[2][1] = player; return true; }
                break;
            case 9:
                if(board[2][2] == '9') { board[2][2] = player; return true; }
                break;
        }
        return false;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        char player = 'X';
        int moves = 0;

        while(true)
        {
            displayBoard();

            System.out.println("Player " + player + ", enter position (1-9): ");
            int pos = sc.nextInt();

            if(placeMove(pos, player))
            {
                moves++;

                if(checkWin(player))
                {
                    displayBoard();
                    System.out.println("Player " + player + " Wins!");
                    break;
                }

                if(moves == 9)
                {
                    displayBoard();
                    System.out.println("Match Draw!");
                    break;
                }

                player = (player == 'X') ? 'O' : 'X';
            }
            else
            {
                System.out.println("Invalid move! Try again.");
            }
        }
        sc.close();
    }
}