vector<int> shortestPathInUnweightedGraph(vector<vector<int>>& graph,int source){
    int n=graph.size();

    vector<int> distance(n,INT_MAX);
    distance[source]=0;

    queue<int> q;
    vector<bool> visited(n,false);
    q.push_back(source);
    visited[source]=true;

    while(!q.empty()){
        int element=q.front();
        q.pop();
        for(int x:graph[element]){
            if(visited[x]==false){
                distance[x]=distance[element]+1;
                q.push_back(x);
                visited[x]=true;
            }
        }
    }
    return distance;
}