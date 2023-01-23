class Solution{
    public:

    bool isValid(int i,int j,int row,int col,vector<vector<int>>& graph,int color,int newColor){
        if( i>=0 && i<row && j>=0 && j<col && graph[i][j]==color)return true;
        return false;
    }

    void dfs(int i,int j,int row,int col,vector<vector<int>>& graph,int color,int newColor){
        graph[i][j]=newColor;

        if(isValid(i+1,j,row,col,graph))dfs(i+1,j,row,col,graph);
        if(isValid(i-1,j,row,col,graph))dfs(i-1,j,row,col,graph);
        if(isValid(i,j+1,row,col,graph))dfs(i,j+1,row,col,graph);
        if(isValid(i,j-1,row,col,graph))dfs(i,j-1,row,col,graph);
    }

    vector<vector<int>> floodFill(vector<vector<int>>& graph,int i,int j,int newColor){

        int row=graph.size();
        int col=graph[0].size();

        int color=graph[i][j];
        if(color==newColor)return graph;

        dfs(i,j,row,col,graph,color,newColor);

        return graph;
    }
};