package com.sidorin.demo.sort.service;


import com.sidorin.demo.sort.bean.Line;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BubbleSortService extends SortService {
    @Override
    protected List<Line> sortList(String target, List<Line> list) {
        boolean found = true;
        while(found){
            found = false;
            for(int i = 0; i < list.size()-1; i++){
                Line current = list.get(i);
                Line next = list.get(i+1);
                if(current.compare(next)){
                    found = true;
                    list.set(i, next);
                    list.set(i+1, current);
                    addLog(target, i, list);
                }
            }
        }
        return null;
    }



}
