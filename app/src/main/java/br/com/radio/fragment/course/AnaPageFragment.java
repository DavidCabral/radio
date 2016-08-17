package br.com.radio.fragment.course;


import com.cleveroad.slidingtutorial.PageFragment;
import com.cleveroad.slidingtutorial.TransformItem;

import br.com.radio.R;


public class AnaPageFragment extends PageFragment {


    @Override
    protected TransformItem[] provideTransformItems() {
        return new TransformItem[]{
                new TransformItem(R.id.iv_ana, true, 20),
                new TransformItem(R.id.iv_ana_2, false, 6),
                new TransformItem(R.id.iv_ana_3, true, 88),
                new TransformItem(R.id.iv_ana_4, false, 10),
                new TransformItem(R.id.tx_type, false, 9),
                new TransformItem(R.id.tx_name, false, 22)
        };
    }

    @Override
    protected int getLayoutResId() {
        return R.layout.fragment_ana_page;
    }


}
