// Detect cycle in undirected graph --> parent


// 1 Time

bool dfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<int> visited(n,false);
    for(int i=0;i<n;i++){
        if(visited[i]==false){
            if(dfsr(graph,i,visited,-1)){
                return true;
            }
        }
    }
    return false;
}

bool dfsr(vector<vector<int>>& graph,int source,vector<bool>& visited,int parent){
    visited[source]=true;
    for(int x:graph[source]){
        if(visited[x]==false){
            if(dfsr(graph,x,visited,source)){
                return true;
            }
        }
        else if(x!=parent){
            return true;
        }
    }
    return false;
}

// 2 Time

bool dfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<boo> visited(n,false);
    for(int i=0;i<n;i++){
        if(visited[i]==false){
            if(dfsr(graph,i,visited,-1)){
                return true;
            }
        }
    }
    return false;
}

bool dfsr(vector<vector<int>>& graph,int source,vector<bool>& visited,int parent){
    visited[source]=true;
    for(int x:graph[source]){
        if(visited[x]==false){
            if(dfsr(graph,x,visited,source)){
                return true;
            }
        }
        else if(x!=parent){
            return true;
        }
    }
    return false;
} 

// 3 Time

bool dfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<bool> visited(n,false);
    for(int i=0;i<n;i++){
        if(visited[i]==false){
            if(dfsr(graph,i,visited,-1)){
                return true;
            }
        }
    }
    return false;
}

bool dfsr(vector<vector<int>>& graph,int source,vector<bool>& visited,int parent){
    visited[source]=true;
    for(int x:graph[source]){
        if(visited[x]==false){
            if(dfsr(graph,x,visited,source)){
                return true;
            }
        }
        if(x!=parent){
            return true;
        }
    }
    return false;
}

// 4 Time

bool dfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<bool> visited(n,false);
    for(int i=0;i<n;i++){
        if(visited[i]==false){
            if(dfsr(graph,i,visited,-1)){
                return true;
            }
        }
    }
    return false;
}

bool dfsr(vector<vector<int>>& graph,int source,vector<bool>& visited,int parent){
    visited[source]=true;
    for(int x:graph[source]){
        if(visited[x]==false){
            if(dfsr(graph,x,visited,source)){
                return true;
            }
        }
        else if(x!=parent){
            return true;
        }
    }
    return false;
}

// 5 Time

bool dfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<bool> visited(n,false);
    for(int i=0;i<n;i++){
        if(visited[i]==false){
            if(dfsr(graph,i,visited,-1)){
                return true;
            }
        }
    }
    return false;
}

bool dfsr(vector<vector<int>>& graph,int source,vector<bool>& visited,int parent){
    visited[source]=true;
    for(int x:graph[source]){
        if(visited[x]==false){
            if(dfsr(graph,x,visited,source)){
                return true;
            }
        }
        else if(x!=parent){
            return true;
        }
    }
    return false;
}

// 6 Time

bool dfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<bool> visited(n,false);
    for(int i=0;i<n;i++){
        if(visited[i]==false){
            if(dfsr(graph,i,visited-1)){
                return true;
            }
        }
    }
    return false;
}

bool dfsr(vector<vector<int>>& graph,int source,vector<bool>& visited,int parent){
    visited[source]=true;
    for(int x:graph[source]){
        if(visited[x]==false){
            if(dfsr(graph,x,visited,source)){
                return true;
            }
        }
        if(x!=parent){
            return true;
        }
    }
    return false;
}

// 7 Time

bool dfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<bool> visited(n,false);
    for(int i=0;i<n;i++){
        if(visited[i]==false){
            if(dfsr(graph,i,vector-1)){
                return true;
            }
        }
    }
    return false;
}

bool dfsr(vector<vector<int>>& graph,int source,vector<bool>& visited,int parent){
    visited[source]=true;
    for(int x:graph[source]){
        if(visited[x]==false){
            if(dfsr(graph,x,visited,source)){
                return true;
            }
        }
        if(x!=parent){
            return true;
        }
    }
    return false;
}

// 8 Time

bool dfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<bool> visited(n,false);
    for(int i=0;i<n;i++){
        if(visited[i]==false){
            if(dfsr(graph,i,visited,-1)){
                return true;
            }
        }
    }
    return false;
}

bool dfsr(vector<vector<int>>& graph,int source,vector<bool>& visited,int parent){
    visited[source]=true;
    for(int x:graph[source]){
        if(visited[x]==false){
            if(dfsr(graph,x,visited,source)){
                return true;
            }
        }
        if(x!=parent){
            return true;
        }
    }
    return false;
}


