//Multidimensional array- 3D
class Main {
    public static void main(String[] args) {
        int num[][][]=new int[3][4][3];
        //i=3, j=4, k=3
        
        //assigning random double digits to array
        for (int i=0;i<3;i++){
            for (int j=0;j<4;j++){
                for(int k=0;k<3;k++){
                num[i][j][k]=(int)(Math.random()*100);
            }
        }
        }
        
        //Printing an multidimensional array
        System.out.println("Printing 2D array : ");
        for(int i=0;i<3;i++){
            System.out.println("Layer " + (i + 1) + ":");
            for(int j=0;j<4;j++){
                for (int k=0;k<3;k++){
                    
                System.out.print(num[i][j][k] +" ");
            }
            System.out.println();
        }
        System.out.println();
        }
    }
}
