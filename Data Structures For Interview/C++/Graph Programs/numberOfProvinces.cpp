class Solution{
    public:

    void dfs(vector<vector<int>& graph,int source,vector<bool>& visited){
        visited[source]=true;
        for(int x:graph[source]){
            if(visited[x]==false){
                dfs(graph,x,visited);
            }
        }
    }

    int numberOfProvinces(vector<vector<int>>& graph){

        int n=graph.size();
        vector<bool> visited(n,false);

        for(int i=0;i<n;i++){
            if(visited[i]==false){
                count++;
                dfs(graph,i,visited);
            }
        }

        return count;
    }
};