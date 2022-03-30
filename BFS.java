import java.util.LinkedList;

public class BFS {
    // Graph will be represented as Adjacency Matrix format
    //Graph Node starts from  0; 
    private int noV; // Number of vertex 
    private int adjMat [][];
    BFS(int num)
    {
        noV = num;
        adjMat = new int [num][num];

    }
    
    //edge from i to j
    void addEdge(int i, int j )
    {
        adjMat[i][j]  = 1;

    }

    void showMat()
    {
        for (int i=0 ; i<noV ; i++)
        {
            for(int j =0 ; j<noV;j++)
            {
                System.out.print (adjMat[i][j]+" ");
            }
            System.out.println();
        }
    }


    void BFS_Traverse (int src)
    {
        //valid source
        //BFS uses queue as Data structure 
        boolean visited [] = new boolean[noV];
        
        //enter the first element into queue
        LinkedList<Integer> q = new LinkedList<Integer>();
        q.add(src);
        visited[src] = true;
        //run till queue is not empty 
        while(!q.isEmpty())
        {
            int node = q.pop(); // q.poll() also works
            System.out.println(node+" ");
            for (int i =0 ; i<noV;i++)
                {

                    if (adjMat[node][i]==1)
                    {
                        if (!visited[i])
                        {
                             q.add(i);
                            visited[i]= true;
                            } 
                    }
                }
            

        }
        
    }

    public static void main(String[] args) {
        BFS obj = new BFS(4);
        obj.addEdge(0,1);
        obj.addEdge(0, 2);
        obj.addEdge(1, 2)   ;
        obj.addEdge(2, 0);
        obj.addEdge(2, 3);
        obj.addEdge(3, 3);
        obj.showMat();
    obj.BFS_Traverse(2);
    }
    
}
