#include<iostream>

using namespace std;

int main(){

    vector<int> graph(4);
    graph[0].push_back(1);
    graph[1].push_back(0);
    graph[0].push_back(2);
    graph[2].push_back(0);
    graph[1].push_back(2);
    graph[2].push_back(1);
    graph[2].push_back(3);
    graph[3].push_back(2);

    for(int i=0;i<4;i++){
        for(auto x : graph[i]){
            cout<<x<<" ";
        }
        cout<<end;
    }
    return 0;
}
