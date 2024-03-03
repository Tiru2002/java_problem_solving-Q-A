package patterns;
 /*    sample out:
  *       ******
          ******
          ******
          ******
  */
public class  RectangleStar{

    public static void main(String[] args) {
        int row=4,col=6;
        //row=i col=j;
        for(int i=1;i<=row;i++){
            for(int j=0;j<=col;j++){
                System.out.print("* ");
            }
            System.err.println();
        }
    }

}