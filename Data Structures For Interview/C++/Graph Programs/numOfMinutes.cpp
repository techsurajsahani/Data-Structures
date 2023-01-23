// Time needed to inform all employees

// 1 Time

unordered_map<int,vector<int>> umap;
int ans=0;
int result=0;

void dfs(int headID,vector<int> informTime){
    result=max(result,ans);
    for(auto employee:umap[headID]){
        ans+=informTime[headID];
        dfs(employee,informTime);
        ans-=informTime[headID];
    }
}
int numOfMinutes(int n,int headID,vector<int> manager,vector<int> informTime){
    for(int i=0;i<n;i++){
        int key=manager[i];
        if(key!=-1){
            umap[key].push_back(i);
        }
    }
    dfs(headID,informTime);
    return result;
}

// 2 Time

unordered_map<int,vector<int>> umap;
int ans=0;
int result=0;

void dfs(int headID,vector<int> informTime){
    result=max(result,ans);
    for(int employee:umap[headID]){
        ans+=informTime[headID];
        dfs(employee,informTime);
        ans-=informTime[headID];
    }
}
int numOfMinutes(int n,int headID,vector<int> manager,vector<int> informTime){
    for(int i=0;i<n;i++){
        int key=manager[i];
        if(key!=-1){
            umap[key].push_back(i);
        }
    }
    dfs(headID,informTime);
    return result;
}

// 3 Time

unordered_map<int,vector<int>> umap;
int result=0;
int ans=0;

void dfs(int headID,vector<int> informTime){
    result=max(result,ans);
    for(auto employee:umap[headID]){
        ans+=informTime[headID];
        dfs(employee,informTime);
        ans-=informTime[headID];
    }
}
int numOfMinutes(int n,int headID,vector<int> manager,vector<int> informTime){
    for(int i=0;i<n;i++){
        int key=manager[i];
        if(key!=-1){
            umap[key].push_back(i);
        }
    }
    dfs(headID,informTime);
    return result;
}

// 4 Time

unordered_map<int,vector<int>> umap;
int result=0;
int ans=0;

dfs(int headID,vector<int> informTime){
    result=max(result,ans);
    for(auto employee:umap[headID]){
        ans+=informTime[headID];
        dfs(headID,informTime);
        ans-=informTime[headID];
    }
}
int numOfMinutes(int n,int headID,vector<int> manager,vector<int> informTime){
    for(int i=0;i<n;i++){
        int key=manager[i];
        if(key!=-1){
            umap[key].push_back(i);
        }
    }
    dfs(headID,informTime);
    return result;
}

// 5 Time

unordered_map<int,vector<int>> umap;
int result=0;
int ans=0;

void dfs(int headID,vector<int> informTime){
    result=max(result,ans);
    for(auto employee:umap[headID]){
        ans+=informTime[headID];
        dfs(employee,informTime);
        ans-=informTime[headID];
    }
}
int numOfMinutes(int n,int headID,vector<int> manager,vector<int> informTime){
    for(int i=0;i<n;i++){
        int key=manager[i];
        if(key!=-1){
            umap[key].push_back(i);
        }
    }
    dfs(headID,informTime);
    return result;
}