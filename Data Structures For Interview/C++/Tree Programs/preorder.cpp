void preorder(TreeNode *root){
    if(root!=NULL){
        cout<<root->val<<" ";
        preorder(root->left);
        preorder(root->right);
    }
}