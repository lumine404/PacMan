import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        int rowCount = 21;
        int columnCount = 19;
        int squareSize = 32;
        int boardWidth = columnCount*squareSize;
        int boardHeight = rowCount*squareSize;

        JFrame frame = new JFrame("Pac Man");
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PacMan pacmangame = new PacMan();
        frame.add(pacmangame);
        frame.pack();
        pacmangame.requestFocus();
        frame.setVisible(true);
    }
}
