//Multidimensional array- 2D
class Main {
    public static void main(String[] args) {
        int num[][]=new int[3][4];
        //rows=3 and columns=4
        
        //assigning random double digits to array
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                num[i][j]=(int)(Math.random()*100);
            }
        }
        
        //Printing an multidimensional array
        System.out.println("Printing 2D array : ");
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(num[i][j] +" ");
            }
            System.out.println();
        }
    }
}
