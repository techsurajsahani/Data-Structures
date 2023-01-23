class Solution{
    public:

    bool isValid(int i,int j,int row,int col,vector<vector<int>>& graph){
        if( i>=0 && i<row && j>=0 && j<col && graph[i][j]=='1')return true;
        return false;
    }

    void dfs(int i,int j,int row,int col,vector<vector<int>>& graph){
        graph[i][j]='0';

        if(isValid(i+1,j,row,col,graph))dfs(i+1,j,row,col,graph);
        if(isValid(i-1,j,row,col,graph))dfs(i-1,j,row,col,graph);
        if(isValid(i,j+1,row,col,graph))dfs(i,j+1,row,col,graph);
        if(isValid(i,j-1,row,col,graph))dfs(i,j-1,row,col,graph);
    }

    int numberOfIsland(vector<vector<int>>& graph){

        int row=graph.size();
        int col=graph[0].size();

        int count=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(graph[i][j]=='1'){
                    count++;
                    dfs(i,j,row,col,graph);
                }
            }
        }
        return count;
    }
};