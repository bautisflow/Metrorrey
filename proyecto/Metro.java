package proyecto;


import java.util.ArrayList;
import java.util.HashMap;

public class Metro {
    public static final int TRANSBORDO = 3; //3 minutos en hacer el transbordo
    private HashMap<Integer,Estacion> listaEstaciones;
    private HashMap<Integer,Peso> listaPesos;
    private Peso peso;


    public Metro(){
        listaEstaciones = new HashMap<Integer,Estacion>();
        listaPesos= new HashMap<Integer,Peso>();
        rellenar();
    }
    public void rellenar(){
        //A
        listaEstaciones.put(0, new Estacion(0,"Schiedam Centrum",1,3,true ,new boolean[]{true,true,true,false,false},"51 55 16.69 N", "4 24 38.44 E"));
        listaEstaciones.put(1, new Estacion(1,"Marconiplein",1,1,false ,null,"51 54 47.99 N", "4 25 58 E"));
        listaEstaciones.put(2, new Estacion(2,"Delfshaven",1,1,false ,null,"51 54 36.28 N", "4 26 44.66 E"));
        listaEstaciones.put(3, new Estacion(3,"Coolhaven",1,1,false ,null,"51 54 34.99 N", "4 27 29 E"));
        listaEstaciones.put(4, new Estacion(4,"Dijkzigt",1,1,false ,null,"51 54 43.99 N","4 27 57.99 E"));
        listaEstaciones.put(5, new Estacion(5,"Eendrachtsplein",1,1,false ,null,"51 54 59 N", "4 28 24.99 E"));
        listaEstaciones.put(6, new Estacion(6,"Beurs",1,5,true ,new boolean[]{true,true,true,true,true},"51 55 6.99 N", "4 28 50 E"));
        listaEstaciones.put(7, new Estacion(7,"Blaak",1,1,false ,null,"51 55 12 N", "4 29 21 E"));
        listaEstaciones.put(8, new Estacion(8,"Oostplein",1,1,false ,null,"51 55 23 N", "4 29 48.99 E"));
        listaEstaciones.put(9, new Estacion(9,"Gerdesiaweg",1,1,false ,null,"51 55 32.99 N","4 30 21.99 E"));
        listaEstaciones.put(10, new Estacion(10,"Voorschoterlaan",1,1,false ,null,"51 55 29.99 N", "4 30 47 E"));
        listaEstaciones.put(11, new Estacion(11,"Kralingse Zoom",1,1,false ,null,"51 55 17 N","4 32 0.99 E"));
        listaEstaciones.put(12, new Estacion(12,"Capelsebrug",1,3,true ,new boolean[]{true,true,true,false,false},"51 57 25.99 N", "4 32 57.99 E"));
        listaEstaciones.put(13, new Estacion(13,"Schenkel",1,3,false ,new boolean[]{true,true,true,false,false},"51 55 54.99 N","4 33 48.99 E"));
        listaEstaciones.put(14, new Estacion(14,"Prinsenlaan",1,3,false ,new boolean[]{true,true,true,false,false},"51 56 26.99 N", "4 33 24 E"));
        listaEstaciones.put(15, new Estacion(15,"Oosterflank",1,3,false ,new boolean[]{true,true,true,false,false},"51 56 44.99 N","4 33 15.99 E"));
        listaEstaciones.put(16, new Estacion(16,"Alexander",1,3,false ,new boolean[]{true,true,true,false,false},"51 57 6.99 N", "4 33 10 E"));
        listaEstaciones.put(17, new Estacion(17,"Graskruid",1,3,false ,new boolean[]{true,true,true,false,false},"51 57 25.99 N","4 32 57.99 E"));
        listaEstaciones.put(18, new Estacion(18,"Romeynshof",1,3,false ,new boolean[]{true,true,true,false,false},"51 57 42 N", "4 32 34 E"));
        listaEstaciones.put(19, new Estacion(19,"Binnenhof",1,3,false ,new boolean[]{true,true,true,false,false},"51 57 37 N", "4 32 8.99 E"));

        //B
        listaEstaciones.put(20, new Estacion(20,"Schiedam Centrum",2,3,true ,new boolean[]{true,true,true,false,false},"51 55 16.69 N", "4 24 38.44 E"));
        listaEstaciones.put(21, new Estacion(21,"Marconiplein",2,1,false ,null,"51 54 47.99 N", "4 25 58 E"));
        listaEstaciones.put(22, new Estacion(22,"Delfshaven",2,1,false ,null,"51 54 36.28 N", "4 26 44.66 E"));
        listaEstaciones.put(23, new Estacion(23,"Coolhaven",1,1,false ,null,"51 54 34.99 N", "4 27 29 E"));
        listaEstaciones.put(24, new Estacion(24,"Dijkzigt",1,1,false ,null,"51 54 43.99 N","4 27 57.99 E"));
        listaEstaciones.put(25, new Estacion(25,"Eendrachtsplein",1,1,false ,null,"51 54 59 N", "4 28 24.99 E"));
        listaEstaciones.put(26, new Estacion(26,"Beurs",1,5,true ,new boolean[]{true,true,true,true,true},"51 55 6.99 N", "4 28 50 E"));
        listaEstaciones.put(27, new Estacion(27,"Blaak",1,1,false ,null,"51 55 12 N", "4 29 21 E"));
        listaEstaciones.put(28, new Estacion(28,"Oostplein",1,1,false ,null,"51 55 23 N", "4 29 48.99 E"));
        listaEstaciones.put(29, new Estacion(29,"Gerdesiaweg",1,1,false ,null,"51 55 32.99 N","4 30 21.99 E"));
        listaEstaciones.put(30, new Estacion(30,"Voorschoterlaan",1,1,false ,null,"51 55 29.99 N", "4 30 47 E"));
        listaEstaciones.put(31, new Estacion(31,"Kralingse Zoom",1,1,false ,null,"51 55 17 N","4 32 0.99 E"));
        listaEstaciones.put(32, new Estacion(32,"Capelsebrug",1,3,true ,new boolean[]{true,true,true,false,false},"51 57 25.99 N", "4 32 57.99 E"));
        listaEstaciones.put(33, new Estacion(33,"Schenkel",1,3,false ,new boolean[]{true,true,true,false,false},"51 55 54.99 N","4 33 48.99 E"));
        listaEstaciones.put(34, new Estacion(34,"Prinsenlaan",1,3,false ,new boolean[]{true,true,true,false,false},"51 56 26.99 N", "4 33 24 E"));
        listaEstaciones.put(35, new Estacion(35,"Oosterflank",1,3,false ,new boolean[]{true,true,true,false,false},"51 56 44.99 N","4 33 15.99 E"));
        listaEstaciones.put(36, new Estacion(36,"Alexander",1,3,false ,new boolean[]{true,true,true,false,false},"51 57 6.99 N", "4 33 10 E"));
        listaEstaciones.put(37, new Estacion(37,"Graskruid",1,3,false ,new boolean[]{true,true,true,false,false},"51 57 25.99 N","4 32 57.99 E"));
        listaEstaciones.put(38, new Estacion(38,"Hesseplaats",1,3,true ,new boolean[]{true,true,true,false,false},"51 57 47 N", "4 33 7.99 E"));
        listaEstaciones.put(39, new Estacion(39,"Nieuw Verlaat",1,3,true ,new boolean[]{true,true,true,false,false},"51 57 53.49 N", "4 33 42.99 E"));
        listaEstaciones.put(40, new Estacion(40,"Ambachtsland",1,3,true ,new boolean[]{true,true,true,false,false},"51 57 56.99 N", "4 34 13 E"));
        listaEstaciones.put(41, new Estacion(41,"De Tochten",1,3,true ,new boolean[]{true,true,true,false,false},"51 58 7.36 N", "4 34 41.31 E"));
        listaEstaciones.put(42, new Estacion(42,"Nesselande",1,3,true ,new boolean[]{true,true,true,false,false},"51 58 44.6 N", "4 35 11.5 E"));

        //C
        listaEstaciones.put(43, new Estacion(43,"De akkers",1,3,true ,new boolean[]{true,true,true,false,false},"51 49 59.99 N", "4 19 10.99 E"));
        listaEstaciones.put(44, new Estacion(44,"Heemraadlaan",1,3,true ,new boolean[]{true,true,true,false,false},"51 50 16 N", "4 19 54 E"));
        listaEstaciones.put(45, new Estacion(45,"Spijkenisse Centrum",1,3,true ,new boolean[]{true,true,true,false,false},"51 50 47 N", "4 20 3.99 E"));
        listaEstaciones.put(46, new Estacion(46,"Zalmplaat",1,3,true ,new boolean[]{true,true,true,false,false},"51 51 19 N", "4 21 46 E"));
        listaEstaciones.put(47, new Estacion(47,"Hoogvliet",1,3,true ,new boolean[]{true,true,true,false,false},"51 51 38 N", "4 22 0 E"));
        listaEstaciones.put(48, new Estacion(48,"Tussenwater",1,3,true ,new boolean[]{true,true,true,false,false},"51 51 46 N", "4 22 36 E"));
        listaEstaciones.put(49, new Estacion(49,"Pernis",1,3,true ,new boolean[]{true,true,true,false,false},"51 53 5.99 N", "4 22 54.99 E"));
        listaEstaciones.put(50, new Estacion(50,"Vijfsluizen",1,3,true ,new boolean[]{true,true,true,false,false},"51 54 32 N", "4 22 18.99 E"));
        listaEstaciones.put(51, new Estacion(51,"Troelstralaan",1,3,true ,new boolean[]{true,true,true,false,false},"51 54 55 N", "4 23 3.99 E"));
        listaEstaciones.put(52, new Estacion(52,"Parkweg",1,3,true ,new boolean[]{true,true,true,false,false},"51 55 16.99 N", "26 7 0.1 E"));
        listaEstaciones.put(53, new Estacion(0,"Schiedam Centrum",1,3,true ,new boolean[]{true,true,true,false,false},"51 55 16.69 N", "4 24 38.44 E"));
        listaEstaciones.put(54, new Estacion(1,"Marconiplein",1,1,false ,null,"51 54 47.99 N", "4 25 58 E"));
        listaEstaciones.put(55, new Estacion(2,"Delfshaven",1,1,false ,null,"51 54 36.28 N", "4 26 44.66 E"));
        listaEstaciones.put(56, new Estacion(3,"Coolhaven",1,1,false ,null,"51 54 34.99 N", "4 27 29 E"));
        listaEstaciones.put(57, new Estacion(4,"Dijkzigt",1,1,false ,null,"51 54 43.99 N","4 27 57.99 E"));
        listaEstaciones.put(58, new Estacion(5,"Eendrachtsplein",1,1,false ,null,"51 54 59 N", "4 28 24.99 E"));
        listaEstaciones.put(59, new Estacion(6,"Beurs",1,5,true ,new boolean[]{true,true,true,true,true},"51 55 6.99 N", "4 28 50 E"));
        listaEstaciones.put(60, new Estacion(7,"Blaak",1,1,false ,null,"51 55 12 N", "4 29 21 E"));
        listaEstaciones.put(61, new Estacion(8,"Oostplein",1,1,false ,null,"51 55 23 N", "4 29 48.99 E"));
        listaEstaciones.put(62, new Estacion(9,"Gerdesiaweg",1,1,false ,null,"51 55 32.99 N","4 30 21.99 E"));
        listaEstaciones.put(63, new Estacion(10,"Voorschoterlaan",1,1,false ,null,"51 55 29.99 N", "4 30 47 E"));
        listaEstaciones.put(64, new Estacion(11,"Kralingse Zoom",1,1,false ,null,"51 55 17 N","4 32 0.99 E"));
        listaEstaciones.put(65, new Estacion(12,"Capelsebrug",1,3,true ,new boolean[]{true,true,true,false,false},"51 57 25.99 N", "4 32 57.99 E"));
        listaEstaciones.put(66, new Estacion(66,"Slotlaan",1,3,true ,new boolean[]{true,true,true,false,false},"51 55 42.99 N", "4 34 42.99 E"));
        listaEstaciones.put(67, new Estacion(67,"Capelle Centrum",1,3,true ,new boolean[]{true,true,true,false,false},"51 55 53 N", "4 35 22.99 E"));
        listaEstaciones.put(68, new Estacion(68,"De Terp",1,3,true ,new boolean[]{true,true,true,false,false},"51 56 8.99 N", "4 35 59.99 E"));

        //D
        listaEstaciones.put(69, new Estacion(43,"De akkers",1,3,true ,new boolean[]{true,true,true,false,false},"51 49 59.99 N", "4 19 10.99 E"));
        listaEstaciones.put(70, new Estacion(44,"Heemraadlaan",1,3,true ,new boolean[]{true,true,true,false,false},"51 50 16 N", "4 19 54 E"));
        listaEstaciones.put(71, new Estacion(45,"Spijkenisse Centrum",1,3,true ,new boolean[]{true,true,true,false,false},"51 50 47 N", "4 20 3.99 E"));
        listaEstaciones.put(72, new Estacion(46,"Zalmplaat",1,3,true ,new boolean[]{true,true,true,false,false},"51 51 19 N", "4 21 46 E"));
        listaEstaciones.put(73, new Estacion(73,"Hoogvliet",1,3,true ,new boolean[]{true,true,true,false,false},"51 51 38 N", "4 22 0 E"));
        listaEstaciones.put(74, new Estacion(74,"Tussenwater",1,3,true ,new boolean[]{true,true,true,false,false},"51 51 46 N", "4 22 36 E"));
        listaEstaciones.put(75, new Estacion(75,"Poortugaal",1,3,true ,new boolean[]{true,true,true,false,false},"51 51 42 N","4 23 44.99 E"));
        listaEstaciones.put(76, new Estacion(76,"Rhoon",1,3,true ,new boolean[]{true,true,true,false,false},"51 51 33 N", "4 25 9 E"));
        listaEstaciones.put(77, new Estacion(77,"Slinge",1,3,true ,new boolean[]{true,true,true,false,false},"51 52 28.99 N", "4 28 40 E"));
        listaEstaciones.put(78, new Estacion(78,"Zuidplein",1,3,true ,new boolean[]{true,true,true,false,false},"51 53 12.99 N", "4 29 18.99 E"));
        listaEstaciones.put(79, new Estacion(79,"Maashaven",1,3,true ,new boolean[]{true,true,true,false,false},"51 53 49.99 N", "4 29 40.99 E"));
        listaEstaciones.put(80, new Estacion(80,"Rijnhaven",1,3,true ,new boolean[]{true,true,true,false,false},"51 54 13.99 N", "4 29 48.99 E"));
        listaEstaciones.put(81, new Estacion(81,"Wilhelminaplein",1,3,true ,new boolean[]{true,true,true,false,false},"51 54 25.99 N", "4 29 38 E"));
        listaEstaciones.put(82, new Estacion(82,"Leuvehaven",1,3,true ,new boolean[]{true,true,true,false,false},"51 54 49.99 N", "4 28 54.99 E"));
        listaEstaciones.put(83, new Estacion(83,"Beurs",1,3,true ,new boolean[]{true,true,true,false,false},"51 55 6.99 N", "4 28 50 E"));
        listaEstaciones.put(84, new Estacion(84,"Stadhuis",1,3,true ,new boolean[]{true,true,true,false,false},"51 55 23.99 N","4 28 41.99 E"));
        listaEstaciones.put(85, new Estacion(85,"Rotterdam Centraal",1,3,true ,new boolean[]{true,true,true,false,false},"51 55 29.99 N", "4 28 9.99 E"));


        //E
        listaEstaciones.put(86, new Estacion(86,"Slinge",1,3,true ,new boolean[]{true,true,true,false,false},"51 52 28.99 N", "4 28 40 E"));
        listaEstaciones.put(87, new Estacion(87,"Zuidplein",1,3,true ,new boolean[]{true,true,true,false,false},"51 53 12.99 N", "4 29 18.99 E"));
        listaEstaciones.put(88, new Estacion(88,"Maashaven",1,3,true ,new boolean[]{true,true,true,false,false},"51 53 49.99 N", "4 29 40.99 E"));
        listaEstaciones.put(89, new Estacion(89,"Rijnhaven",1,3,true ,new boolean[]{true,true,true,false,false},"51 54 13.99 N", "4 29 48.99 E"));
        listaEstaciones.put(90, new Estacion(90,"Wilhelminaplein",1,3,true ,new boolean[]{true,true,true,false,false},"51 54 25.99 N", "4 29 38 E"));
        listaEstaciones.put(91, new Estacion(91,"Leuvehaven",1,3,true ,new boolean[]{true,true,true,false,false},"51 54 49.99 N", "4 28 54.99 E"));
        listaEstaciones.put(92, new Estacion(92,"Beurs",1,3,true ,new boolean[]{true,true,true,false,false},"51 55 6.99 N", "4 28 50 E"));
        listaEstaciones.put(93, new Estacion(93,"Stadhuis",1,3,true ,new boolean[]{true,true,true,false,false},"51 55 23.99 N","4 28 41.99 E"));
        listaEstaciones.put(94, new Estacion(94,"Rotterdam Centraal",1,3,true ,new boolean[]{true,true,true,false,false},"51 55 29.99 N", "4 28 9.99 E"));
        listaEstaciones.put(95, new Estacion(95,"Blijdorp",1,3,true ,new boolean[]{true,true,true,false,false},"51 55 50.99 N", "26 7 0.1 E"));
        listaEstaciones.put(96, new Estacion(96,"Melanchthonweg",1,3,true ,new boolean[]{true,true,true,false,false},"51 56 53.99 N", "4 27 51.99 E"));
        listaEstaciones.put(97, new Estacion(97,"Meijersplein",1,3,true ,new boolean[]{true,true,true,false,false},"51 57 21.99 N", "4 27 43.99 E"));
        listaEstaciones.put(98, new Estacion(98,"Rodenrijs",1,3,true ,new boolean[]{true,true,true,false,false},"51 58 33.99 N","4 27 38 E"));
        listaEstaciones.put(99, new Estacion(99,"Berkel Westpolder",1,3,true ,new boolean[]{true,true,true,false,false},"51 59 4.99 N", "4 27 26.99 E"));
        listaEstaciones.put(100, new Estacion(100,"Pijnacker Zuid",1,3,true ,new boolean[]{true,true,true,false,false},"52 0 16.99 N", "4 26 44.99 E"));
        listaEstaciones.put(101, new Estacion(101,"Pijnacker Centrum",1,3,true ,new boolean[]{true,true,true,false,false},"52 1 10.99 N", "4 26 13.99 E"));
        listaEstaciones.put(102, new Estacion(102,"Nootdorp",1,3,true ,new boolean[]{true,true,true,false,false},"52 2 52 N", "4 24 51.99 E"));
        listaEstaciones.put(103, new Estacion(103,"Leidschenveen",1,3,true ,new boolean[]{true,true,true,false,false},"52 3 51.99 N", "4 24 0 E"));
        listaEstaciones.put(104, new Estacion(104,"Forepark",1,3,true ,new boolean[]{true,true,true,false,false},"52 4 12 N", "4 23 33 E"));
        listaEstaciones.put(105, new Estacion(105,"Leidschendam-Voorburg",1,3,true ,new boolean[]{true,true,true,false,false},"52 4 39 N", "4 22 55.99 E"));
        listaEstaciones.put(106, new Estacion(106,"Voorburg Loo",1,3,true ,new boolean[]{true,true,true,false,false},"52 4 55.99 N","4 21 56.99 E"));
        listaEstaciones.put(107, new Estacion(107,"Laan van NOI",1,3,true ,new boolean[]{true,true,true,false,false},"52 4 43.99 N", "4 20 35 E"));
        listaEstaciones.put(108, new Estacion(108,"Den Haag Centraal",1,3,true ,new boolean[]{true,true,true,false,false},"52 4 51.99 N", "4 19 26 E"));
        ajustarValores();
        cargarPesos();

    }
    public void ajustarValores(){
        Estacion auxiliar = null;
        int linea=0;
        for (int i=0; i<109;i++){
            auxiliar= listaEstaciones.get(i);
            auxiliar.setIdEstacion(i);
            auxiliar.setLinea(queLinea(auxiliar.getIdEstacion()));
            cargarValoresTransbordo(auxiliar);
            auxiliar.setLinea(queLinea(auxiliar.getIdEstacion()));

        }
        listaEstaciones.get(0).setLinea(1);
    }
    public void cargarValoresTransbordo(Estacion auxiliar){
        //Si se cumple estamos ante una estacion con transbordo!
        if( auxiliar.getIdEstacion()==0||auxiliar.getIdEstacion()==6||auxiliar.getIdEstacion()==12||auxiliar.getIdEstacion()==20||auxiliar.getIdEstacion()==26|auxiliar.getIdEstacion()==32||auxiliar.getIdEstacion()==53||auxiliar.getIdEstacion()==59||auxiliar.getIdEstacion()==65||auxiliar.getIdEstacion()==83||auxiliar.getIdEstacion()==85||auxiliar.getIdEstacion()==92||auxiliar.getIdEstacion()==94){
            listaEstaciones.get(auxiliar.getIdEstacion()).setTieneTransbordo(true);
            switch (auxiliar.getIdEstacion()){

                //T0 centrum
                case 0:
                    listaEstaciones.get(0).setLineasPertenece(new boolean[]{true,true,true,false,false});
                    break;
                case 20:
                    listaEstaciones.get(20).setLineasPertenece(new boolean[]{true,true,true,false,false});
                    break;
                case 53:
                    listaEstaciones.get(53).setLineasPertenece(new boolean[]{true,true,true,false,false});
                    break;


                //T1 beurs
                case 6:
                    listaEstaciones.get(6).setLineasPertenece(new boolean[]{true,true,true,true,true});
                    break;
                case 26:
                    listaEstaciones.get(26).setLineasPertenece(new boolean[]{true,true,true,true,true});
                    break;
                case 59:
                    listaEstaciones.get(59).setLineasPertenece(new boolean[]{true,true,true,true,true});
                    break;
                case 83:
                    listaEstaciones.get(83).setLineasPertenece(new boolean[]{true,true,true,true,true});
                    break;
                case 92:
                    listaEstaciones.get(92).setLineasPertenece(new boolean[]{true,true,true,true,true});
                    break;

                //T2 capel
                case 12:
                    listaEstaciones.get(12).setLineasPertenece(new boolean[]{true,true,true,false,false});
                    break;
                case 32:
                    listaEstaciones.get(32).setLineasPertenece(new boolean[]{true,true,true,false,false});
                    break;
                case 65:
                    listaEstaciones.get(65).setLineasPertenece(new boolean[]{true,true,true,false,false});
                    break;

                //T3 Rotterdam
                case 85:
                    listaEstaciones.get(85).setLineasPertenece(new boolean[]{false,false,false,true,true});
                    break;
                case 94:
                    listaEstaciones.get(94).setLineasPertenece(new boolean[]{false,false,false,true,true});
                    break;
            }

        }else{
            listaEstaciones.get(auxiliar.getIdEstacion()).setTieneTransbordo(false);
            listaEstaciones.get(auxiliar.getIdEstacion()).setLineasPertenece(null);
        }
    }
    public int queLinea(int id){
        int resultado=0;
        if(id<20&&id>0){
            resultado=1;
        }else if(id<43 && id>19){

            resultado=2;
        }else if (id<69 && id>42){

            resultado=3;
        }else if (id<86 && id>68){

            resultado=4;
        }else if (id<109&&id>85) {
            resultado=5;
        }
        return resultado;
    }
    public HashMap<Integer, Estacion> getListaEstaciones() {
        return listaEstaciones;
    }

    public ArrayList<Integer> obternerHijos (int id){
        ArrayList<Integer> array = new ArrayList<>();
        if (id==19||id==42||id==68||id==108){
            array.add(id-1);
        }else if (id==43||id==69||id==86){
            array.add(id+1);
        }else if (id==0){
            array.add(1);
            array.add(20);
            array.add(53);
        }else if (id==20){
            array.add(21);
            array.add(0);
            array.add(53);
        }else if (id==53){
            array.add(54);
            array.add(52);
            array.add(0);
            array.add(20);
        }else if (id==6){
            array.add(7);
            array.add(5);
            array.add(26);
            array.add(59);
            array.add(83);
            array.add(92);
        }else if (id==26){
            array.add(27);
            array.add(25);
            array.add(6);
            array.add(59);
            array.add(83);
            array.add(92);
        }else if (id==59){
            array.add(60);
            array.add(58);
            array.add(6);
            array.add(26);
            array.add(83);
            array.add(92);
        }else if (id==83){
            array.add(84);
            array.add(82);
            array.add(6);
            array.add(26);
            array.add(59);
            array.add(92);
        }else if (id==92){
            array.add(93);
            array.add(91);
            array.add(6);
            array.add(26);
            array.add(59);
            array.add(83);
        }else if (id==12){
            array.add(13);
            array.add(11);
            array.add(32);
            array.add(65);
        }else if (id==32){
            array.add(33);
            array.add(31);
            array.add(12);
            array.add(65);
        }else if (id==65){
            array.add(66);
            array.add(64);
            array.add(12);
            array.add(32);
        }else if (id==85){
            array.add(84);
            array.add(94);
        }else if (id==94){
            array.add(95);
            array.add(93);
            array.add(85);
        }else {
            array.add(id + 1);
            array.add(id - 1);
        }
        return array;
    }

    public int getEstacion(String nombre){
        int e =-1;
        for (Estacion i : listaEstaciones.values()){
            if (i.getNombreEstacion().equals(nombre)){
                return i.getIdEstacion();
            }
        }
        return e;
    }
    public void cargarPesos(){
        peso = new Peso(2,TRANSBORDO,TRANSBORDO,0,0,0);
        listaPesos.put(0, peso);

        peso.asignarPesos(2, 2, 0, 0, 0, 0);
        listaPesos.put(1, peso);

        peso.asignarPesos(3, 2, 0, 0, 0, 0);
        listaPesos.put(2, peso);

        peso.asignarPesos(3, 3, 0, 0, 0, 0);
        listaPesos.put(3, peso);


        peso.asignarPesos(1, 3, 0, 0, 0, 0);
        listaPesos.put(4, peso);

        peso.asignarPesos(1, 1, 0, 0, 0, 0);
        listaPesos.put(5, peso);


        peso.asignarPesos(2, 1, TRANSBORDO, TRANSBORDO, TRANSBORDO, TRANSBORDO);
        listaPesos.put(6, peso);

        peso.asignarPesos(1, 2, 0, 0, 0, 0);
        listaPesos.put(7, peso);

        peso.asignarPesos(2, 1, 0, 0, 0, 0);
        listaPesos.put(8, peso);

        peso.asignarPesos(1, 2, 0, 0, 0, 0);
        listaPesos.put(9, peso);


        peso.asignarPesos(2, 1, 0, 0, 0, 0);
        listaPesos.put(10, peso);

        peso.asignarPesos(2, 2, 0, 0, 0, 0);
        listaPesos.put(11, peso);

        peso.asignarPesos(3, 2, TRANSBORDO, 0, 0, 0);
        listaPesos.put(12, peso);

        peso.asignarPesos(3, 2, TRANSBORDO, 0, 0, 0);
        listaPesos.put(13, peso);

        peso.asignarPesos(1, 3, 0, 0, 0, 0);
        listaPesos.put(14, peso);

        peso.asignarPesos(2, 1, 0, 0, 0, 0);
        listaPesos.put(15, peso);

        peso.asignarPesos(1, 2, 0, 0, 0, 0);
        listaPesos.put(16, peso);

        peso.asignarPesos(2, 1, 0, 0, 0, 0);
        listaPesos.put(17, peso);

        peso.asignarPesos(1, 2, 0, 0, 0, 0);
        listaPesos.put(18, peso);

        peso.asignarPesos(1, 0, 0, 0, 0, 0);
        listaPesos.put(19, peso);


        peso.asignarPesos(2, TRANSBORDO, TRANSBORDO, 0, 0, 0);
        listaPesos.put(20, peso);

        peso.asignarPesos(2, 2, 0, 0, 0, 0);
        listaPesos.put(21, peso);

        peso.asignarPesos(3, 2, 0, 0, 0, 0);
        listaPesos.put(22, peso);


        peso.asignarPesos(3, 3, 0, 0, 0, 0);
        listaPesos.put(23, peso);

        peso.asignarPesos(1, 3, 0, 0, 0, 0);
        listaPesos.put(24, peso);


        peso.asignarPesos(1, 1, 0, 0, 0, 0);
        listaPesos.put(25, peso);


        peso.asignarPesos(2, 2, TRANSBORDO, TRANSBORDO, TRANSBORDO, TRANSBORDO);
        listaPesos.put(26, peso);

        peso.asignarPesos(1, 2, 0, 0, 0, 0);
        listaPesos.put(27, peso);

        peso.asignarPesos(2, 1, 0, 0, 0, 0);
        listaPesos.put(28, peso);


        peso.asignarPesos(1, 2, 0, 0, 0, 0);
        listaPesos.put(29, peso);

        peso.asignarPesos(2, 1, 0, 0, 0, 0);
        listaPesos.put(30, peso);

        peso.asignarPesos(2, 2, 0, 0, 0, 0);
        listaPesos.put(31, peso);

        peso.asignarPesos(3, 2, TRANSBORDO, 0, 0, 0);
        listaPesos.put(32, peso);

        peso.asignarPesos(1, 3, 0, 0, 0, 0);
        listaPesos.put(33, peso);

        peso.asignarPesos(1, 1, 0, 0, 0, 0);
        listaPesos.put(34, peso);

        peso.asignarPesos(2, 1, 0, 0, 0, 0);
        listaPesos.put(35, peso);

        peso.asignarPesos(1, 2, 0, 0, 0, 0);
        listaPesos.put(36, peso);

        peso.asignarPesos(2, 1, 0, 0, 0, 0);
        listaPesos.put(37, peso);

        peso.asignarPesos(2, 2, 0, 0, 0, 0);
        listaPesos.put(38, peso);

        peso.asignarPesos(2, 2, 0, 0, 0, 0);
        listaPesos.put(39, peso);

        peso.asignarPesos(2, 2, 0, 0, 0, 0);
        listaPesos.put(40, peso);

        peso.asignarPesos(2, 2, 0, 0, 0, 0);
        listaPesos.put(41, peso);

        peso.asignarPesos(2, 0, 0, 0, 0, 0);
        listaPesos.put(42, peso);

        peso.asignarPesos(2, 0, 0, 0, 0, 0);
        listaPesos.put(43, peso);

        peso.asignarPesos(1, 2, 0, 0, 0, 0);
        listaPesos.put(44, peso);

        peso.asignarPesos(3, 1, 0, 0, 0, 0);
        listaPesos.put(45, peso);

        peso.asignarPesos(1, 3, 0, 0, 0, 0);
        listaPesos.put(46, peso);

        peso.asignarPesos(2, 1, 0, 0, 0, 0);
        listaPesos.put(47, peso);

        peso.asignarPesos(3, 2, 0, 0, 0, 0);
        listaPesos.put(48, peso);

        peso.asignarPesos(3, 3, 0, 0, 0, 0);
        listaPesos.put(49, peso);

        peso.asignarPesos(1, 3, 0, 0, 0, 0);
        listaPesos.put(50, peso);

        peso.asignarPesos(3, 1, 0, 0, 0, 0);
        listaPesos.put(51, peso);

        peso.asignarPesos(3, 3, 0, 0, 0, 0);
        listaPesos.put(52, peso);

        peso.asignarPesos(2, 3, 0, 0, 0, 0);
        listaPesos.put(53, peso);

        peso.asignarPesos(2, 2, 0, 0, 0, 0);
        listaPesos.put(54, peso);

        peso.asignarPesos(3, 2, 0, 0, 0, 0);
        listaPesos.put(55, peso);

        peso.asignarPesos(3, 3, 0, 0, 0, 0);
        listaPesos.put(56, peso);

        peso.asignarPesos(1, 3, 0, 0, 0, 0);
        listaPesos.put(57, peso);

        peso.asignarPesos(1, 1, 0, 0, 0, 0);
        listaPesos.put(58, peso);

        peso.asignarPesos(2, 1, TRANSBORDO, TRANSBORDO, TRANSBORDO, TRANSBORDO);
        listaPesos.put(59, peso);

        peso.asignarPesos(1, 2, 0, 0, 0, 0);
        listaPesos.put(60, peso);

        peso.asignarPesos(2, 1, 0, 0, 0, 0);
        listaPesos.put(61, peso);

        peso.asignarPesos(1, 2, 0, 0, 0, 0);
        listaPesos.put(62, peso);

        peso.asignarPesos(2, 1, 0, 0, 0, 0);
        listaPesos.put(63, peso);

        peso.asignarPesos(2, 2, 0, 0, 0, 0);
        listaPesos.put(64, peso);

        peso.asignarPesos(3, 2, TRANSBORDO, 0, 0, 0);
        listaPesos.put(65, peso);

        peso.asignarPesos(1, 3, 0, 0, 0, 0);
        listaPesos.put(66, peso);

        peso.asignarPesos(1, 1, 0, 0, 0, 0);
        listaPesos.put(67, peso);

        peso.asignarPesos(1, 0, 0, 0, 0, 0);
        listaPesos.put(68, peso);

        peso.asignarPesos(2, 0, 0, 0, 0, 0);
        listaPesos.put(69, peso);

        peso.asignarPesos(1, 2, 0, 0, 0, 0);
        listaPesos.put(70, peso);

        peso.asignarPesos(3, 1, 0, 0, 0, 0);
        listaPesos.put(71, peso);

        peso.asignarPesos(1, 3, 0, 0, 0, 0);
        listaPesos.put(72, peso);

        peso.asignarPesos(2, 1, 0, 0, 0, 0);
        listaPesos.put(73, peso);

        peso.asignarPesos(2, 2, 0, 0, 0, 0);
        listaPesos.put(74, peso);

        peso.asignarPesos(2, 2, 0, 0, 0, 0);
        listaPesos.put(75, peso);

        peso.asignarPesos(1, 2, 0, 0, 0, 0);
        listaPesos.put(76, peso);

        peso.asignarPesos(3, 1, 0, 0, 0, 0);
        listaPesos.put(77, peso);

        peso.asignarPesos(2, 3, 0, 0, 0, 0);
        listaPesos.put(78, peso);

        peso.asignarPesos(2, 2, 0, 0, 0, 0);
        listaPesos.put(79, peso);

        peso.asignarPesos(1, 2, 0, 0, 0, 0);
        listaPesos.put(80, peso);

        peso.asignarPesos(1, 1, 0, 0, 0, 0);
        listaPesos.put(81, peso);

        peso.asignarPesos(1, 1, 0, 0, 0, 0);
        listaPesos.put(82, peso);

        peso.asignarPesos(1, 1, TRANSBORDO, TRANSBORDO, TRANSBORDO, TRANSBORDO);
        listaPesos.put(83, peso);

        peso.asignarPesos(1, 1, 0, 0, 0, 0);
        listaPesos.put(84, peso);

        peso.asignarPesos(1, TRANSBORDO, 0, 0, 0, 0);
        listaPesos.put(85, peso);

        peso.asignarPesos(3, 0, 0, 0, 0, 0);
        listaPesos.put(86, peso);

        peso.asignarPesos(2, 3, 0, 0, 0, 0);
        listaPesos.put(87, peso);

        peso.asignarPesos(2, 2, 0, 0, 0, 0);
        listaPesos.put(88, peso);

        peso.asignarPesos(1, 2, 0, 0, 0, 0);
        listaPesos.put(89, peso);

        peso.asignarPesos(1, 1, 0, 0, 0, 0);
        listaPesos.put(90, peso);

        peso.asignarPesos(1, 1, 0, 0, 0, 0);
        listaPesos.put(91, peso);

        peso.asignarPesos(1,1,TRANSBORDO,TRANSBORDO,TRANSBORDO,TRANSBORDO);
        listaPesos.put(92, peso);

        peso.asignarPesos(1,1,0,0,0,0);
        listaPesos.put(93, peso);

        peso.asignarPesos(2,1,TRANSBORDO,0,0,0);
        listaPesos.put(94, peso);

        peso.asignarPesos(3,2,0,0,0,0);
        listaPesos.put(95, peso);

        peso.asignarPesos(1,3,0,0,0,0);
        listaPesos.put(96, peso);

        peso.asignarPesos(3,1,0,0,0,0);
        listaPesos.put(97, peso);

        peso.asignarPesos(3,3,0,0,0,0);
        listaPesos.put(98, peso);

        peso.asignarPesos(2,3,0,0,0,0);
        listaPesos.put(99, peso);

        peso.asignarPesos(3,2,0,0,0,0);
        listaPesos.put(100, peso);

        peso.asignarPesos(4,3,0,0,0,0);
        listaPesos.put(101, peso);

        peso.asignarPesos(3,4,0,0,0,0);
        listaPesos.put(102, peso);

        peso.asignarPesos(2,3,0,0,0,0);
        listaPesos.put(103, peso);

        peso.asignarPesos(1,2,0,0,0,0);
        listaPesos.put(104, peso);

        peso.asignarPesos(1,1,0,0,0,0);
        listaPesos.put(105, peso);

        peso.asignarPesos(3,1,0,0,0,0);
        listaPesos.put(106, peso);

        peso.asignarPesos(2,3,0,0,0,0);
        listaPesos.put(107, peso);

        peso.asignarPesos(2,0,0,0,0,0);
        listaPesos.put(108, peso);


        
    }

    public HashMap<Integer, Peso> getListaPesos() {
        return listaPesos;
    }
}
