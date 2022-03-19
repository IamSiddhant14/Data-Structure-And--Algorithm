// import java.util.*;
// import java.io*;

// public static void func(int[]arr){
//     HashMap<Integer, Integer> map = new HasMap<>();
//     for(int ele: arr){
//         map.put(ele, map.getOrDeault(ele, 0) + 1);
//     }
//     Stack<Integer>st = new Stack<>();
//     int[]ans = new int[arr.length];
//     for(int i = 0; i < arr.length; i++){
//         while(st.size() != 0 && map.get(arr[i]) > map.get(arr[st.peek()])){
//             ans[st.peek()] = arr[i];
//             st.pop();
//         }    
//         st.push(i);
//     }

// }