vector<vector<int>> allPathFromSourceToTarget(vector<vector<int>>& graph){
    vector<vector<int>> result;
    vector<int> path;
    int source=0;
    dfs(graph,source,result,path);
    return result;
}

void dfs(vector<vector<int>>& graph,int source,vector<vector<int>>& result,vector<int>& path){
    path.push_back(source);
    if(source==graph.size()-1){
        result.push_back(path);
    }
    else{
        for(int x:graph[source]){
            dfs(graph,x,result,path);
        }
    }
    path.pop();
}