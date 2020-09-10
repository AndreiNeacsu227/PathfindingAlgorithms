import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Bfs {

    Queue<String> qu = new LinkedList<>();

    int x = 0;
    int y = 0;
    int vertex = 0;

    public String [][] BfsAlg(String [][] gra) {


        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                    try{
                        if (gra[x][y + 1] == ("O")) {
                            vertex++;
                            gra[x][y + 1] = Integer.toString(vertex);
                            qu.add(gra[x][y + 1]);
                            break;
                        }else if (gra[x][y + 1].equals("F")){
                            System.out.println("S-a gasit drumul");
                            System.exit(0);
                        }
                        else{
                            break;
                        }
                    }catch(ArrayIndexOutOfBoundsException e){
                        break;
                    }

                case 2:
                    try{
                        if (gra[x][y - 1] == "O") {
                            vertex++;
                            gra[x][y - 1] = Integer.toString(vertex);
                            qu.add(Integer.toString(vertex));
                            break;
                        } else if (gra[x][y - 1].equals("F")){
                            System.out.println("S-a gasit drumul");
                            System.exit(0);
                        }else{
                            break;
                        }
                    } catch(ArrayIndexOutOfBoundsException e){
                        break;
                    }

                case 3:
                    try{
                        if (gra[x - 1][y] == "O") {
                            vertex++;
                            gra[x - 1][y] = Integer.toString(vertex);
                            qu.add(Integer.toString(vertex));
                            break;
                        }else if (gra[x - 1][y].equals("F")){
                            System.out.println("S-a gasit drumul");
                            System.exit(0);
                        } else{
                            break;}
                    } catch (ArrayIndexOutOfBoundsException e){
                        break;
                    }

                case 4:
                    try{
                        if (gra[x + 1][y] == "O") {
                            vertex++;
                            gra[x + 1][y] = Integer.toString(vertex);
                            qu.add(Integer.toString(vertex));
                            break;
                        }else if (gra[x + 1][y].equals("F")){
                            System.out.println("S-a gasit drumul");
                            System.exit(0);
                        } else {
                            break;}
                    }
                    catch (ArrayIndexOutOfBoundsException e){
                        break;
                    }
            }
        }



        String ul = qu.poll();

        for(int i = 0; i < gra.length; i++){
            System.out.println("\n");
            for(int j =0; j<gra[i].length;j++) {

                if (gra[i][j].equals(ul)) {
                    x = i;
                    y = j;

                }
                String formatat= String.format("%" + -7 + "s", gra[i][j]);
                System.out.print(formatat);


            }
        }
        System.out.println("\n");
        System.out.println("=============================================");
        System.out.println(x+ " " + y);
        System.out.println("=============================================");
        return BfsAlg(gra);
    }
}




