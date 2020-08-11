public class Main {
    public static void main(String[] args) {

    Graph graph1 = new Graph();
    graph1.addSquare();
    graph1.printMaze();

    Dfs d = new Dfs();

    d.DfsAlg(graph1.gr);


    }
}
