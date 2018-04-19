package com.yur.util;

import java.util.Collections;
import java.util.List;

public class GridResponse<T> {

    private int count;

    private List<T> data;

    @SuppressWarnings("unchecked")
    private static final GridResponse emptyResponse = new GridResponse(Collections.emptyList(),0);

    @SuppressWarnings("unchecked")
    public static <T> GridResponse<T> empty(){
        return (GridResponse<T>)emptyResponse;
    }

    /**
     *
     */
    public GridResponse(List<T> list,int count) {
        setCount(count);
        setData(list);
    }

    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }

    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * @return the data
     */
    public List<T> getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(List<T> data) {
        this.data = data;
    }

}
