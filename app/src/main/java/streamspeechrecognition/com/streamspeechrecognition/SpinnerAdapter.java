package streamspeechrecognition.com.streamspeechrecognition;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrey on 10.05.2017.
 */

public class SpinnerAdapter extends BaseAdapter {
    List<SpinnerModel> spinnerModels;
    public SpinnerAdapter(List<SpinnerModel> spinnerModels) {
    this.spinnerModels = spinnerModels;
    }

    @Override
    public int getCount() {
        return spinnerModels.size();
    }

    @Override
    public Object getItem(int position) {
        return spinnerModels.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View v = inflater.inflate(R.layout.language_row, null);
        TextView textViewLanguage = (TextView) v.findViewById(R.id.textViewLanguage);
        ImageView imageViewFlag = (ImageView) v.findViewById(R.id.imageViewFlag);

        textViewLanguage.setText(spinnerModels.get(position).getLanguage());
        imageViewFlag.setBackgroundResource(spinnerModels.get(position).getImage());

        return v;
    }
}
