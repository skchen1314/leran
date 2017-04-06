package com.csk.learn.optimize.collections;

import java.util.ArrayList;

/**
 * 实现RandomAccess接口的集合
 * Created by chensk on 2016/8/22.
 */
public class RandomAccessImplIterateTest {
    /**
     * 实现RandomAccess接口的集合比如ArrayList，应当使用最普通的for循环而不是foreach循环来遍历
     * @param args
     */
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        for(int i = 0; i < 10000; i++ )
        {
            arrayList.add(i);
        }

        for (int i = 0, length = arrayList.size() ; i < arrayList.size(); i++){}

    }
}
