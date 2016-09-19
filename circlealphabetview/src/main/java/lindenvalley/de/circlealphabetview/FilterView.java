package lindenvalley.de.circlealphabetview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;

public class FilterView extends LinearLayout {
    private Context mContext;
    public FilterView(Context context) {
        super(context);
        this.mContext = context;
        initComponent();
    }

    public FilterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.mContext = context;
        initComponent();
    }

    public FilterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mContext = context;
        initComponent();
    }

    private void initComponent() {
        LayoutInflater inflater = (LayoutInflater) getContext()
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.filter_view, this);
    }
}


