package com.example.gen;

import java.util.ArrayList;
import com.example.ResultProvider;

public class AEF implements ResultProvider {
    ArrayList<ResultProvider> mChildren;
    private static final int CHILD_COUNT = 5;

    public AEF() {
        mChildren = new ArrayList<>(CHILD_COUNT);
        mChildren.add(new AEFB());
        mChildren.add(new AEFC());
        mChildren.add(new AEFD());
        mChildren.add(new AEFE());
        mChildren.add(new AEFF());

    }

    public float getResult(float in) {
        float res = in;
        double val1 = Math.random();
        val1 *= 2;
        ArrayList<Float> list = new ArrayList<>(2);
        list.add(new Float(val1));
        list.add(new Float(val1));

        for (Float f : list) {
            res += f;
        }

        String cn = this.getClass().getSimpleName();
        System.out.println("Return " + res + " in " + cn + " at " + System.currentTimeMillis());
        res = (float) Math.pow(res, 1.001);



        for (int i = 0; i < mChildren.size(); i++) {
            res = mChildren.get(i).getResult(res);
        }
        return res;
    }
}
