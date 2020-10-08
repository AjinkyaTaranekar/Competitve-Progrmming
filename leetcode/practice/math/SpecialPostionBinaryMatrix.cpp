int numSpecial(vector<vector<int>>& mat) {
	const int row = mat.size(), col = row?mat[0].size():0;
	int cnt=0;
	for(int i=0;i<row;++i){
		for(int j=0;j<col;++j){
			if(mat[i][j]==1){
				int sum=0;
				for(int k=0;k<row && sum<=2;++k)  sum+=mat[k][j];
				for(int k=0;k<col && sum<=2;++k)  sum+=mat[i][k];
				if(sum==2) ++cnt;
			}
		}
	}
	return cnt;
}