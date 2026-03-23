package practice;

import java.util.Arrays;

public class Hashing {
    //Number Hashing using array the task is to count the frequencies of numbers
    int hash[]=new int[100000];
    int Counting(int number,int array[]) {
        Arrays.fill(hash,0);
        for (int i = 0; i < array.length; i++) {
            hash[array[i]] += 1;

        }


        return hash[number];

    }
    //number hashing supports for upto 10 to the power 7 size only
    void NumberHashing(int target,int[]array){
        int max=Arrays.stream(array).max().getAsInt();
        int[]hashh=new int[max+1];
        for(int i=0 ;i<array.length;i++){
            hashh[array[i]]+=1;

        }
        System.out.println("target's Frequency is "+hashh[target]);
    }
    //charater hashing we use the ASCII to do it
    //1 character occupies 8 bit that 1 byte so 2 to the power of 8 = 256
    void Charater_Hashing(char charr,String sentence){
        int[]hashh=new int[256];
        for(int i=0 ;i<sentence.length();i++){
            hashh[sentence.charAt(i)]+=1;

        }
        System.out.println("founded frequency of the target "+hashh[charr]);

    }


    public static void main(String[] args){
        Hashing hash=new Hashing();
        Hash_Map hashMap=new Hash_Map();

        int[] array={1,3,1,4,5,3,3,4};
       // System.out.println(hash.Counting(1,array));
       // String name="AjaylinShyam";
      // hash.Charater_Hashing('a',name);
        // hash.NumberHashing(3,array);
        hashMap.hashfunct(3,array);

    }

        }


