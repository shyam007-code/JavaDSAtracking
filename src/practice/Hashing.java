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
    public static void main(String[] args){
        Hashing hash=new Hashing();

        int[] array={1,3,1,4,5,3,3,4};
        System.out.println(hash.Counting(1,array));

    }

        }


