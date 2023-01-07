public class FuzzBuzz {

    public static void main(String[] args) {
        for(int i=1;i<101;i++){
            if(i%3==0 && i%5==0){
                System.out.println("FuzzBuzz");
            } else if(i%3==0){
                System.out.println("Fuzz");
            }else if(i%5==0){
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }

    }


}
