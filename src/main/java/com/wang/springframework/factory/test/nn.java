package com.wang.springframework.factory.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wjh
 * @version 1.0
 * nn
 * @date 2021/10/27 19:28
 */
public class nn {
    public static void main(String[] args) {
        nn nn = new nn();
        System.out.println("========"+nn.permute(new int[]{1,2,3}));

    }
    boolean[] used;
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        int len = nums.length;
        used = new boolean[len];
        track(nums,res,path);
        return res;

    }

    public void track(int[] nums,List<List<Integer>> res, List<Integer> path){
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
            System.out.println(res);
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(i>0&&nums[i]==nums[i-1]&&used[i]){
                continue;
            }
            path.add(nums[i]);
            used[i]=true;
            track(nums,res,path);
            path.remove(path.size()-1);
            used[i]=false;
        }
    }
}

