package Array;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {

    public static void main(String[] args){
        String[] friendsArray = new String[5];

        String[] friendsArray2 = {"Long", "Thinh", "Duong", "Quan"};

        ArrayList<String> ListFriendsArray = new ArrayList<>();

        ArrayList<String> ListFriendsArray2 = new ArrayList<>(Arrays.asList("Long", "Thinh", "Duong", "Quan"));

        //get size array
        System.out.println(friendsArray2[2]);
        System.out.println(ListFriendsArray2.get(2));

        //add an element
        ListFriendsArray2.add("Phuc");
        System.out.println(ListFriendsArray2.size());
        System.out.println(ListFriendsArray2.get(4));

        //set an element
        friendsArray2[2] = "Linh";
        System.out.println(friendsArray2[2]);
        ListFriendsArray2.set(1, "Thay Son");
        System.out.println(ListFriendsArray2.get(1));

        //remove an element
        // Can not do this with array
        ListFriendsArray2.remove(1);
        System.out.println(ListFriendsArray2.get(1));
        System.out.println(ListFriendsArray2.size());

        //Print Array
        System.out.println(Arrays.toString(friendsArray2));
        System.out.println(ListFriendsArray2);
    }

}
