// BFS Traversal

// 1 Time

void bfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<bool> visited(n,false);
    for(int i=0;i<n;i++){
        if(visited[i]==false){
            bfsr(graph,i,visited);
        }
    }
}

void bfsr(vector<vector<int>>& graph,int source,vector<int>& source){
    queue<int> q;
    q.push_back(source);
    visited[source]=true;
    while(!q.empty()){
        int element=q.front();
        q.pop();
        for(int x:graph[element]){
            if(visited[x]==false){
                q.push_back(x);
                visited[x]=true;
            }
        }
    }
}

// 2 Time

void bfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<int> visited(n,false);
    for(int i=0;i<n;i++){
        if(visited[i]==false){
            bfsr(graph,i,visited);
        }
    }
}

void bfsr(vector<vector<int>>& graph,int source,vector<bool>& visited){
    queue<int> q;
    q.push_back(source);
    visited[source]=true;
    while(!q.empty()){
        int element=q.front();
        q.pop();
        for(int x:graph[element]){
            if(visited[x]==false){
                q.push_back(x);
                visited[x]=true;
            }
        }
    }
}

// 3 Time

void bfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<bool> visited(n,false);
    for(int i=0;i<n;i++){
        if(visited[i]==false){
            bfsr(graph,i,visited);
        }
    }
}

void bfsr(vector<vector<int>>& graph,int source,vector<bool>& visited){
    queue<int> q;
    q.push_back(source);
    visited[source]=true;
    while(!q.empty()){
        int element=q.front();
        q.pop();
        for(int x:graph[element]){
            if(visited[x]==false){
                q.push_back(x);
                visited[x]=true;
            }
        }
    }
}

// 4 Time

void bfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<bool> visited(n,false);
    for(int i=0;i<n;i++){
        if(visited[i]==false){
            bfsr(graph,i,visited);
        }
    }
}

void bfsr(vector<vector<int>>& graph,int source,vector<bool>& visited){
    queue<int> q;
    q.push_back(source);
    visited[source]=true;
    while(!q.empty()){
        int element=q.front();
        q.pop();
        for(int x:graph[element]){
            if(visited[x]==false){
                q.push_back(x);
                visited[x]=true;
            }
        }
    }
}

// 5 Time

void bfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<bool> visited(n,false);
    for(int i=0;i<n;i++){
        if(visited[i]==false){
            bfsr(graph,i,visited);
        }
    }
}

void bfsr(vector<vector<int>>& graph,int source,vector<bool>& visited){
    queue<int> q;
    q.push_back(source);
    visited[source]=true;
    while(!q.empty()){
        int element=q.front();
        q.pop();
        for(int x:graph[element]){
            if(visited[x]==false){
                q.push_back(x);
                visited[x]=true;
            }
        }
    }
}

// 6 Time

void bfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<int> visited(n,false);
    for(int i=0;i<n;i++){
        if(visited[i]==false){
            bfsr(graph,i,visited);
        }
    }
}

void bfsr(vector<vector<int>>& graph,int source,vector<bool>& visited){
    queue<int> q;
    q.push_back(source);
    visited[source]=true;
    while(!q.empty()){
        int element=q.front();
        q.pop();
        for(int x:graph[element]){
            if(visited[x]==false){
                q.push_back(x);
                visited[x]=true;
            }
        }
    }
}

// 7 Time

void bfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<bool> visited(n,false);
    for(in ti=0;i<n;i++){
        if(visited[i]==false){
            bfsr(graph,i,visited);
        }
    }
}

void bfsr(vector<vector<int>>& graph,int source,vector<bool>& visited){
    queue<int> q;
    q.push_back(source);
    visited[source]=true;
    while(!q.empty()){
        int element=q.front();
        q.pop();
        for(int x:graph[element]){
            if(visited[x]==false){
                q.push_back(x);
                visited[x]=true;
            }
        }
    }
}

// 8 Time

void bfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<bool> visited(n,false);
    for(int i=0;i<n;i++){
        if(visited[i]==false){
            bfsr(graph,i,visited);
        }
    }
}

void bfsr(vector<vector<int>>& graph,int source,vector<boo>& visited){
    queue<int> q;
    q.push_back(source);
    visited[source]=true;
    while(!q.empty()){
        int element=q.front();
        q.pop();
        for(int x:graph[element]){
            if(visited[x]==false){
                q.push_back(x);
                visited[x]=true;
            }
        }
    }
}

// 9 Time

void bfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<bool> visited(n,false);
    for(int i=0;i<n;i++){
        bfsr(graph,i,visited);
    }
}

void bfsr(vector<vector<int>>& graph,int source,vector<bool>& visited){
    queue<int> q;
    q.push_back(source);
    visited[source]=true;
    while(!q.empty()){
        int element=q.front();
        q.pop();
        for(int x:graph[element]){
            if(visited[x]==false){
                q.push_back(x);
                visited[x]=true;
            }
        }
    }
}

// 10 Time

void bfs(vector<vector<int>>& graph){
    int n=graph.size();
    vector<bool> visited(n,false);
    for(int i=0;i<n;i++){
        if(visited[i]==false){
            bfsr(graph,i,visited);
        }
    }
}

void bfsr(vector<vector<int>>& graph,int source,vector<bool>& visited){
    queue<int> q;
    q.push_back(source);
    visited[source]=true;
    while(!q.empty()){
        int element=q.front();
        q.pop();
        for(int x:graph[element]){
            if(visited[x]==false){
                q.push_back(x);
                visited[x]=true;
            }
        }
    }
}