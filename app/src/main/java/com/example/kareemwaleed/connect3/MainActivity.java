package com.example.kareemwaleed.connect3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    boolean player;
    boolean game;
    ArrayList<String> cell;
    ArrayList<ImageView> yellowCoins;
    ArrayList<ImageView> redCoins;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        prepare();
    }

    private void prepare()
    {
        game = true;
        player = true;
        cell = new ArrayList<>();
        for(int i=0; i < 9; i++)
            cell.add(".");
        redCoins = new ArrayList<>();
        yellowCoins = new ArrayList<>();
        ImageView temp;

        temp = (ImageView) findViewById(R.id.cellOneRed);
        temp.setTranslationY(-10000f);
        redCoins.add(temp);

        temp = (ImageView) findViewById(R.id.cellTwoRed);
        temp.setTranslationY(-10000f);
        redCoins.add(temp);

        temp = (ImageView) findViewById(R.id.cellThreeRed);
        temp.setTranslationY(-10000f);
        redCoins.add(temp);

        temp = (ImageView) findViewById(R.id.cellFourRed);
        temp.setTranslationY(-10000f);
        redCoins.add(temp);

        temp = (ImageView) findViewById(R.id.cellFiveRed);
        temp.setTranslationY(-10000f);
        redCoins.add(temp);

        temp = (ImageView) findViewById(R.id.cellSixRed);
        temp.setTranslationY(-10000f);
        redCoins.add(temp);

        temp = (ImageView) findViewById(R.id.cellSevenRed);
        temp.setTranslationY(-10000f);
        redCoins.add(temp);

        temp = (ImageView) findViewById(R.id.cellEightRed);
        temp.setTranslationY(-10000f);
        redCoins.add(temp);

        temp = (ImageView) findViewById(R.id.cellNineRed);
        temp.setTranslationY(-10000f);
        redCoins.add(temp);

        temp = (ImageView) findViewById(R.id.cellOneYellow);
        temp.setTranslationY(-10000f);
        yellowCoins.add(temp);

        temp = (ImageView) findViewById(R.id.cellTwoYellow);
        temp.setTranslationY(-10000f);
        yellowCoins.add(temp);

        temp = (ImageView) findViewById(R.id.cellThreeYellow);
        temp.setTranslationY(-10000f);
        yellowCoins.add(temp);

        temp = (ImageView) findViewById(R.id.cellFourYellow);
        temp.setTranslationY(-10000f);
        yellowCoins.add(temp);

        temp = (ImageView) findViewById(R.id.cellFiveYellow);
        temp.setTranslationY(-10000f);
        yellowCoins.add(temp);

        temp = (ImageView) findViewById(R.id.cellSixYellow);
        temp.setTranslationY(-10000f);
        yellowCoins.add(temp);

        temp = (ImageView) findViewById(R.id.cellSevenYellow);
        temp.setTranslationY(-10000f);
        yellowCoins.add(temp);

        temp = (ImageView) findViewById(R.id.cellEightYellow);
        temp.setTranslationY(-10000f);
        yellowCoins.add(temp);

        temp = (ImageView) findViewById(R.id.cellNineYellow);
        temp.setTranslationY(-10000f);
        yellowCoins.add(temp);
    }

    public void cellOneResponse(View view)
    {
        if(!validate(0))
            return;
        if(player && game)
            redPlay(0);
        else if(!player && game)
            yellowPlay(0);
        else
            Toast.makeText(getApplicationContext(), "The game is over !!", Toast.LENGTH_LONG).show();
    }

    public void cellTwoResponse(View view)
    {
        if(!validate(1))
            return;
        if(player && game)
            redPlay(1);
        else if(!player && game)
            yellowPlay(1);
        else
            Toast.makeText(getApplicationContext(), "The game is over !!", Toast.LENGTH_LONG).show();
    }

    public void cellThreeResponse(View view)
    {
        if(!validate(2))
            return;
        if(player && game)
            redPlay(2);
        else if(!player && game)
            yellowPlay(2);
        else
            Toast.makeText(getApplicationContext(), "The game is over !!", Toast.LENGTH_LONG).show();
    }

    public void cellFourResponse(View view)
    {
        if(!validate(3))
            return;
        if(player && game)
            redPlay(3);
        else if(!player && game)
            yellowPlay(3);
        else
            Toast.makeText(getApplicationContext(), "The game is over !!", Toast.LENGTH_LONG).show();
    }

    public void cellFiveResponse(View view)
    {
        if(!validate(4))
            return;
        if(player && game)
            redPlay(4);
        else if(!player && game)
            yellowPlay(4);
        else
            Toast.makeText(getApplicationContext(), "The game is over !!", Toast.LENGTH_LONG).show();
    }

    public void cellSixResponse(View view)
    {
        if(!validate(5))
            return;
        if(player && game)
            redPlay(5);
        else if(!player && game)
            yellowPlay(5);
        else
            Toast.makeText(getApplicationContext(), "The game is over !!", Toast.LENGTH_LONG).show();
    }

    public void cellSevenResponse(View view)
    {
        if(!validate(6))
            return;
        if(player && game)
            redPlay(6);
        else if(!player && game)
            yellowPlay(6);
        else
            Toast.makeText(getApplicationContext(), "The game is over !!", Toast.LENGTH_LONG).show();
    }

    public void cellEightResponse(View view)
    {
        if(!validate(7))
            return;
        if(player && game)
            redPlay(7);
        else if(!player && game)
            yellowPlay(7);
        else
            Toast.makeText(getApplicationContext(), "The game is over !!", Toast.LENGTH_LONG).show();
    }

    public void cellNineResponse(View view)
    {
        if(!validate(8))
            return;
        if(player && game)
            redPlay(8);
        else if(!player && game)
            yellowPlay(8);
        else
            Toast.makeText(getApplicationContext(), "The game is over !!", Toast.LENGTH_LONG).show();
    }

    private boolean validate(int cellNumber)
    {
        checkGameOver();
        if(cell.get(cellNumber) == ".")
            return true;
        if(!game)
            Toast.makeText(getApplicationContext(), "The game is over !!", Toast.LENGTH_LONG).show();
        return false;
    }

    private boolean checkRedWin()
    {
        if(cell.get(0) == "R" && cell.get(3) == "R" && cell.get(6) == "R")
            return true;
        if(cell.get(1) == "R" && cell.get(4) == "R" && cell.get(7) == "R")
            return true;
        if(cell.get(2) == "R" && cell.get(5) == "R" && cell.get(8) == "R")
            return true;
        if(cell.get(0) == "R" && cell.get(1) == "R" && cell.get(2) == "R")
            return true;
        if(cell.get(3) == "R" && cell.get(4) == "R" && cell.get(5) == "R")
            return true;
        if(cell.get(6) == "R" && cell.get(7) == "R" && cell.get(8) == "R")
            return true;
        return false;
    }

    private boolean checkYellowWin()
    {
        if(cell.get(0) == "Y" && cell.get(3) == "Y" && cell.get(6) == "Y")
            return true;
        if(cell.get(1) == "Y" && cell.get(4) == "Y" && cell.get(7) == "Y")
            return true;
        if(cell.get(2) == "Y" && cell.get(5) == "Y" && cell.get(8) == "Y")
            return true;
        if(cell.get(0) == "Y" && cell.get(1) == "Y" && cell.get(2) == "Y")
            return true;
        if(cell.get(3) == "Y" && cell.get(4) == "Y" && cell.get(5) == "Y")
            return true;
        if(cell.get(6) == "Y" && cell.get(7) == "Y" && cell.get(8) == "Y")
            return true;
        return false;
    }

    private void redPlay(int cellNumber)
    {

        redCoins.get(cellNumber).setTranslationY(0f);
        cell.set(cellNumber, "R");
        if(checkRedWin())
        {
            Toast.makeText(getApplicationContext(), "Red Player Wins", Toast.LENGTH_LONG).show();
            game = false;
        }
        player = false;
    }

    private void yellowPlay(int cellNumber)
    {

        yellowCoins.get(cellNumber).setTranslationY(0f);
        cell.set(cellNumber, "Y");
        if(checkYellowWin())
        {
            Toast.makeText(getApplicationContext(), "Yellow Player Wins", Toast.LENGTH_LONG).show();
            game = false;
        }
        player = true;
    }

    private void checkGameOver()
    {
        boolean check = false;
        for(int i=0; i < 9; i++)
        {
            if(cell.get(i) == ".")
            {
                check = true;
                break;
            }
        }
        if(!check)
            game = false;
    }

    public void reset(View view)
    {
        cell.clear();
        redCoins.clear();
        yellowCoins.clear();
        prepare();
    }
}
