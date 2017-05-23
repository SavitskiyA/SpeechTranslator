package streamspeechrecognition.com.streamspeechrecognition;

import android.app.Dialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Andrey on 10.05.2017.
 */

public class LanguageFragment extends DialogFragment {
private List<SpinnerModel> spinnerModels;

    public Dialog onCreateDialog(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.language_layout, null);

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setView(v);
        builder.setCancelable(true);

        Spinner spinnerLanguageFrom = (Spinner) v.findViewById(R.id.spinnerLanguageFrom);
        Spinner spinnerLanguageTo = (Spinner) v.findViewById(R.id.spinnerLanguageTo);
        spinnerModels=new ArrayList();
        SpinnerAdapter spinnerAdapter = new SpinnerAdapter(spinnerModels);

        spinnerLanguageFrom.setAdapter(spinnerAdapter);
        spinnerLanguageTo.setAdapter(spinnerAdapter);

        spinnerLanguageFrom.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SharedPreferences sharedPreferences = getActivity().getSharedPreferences("language", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("languageFrom", spinnerModels.get(position).getAlfaLanguage());
            }
        });

        spinnerLanguageTo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                SharedPreferences sharedPreferences = getActivity().getSharedPreferences("language", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("languageTo", spinnerModels.get(position).getAlfaLanguage());
            }
        });

        spinnerLanguageTo.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
        AlertDialog alertDialog = builder.create();
        return alertDialog;
    }
}
