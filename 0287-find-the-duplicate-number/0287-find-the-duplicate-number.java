class Solution {
    public int findDuplicate(int[] a) {
        int dupilcate,temp;
        while(true){
            if(a[a[0]]!=a[0]){
                temp=a[a[0]];
                a[a[0]]=a[0];
                a[0]=temp;
            }
            else
            {
                dupilcate=a[0];
                break;
            }
        }
        return dupilcate;
    }
}