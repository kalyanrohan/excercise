import java.util.Arrays;
import java.util.Scanner;
import java.util.Vector;
public class Week4 {
    public static void main(String[] args){
        String id[]={"2440061285","2440065163","2440071973","2440081942","2440090266"};
        String color[]={"Blue","Black","Red","Red Velvet","Crimson Red"};
        String name[]={"Edsel Putra Harren","Monique Senjaya","Ardelia Shaula Araminta","Raphael Reynaldi","Sri Kalyan Rohan"};
        String temp;
        String temp2;
        int input;

        for(int i=0;i<name.length;i++){
            for(int x=i+1;x<name.length;x++){
                if(name[x].charAt(0)<name[i].charAt(0)){
                    temp=name[i];
                    name[i]=name[x];
                    name[x]=temp;
                }
            }
        }
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        };
        for(int i=0;i<color.length;i++){
            for(int x=i+1;x<color.length;x++){
                if(color[x].charAt(0)<color[i].charAt(0)){
                    temp2=color[i];
                    color[i]=color[x];
                    color[x]=temp2;
                }
            }
        }
        System.out.println();
        for(int i=0;i<color.length;i++){
            System.out.println(color[i]);
        };

        Arrays.sort(name);
        Arrays.sort(color);
        Arrays.sort(id);

        System.out.println();
        for(int i=0;i<color.length;i++){
            System.out.println(color[i]);
        };
        System.out.println();
        for(int i=0;i<name.length;i++){
            System.out.println(name[i]);
        };
        System.out.println();
        for(int i=0;i<id.length;i++){
            System.out.println(id[i]);
        };
    }
}
