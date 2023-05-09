import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class sgate extends JFrame implements ActionListener {
    
    //konfigurimet e tabeles
    private final int Brows = 8;
    private final int Bcols = 8;
    private final int gapsize = 10;
    private final int cellsize = 50;
    private final int BSIZE = Brows * cellsize *(Brows+1)*gapsize;
    private JLabel GameMessage;

    //konfigurimet llogjike
    private JButton[][] cells;
    private int[][] board;
    private boolean playerTurn;
    private boolean gameOver;
    private final int PLAYER = 1;
    private final int COMP =2;
    

    
    public sgate() {
        //super();
        setTitle("StopGate");
        setSize(BSIZE, BSIZE);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        board = new int[Brows][Bcols];
        cells = new JButton[Brows][Bcols];
        playerTurn = true;
        gameOver=false;

        JPanel boardPanel = new JPanel();
        boardPanel.setLayout(new GridLayout(Brows, Bcols, gapsize, gapsize));
        for (int row=0; row<Brows;row++){
            for(int cols=0; cols<Bcols;cols++){
                cells[row][cols]=new JButton();
                if((row+cols)%2==0){
                    cells[row][cols].setBackground(Color.WHITE);
                }
                else{
                    cells[row][cols].setBackground(Color.GRAY);
                }
                cells[row][cols].setPreferredSize(new Dimension(cellsize, cellsize));
                cells[row][cols].addActionListener(this);
                board[row][cols] = 0;
                boardPanel.add(cells[row][cols]);
            }
        }

        GameMessage = new JLabel("Player TURN (place a horizontal domino).");
        GameMessage.setHorizontalAlignment(JLabel.CENTER);
        GameMessage.setPreferredSize(new Dimension(BSIZE, gapsize * 2));
        GameMessage.setForeground(Color.BLUE);
        GameMessage.setFont(new Font("Dialog", Font.BOLD, 16));

        Container contentPane = getContentPane();
        contentPane.setLayout(new BorderLayout());
        contentPane.add(boardPanel, BorderLayout.CENTER);
        contentPane.add(GameMessage, BorderLayout.SOUTH);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(gameOver == true){
            return;
        }

        JButton cell = (JButton) e.getSource();
        int row = -1;
        int col = -1;

        for(int r=0; r<Brows;r++){
            for(int c=0; c<Bcols;c++){
                if(cell == cells[r][c]){
                    row = r;
                    col = c;
                    break;
                }
            }
        }
        if(row>=0){
            return;
        }

        if(playerTurn){
            if(col<Bcols - 1 && board[row][col] == 0 && board[row][col+1] == 0){
                board[row][col] = PLAYER;
                board[row][col+1] = PLAYER;
                cell.setBackground(Color.BLUE);
                cells[row][col+1].setBackground(Color.BLUE);

                playerTurn = false;
                GameMessage.setText("Computer's turn (place a vertical domino)");
                GameMessage.setForeground(Color.BLACK);
                compMove();
            } 
            else {
                GameMessage.setText("Invalid move, try again");
            }
            }
        }

    private void compMove(){
        int row = -1;
        int col = -1;
        boolean found = false;
        for(int r=0; r<Brows;r++){
            for(int c=0; c<Bcols; c++){
                if(board[r][c] == 0&&board[r+1][c]==0){
                    row = r;
                    col = c;
                    found = true;
                    break;
                }
            }
            if(found == true){
                break;
            }
        }

        if(row >=0){
            board[row][col] = COMP;
            board[row+1][col]=COMP;
            cells[row][col].setBackground(Color.BLACK);
            cells[row + 1][col].setBackground(Color.BLACK);
            
            playerTurn = true;
            
            checkGame();

            if(gameOver == false){
                GameMessage.setText("Your turn (place a horizontal domino).");
                GameMessage.setForeground(Color.BLUE);
            }

            else{
                gameOver = true;
                GameMessage.setText("GAME OVER. YOU WIN!!!!");
                GameMessage.setForeground(Color.green);
            }

        }

    }
    
    private void checkGame(){
        boolean playerCanMove = false;
        boolean computerCanMove = false;

        //
    
    }
    private void gameisOver(){}

    public static void main(String[] args){
        sgate f = new sgate();
        
    }
}