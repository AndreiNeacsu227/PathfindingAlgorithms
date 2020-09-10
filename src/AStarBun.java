//import java.util.HashMap;
//
//public class AStarBun {
//
//    String [][] grSec = new String[5][5];
//    Boolean [][] grVis = new Boolean[5][5];
//    boolean initGraphs = false;
//    int coordF=4;
//    int coordS=0;
//    int maxSumDist = 10000 ;
//
//    public boolean isValid(int row, int col)
//    {
//        // Returns true if row number and column number
//        // is in range
//        return (row >= 0) && (row < 5) &&
//                (col >= 0) && (col < 5);
//    }
//
//    public String [][] DfsAlg(String [][] gra){
//
//
//        if (initGraphs==false) {
//            for (int t = 0; t < gra.length; t++) {
//                for (int k = 0; k < gra[t].length; k++) {
//                    grSec[t][k] = gra[t][k];
//                    grVis[t][k] = false;
//                }
//            }
//        }
//
//        int x = 0;
//        int y = 0;
//
//        if ((isValid(x+1,y))&&(grVis[x+1][y] == false)) {
//            gra[x + 1][y]   = Integer.toString(Math.abs(x+1 - coordS) + Math.abs(y - coordS));
//            grSec[x + 1][y] = Integer.toString(Math.abs(x+1 - coordF) + Math.abs(y - coordS));
//        }
//
//        if ((isValid(x-1,y))&&(grVis[x-1][y] == false)) {
//            gra[x - 1][y]   = Integer.toString(Math.abs(x-1 - coordS) + Math.abs(y - coordS));
//            grSec[x - 1][y] = Integer.toString(Math.abs(x-1 - coordF) + Math.abs(y - coordS));
//        }
//
//        if ((isValid(x,y+1))&&(grVis[x][y+1] == false)) {
//            gra[x][y+1]   = Integer.toString(Math.abs(x- coordS) + Math.abs(y+1 - coordS));
//            grSec[x][y+1] = Integer.toString(Math.abs(x- coordF) + Math.abs(y+1 - coordS));
//        }
//
//        if ((isValid(x,y-1))&&(grVis[x][y-1] == false)) {
//            gra[x][y-1]   = Integer.toString(Math.abs(x - coordS) + Math.abs(y-1 - coordS));
//            grSec[x][y-1] = Integer.toString(Math.abs(x - coordF) + Math.abs(y-1 - coordS));
//        }
//
//
//        for (int t = 0; t < gra.length; t++) {
//            for (int k = 0; k < gra[t].length; k++) {
//                int distS = Integer.parseInt(gra[t][k]);
//                int distF = Integer.parseInt(grSec[t][k]);
//                int sumDist = distS + distF;
//                if ((maxSumDist > sumDist)&&(grVis[t][k]) == false){
//                    maxSumDist = sumDist;
//                }else if ((maxSumDist == sumDist)&&(grVis[t][k]) == false){
//                    if(distF<)
//                }
//
//            }
//        }
//
//
//
//    }
//}
