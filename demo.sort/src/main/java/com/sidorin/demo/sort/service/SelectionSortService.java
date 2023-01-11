package com.sidorin.demo.sort.service;

import com.sidorin.demo.sort.bean.Line;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SelectionSortService extends SortService {
    @Override
    protected List<Line> sortList(String target, List<Line> list) {
        for (int i = 0; i < list.size(); i++) {
            Line max = list.get(i);
            int maxInd = i;
            for(int j = i+1; j< list.size(); j++){
                if(list.get(j).needToReplace(max)){
                    max = list.get(j);
                    maxInd = j;
                    addLog(target, j, list);
                }
            }
            Line temp = list.get(i);
            list.set(i, max);
            addLog(target, i, list);
            list.set(maxInd, temp);
            addLog(target, i, list);
        }
        return list;
    }
}
