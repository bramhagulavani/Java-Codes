class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m=grid.length;
        int n=grid[0].length;
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0;i<m;i++)
        {
            List<Integer> list2 = new ArrayList<>();
            for(int j=0;j<n;j++){
                list2.add(0);
            }
            list.add(list2);
        }
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++)
            {
                int index=(i*n+j+k)% (m*n);
                int x= index/n;
                int y=index%n;
                list.get(x).set(y, grid[i][j]);
            }
        }
return list;
    }
}