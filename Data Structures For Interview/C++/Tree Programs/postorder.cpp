void postorder(TreeNode *root){
    if(root!=NULL){
        preorder(root->left);
        preorder(root->right);
        cout<<root->val<<" ";
    }
}