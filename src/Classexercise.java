import javax.lang.model.type.NullType;

public class Classexercise {
    public static void main(String[] args){
    String array1[]={"Hello","Okay","Yes","Yes","Hello"};
    String array2[]={"Hello","Okay","Yes","Yes","Hell"};
    int count=0;
//        for(String element:array1){
//            for(int i=1;i<array1.length;i++){
//                if(element==array1[i]){
//                    System.out.println(element);
//                }
//            }
//        }

      if(array1.length==array2.length){
          for(String element:array1){
              for(String element2:array2){
                  if(element==element2){
                      count++;
                      break;
                  }
              }
          }
          System.out.println(count);
          if(count==array1.length){
              System.out.println("Both arrays are equal.");
          }
      }
    }
}
