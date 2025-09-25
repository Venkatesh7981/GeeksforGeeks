class Solution {
    public void mergeArrays(int a[], int b[]) {
        // code here
        int n=a.length;
        int m=b.length;
        int [] arr=new int[n+m];
        for(int i=0;i<n;i++) arr[i]=a[i];
        for(int j=0;j<m;j++) arr[n+j]=b[j];
         Arrays.sort(arr);
        for(int i=0;i<n;i++) a[i]=arr[i];
        for(int j=0;j<m;j++) b[j]=arr[n+j];
         
            }
}
