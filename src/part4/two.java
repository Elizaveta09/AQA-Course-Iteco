package part4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class two {

    public static void main (String[] args) {

        //median();
        element();
    }

    public static void median(){

        List<Integer> nums1 = Arrays.asList(1,3,5,8,9,11);
        List<Integer> nums2 = Arrays.asList(2,4);

        List<Integer> result = new ArrayList<>();

        int pointer1 = 0;
        int pointer2 = 0;

        while (pointer1 < nums1.size() && pointer2 < nums2.size()){
            if(nums1.get(pointer1) < nums2.get(pointer2)){
                result.add(nums1.get(pointer1));
                pointer1++;
            }else{
                result.add(nums2.get(pointer2));
                pointer2++;
            }
        }

        if (pointer1 < nums1.size()){
            while (pointer1 < nums1.size()){
                result.add(nums1.get(pointer1));
                pointer1++;
            }
        }

        if (pointer2 < nums2.size()){
            while (pointer2 < nums2.size()){
                result.add(nums2.get(pointer2));
                pointer2++;
            }
        }

        System.out.println(result);

        if (result.size() % 2 != 0){
            int i = result.size() / 2;
            int medianRes1 = result.get(i);
            System.out.println(medianRes1);
        }

        if (result.size() % 2 == 0){
            int i2 = result.size() / 2;
            int median2 = result.get(i2);
            int median3 = result.get(i2-1);
            float medianRes2 = ((float) (median2 + median3)) / 2;
            System.out.println(medianRes2);
        }

    }

    public static void element(){
        List<Integer> elements = Arrays.asList(1,1,4,5,3,1,2,3,4);

        HashMap<String, Integer> hashmap = new HashMap <>();

        for(int i=0; i < elements.size(); i++){
            if (hashmap.containsKey(String.valueOf(elements.get(i)))){
                hashmap.put(String.valueOf(elements.get(i)), hashmap.get(String.valueOf(elements.get(i)))+1);
            }else{
                hashmap.put(String.valueOf(elements.get(i)), 1);
            }
        }

        System.out.println(hashmap);
    }
}
