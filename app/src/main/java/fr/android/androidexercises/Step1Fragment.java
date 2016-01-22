package fr.android.androidexercises;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Step1Fragment extends Fragment {


    private OnNextStep1Listener listener;
    private Button nextButton;

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        // TODO cast context to listener
        listener = (OnNextStep1Listener) context;
    }

    // TODO Override onCreateViewMethod
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_step1, container, false);
        nextButton = (Button) view.findViewById(R.id.nextButtonStep1);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO call onNext() from listener
                listener.onNextStep1();
            }
        });
        return view;
    }

    public interface OnNextStep1Listener {

        // TODO add onNext() method
        void onNextStep1();

    }

}
