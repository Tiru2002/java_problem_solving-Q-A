package intermediate;

public class DuplicateCharactersInAnArray {
    public static void main(String[] args) {
        int []a={1,2,3,4,1,2,3,5,6,4};
        System.out.println("Duplicate Chaeracter in a array :");


        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    System.out.print(a[i]+" | ");
            }
        }
    }
    

    

}
}
