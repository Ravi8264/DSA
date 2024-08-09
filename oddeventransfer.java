class oddeventransfer{
    public static void main (String args[] ){
        int a[]={3,4,9};
        int n=a.length;
        if(n%2!=0){
            for(int i=0; i<n; i++){
                    if(a[i]%2==0)a[i]-=3;
                    else a[i]+=3;
        }
        
    }
}