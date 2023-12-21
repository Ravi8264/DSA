public class comparator {
    public static void main(String[] args) {
        
    }
}


// 1st method
// ans.sort((a, b) -> {
//     int minSize = Math.min(a.size(), b.size());
//     for (int i = 0; i < minSize; i++) {
//         if (!a.get(i).equals(b.get(i))) {
//             return a.get(i) - b.get(i);
//         }
//     }
//     return Integer.compare(a.size(), b.size());
// });
   

//2nd method
// ans.sort((a, b) -> {
//     for (int i = 0; i < a.size(); i++) {
//         int elementComparison = a.get(i).compareTo(b.get(i));
//         if (elementComparison != 0) {
//             return elementComparison;
//         }
//     }
//     // No special handling for equal lists
// });



//3rd method
// ans.sort((a, b) -> {
//     for (int i = 0; i < a.size(); i++) {
//         if (!a.get(i).equals(b.get(i))) {
//             return a.get(i) - b.get(i);
//         }
//     }
//     // No special handling for equal lists
// });



//4th method


// Custom Sorting Criteria: 
// Depending on your specific sorting requirements, you can return a different integer value. 
// For example, you might want to sort equal lists based on some other criteria. 
// Here's an example that sorts equal lists based on their size (number of elements):


// ans.sort((a, b) -> {  //if a and b size are equal
//     for (int i = 0; i < a.size(); i++) {
//         if (!a.get(i).equals(b.get(i))) {
//             return a.get(i) - b.get(i);
//         }
//     }
//     return a.size() - b.size(); // Sort equal lists by size
// });

  
//method5

// Preserve Original Order: 
// If you want to preserve the original order of equal lists in the sorted result, you can return a value that reflects this. 
// For example, you can return -1 to indicate that the first list (a) should come before the second list (b) in such cases:


// ans.sort((a, b) -> {
//     for (int i = 0; i < a.size(); i++) {
//         if (!a.get(i).equals(b.get(i))) {
//             return a.get(i) - b.get(i);
//         }
//     }
//     return -1; // Preserve original order of equal lists
// });





    //     Preserve Original Order: 
    //     If you want to preserve the original order of equal lists in the sorted result, you can return a value that reflects this.
    //     For example, 
    //     you can return -1 to indicate that the first list (a) should come before the second list (b) in such cases:
    //   //1st method
    //   ans.sort((a,b)->{  //if size is same  a and b
    //     for(int i=0; i<min; i++){
    //       if(a.get(i) !=b.get(i)){
    //         return a.get(i)-b.get(i);
    //       }
    //     }
    //     return -1;
    //   });



//     // 2nd method
      

//   ans.sort((a,b)->{   //if size is different
//         int min=Math.min(a.size(),b.size());
//         for(int i=0; i<min; i++){
//           if(a.get(i) !=b.get(i)){
//             return a.get(i).compareTo(b.get(i));
//           }
//         }
//        return Integer.compare(a.size(), b.size());  //// Sort equal lists by size
//       });
  



    // //3rd method

    //    ans.sort((a,b)->{   //used compareTo and equals to
    //     int min=Math.min(a.size(),b.size());
    //     for(int i=0; i<min; i++){
    //       if(!a.get(i).equals(b.get(i))){
    //         return a.get(i).compareTo(b.get(i));
    //       }
    //     }
    //    return Integer.compare(a.size(), b.size());
    //   });


      
      //4th method
    // ans.sort((a,b)->{
    //     int min=Math.min(a.size(),b.size());
    //     for(int i=0; i<min; i++){
    //       if(!a.get(i).equals(b.get(i))){
    //         return a.get(i)-b.get(i);
    //       }
    //     }
    //    return Integer.compare(a.size(), b.size());
    //   });
      
      
//  External comparator
//       Collections.sort(ans, new rsk());
//       return ans;
//     }
// }   

// class rsk implements Comparator<List<Integer>> {
//     @Override
//     public int compare(List<Integer> a, List<Integer> b) {
//         int minSize = Math.min(a.size(), b.size());
//         for (int i = 0; i < minSize; i++) {
//         if(!a.get(i).equals(b.get(i))){
//          return a.get(i).compareTo(b.get(i));
//         } 
//     }
//       return Integer.compare(a.size(), b.size());
//   }
// }
