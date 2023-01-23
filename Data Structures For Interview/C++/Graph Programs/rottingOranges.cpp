queue<pair<int,int>> q;

bool isValid(int x,int y,int row,int col,vector<vector<int>>& graph){
    if(x>=0 && x<row && y>=0 && y<col && graph[x][y]==1){
        return true;
    }
    else{
        return false;
    }
}
int rottingOranges(vector<vector<int>>& graph){

    int row=graph.size();
    int col=graph[0].size();

    int fresh=0;

    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(graph[i][j]==2){
                q.add({i,j});
            }
            else if(graph[i][j]==1){
                fresh++;
            }
        }
    }

    if(fresh==0)return 0;

    while(!q.empty()){
        int temp=0;
        size=q.size();
        while(size>0){
            pair<int,int> p=q.front();
            q.pop();
            int x=p.first;
            int y=p.second;

            if(isValid(x+1,y,row,col,graph)){
                temp++;
                graph[x+1][y]=2;
                q.add({x+1,y});
            }
            if(isValid(x-1,y,row,col,graph)){
                temp++;
                graph[x-1][y]=2;
                q.add({x-1,y});
            }
            if(isValid(x,y+1,row,col,graph)){
                temp++;
                graph[x][y+1]=2;
                q.add({x,y+1});
            }
            if(isValid(x,y-1,row,col,graph)){
                temp++;
                graph[x][y-1]=2;
                q.add({x,y-1});
            }
            size--;
        }
        if(temp!=0){
            time++;
        }
    }

    for(int i=0;i<row;i++){
        for(int j=0;j<col;j++){
            if(graph[i][j]==1){
                time=0;
                break;
            }
        }
    }

    return (time==0)? -1:time;
}