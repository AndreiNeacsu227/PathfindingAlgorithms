public class Dijkstra {

    int x = 0;
    int y = 0;
    int dist = 0;
    String ul = "S";

    public String [][] DijkstraAlg(String [][] gra) {
        dist++;

        for(int t = 0; t < gra.length; t++) {
            for (int k = 0; k < gra[t].length; k++) {
                if (gra[t][k].equals(ul)) {
                    x = t;
                    y = k;
                    for (int i = 1; i <= 4; i++) {
                        switch (i) {
                            case 1:
                                try {
                                    if (gra[x][y + 1] == ("O")) {
                                        gra[x][y + 1] = Integer.toString(dist);
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
                                        gra[x][y - 1] = Integer.toString(dist);
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
                                        gra[x - 1][y] = Integer.toString(dist);
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
                                        gra[x + 1][y] = Integer.toString(dist);
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
        }
        ul = Integer.toString(dist);

        for(int i = 0; i < gra.length; i++){
            System.out.println("\n");
            for(int j =0; j<gra[i].length;j++) {
                System.out.print(gra[i][j] + "  ");
            }
        }

        System.out.println("\n");
        System.out.println("=============================================");
        return DijkstraAlg(gra);
    }
}




