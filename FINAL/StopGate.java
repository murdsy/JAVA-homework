import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class StopGate extends JFrame implements ActionListener {
    private final int ROWS = 8;
    private final int COLS = 8;
    private final int CELL_SIZE = 50;
    private final int GAP_SIZE = 10;
    private final int BOARD_SIZE = ROWS * CELL_SIZE + (ROWS + 1) * GAP_SIZE;
    private final int PLAYER_DOMINO = 1;
    private final int COMPUTER_DOMINO = 2;
    private JButton[][] cells;
    private int[][] board;
    private boolean playerTurn;
    private boolean gameOver = false; 
    private JLabel message;
    
    public StopGate() {
        setTitle("StopGate Game");
        setSize(BOARD_SIZE, BOARD_SIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        board = new int[ROWS][COLS];
        cells = new JButton[ROWS][COLS];
        playerTurn = true;
        gameOver = false;
        
        JPanel boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(ROWS, COLS, GAP_SIZE, GAP_SIZE));
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                cells[row][col] = new JButton();
                if((row+col)%2==0){
                    cells[row][col].setBackground(Color.WHITE);
                }
                else{
                    cells[row][col].setBackground(Color.GRAY);
                }
                cells[row][col].setPreferredSize(new Dimension(CELL_SIZE, CELL_SIZE));
                cells[row][col].addActionListener(this);
                boardPanel.add(cells[row][col]);
            }
        }
        
        message = new JLabel("Your turn (place a horizontal domino)");
        message.setHorizontalAlignment(JLabel.CENTER);
        message.setPreferredSize(new Dimension(BOARD_SIZE, GAP_SIZE * 2));
        message.setForeground(Color.BLUE);
        message.setFont(new Font("Dialog", Font.BOLD, 16));
        
        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(boardPanel, BorderLayout.CENTER);
        contentPane.add(message, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (gameOver==true) {
            return;
        }
        
        JButton cell = (JButton) e.getSource();
        int row = -1;
        int col = -1;
        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if (cell == cells[r][c]) {
                    row = r;
                    col = c;
                    break;
                }
            }
            if (row >= 0) {
                break;
            }
        }
        
        if (playerTurn) {
            if (col < COLS - 1 && board[row][col] == 0 && board[row][col + 1] == 0) {
                board[row][col] = PLAYER_DOMINO;
                board[row][col + 1] = PLAYER_DOMINO;
                cell.setBackground(Color.BLUE);
                cells[row][col+1].setBackground(Color.BLUE);
                playerTurn = false;
                message.setText("Computer's turn (place a vertical domino)");
                message.setForeground(Color.BLACK);
                computerMove();
            } else {
                message.setText("Invalid move, try again");
            }
        }
    }
    
    private void computerMove() {
        int row = -1;
        int col = -1;
        boolean found = false;
        for (int r = 0; r < ROWS - 1; r++) {
            for (int c = 0; c < COLS; c++) {
                if (board[r][c] == 0 && board[r + 1][c] == 0) {
                    row = r;
                    col = c;
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }

        }
        if (row >= 0) {
            board[row][col] = COMPUTER_DOMINO;
            board[row + 1][col] = COMPUTER_DOMINO;
            cells[row][col].setBackground(Color.BLACK);
            cells[row + 1][col].setBackground(Color.BLACK);
            playerTurn = true;
            checkGameOver();
            if (!gameOver) {
                message.setText("Your turn (place a horizontal domino)");
                message.setForeground(Color.BLUE);
            }
         else {
            gameOver = true;
            message.setText("Game over. You win!");
            message.setForeground(Color.BLUE);
        }   
    }
}

private void checkGameOver() {
    boolean playerCanMove = false;
    boolean computerCanMove = true;

    //==========================================
    for (int row = 0; row < ROWS; row++) {
        for (int col = 0; col < COLS - 1; col++) {
           
            if (board[row][col] == 0 && board[row][col + 1] == 0) {
                if (playerTurn==true) {
                    playerCanMove = true;
                    //computerCanMove = false;
                } else {
                    playerCanMove = false;
                }
            }

        }
    }
    //==========================================


    if (playerCanMove==false && computerCanMove==true) {
        gameOver = true;
        message.setText("Game over. You lose!");
        message.setForeground(Color.BLACK);
    } else if (computerCanMove==false && playerCanMove==true) {
        gameOver = true;
        message.setText("Game over. You win!");
        message.setForeground(Color.BLUE);
    } else if (computerCanMove==true && playerCanMove==true){
        //
    }
}

public static void main(String[] args) {
    new StopGate();
}

}