package com.example.gen;

import java.util.ArrayList;
import com.example.ResultProvider;

public class AEFE implements ResultProvider {
    ArrayList<ResultProvider> mChildren;
    private static final int CHILD_COUNT = 5;

    public AEFE() {
        mChildren = new ArrayList<>(CHILD_COUNT);
        mChildren.add(new AEFEB());
        mChildren.add(new AEFEC());
        mChildren.add(new AEFED());
        mChildren.add(new AEFEE());
        mChildren.add(new AEFEF());

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
