
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class mainPacman extends JPanel implements ActionListener {

	private Dimension d;
    private final Font letra = new Font("Arial", Font.BOLD, 14);
    private boolean inGame = false;
    private boolean dying = false;

    private final int CUADRITO = 24;
    private final int T_TABLERO = 15;
    private final int SCREEN_SIZE = T_TABLERO * CUADRITO;
    private int MAX_GHOSTS = 10;
    private final int PACMAN_SPEED = 6;

    private int N_FANTASMAS = 2;
    private int lives, score;
    private int[] dx, dy;
    private int[] ghost_x, ghost_y, ghost_dx, ghost_dy, ghostSpeed;

    private Image heart, ghost;
    private Image up, down, left, right;

    private int pacman_x, pacman_y, pacmand_x, pacmand_y;
    private int req_dx, req_dy;

    private final short levelData[] = {
    	19, 26, 26, 26, 26, 22, 0 ,  0, 0 , 19, 26, 26, 26, 26, 22,
        21, 0 , 0 , 0 , 0 , 17, 26, 26, 26, 20, 0 ,  0,  0, 0 , 21,
        21, 0 , 19, 18, 18, 20, 0 , 0 , 0 , 17, 18, 18, 18, 0 , 21,
        21, 0 , 17, 16, 16, 16, 26, 18, 26, 16, 16, 16, 16, 0 , 21,
        21, 0 , 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16,  0, 21,
        17, 26, 16, 16, 16, 16, 24, 16, 16, 16, 16, 16, 16, 26, 20,
        17, 16, 16, 16, 16, 20, 0, 17, 16,  16, 16, 16, 16, 16, 20,
        17, 16, 16, 16, 16, 16, 18, 16, 16, 16, 16, 16, 16, 16, 20,
        17, 16, 16, 0 , 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
        17, 16, 16, 0 , 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
        17, 16, 16, 0 , 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
        17, 16, 16, 18 , 25, 18, 26, 16, 16, 16, 16, 16, 16, 16, 20,
        17, 26, 24, 28, 0 , 21, 16, 16, 16, 16, 16, 16, 16, 16, 20,
        21, 0 , 0 , 0 , 0 , 21, 16, 16, 16, 16, 16, 16, 16, 16, 20,
        25, 26, 26, 26, 26, 28, 24, 24, 24, 24, 24, 24, 24, 24, 28



        // 0 para estar azul
        // 1 para muro left
        // 2 muro toop
        // 4 muro  r
        // 8 muro bot
        // 16 punto comestible
    };

    private final int validSpeeds[] = {1, 2, 3, 4, 6, 8};
    private final int maxSpeed = 6;

    private int currentSpeed = 3;
    private short[] screenData;
    private Timer timer;

    public mainPacman() {

        loadImages();
        initVariables();
        addKeyListener(new TAdapter());
        setFocusable(true);
        initGame();
    }
    
    
    private void loadImages() {
    	down = new ImageIcon("./images/down.gif").getImage();
    	up = new ImageIcon("./images/up.gif").getImage();
    	left = new ImageIcon("./images/left.gif").getImage();
    	right = new ImageIcon("./images/right.gif").getImage();
        ghost = new ImageIcon("./images/ghost.gif").getImage();
        heart = new ImageIcon("./images/heart.png").getImage();

    }
       private void initVariables() {

        screenData = new short[T_TABLERO * T_TABLERO];
        d = new Dimension(400, 400);
        ghost_x = new int[MAX_GHOSTS];
        ghost_dx = new int[MAX_GHOSTS];
        ghost_y = new int[MAX_GHOSTS];
        ghost_dy = new int[MAX_GHOSTS];
        ghostSpeed = new int[MAX_GHOSTS];
        dx = new int[10];
        dy = new int[10];
        
        timer = new Timer(40, this);
        timer.start();
    }

    private void playGame(Graphics2D g2d) {

        if (dying) {

            death();

        } else {

            movePacman();
            drawPacman(g2d);
            moveGhosts(g2d);
            checkMaze();
        }
    }

    private void showIntroScreen(Graphics2D g2d) {
 
    	String start = "Press SPACE to start";
        g2d.setColor(Color.yellow);
        g2d.drawString(start, (SCREEN_SIZE)/4, 150);
    }

    private void drawScore(Graphics2D g) {
        g.setFont(letra);
        g.setColor(new Color(5, 181, 79));
        String s = "Score: " + score;
        g.drawString(s, SCREEN_SIZE / 2 + 96, SCREEN_SIZE + 16);

        for (int i = 0; i < lives; i++) {
            g.drawImage(heart, i * 28 + 8, SCREEN_SIZE + 1, this);
        }
    }

    private void checkMaze() {

        int i = 0;
        boolean finished = true;

        while (i < T_TABLERO * T_TABLERO && finished) {

            if ((screenData[i]) != 0) {
                finished = false;
            }

            i++;
        }

        if (finished) {

            score += 50;

            if (N_FANTASMAS < MAX_GHOSTS) {
                N_FANTASMAS++;
            }

            if (currentSpeed < maxSpeed) {
                currentSpeed++;
            }

            initLevel();
        }
    }

    private void death() {

    	lives--;

        if (lives == 0) {
            inGame = false;
        }

        continueLevel();
    }

    private void moveGhosts(Graphics2D g2d) {

        int pos;
        int count;

        for (int i = 0; i <= N_FANTASMAS; i++) {
            if (ghost_x[i] % CUADRITO == 0 && ghost_y[i] % CUADRITO == 0) {
                pos = ghost_x[i] / CUADRITO + T_TABLERO * (int) (ghost_y[i] / CUADRITO);

                count = 0;

                if ((screenData[pos] & 1) == 0 && ghost_dx[i] != 1) {
                    dx[count] = -1;
                    dy[count] = 0;
                    count++;
                }

                if ((screenData[pos] & 2) == 0 && ghost_dy[i] != 1) {
                    dx[count] = 0;
                    dy[count] = -1;
                    count++;
                }

                if ((screenData[pos] & 4) == 0 && ghost_dx[i] != -1) {
                    dx[count] = 1;
                    dy[count] = 0;
                    count++;
                }

                if ((screenData[pos] & 8) == 0 && ghost_dy[i] != -1) {
                    dx[count] = 0;
                    dy[count] = 1;
                    count++;
                }

                if (count == 0) {

                    if ((screenData[pos] & 15) == 15) {
                        ghost_dx[i] = 0;
                        ghost_dy[i] = 0;
                    } else {
                        ghost_dx[i] = -ghost_dx[i];
                        ghost_dy[i] = -ghost_dy[i];
                    }

                } else {

                    count = (int) (Math.random() * count);

                    if (count > 3) {
                        count = 3;
                    }

                    ghost_dx[i] = dx[count];
                    ghost_dy[i] = dy[count];
                }

            }

            ghost_x[i] = ghost_x[i] + (ghost_dx[i] * ghostSpeed[i]);
            ghost_y[i] = ghost_y[i] + (ghost_dy[i] * ghostSpeed[i]);
            drawGhost(g2d, ghost_x[i] + 1, ghost_y[i] + 1);

            if (pacman_x > (ghost_x[i] - 12) && pacman_x < (ghost_x[i] + 12)
                    && pacman_y > (ghost_y[i] - 12) && pacman_y < (ghost_y[i] + 12)
                    && inGame) {

                dying = true;
            }
        }
    }

    private void drawGhost(Graphics2D g2d, int x, int y) {
    	g2d.drawImage(ghost, x, y, this);
        }

    private void movePacman() {

        int pos;
        short ch;

        if (pacman_x % CUADRITO == 0 && pacman_y % CUADRITO == 0) {
            pos = pacman_x / CUADRITO + T_TABLERO * (int) (pacman_y / CUADRITO);
            ch = screenData[pos];

            if ((ch & 16) != 0) {
                screenData[pos] = (short) (ch & 15);
                score++;
            }

            if (req_dx != 0 || req_dy != 0) {
                if (!((req_dx == -1 && req_dy == 0 && (ch & 1) != 0)
                        || (req_dx == 1 && req_dy == 0 && (ch & 4) != 0)
                        || (req_dx == 0 && req_dy == -1 && (ch & 2) != 0)
                        || (req_dx == 0 && req_dy == 1 && (ch & 8) != 0))) {
                    pacmand_x = req_dx;
                    pacmand_y = req_dy;
                }
            }

            // Check for standstill
            if ((pacmand_x == -1 && pacmand_y == 0 && (ch & 1) != 0)
                    || (pacmand_x == 1 && pacmand_y == 0 && (ch & 4) != 0)
                    || (pacmand_x == 0 && pacmand_y == -1 && (ch & 2) != 0)
                    || (pacmand_x == 0 && pacmand_y == 1 && (ch & 8) != 0)) {
                pacmand_x = 0;
                pacmand_y = 0;
            }
        } 
        pacman_x = pacman_x + PACMAN_SPEED * pacmand_x;
        pacman_y = pacman_y + PACMAN_SPEED * pacmand_y;
    }

    private void drawPacman(Graphics2D g2d) {

        if (req_dx == -1) {
        	g2d.drawImage(left, pacman_x + 1, pacman_y + 1, this);
        } else if (req_dx == 1) {
        	g2d.drawImage(right, pacman_x + 1, pacman_y + 1, this);
        } else if (req_dy == -1) {
        	g2d.drawImage(up, pacman_x + 1, pacman_y + 1, this);
        } else {
        	g2d.drawImage(down, pacman_x + 1, pacman_y + 1, this);
        }
    }

    private void drawMaze(Graphics2D g2d) {

        short i = 0;
        int x, y;

        for (y = 0; y < SCREEN_SIZE; y += CUADRITO) {
            for (x = 0; x < SCREEN_SIZE; x += CUADRITO) {

                g2d.setColor(new Color(0,72,251));
                g2d.setStroke(new BasicStroke(5));
                
                if ((levelData[i] == 0)) { 
                	g2d.fillRect(x, y, CUADRITO, CUADRITO);
                 }

                if ((screenData[i] & 1) != 0) { 
                    g2d.drawLine(x, y, x, y + CUADRITO - 1);
                }

                if ((screenData[i] & 2) != 0) { 
                    g2d.drawLine(x, y, x + CUADRITO - 1, y);
                }

                if ((screenData[i] & 4) != 0) { 
                    g2d.drawLine(x + CUADRITO - 1, y, x + CUADRITO - 1,
                            y + CUADRITO - 1);
                }

                if ((screenData[i] & 8) != 0) { 
                    g2d.drawLine(x, y + CUADRITO - 1, x + CUADRITO - 1,
                            y + CUADRITO - 1);
                }

                if ((screenData[i] & 16) != 0) { 
                    g2d.setColor(new Color(255,255,255));
                    g2d.fillOval(x + 10, y + 10, 6, 6);
               }

                i++;
            }
        }
    }

    private void initGame() {

    	lives = 3;
        score = 0;
        initLevel();
        N_FANTASMAS = -1;
        currentSpeed = 3;
    }

    private void initLevel() {

        int i;
        for (i = 0; i < T_TABLERO * T_TABLERO; i++) {
            screenData[i] = levelData[i];
        }

        continueLevel();
    }

    private void continueLevel() {

    	int dx = 1;
        int random;

        for (int i = 0; i < N_FANTASMAS; i++) {

            ghost_y[i] = 4 * CUADRITO; //start position
            ghost_x[i] = 4 * CUADRITO;
            ghost_dy[i] = 0;
            ghost_dx[i] = dx;
            dx = -dx;
            random = (int) (Math.random() * (currentSpeed + 1));

            if (random > currentSpeed) {
                random = currentSpeed;
            }

            ghostSpeed[i] = validSpeeds[random];
        }

        pacman_x = 7 * CUADRITO;  //start position
        pacman_y = 11 * CUADRITO;
        pacmand_x = 0;	//reset direction move
        pacmand_y = 0;
        req_dx = 0;		// reset direction controls
        req_dy = 0;
        dying = false;
    }

 
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.black);
        g2d.fillRect(0, 0, d.width, d.height);

        drawMaze(g2d);
        drawScore(g2d);

        if (inGame) {
            playGame(g2d);
        } else {
            showIntroScreen(g2d);
        }

        Toolkit.getDefaultToolkit().sync();
        g2d.dispose();
    }


    //controls
    class TAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {

            int key = e.getKeyCode();

            if (inGame) {
                if (key == KeyEvent.VK_LEFT) {
                    req_dx = -1;
                    req_dy = 0;
                } else if (key == KeyEvent.VK_RIGHT) {
                    req_dx = 1;
                    req_dy = 0;
                } else if (key == KeyEvent.VK_UP) {
                    req_dx = 0;
                    req_dy = -1;
                } else if (key == KeyEvent.VK_DOWN) {
                    req_dx = 0;
                    req_dy = 1;
                } else if (key == KeyEvent.VK_ESCAPE && timer.isRunning()) {
                    inGame = false;
                } 
            } else {
                if (key == KeyEvent.VK_SPACE) {
                    inGame = true;
                    initGame();
                }
            }
        }
}

	
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
		
	}
