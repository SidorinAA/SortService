package com.sidorin.demo.sort.service;

import com.sidorin.demo.sort.bean.Line;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsertionSortService extends SortService {
    @Override
    protected List<Line> sortList(String target, List<Line> list) {
        for (int i = 0; i < list.size(); i++) {
            Line current = list.get(i);
            int j = i - 1;
            while(j>=0 && list.get(j).needToReplace(current)){
                list.set(j+1, list.get(j));
                addLog(target, List.of(i, j), list);
                j--;
            }
            list.set(j+1, current);
        }
        return list;
    }
}
