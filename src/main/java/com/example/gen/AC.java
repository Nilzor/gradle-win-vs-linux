package com.example.gen;

import java.util.ArrayList;
import com.example.ResultProvider;

public class AC implements ResultProvider {
    ArrayList<ResultProvider> mChildren;
    private static final int CHILD_COUNT = 5;

    public AC() {
        mChildren = new ArrayList<>(CHILD_COUNT);
        mChildren.add(new ACB());
        mChildren.add(new ACC());
        mChildren.add(new ACD());
        mChildren.add(new ACE());
        mChildren.add(new ACF());

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
