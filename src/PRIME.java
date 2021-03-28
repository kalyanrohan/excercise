public class PRIME {
    public static void main(String[] args){
    prime(500);
    }
    static void prime(int num){
      //generate numbers
        for(int i=2;i<=num;i++){
            Boolean indic=Boolean.TRUE;
            int limit=0;
            limit=i/2;
            for(int x=2;x<limit;x++){
                if(i%x==0){
                    indic=Boolean.FALSE;
                    break;
              }
          }
            if(indic==Boolean.TRUE) {
                System.out.println(i);
            }
      }
    };
}
