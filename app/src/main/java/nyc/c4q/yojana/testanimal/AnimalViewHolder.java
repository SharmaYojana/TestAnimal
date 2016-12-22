package nyc.c4q.yojana.testanimal;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by yojanasharma on 12/21/16.
 */

public class AnimalViewHolder extends RecyclerView.ViewHolder {
    private View mRoot;
    private TextView mName;
    private TextView mTextColor;
    private TextView mBackground;

    public AnimalViewHolder(ViewGroup parent) {
        super(inflateView(parent));
        mRoot = itemView;
        mName = (TextView) mRoot.findViewById(R.id.name);
        mTextColor = (TextView) mRoot.findViewById(R.id.textColor);
        mBackground = (TextView) mRoot.findViewById(R.id.background);
    }
    private static View inflateView(ViewGroup parent){
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        return inflater.inflate(R.layout.list_animals, parent, false);
    }

    public void bind (Animals animals){
        mName.setText(animals.getName());
        mTextColor.setText(animals.getTextColor());
        mBackground.setText(animals.getBackground());
    }
}
