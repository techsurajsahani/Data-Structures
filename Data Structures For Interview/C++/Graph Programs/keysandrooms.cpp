// Keys and rooms

// 1 Time

bool VisitAllRooms(vector<vector<int>>& rooms){

    int n=rooms.size();
    queue<int> q;
    vector<bool> visited(n,false);

    q.add(0);
    visited[0]=true;

    while(!q.empty()){
        int element=q.front();
        q.pop();
        for(auto x:rooms[element]){
            if(visited[x]==false){
                q.add(x);
                visited[x]=true;
            }
        }
    }

    for(auto x: visited){
        if(x==false){
            return false;
        }
    }
    return true;
}

// 2 Time

bool VisitAllRooms(vector<vector<int>>& rooms){
    
    int n=rooms.size();

    queue<int> q;
    vector<bool> visited(n,false);

    q.add(0);
    visited[0]=true;

    while(!q.empty()){
        int element=q.front();
        q.pop();
        for(auto x : rooms){
            if(visited[x]==false){
                q.add(x);
                visited[x]=true;
            }
        }
    }

    for(auto x :visited){
        if(x==false)return false;
    }
    return true;
}

// 3 Time

bool VisitAllRooms(vector<vector<int>>& rooms){

    int n=rooms.size();
    queue<int> q;
    vector<bool> visited(n,false);

    q.add(0);
    visited[0]=true;

    while(!q.empty()){
        int element=q.front();
        q.pop();
        for(auto x : rooms[element]){
            if(visited[x]==false){
                q.add(x);
                visited[x]=true;
            }
        }
    }
    for(auto x :visited){
        if(x==false)return false;
    }
    return true;
}

// 4 Time

bool VisitAllRooms(vector<vector<int>>& rooms){

    int n=rooms.size();
    queue<int> q;
    vector<bool> visited(n,false);

    q.add(0);
    visited[0]=true;

    while(!q.empty()){
        int element=q.front();
        q.pop();
        for(auto x : rooms[element]){
            if(visited[x]==false){
                q.add(x);
                visited[x]=true;
            }
        }
    }
    for(auto x :visited){
        if(x==false)return false;
    }
    return true;
}

// 5 Time

bool VisitAllRooms(vector<vector<int>>& rooms){

    int n=rooms.size();
    queue<int> q;
    vector<int> visited(n,false);

    q.add(0);
    visited[0]=true;

    while(!q.empty()){
        int element=q.front();
        q.pop();
        for(auto x : rooms[element]){
            if(visited[x]==false){
                q.add(x);
                visited[x]=true;
            }
        }
    }
    for(auto x :visited){
        if(x==false)return false;
    }
    return true;
}
