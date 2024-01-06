package practitce;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SnakeGame extends JFrame implements ActionListener {
    private final int BOARD_WIDTH = 25;
    private final int BOARD_HEIGHT = 25;
    private final int DOT_SIZE = 20;
    private final int ALL_DOTS = BOARD_WIDTH * BOARD_HEIGHT;
    private final int DELAY = 150;

    private final int x[] = new int[ALL_DOTS];
    private final int y[] = new int[ALL_DOTS];

    private int dots;
    private int appleX;
    private int appleY;

    private boolean leftDirection = false;
    private boolean rightDirection = true;
    private boolean upDirection = false;
    private boolean downDirection = false;
    private boolean inGame = true;

    private Timer timer;

    public SnakeGame() {
        setTitle("Snake Game");
        setSize(BOARD_WIDTH * DOT_SIZE, BOARD_HEIGHT * DOT_SIZE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        initGame();
        addKeyListener(new TAdapter());

        timer = new Timer(DELAY, this);
        timer.start();
    }

    private void initGame() {
        dots = 3;

        for (int z = 0; z < dots; z++) {
            x[z] = 50 - z * DOT_SIZE;
            y[z] = 50;
        }

        locateApple();
    }

    private void locateApple() {
        int r = (int) (Math.random() * BOARD_WIDTH);
        appleX = r * DOT_SIZE;

        r = (int) (Math.random() * BOARD_HEIGHT);
        appleY = r * DOT_SIZE;
    }

    private void checkApple() {
        if (x[0] == appleX && y[0] == appleY) {
            dots++;
            locateApple();
        }
    }

    private void move() {
        for (int z = dots; z > 0; z--) {
            x[z] = x[z - 1];
            y[z] = y[z - 1];
        }

        if (leftDirection) {
            x[0] -= DOT_SIZE;
        }

        if (rightDirection) {
            x[0] += DOT_SIZE;
        }

        if (upDirection) {
            y[0] -= DOT_SIZE;
        }

        if (downDirection) {
            y[0] += DOT_SIZE;
        }
    }

    private void checkCollision() {
        for (int z = dots; z > 0; z--) {
            if (z > 4 && x[0] == x[z] && y[0] == y[z]) {
                inGame = false;
            }
        }

        if (y[0] >= BOARD_HEIGHT * DOT_SIZE || y[0] < 0 || x[0] >= BOARD_WIDTH * DOT_SIZE || x[0] < 0) {
            inGame = false;
        }

        if (!inGame) {
            timer.stop();
        }
    }

    private void gameOver(Graphics g) {
        String msg = "Game Over";
        Font font = new Font("Arial", Font.BOLD, 24);
        FontMetrics metrics = getFontMetrics(font);

        g.setColor(Color.RED);
        g.setFont(font);
        g.drawString(msg, (BOARD_WIDTH * DOT_SIZE - metrics.stringWidth(msg)) / 2, BOARD_HEIGHT * DOT_SIZE / 2);
    }

    private void draw(Graphics g) {
        if (inGame) {
            g.setColor(Color.RED);
            g.fillRect(appleX, appleY, DOT_SIZE, DOT_SIZE);

            for (int z = 0; z < dots; z++) {
                if (z == 0) {
                    g.setColor(Color.GREEN);
                } else {
                    g.setColor(Color.GREEN.darker());
                }
                g.fillRect(x[z], y[z], DOT_SIZE, DOT_SIZE);
            }

            Toolkit.getDefaultToolkit().sync();
        } else {
            gameOver(g);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (inGame) {
            checkApple();
            checkCollision();
            move();
        }

        repaint();
    }

    private class TAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            int key = e.getKeyCode();

            if ((key == KeyEvent.VK_LEFT || key == KeyEvent.VK_A) && !rightDirection) {
                leftDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_RIGHT || key == KeyEvent.VK_D) && !leftDirection) {
                rightDirection = true;
                upDirection = false;
                downDirection = false;
            }

            if ((key == KeyEvent.VK_UP || key == KeyEvent.VK_W) && !downDirection) {
                upDirection = true;
                rightDirection = false;
                leftDirection = false;
            }

            if ((key == KeyEvent.VK_DOWN || key == KeyEvent.VK_S) && !upDirection) {
                downDirection = true;
                rightDirection = false;
                leftDirection = false;
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        draw(g);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SnakeGame().setVisible(true);
        });
    }
}