import java.util.Random;

public class Graph {

    String [][] gr = new String[5][5];
    Random r = new Random();

    public void addSquare(){
        for(int i = 0; i < gr.length; i++){
            for(int j =0; j<gr[i].length;j++){
                int x = r.nextInt(5);

                if ((i==0) && (j==0)){
                    gr[i][j]="S";
                }
                else if ((i==4) && (j==4)){
                    gr[i][j]="F";
                }
                else if (x != 0){
                    gr[i][j]="O";

                }
                else if (x == 0){
                    gr[i][j]= "X";
                }
            }
        }
    }


    public void printMaze() {
        for (String[] a : gr) {
            for (String t : a) {
                System.out.print(t + "  ");
            }
            System.out.println("\n");
        }
    }

}
