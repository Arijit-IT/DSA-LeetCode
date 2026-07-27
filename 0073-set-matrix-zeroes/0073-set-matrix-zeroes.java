class Solution {
    public void setZeroes(int[][] matrix) {
        Set<Integer>mapi=new HashSet<>();
        Set<Integer>mapj=new HashSet<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0){
                    mapi.add(i);
                    mapj.add(j);
                }
            }
        }
        for(int num: mapi){
            for(int v=0;v<matrix[0].length;v++){
                matrix[num][v]=0;
                
            }
        }
        for(int num: mapj){
            for(int v=0;v<matrix.length;v++){
                matrix[v][num]=0;
                
            }
        }

    }
}