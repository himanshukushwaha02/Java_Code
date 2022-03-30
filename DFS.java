public class DFS {
    // Graph will be represented as Adjacency Matrix format
    //Graph Node starts from  0; 
    private int noV; // Number of vertex 
    private int adjMat [][];
    private boolean visited[];
    DFS(int num)
    {
        noV = num;
        adjMat = new int [num][num];
        visited =new boolean[num];
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


    void DFS_Traverse (int src)
    {
        //valid source
        //Recursion can be used
        if(!visited[src])
        {
            visited[src ]= true;
            System.out.println(src);
            //call recursively for each neighbour
            for(int i=0;i<noV;i++)
            {
                if(adjMat[src][i]==1)
                {
                    DFS_Traverse(i);
                }
            }
        }
        
    }

    public static void main(String[] args) {
        DFS obj = new DFS(4);
        obj.addEdge(0,1);
        obj.addEdge(0, 2);
        obj.addEdge(1, 2)   ;
        obj.addEdge(2, 0);
        obj.addEdge(2, 3);
        obj.addEdge(3, 3);
        obj.showMat();
    obj.DFS_Traverse(2);
    }
        
    
    
}
