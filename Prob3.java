import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Prob3 {
    
    
    static int n;
    static int g[][];
    static int d[];
    static int visited[];
    static void print(){
        for(int i =0; i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(g[i][j]);
                
            }
            System.out.println();
            
        }
        
    }
    static void bfs(int s){
        d[s] =0;
        visited[s]= 0;
        Queue<Integer> q = new LinkedList<Integer>();
        
        q.add(s);
        while(q.isEmpty()!= true){
            int u= q.remove();
            for(int v=0; v<n; v++){
                if(g[u][v]==1 && visited[v]==0){
                    q.add(v);
                    visited[v]=1;
                    d[v]= d[u]+1; 
                    
                }
            }
        }
        
        
    }
    public static void main(String[] args) {
        
        int m;
        Scanner sc= new Scanner (System.in);
        System.out.println("number of different fixed positions");
        n= sc.nextInt(); 
        System.out.println("number of connections");
        m= sc.nextInt();
        g= new int [n][n];
        d= new int[n];
        visited = new int[n];
        for(int i=0; i<m; i++){
            int x= sc.nextInt();
            int y= sc.nextInt();
            g[y][x]=1;
        }
        System.out.println("Lina's position");
        int l = sc.nextInt();
        System.out.println("Participant number");
        int p = sc.nextInt();
        int parti []= new int[p];
        for(int i=0;i<p;i++){
            parti[i]= sc.nextInt();
        }
        bfs(l); 
        int min= d[parti[0]];
        for(int i=1; i<p;i++){
            if(min>d[parti[i]]){
                min=d[parti[i]];
            }
        }
        System.out.println(min);
    }   
} 

