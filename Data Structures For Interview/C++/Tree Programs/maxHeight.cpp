int maxHeight(TreeNode *root){
    if(root==NULL)return 0;
    else{
        int lh=maxHeight(root->left);
        int rh=maxHeight(root->right);
        return fmax(lh,rh)+1;
    }
}