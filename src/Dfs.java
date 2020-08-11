import java.util.Stack;

public class Dfs {

    Stack<String> st = new Stack<>();

    boolean find = false;
    int x = 0;
    int y = 0;
    int vertex = 0;

    public String [][] DfsAlg(String [][] gra) {
        String [][] inGraph = new String[5][5];



        for (int i = 1; i <= 4; i++) {
                switch (i) {
                    case 1:
                        try{
                        if (gra[x][y + 1] == ("O")) {
                            vertex++;
                            gra[x][y + 1] = Integer.toString(vertex);
                            st.push(gra[x][y + 1]);
                            break;
                        }else{
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
                            st.push(Integer.toString(vertex));
                            break;
                        } else{
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
                            st.push(Integer.toString(vertex));
                            break;
                        }else{
                        break;}
                        } catch (ArrayIndexOutOfBoundsException e){
                            break;
                        }

                    case 4:
                        try{
                        if (gra[x + 1][y] == "O") {
                            vertex++;
                            gra[x + 1][y] = Integer.toString(vertex);
                            st.push(Integer.toString(vertex));
                            break;
                        }else {
                            break;}
                        }
                        catch (ArrayIndexOutOfBoundsException e){
                            break;
                        }
                }
            }

        String ul = st.pop();

        for(int i = 0; i < gra.length; i++){
            System.out.println("\n");
            for(int j =0; j<gra[i].length;j++) {

                if (gra[i][j] == ul) {
                    x = i;
                    y = j;


                }
                System.out.print(gra[i][j] + "  ");


            }
        }
        System.out.println("\n");
        System.out.println("=============================================");
        System.out.println(x+ " " + y);
        System.out.println("=============================================");
        return DfsAlg(gra);
    }
}




