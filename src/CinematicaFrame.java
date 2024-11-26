import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CinematicaFrame extends JFrame {
    private JTextField txtDistancia, txtTiempo, txtAceleracion;
    private JLabel lblVelocidadInicial, lblVelocidadFinal,lblnada;
    private JPanel panelMovimiento;
    private Timer timer;
    private double distancia, tiempo, aceleracion, velocidadInicial, velocidadFinal, posicion;
    private int xPos = 20;

    public CinematicaFrame() {
        setTitle("Cálculo de Cinemática con Movimiento");
        setSize(2100, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel de Entrada
        JPanel panelInput = new JPanel();
        panelInput.setLayout(new GridLayout(5, 9));
        
        JButton btnRegresar = new JButton("Regresar");
        panelInput.add(btnRegresar);
    panelInput.add(new JLabel(""));
    panelInput.add(new JLabel(""));
        panelInput.add(new JLabel("Distancia (m):"));
        txtDistancia = new JTextField();
        panelInput.add(txtDistancia);
panelInput.add(new JLabel(""));
        panelInput.add(new JLabel("Tiempo (s):"));
        txtTiempo = new JTextField();
        panelInput.add(txtTiempo);
panelInput.add(new JLabel(""));
        panelInput.add(new JLabel("Aceleración (m/s²):"));
        txtAceleracion = new JTextField();
        panelInput.add(txtAceleracion);
panelInput.add(new JLabel(""));
        JButton btnCalcular = new JButton("Calcular");
        panelInput.add(btnCalcular);

        lblnada = new JLabel("");
        lblVelocidadInicial = new JLabel("Velocidad Inicial: ");
        panelInput.add(lblVelocidadInicial);
        lblVelocidadFinal = new JLabel("Velocidad Final: ");
        
        panelInput.add(lblVelocidadFinal);

        add(panelInput, BorderLayout.NORTH);

        // Panel de Movimiento
        panelMovimiento = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
              //TODO LO HE SEPARADO
                setBackground(Color.black);

                g.setColor(Color.white);
                g.fillRect(0, 50, getWidth(), 10); // Línea superior
                g.fillRect(0, getHeight() - 60, getWidth(), 10); // Línea inferior

                // línea central de movimiento
                g.setColor(Color.yellow);
                for (int i = 0; i < getWidth(); i += 40) {
                    g.fillRect(i, getHeight() / 2 - 5, 20, 10); 
                }
              //forma del carro
                g.setColor(new Color(0, 102, 204));
                g.fillRect(xPos, getHeight() / 2 - 20, 100, 40); 
                g.fillRect(xPos+15, getHeight() / 2 - 40, 70, 20);

                //ventanas del carro
                g.setColor(Color.cyan);
                g.fillRect(xPos+25, getHeight() / 2 - 35, 25, 15); 
                g.fillRect(xPos+55, getHeight() / 2 - 35, 25, 15); 

                //ruedas
                g.setColor(Color.lightGray);
                g.fillOval(xPos+10, getHeight() / 2 + 10, 20, 20); 
                g.fillOval(xPos+65, getHeight() / 2 + 10, 20, 20);  

                //luces
                g.setColor(Color.red);
                g.fillRect(xPos, getHeight() / 2 - 5, 5, 10);
                g.fillRect(xPos+95, getHeight() / 2 - 5, 5, 10); 

                g.setColor(Color.yellow);
                g.fillRect(xPos+95, getHeight() / 2 - 20, 5, 10); 
                g.fillRect(xPos, getHeight() / 2 - 20, 5, 10);  
            }
        };
        
        add(panelMovimiento, BorderLayout.CENTER);

        // Acción de Calcular
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularVelocidades();
                animacionActionPerformed(e);
            }
        });
        btnRegresar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                 principal hy=new principal();
                  dispose();
                hy.setVisible(true);
            }
        });
    }

    private void calcularVelocidades() {
        try {
            distancia = Double.parseDouble(txtDistancia.getText());
            tiempo = Double.parseDouble(txtTiempo.getText());
            aceleracion = Double.parseDouble(txtAceleracion.getText());

            // Fórmulas de cinemática
            velocidadInicial = (distancia - 0.5 * aceleracion * Math.pow(tiempo, 2)) / tiempo;
            velocidadFinal = velocidadInicial + aceleracion * tiempo;

            lblVelocidadInicial.setText(String.format("Velocidad Inicial: %.2f m/s", velocidadInicial));//para reducir el numero
            lblVelocidadFinal.setText(String.format("Velocidad Final: %.2f m/s", velocidadFinal));//para reducir el numero
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void animacionActionPerformed(java.awt.event.ActionEvent evt) {
        if (timer != null && timer.isRunning()) {
            timer.stop();
        }  // ESTO ES PARA EL TIEMPO 

        xPos = 20; // posicion del carro
        posicion = 0;
        timer = new Timer(10, new ActionListener() {
            private double 
             tiempoActual = 0.0;

            @Override
            public void actionPerformed(ActionEvent e) {
                tiempoActual += 0.01;
                posicion = velocidadInicial * tiempoActual + 0.5 * aceleracion * Math.pow(tiempoActual, 3);
                xPos = 0 + (int) posicion;

                if (tiempoActual >= tiempo || xPos >= panelMovimiento.getWidth() - 50) {
                    timer.stop();  // esto permite detenerse en el momento seleccionado
                }

                panelMovimiento.repaint();// volver todo al inicio
            }
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CinematicaFrame().setVisible(true);
        });
    }
}
