package com.sidorin.demo.sort.socket;

public class IncomeMessage {
    private SortType sortType;
    private boolean play;
    private boolean stop;

    public SortType getSortType() {
        return sortType;
    }

    public boolean isPlay() {
        return play;
    }

    public boolean isStop() {
        return stop;
    }
}
