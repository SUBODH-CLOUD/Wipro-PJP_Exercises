public class BiggestNoIn2DArray {
    
    public static void main(String[] args) {

        if(args.length != 9){
            System.out.println("Please enter 9 integer numbers");
            
        }else{
        int[][] arr = new int[3][3];
        int k =0;
        for(int i = 0; i < 3; i++){
             for(int j = 0; j<3; j++){
                arr[i][j] = Integer.parseInt(args[k]);
                k++;
             }
        }

       

        
       System.out.println("The Given array is : ");
         for(int i =0; i<3; i++){
            for(int j =0; j<3; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
         }   
         int big = 0;
         for(int i =0; i<3; i++){
           for(int j =0; j<3; j++){
            if(big<arr[i][j]){
                big = arr[i][j];
            }
           }
         }
         System.out.println("The biggest number in the given array is " + big);
    }
}
}


