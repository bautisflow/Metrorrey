package interfaz;


import proyecto.Algoritmo;

import proyecto.Metro;


import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.*;

public class Interfaz extends JFrame{
    private Container ventana;

    private final String JESUS = "Jesús Carpintero Rodríguez";
    private final String ISMA = "Ismael Yubero Moreno";
    private final String TITOROBERT = "Roberto García Álvarez";
    private final String DANIEL = "Daniel de la Hoz Fuentes";
    private final String PABLO = "Pablo Cabezuelo Aguilar";
    private final Color color = new Color(0, 141, 255);
    private final Font fuenteTitulo = new Font("Dialog",Font.BOLD,45);
    private final Font fuenteAutores = new Font("Dialog",0,21);
    private Algoritmo algoritmo;
    private Metro metro;

    public Interfaz(){
        super("Metro");
        ventana = getContentPane();
        algoritmo=new Algoritmo();
        metro=new Metro();
        ventana.setBackground(color);
        setSize(850, 850);
        cargarVentanaComienzo();
        setVisible(true);


    }

    public void cargarVentanaComienzo(){
        ventana.removeAll();
        ventana.repaint();
        ventana.setLayout(new CardLayout());
        Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        TitledBorder titulo = BorderFactory.createTitledBorder(border, "Metro", 0,(int)CENTER_ALIGNMENT, fuenteTitulo);
        titulo.setTitleColor(Color.black);

        JPanel panel =new JPanel();
        JPanel panel0 = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JButton buscar = new JButton("Encontrar recorrido");
        JButton mapa = new JButton("Mapa metro");
        JButton autores = new JButton("Autores");


        panel.setLayout(new BorderLayout());
        panel.setBorder(titulo);
        panel.setSize(getContentPane().getSize());
        panel0.setLayout(new GridLayout(3, 1));

        panel2.setLayout(new BoxLayout(panel2, BoxLayout.X_AXIS));
        panel2.add(new JLabel(""));
        panel2.add(buscar);
        panel2.add(mapa);
        panel2.add(autores);
        panel2.add(new JLabel(""));



        JList<String> lista = new JList<String>();
        JList<String> lista2 = new JList<String>();
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        DefaultListModel modelo = new DefaultListModel();
        DefaultListModel modelo2 = new DefaultListModel();
        JScrollPane scrollLista = new JScrollPane();
        scrollLista.setViewportView(lista);
        Date fecha = new Date();
        Metro m = new Metro();

        for (int i=0;i<m.getListaEstaciones().size();i++){
            if (!modelo.contains(m.getListaEstaciones().get(i).getNombreEstacion())) {
                modelo.addElement(m.getListaEstaciones().get(i).getNombreEstacion());
                modelo2.addElement(m.getListaEstaciones().get(i).getNombreEstacion());
            }

        }



        lista.setModel(modelo);
        lista2.setModel(modelo2);

        JComboBox<String> hora = new JComboBox<String>();
        hora.setForeground(color);
        hora.setFont(new Font("Arial", Font.BOLD, 13));
        DefaultComboBoxModel<String> modeloHora=new DefaultComboBoxModel<String>(new String[] {"00:00","00:15","00:30","00:45","01:00","01:15","01:30","01:45","02:00","02:15","02:30","02:45",
                "03:00","03:15","03:30","03:45","04:00","04:15","04:30","04:45","05:00","05:15","05:30","05:45","06:00","06:15","06:30","06:45","07:00","07:15",
                "07:30","07:45","08:00","08:15","08:30","08:45","09:00","09:15","09:30","09:45","10:00","10:15","10:30","10:45","11:00",
                "11:15","11:30","11:45","12:00","12:15","12:30","12:45","13:00","13:15","13:30","13:45","14:00","14:15",
                "14:30","14:45","15:00","15:15","15:30","15:45","16:00","16:15","16:30","16:45","17:00","17:15","17:30",
                "17:45","18:00","18:15","18:30","18:45","19:00","19:15","19:30","19:45","20:00","20:15","20:30","20:45"
                ,"21:00","21:15","21:30","21:45","22:00","22:15","22:30","22:45","23:00","23:15","23:30","23:45"});
        hora.setModel(modeloHora);


        JPanel panel11 = new JPanel();
        panel11.setLayout(null);
        JPanel panel12 = new JPanel();
        panel12.setLayout(null);
        JScrollPane scroll = new JScrollPane(lista);
        JScrollPane scroll2 = new JScrollPane(lista2);
        panel1.setLayout(new GridLayout(1, 3));
        scroll.setBounds(0, 5, 800, 400);
        scroll2.setBounds(0, 5, 800, 400);
        panel11.add(scroll);
        JPanel panel1m = new JPanel();
        panel1m.setLayout(new BoxLayout(panel1m, BoxLayout.Y_AXIS));
        panel1m.add(new JLabel("Hora"));
        panel1m.add(hora);
        panel12.add(scroll2);
        JPanel panel11m =new JPanel();
        JPanel panel12m = new JPanel();
        panel11m.setLayout(new BoxLayout(panel11m,BoxLayout.Y_AXIS));
        panel12m.setLayout(new BoxLayout(panel12m,BoxLayout.Y_AXIS));
        panel11m.add(new JLabel("Origen"));
        panel12m.add(new JLabel("Destino"));
        panel11m.add(panel11);
        panel12m.add(panel12);
        panel1.add(panel11m);
        panel1.add(panel1m);
        panel1.add(panel12m);


        panel.add(panel0);
        panel0.add(new JLabel(""));
        panel0.add(panel1);
        panel0.add(panel2);


        scroll.setBackground(color);
        scroll2.setBackground(color);
        ventana.add(panel);
        panel11.setBackground(color);
        panel12.setBackground(color);
        ventana.setBackground(color);
        panel.setBackground(color);
        panel11m.setBackground(color);
        panel12m.setBackground(color);
        panel0.setBackground(color);
        panel1.setBackground(color);
        panel1m.setBackground(color);
        panel2.setBackground(color);
        setVisible(true);

        autores.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cargarVentanaAutores();
            }
        });
        mapa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cargarVentanaMapa();
            }
        });

       buscar.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseClicked(MouseEvent e) {
               int id1 =lista.getSelectedIndex();
               int id2 = lista2.getSelectedIndex();
               Metro m = new Metro();
               String donde = m.getListaEstaciones().get(id1).getNombreEstacion();
               String hasta = m.getListaEstaciones().get(id2).getNombreEstacion();
               int[] arrDonde = ;
               int[] arrHasta = m.getNumero(hasta);
               Algoritmo viajeFinal = null;
               double a = -1;
               double aux = 0;
               for(int i = 0; i < arrDonde.length; i++)
                   for(int u = 0; u < arrHasta.length; u++){
                       Algoritmo viajecillo = new Algoritmo();
                       aux = viajecillo.aEstrella(arrDonde[i], arrHasta[u], horaSel);
                       if(a == -1 || aux < a){
                           viajeFinal = viajecillo;
                           a = aux;
                       }
                   }
               String fin = viajeFinal.imprimirFinal();
               System.out.println("Recorrido desde "+donde+" hasta "+hasta);
               System.out.println(fin);
               cargarVentanaRecorrido(fin);
           }
       });



    }
    public void cargarVentanaAutores(){
        ventana.removeAll();
        ventana.repaint();
        ventana.setLayout(new CardLayout());
        Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        TitledBorder titulo = BorderFactory.createTitledBorder(border, "Autores", 0, (int)CENTER_ALIGNMENT, fuenteTitulo);
        titulo.setTitleColor(Color.black);
        JPanel panel = new JPanel();
        JPanel panel0 = new JPanel();
        JPanel panel1 =new JPanel();
        JPanel panel2 = new JPanel();
        JTextArea texto = new JTextArea(5,1);
        JButton volver = new JButton("Volver");


        panel.setLayout(new GridLayout(3, 1));
        panel.setBorder(titulo);
        panel0.setLayout(new FlowLayout());
        panel1.setLayout(new GridLayout(1, 3));

        texto.setText(DANIEL + "\n" + PABLO + "\n" + ISMA + "\n" + TITOROBERT + "\n" + JESUS);
        texto.setAlignmentX(CENTER_ALIGNMENT);
        texto.setAlignmentY(CENTER_ALIGNMENT);
        texto.setBackground(color);
        texto.setEditable(false);
        texto.setFocusable(false);
        texto.setFont(fuenteAutores);
        panel1.add(new JLabel(""));
        panel1.add(texto);
        panel1.add(new JLabel(""));
        panel2.add(volver);
        panel.add(panel0);
        panel.add(panel1);
        panel.add(panel2);

        volver.setBackground(color);
        panel.setBackground(color);
        panel0.setBackground(color);
        panel1.setBackground(color);
        panel2.setBackground(color);
        ventana.setBackground(color);
        ventana.add(panel);
        setVisible(true);


        volver.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cargarVentanaComienzo();
            }
        });

    }
    public void cargarVentanaMapa(){
        ventana.removeAll();
        ventana.repaint();
        Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        TitledBorder titulo = BorderFactory.createTitledBorder(border, "Autores", 0, (int)CENTER_ALIGNMENT, fuenteTitulo);
        titulo.setTitleColor(Color.black);

        JButton volver = new JButton("Volver");


        ImageIcon foto = new ImageIcon(getClass().getResource("mapa-metro-rotterdam.png"));

        JLabel img = new JLabel(foto);
        ventana.setLayout(new CardLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBorder(titulo);
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.add(img);
        panel1.add(volver);
        panel.add(panel1);
        ventana.add(panel);
        setVisible(true);


        volver.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cargarVentanaComienzo();
            }
        });
    }
    public void cargarVentanaRecorrido(String fin){
        ventana.removeAll();
        ventana.repaint();
        ventana.setLayout(new CardLayout());
        Border border = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
        TitledBorder titulo = BorderFactory.createTitledBorder(border, "Recorrido", 0, (int)CENTER_ALIGNMENT, fuenteTitulo);
        titulo.setTitleColor(Color.black);
        JPanel panel = new JPanel();
        JPanel panel0 = new JPanel();
        JPanel panel1 =new JPanel();
        JPanel panel2 = new JPanel();
        JTextArea texto = new JTextArea();
        JButton volver = new JButton("Volver");


        panel.setLayout(new GridLayout(3, 1));
        panel.setBorder(titulo);
        panel0.setLayout(new FlowLayout());
        panel1.setLayout(new GridLayout(1, 3));

        texto.setText(fin);
        texto.setAlignmentX(CENTER_ALIGNMENT);
        texto.setAlignmentY(CENTER_ALIGNMENT);
        texto.setBackground(color);
        texto.setEditable(false);
        texto.setFocusable(false);
        texto.setFont(fuenteAutores);
        panel1.add(new JLabel(""));
        panel1.add(texto);
        panel1.add(new JLabel(""));
        panel2.add(volver);
        panel.add(panel0);
        panel.add(panel1);
        panel.add(panel2);

        volver.setBackground(color);
        panel.setBackground(color);
        panel0.setBackground(color);
        panel1.setBackground(color);
        panel2.setBackground(color);
        ventana.setBackground(color);
        ventana.add(panel);
        setVisible(true);


        volver.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cargarVentanaComienzo();
            }
        });

    }
}
