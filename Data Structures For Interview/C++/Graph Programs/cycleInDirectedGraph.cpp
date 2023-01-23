// Detect cycle in directed graph --> visited & currentVisited array

// 1 Time

bool dfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<bool> visited(n,false);
    vector<bool> currentVisited(n,false);
    for(int i=0;i<n;i++){
        if(visited[i]==false){
            if(dfsr(graph,i,visited,currentVisited)){
                return true;
            }
        }
    }
    return false;
}

bool dfsr(vector<vector<int>>& graph,int source,vector<boo>& visited,vector<bool>& currentVisited){
    visited[source]=true;
    currentVisited[source]=true;
    for(int x:graph[source]){
        if(visited[x]==false){
            if(dfsr(graph,x,visited,currentVisited)){
                return true;
            }
        }
        else if(visited[x]==true && currentVisited[x]==true){
            return true;
        }
    }
    currentVisited[source]=false;
    return false;
}

