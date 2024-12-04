//Jagged Array
class Main {
    public static void main(String[] args) {
        //Initialize jagged array
        int num[][]=new int[3][];  //jagged array
        
        //Initializing columns for each row in an array
        num[0]=new int[3];
        num[1]=new int[4];
        num[2]=new int[2];
        
        //assifning single digit numbers to jagged array
        for(int i=0;i<num.length;i++){
            for(int j=0;j<num[i].length;j++){
                num[i][j]=(int)(Math.random()*10);
            }
        }
        
        //Printing Jagged Array
        System.out.println("Printing Jagged Array : ");
        for(int n[] : num){
            for(int m: n){
                System.out.print(m+ " ");
            }
            System.out.println();
        }
    }
}
