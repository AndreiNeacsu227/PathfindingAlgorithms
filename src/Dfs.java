import java.util.Stack;

public class Dfs {

    Stack<String> st = new Stack<>();

    int x = 0;
    int y = 0;
    int vertex = 0;

    public String [][] DfsAlg(String [][] gra) {

        Stack<String> st1 = new Stack<>();

        for (int i = 1; i <= 4; i++) {
                switch (i) {
                    case 1:
                        try{
                        if (gra[x][y + 1] == ("O")) {
                            vertex++;
                            gra[x][y + 1] = Integer.toString(vertex);
                            st1.push(gra[x][y + 1]);
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
                            st1.push(Integer.toString(vertex));
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
                            st1.push(Integer.toString(vertex));
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
                            st1.push(Integer.toString(vertex));
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

        while(!st1.empty()){
            st.push(st1.pop());
        }


        String ul = st.pop();

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
        return DfsAlg(gra);
    }
}




