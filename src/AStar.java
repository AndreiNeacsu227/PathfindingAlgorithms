public class AStar {


    String [][] grSec = new String[5][5];
    Boolean [][] grVis = new Boolean[5][5];
    boolean initGrSec=false;
    int distDest =10000 ;
    int blocked = 0;


    int x = 0;
    int y = 0;
    int distF= 4;
    int distS = 0;




    public String [][] AStarAlg(String [][] gra) {
        distDest=10000;
        blocked=0;

        if (initGrSec==false) {
            for (int t = 0; t < gra.length; t++) {
                for (int k = 0; k < gra[t].length; k++) {
                    grSec[t][k] = gra[t][k];
                    grVis[t][k] = false;
                }
            }
        }

        initGrSec =true;
        grVis[x][y] = true;

        for(int t = 0; t < gra.length; t++) {
            for (int k = 0; k < gra[t].length; k++) {
                    for (int i = 1; i <= 4; i++) {
                        switch (i) {
                            case 1:
                                try {
                                    if (gra[x][y + 1] == ("O")) {
                                        gra[x][y + 1] = Integer.toString(Math.abs(x - distS) + Math.abs(y+1 - distS));
                                        grSec[x][y +1] = Integer.toString(Math.abs(x - distF) + Math.abs(y+1 - distF));
                                        break;
                                    } else if (gra[x][y + 1].equals("F")) {
                                        System.out.println("S-a gasit drumul");
                                        System.exit(0);
                                    } else {
                                        break;
                                    }
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    break;
                                }

                            case 2:
                                try {
                                    if (gra[x][y - 1] == "O") {
                                        gra[x][y - 1] = Integer.toString(Math.abs(x - distS) + Math.abs(y-1 - distS));
                                        grSec[x][y -1] = Integer.toString(Math.abs(x - distF) + Math.abs(y-1 - distF));
                                        break;
                                    } else if (gra[x][y - 1].equals("F")) {
                                        System.out.println("S-a gasit drumul");
                                        System.exit(0);
                                    } else {
                                        break;
                                    }
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    break;
                                }

                            case 3:
                                try {
                                    if (gra[x - 1][y] == "O") {
                                        gra[x - 1][y] = Integer.toString(Math.abs(x-1 - distS) + Math.abs(y - distS));
                                        grSec[x-1][y] = Integer.toString(Math.abs(x-1 - distF) + Math.abs(y - distF));
                                        break;
                                    } else if (gra[x - 1][y].equals("F")) {
                                        System.out.println("S-a gasit drumul");
                                        System.exit(0);
                                    } else {
                                        break;
                                    }
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    break;
                                }

                            case 4:
                                try {
                                    if (gra[x + 1][y] == "O") {
                                        gra[x + 1][y] = Integer.toString(Math.abs(x+1 - distS) + Math.abs(y - distS));
                                        grSec[x+1][y] = Integer.toString(Math.abs(x+1 - distF) + Math.abs(y - distF));
                                        break;
                                    } else if (gra[x + 1][y].equals("F")) {
                                        System.out.println("S-a gasit drumul");
                                        System.exit(0);
                                    } else {
                                        break;
                                    }
                                } catch (ArrayIndexOutOfBoundsException e) {
                                    break;
                                }
                        }
                    }
                }
            }



            for (int t = 0; t < gra.length; t++) {
                for (int k = 0; k < gra[t].length; k++) {
                        try {
                            int distF2 = Integer.parseInt(grSec[t][k]);
                            if ((distDest>= distF2)&&(grVis[t][k] == false)&&(grSec[t][k] != "0")){
                                x = t;
                                y = k;
                                distDest=distF2;
                                blocked = 1;

                            }
                        } catch (NumberFormatException e) {
                            continue;
                        }
                    }
                }


            if (blocked==0){
                System.out.println("DRUM BLOCAT");
                System.exit(0);
            }



        for(int i = 0; i < gra.length; i++){
            System.out.println("\n");
            for(int j =0; j<gra[i].length;j++) {
                System.out.print(gra[i][j] + "|");
                String formatat= String.format("%" + -7 + "s", grSec[i][j]);
                System.out.print(formatat);
            }
        }

        System.out.println("\n");
        System.out.println("Coordonatele: x = " + y+" y= " + x);
        System.out.println("=============================================");

        return AStarAlg(gra);
    }
}




