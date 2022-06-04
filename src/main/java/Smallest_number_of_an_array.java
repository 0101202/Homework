public class Smallest_number_of_an_array {
    public static int getSmallest(int[] a, int total){
        int temp;
        for (int i = 0; i < total; i++)
        {
            for (int j = i + 1; j < total; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a[0];
    }
    public static void main(String args[]){
        int a[]={1,13,35,79,41,3};
        int b[]={13,54,68,98,24,53,80};
        System.out.println("Smallest: "+getSmallest(a,6));
        System.out.println("Smallest: "+getSmallest(b,7));

    }
}
