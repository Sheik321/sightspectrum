package practitce;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Stopwatch extends JFrame {
    private long startTime = 0;
    private long stopTime = 0;
    private long elapsedTime = 0;
    private boolean isRunning = false;

    private JLabel timeLabel;
    private JButton startButton;
    private JButton stopButton;
    private JButton resetButton;

    public Stopwatch() {
        setTitle("Stopwatch");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLayout(new FlowLayout());

        timeLabel = new JLabel("00:00:00");
        timeLabel.setFont(new Font("Verdana", Font.PLAIN, 30));
        add(timeLabel);

        startButton = new JButton("Start");
        stopButton = new JButton("Stop");
        resetButton = new JButton("Reset");

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                start();
            }
        });

        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                stop();
            }
        });

        resetButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                reset();
            }
        });

        add(startButton);
        add(stopButton);
        add(resetButton);
    }

    private void start() {
        if (!isRunning) {
            startTime = System.currentTimeMillis() - elapsedTime;
            isRunning = true;
            updateTimer();
        }
    }

    private void stop() {
        if (isRunning) {
            stopTime = System.currentTimeMillis();
            isRunning = false;
            elapsedTime = stopTime - startTime;
            updateTimer();
        }
    }

    private void reset() {
        isRunning = false;
        startTime = 0;
        stopTime = 0;
        elapsedTime = 0;
        updateTimer();
    }

    private void updateTimer() {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                long currentTime = elapsedTime;
                if (isRunning) {
                    currentTime = System.currentTimeMillis() - startTime;
                }
                int seconds = (int) (currentTime / 1000);
                int minutes = seconds / 60;
                int hours = minutes / 60;
                seconds = seconds % 60;
                minutes = minutes % 60;

                String timeString = String.format("%02d:%02d:%02d", hours, minutes, seconds);
                timeLabel.setText(timeString);
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Stopwatch stopwatch = new Stopwatch();
                stopwatch.setVisible(true);
                Timer timer = new Timer(100, new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        stopwatch.updateTimer();
                    }
                });
                timer.start();
            }
        });
    }
}