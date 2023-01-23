class Solution{
    public:

    bool isValid(int i,int j,int row,int col,vector<vector<int>>& graph){
        if( i>=0 && i<row && j>=0 && j<col && graph[i][j]=='1')return true;
        return false;
    }

    void dfs(int i,int j,int row,int col,vector<vector<int>>& graph,int count){
        graph[i][j]='0';
        count++;

        if(isValid(i+1,j,row,col,graph))dfs(i+1,j,row,col,graph);
        if(isValid(i-1,j,row,col,graph))dfs(i-1,j,row,col,graph);
        if(isValid(i,j+1,row,col,graph))dfs(i,j+1,row,col,graph);
        if(isValid(i,j-1,row,col,graph))dfs(i,j-1,row,col,graph);
    }

    int maxAreaOfIsland(vector<vector<int>>& graph){

        int row=graph.size();
        int col=graph[0].size();

        int area=0;

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(graph[i][j]=='1'){
                    int count=0;
                    dfs(i,j,row,col,graph,count);
                    area=max(area,count);
                }
            }
        }
        return area;
    }
};