vector<int> dfsTopologicalSort(vector<vector<int>>& graph){

    int n=graph.size();
    vector<bool> visited(n,false);
    stack<int> st;
    for(int i=0;i<n;i++){
        if(visited[i]==false){
            dfsr(graph,i,visited,st);
        }
    }
    
    vector<int> result;
    for(int x:st){
        result.push(st.top());
        st.pop();
    }
    return result;
}

void dfsr(vector<vector<int>>& graph,int source,vector<bool>& visited,stack<int>& st){
    visited[source]=true;
    for(int x:graph[source]){
        if(visited[x]==false){
            dfsr(graph,x,visited,st);
        }
    }
    stack.push(source);
}