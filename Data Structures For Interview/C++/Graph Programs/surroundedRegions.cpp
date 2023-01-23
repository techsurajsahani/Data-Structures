class Solution{
    public:

    bool isValid(int i,int j,int row,int col,vector<vector<int>>& graph){
        if( i>=0 && i<row && j>=0 && j<col && graph[i][j]=='o')return true;
        return false;
    }

    void dfs(int i,int j,int row,int col,vector<vector<int>>& graph){
        graph[i][j]='B';

        if(isValid(i+1,j,row,col,graph))dfs(i+1,j,row,col,graph);
        if(isValid(i-1,j,row,col,graph))dfs(i-1,j,row,col,graph);
        if(isValid(i,j+1,row,col,graph))dfs(i,j+1,row,col,graph);
        if(isValid(i,j-1,row,col,graph))dfs(i,j-1,row,col,graph);
    }

    void surroundedRegions(vector<vector<int>>& graph){

        int row=graph.size();
        int col=graph[0].size();

        for(int i=0;i<row;i++){

            int j=0;
            if(graph[i][j]=='o')dfs(i,j,row,col,graph);

            j=col-1;
            if(graph[i][j]=='o')dfs(i,j,row,col,graph);
        }

        for(int j=0;j<col;j++){

            int i=0;
            if(graph[i][j]=='o')dfs(i,j,row,col,graph);

            i=row-1;
            if(graph[i][j]=='o')dfs(i,j,row,col,graph);
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(graph[i][j]=='o')graph[i][j]='x';
                if(graph[i][j]=='B')graph[i][j]='o';
            }
        }
    }
};