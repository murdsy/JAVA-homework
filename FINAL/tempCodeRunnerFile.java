playerTurn = false;
                message.setText("Computer's turn (place a vertical domino)");
                message.setForeground(Color.BLACK);
                computerMove();
            } else {
                message.setText("Invalid move, try again");
            }