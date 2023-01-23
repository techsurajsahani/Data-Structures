// Minimum Time To Collect All Apples In A Tree

// 1 Time

unordered_map<int,vector<int>> umap;
vector<bool> visited;

int dfs(int node,int mycost,vector<bool> hasApple){
    if(visited[node]==true)return 0;
    visited[node]=true;

    int childCost=0;
    for(auto x : umap[node]){
        childCost+=dfs(x,2,hasApple);
    }

    if(childCost==0 && !hasApple[node])return 0;
    return mycost+childCost;
}
int minTime(int n,vector<vector<int>> edges,vector<bool> hasApple){
    for(auto x:edges){
        umap[x[0]].push_back(x[1]);
        umap[x[1]].push_back(x[0]);
    }
    for(int i=0;i<n;i++){
        visited.push_back(false);
    }
    int time=0;
    time+=dfs(0,0,hasApple);
    return time;
}

// 2 Time

unordered_map<int,vector<int>> umap;
vector<bool> visited;

int dfs(int node,int mycost,vector<bool> hasApple){
    if(visited[node]==true)return 0;
    visited[node]=true;

    int childCost=0;
    for(auto x:umap[node]){
        childCost+=dfs(x,2,hasApple);
    }

    if(childCost==0 && !hasApple[node])return 0;
    return mycost+childCost;
}
int minTime(int n,vector<vector<int>> edges,vector<bool> hasApple){
    for(auto x:edges){
        umap[x[0]].push_back(x[1]);
        umap[x[1]].push_back(x[0]);
    }

    for(int i=0;i<n;i++){
        visited.push_back(false);
    }

    int time=0;
    time+=dfs(0,0,hasApple);
    return time;
}

// 3 Time

unordered_map<int,vector<int>> umap;
vector<bool> visited;

int dfs(int node,int mycost,vector<bool> hasApple){
    if(visited[node]==true)return 0;
    visited[node]=true;

    int childCost=0;
    for(auto x:umap[node]){
        childCost+=dfs(x,2,hasApple);
    }

    if(childCost==0 && !hasApple[node])return 0;
    return mycost+childCost;
}
int minTime(int n,vector<vector<int>> edges,vector<bool> hasApple){
    for(auto x:edges){
        umap[x[0]].push_back(x[1]);
        umap[x[1]].push_back(x[0]);
    }

    for(int i=0;i<n;i++){
        visited.push_back(false);
    }

    int time=0;
    time+dfs(0,0,hasApple);
    return time;
}

// 4 Time

unordered_map<int,vector<int>> umap;
vector<bool> visited;

int dfs(int node,int mycost,vector<bool> hasApple){
    if(visited[node]==true)return 0;
    visited[node]=true;

    int childCost=0;
    for(auto x :umap[node]){
        childCost+=dfs(x,2,hasApple);
    }

    if(childCost==0 && !hasApple[node])return 0;
    return mycost+childCost;
}
int minTime(int n,vector<vector<int>> edges,vector<bool> hasApple){
    for(auto x:edges){
        umap[x[0]].push_back(x[1]);
        umap[x[1]].push_back(x[0]);
    }

    for(int i=0;i<n;i++){
        visited.push_back(false);
    }

    int time=0;
    time+=dfs(0,0,hasApple);
    return time;
}

// 5 Time
unordered_map<int,vector<int>> umap;
vector<bool> visited;

int dfs(int node,int mycost,vector<bool> hasApple){
    if(visited[node]==true)return 0;
    visited[node]=true;

    int childCost=0;
    for(auto x:umap[node]){
        childCost+=dfs(x,2,hasApple);
    }

    if(childCost==0 && !hasApple(node))return 0;
    return mycost+childCost;
}
int minTime(int n,vector<vector<int>> edges,vector<bool> hasApple){
    for(auto x : edges){
        umap[x[0]].push_back(x[1]);
        umap[x[1]].push_back(x[0]);
    }

    for(int i=0;i<n;i++){
        visited.push_back(false);
    }

    int time=0;
    time+=dfs(0,0,hasApple);
    return time;
}