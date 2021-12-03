package com.example.finalapp.ui.numGuessGame;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.finalapp.R;

import org.w3c.dom.Text;

import java.util.Random;


public class NumGuessGameFragment extends Fragment {

    TextView tryCounter;
    TextView scoreCounter;
    TextView lowHigh;
    EditText numberInput;
    Button guessBTN;

    private int score;
    private int strike;
    private int bonusScore;
    private int randNumber;

    private NumGuessGameViewModel numGuessGameViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View root = inflater.inflate(R.layout.fragment_numguessgame,container,false);

        tryCounter = root.findViewById(R.id.tryCounter);
        scoreCounter = root.findViewById(R.id.scoreCounter);
        lowHigh = root.findViewById(R.id.lowHigh);
        numberInput = root.findViewById(R.id.numberInput);
        guessBTN = root.findViewById(R.id.guessBTN);

        strike = 5;
        score = 0;
        bonusScore = 0;
        randNumber = new Random().nextInt(101);
        lowHigh.setText("Guess a number between 1 and 100 ");
        tryCounter.setText("Tries left: "+String.valueOf(strike));
        scoreCounter.setText("Score: "+String.valueOf(score));

        guessBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { guess(); }
        });

        return root;
    }

    private void guess(){
        int numInput = Integer.parseInt((String.valueOf(numberInput.getText())));
        if (numInput == randNumber) {
            bonusScore = strike * 5;
            score += 50;
            score += bonusScore;
            scoreCounter.setText(String.valueOf(score));
            guessBTN.setVisibility(View.INVISIBLE);
            lowHigh.setText("Congrats, the number was "+randNumber);
        }
        else if (numInput>randNumber) {
            strike -= 1;
            tryCounter.setText("Tries left: "+String.valueOf(strike));
            lowHigh.setText("The correct number is lower than "+String.valueOf(numInput));
        }
        else if (numInput<randNumber) {
            strike -= 1;
            tryCounter.setText("Tries left: "+String.valueOf(strike));
            lowHigh.setText("The correct number is higher than "+String.valueOf(numInput));
        }
        else {
            strike -= 1;
            tryCounter.setText(String.valueOf(strike));
            lowHigh.setText("That's not a number");
        }

        if (strike <= 0) {
            guessBTN.setVisibility(View.INVISIBLE);
            lowHigh.setText("Uh oh, Somebody's got a frowny face. " +
                    "Ooo better luck next time.\nThe number was "+randNumber);
        }
    }

}