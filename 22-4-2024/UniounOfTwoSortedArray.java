import java.util.ArrayList;
import java.util.List;

public class UniounOfTwoSortedArray {

    public void printArray(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }


    public int[] unionArray(int[] nums1, int[] nums2) {

        int n = nums1.length;
        int m = nums2.length;
        List<Integer> UnionList = new ArrayList<>();
        int i=0;
        int j=0;
        while(i<n && j<m){
            if(nums1[i]<nums2[j]){
                if (UnionList.isEmpty() || UnionList.get(UnionList.size() - 1) != nums1[i]){
                    UnionList.add(nums1[i]);
                }
                i++;
                
            }
            else if(nums2[j]<nums1[i]){
                if (UnionList.isEmpty() || UnionList.get(UnionList.size() - 1) != nums2[j]){
                    UnionList.add(nums2[j]);
                }
                j++;
            }
            else{
                if (UnionList.isEmpty() || UnionList.get(UnionList.size() - 1) != nums1[i]){
                    UnionList.add(nums1[i]);
                }
                i++;
                j++;
                
            }
            
        }
        while(i<n){
            if (UnionList.isEmpty() || UnionList.get(UnionList.size() - 1) != nums1[i]){
                UnionList.add(nums1[i]);
            }
            i++;
            
        }
        while(j<m){
            if (UnionList.isEmpty() || UnionList.get(UnionList.size() - 1) != nums2[j]){
                UnionList.add(nums2[j]);
            }
            j++;
            
        }

        int[] nums3 = new int[UnionList.size()];
        for(int k = 0;k<UnionList.size();k++){
            nums3[k] = UnionList.get(k);
        }
        return nums3;
        
    }





    public static void main(String[] args) {

        int[] nums1 = {3, 4, 6, 7, 9, 9};
        int[] nums2 = {1, 5, 7, 8, 8};
        
        int[] nums3 = new int[nums1.length+nums2.length];
        UniounOfTwoSortedArray u = new UniounOfTwoSortedArray();
        nums3 = u.unionArray(nums1, nums2);

        u.printArray(nums3);
        
    }
    
}
