package com.wangyin.szkweb.Utils;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by shizhongkai on 2017/11/21.
 */
public class ArgUtil {
       static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

    public static void main(String args[]){

//        int result[]=getIndies(new int[]{1,2,3,4},7);
//       System.out.print("1 "+result[0]+" 2:"+result[1]);

        ListNode l1 =new ListNode(5);
//        ListNode l2 =new ListNode(0);
//        ListNode l3 =new ListNode(3);
//        l1.next=l2;
//        l2.next=l3;
        ListNode ll1 =new ListNode(7);
        ListNode ll2 =new ListNode(6);
        ListNode ll3 =new ListNode(9);
        ll1.next=ll2;
        ll2.next=ll3;
        addTwoNumbers(l1,ll1);
        System.out.print("first"+l1.val +"second"+l1.next.val+"third"+l1.next.next.val);

//        System.out.print("first"+l1.val +"second"+l1.next.val+"third"+l1.next.next.val+"fourth"+l1.next.next.next.val);

    }
    public static int[] getIndies(int[] nums,int target){
        int result[] =new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j =i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]=i;
                    result[1]=j;
                }

            }
        }
        return result;

    }


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int jinwei =0;
        ListNode result =l1;
        ListNode last =l1;

        do{
            if(l2==null){
                l2 =new ListNode(0);
            }
            if(l1==null){
                l1 =new ListNode(0);
                last.next=l1;

            }
               l1.val=l1.val+l2.val+jinwei;
               if(l1.val>=10){
                   jinwei =1;
               }else{
                   jinwei =0;
               }
               l1.val=l1.val>=10?l1.val-10:l1.val;
               last =l1;
               l1=l1.next;
               l2=l2.next;
           } while(l2!=null||l1!=null);
          if(jinwei==1){
              ListNode llast =new ListNode(1);
              last.next =llast;
          }
           return result;
    }

//    Given a string, find the length of the longest substring without repeating characters.
//
//    Examples:
//
//    Given "abcabcbb", the answer is "abc", which the length is 3.
//
//    Given "bbbbb", the answer is "b", with the length of 1.
//
//    Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
public static int lengthOfLongestSubstring(String s) {

            int n = s.length();
            Set<Character> set = new HashSet();
            int ans = 0, i = 0, j = 0;
            while (i < n && j < n) {
                // try to extend the range [i, j]
                if (!set.contains(s.charAt(j))){
                    set.add(s.charAt(j++));
                    ans = Math.max(ans, j - i);
                }
                else {
                    set.remove(s.charAt(i++));
                }
            }
            return ans;
        }


}
