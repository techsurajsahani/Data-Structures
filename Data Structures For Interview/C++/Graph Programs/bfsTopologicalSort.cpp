vector<int> bfsTopologicalSort(vector<vector<int>>& graph){

    int n=graph.size();
    vector<int> indegree(n,0);
    vector<int> result(n,0);
    queue<int> q;

    for(int i=0;i<n;i++){
        for(int x:graph[i]){
            indegree[x]++;
        }
    }

    for(int i=0;i<n;i++){
        if(indegree[i]==0){
            q.push_back(i);
        }
    }

    while(!q.empty()){
        int element=q.front();
        q.pop();
        result.push_back(element);
        for(int x:graph[element]){
            indegree[x]--;
            if(indegree[x]==0){
                q.push_back(x);
            }
        }
    }
    return result;
}