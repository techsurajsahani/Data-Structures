void levelorder(TreeNode *root){

    if(root==NULL)return NULL;

    vector<vector<int>> result;
    queue<int> q;
    q.add(root);

    while(1){
        vector<int> list;
        int size=q.size();
        if(size==0)return;
        while(size>0){
            TreeNode *node=q.front();
            q.pop();
            list.add(node->val);
            if(node->left!=NULL){
                q.add(node->left);
            }
            if(node->right!=NULL){
                q.add(node->right);
            }
            size--;
        }
        result.push_back(list);
    }
    return result;
}