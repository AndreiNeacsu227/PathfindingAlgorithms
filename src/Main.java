import java.util.Scanner;

public class Main {
    public static void main(String[] args) {




    Graph graph1 = new Graph();

    Scanner input = new Scanner(System.in);


    //Instantele pentru algoritmi
        Dfs a = new Dfs();
        Bfs b= new Bfs();
        Dijkstra c = new Dijkstra();
        AStar d = new AStar();


    while(true){
        System.out.println("Introduceti comanda");
        System.out.println("1.Generare labirint");
        System.out.println("2.Dfs");
        System.out.println("3.Bfs");
        System.out.println("4.Dikstra");
        System.out.println("5.AStar");
        System.out.println("6.Iesire din program");

        int in = input.nextInt();
        switch (in){
            case 1:
                graph1.addSquare();
                graph1.printMaze();
                break;
            case 2:
                a.DfsAlg(graph1.gr);
                break;
            case 3:
                b.BfsAlg(graph1.gr);
                break;
            case 4:
                c.DijkstraAlg(graph1.gr);
                break;
            case 5:
                d.AStarAlg(graph1.gr);
                break;
            case 6:
                System.exit(0);
        }
    }


    }
}
