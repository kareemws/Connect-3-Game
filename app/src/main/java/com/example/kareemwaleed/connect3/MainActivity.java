package com.example.kareemwaleed.connect3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.HashMap;
import java.util.Map;

import static com.example.kareemwaleed.connect3.R.id.cellEight;
import static com.example.kareemwaleed.connect3.R.id.cellFour;
import static com.example.kareemwaleed.connect3.R.id.cellNine;

public class MainActivity extends AppCompatActivity {

    boolean player;
    boolean game;
    Map<String, ImageView> cells;

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
        cells = new HashMap<String, ImageView>();
        cells.put("cellOne", (ImageView)findViewById(R.id.cellOne));
        cells.put("cellTwo", (ImageView)findViewById(R.id.cellTwo));
        cells.put("cellThree", (ImageView)findViewById(R.id.cellThree));
        cells.put("cellFour", (ImageView)findViewById(cellFour));
        cells.put("cellFive", (ImageView)findViewById(R.id.cellFive));
        cells.put("cellSix", (ImageView)findViewById(R.id.cellSix));
        cells.put("cellSeven", (ImageView)findViewById(R.id.cellSeven));
        cells.put("cellEight", (ImageView)findViewById(cellEight));
        cells.put("cellNine", (ImageView)findViewById(cellNine));
    }

    public void cellResponse(View view)
    {
        if(!validate(view))
            return;
        if(player && game)
            redPlay(view);
        else if(!player && game)
            yellowPlay(view);
        else
            Toast.makeText(getApplicationContext(), "The game is over !!\nReset to play again", Toast.LENGTH_LONG).show();
    }

    private boolean validate(View view)
    {
        checkGameOver();
        ImageView temp = (ImageView) view;
        if(temp.getDrawable() == null)
            return true;
        if(!game)
            Toast.makeText(getApplicationContext(), "The game is over !!\nReset to play again", Toast.LENGTH_LONG).show();
        return false;
    }

    private boolean checkRedWin()
    {
        if(cells.get("cellOne").getDrawable() != null
                && cells.get("cellOne").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.red).getConstantState()
                && cells.get("cellFour").getDrawable() != null
                && cells.get("cellFour").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.red).getConstantState()
                && cells.get("cellSeven").getDrawable() != null
                && cells.get("cellSeven").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.red).getConstantState())
            return true;
        if(cells.get("cellTwo").getDrawable() != null
                && cells.get("cellTwo").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.red).getConstantState()
                && cells.get("cellFive").getDrawable() != null
                && cells.get("cellFive").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.red).getConstantState()
                && cells.get("cellEight").getDrawable() != null
                && cells.get("cellEight").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.red).getConstantState())
            return true;
        if(cells.get("cellThree").getDrawable() != null
                && cells.get("cellThree").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.red).getConstantState()
                && cells.get("cellSix").getDrawable() != null
                && cells.get("cellSix").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.red).getConstantState()
                && cells.get("cellNine").getDrawable() != null
                && cells.get("cellNine").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.red).getConstantState())
            return true;
        if(cells.get("cellOne").getDrawable() != null
                && cells.get("cellOne").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.red).getConstantState()
                && cells.get("cellTwo").getDrawable() != null
                && cells.get("cellTwo").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.red).getConstantState()
                && cells.get("cellThree").getDrawable() != null
                && cells.get("cellThree").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.red).getConstantState())
            return true;
        if(cells.get("cellFour").getDrawable() != null
                && cells.get("cellFour").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.red).getConstantState()
                && cells.get("cellFive").getDrawable() != null
                && cells.get("cellFive").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.red).getConstantState()
                && cells.get("cellSix").getDrawable() != null
                && cells.get("cellSix").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.red).getConstantState())
            return true;
        if(cells.get("cellSeven").getDrawable() != null
                && cells.get("cellSeven").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.red).getConstantState()
                && cells.get("cellEight").getDrawable() != null
                && cells.get("cellEight").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.red).getConstantState()
                && cells.get("cellNine").getDrawable() != null
                && cells.get("cellNine").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.red).getConstantState())
            return true;
        return false;
    }

    private boolean checkYellowWin()
    {
        if(cells.get("cellOne").getDrawable() != null
                && cells.get("cellOne").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.yellow).getConstantState()
                && cells.get("cellFour").getDrawable() != null
                && cells.get("cellFour").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.yellow).getConstantState()
                && cells.get("cellSeven").getDrawable() != null
                && cells.get("cellSeven").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.yellow).getConstantState())
            return true;
        if(cells.get("cellTwo").getDrawable() != null
                && cells.get("cellTwo").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.yellow).getConstantState()
                && cells.get("cellFive").getDrawable() != null
                && cells.get("cellFive").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.yellow).getConstantState()
                && cells.get("cellEight").getDrawable() != null
                && cells.get("cellEight").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.yellow).getConstantState())
            return true;
        if(cells.get("cellThree").getDrawable() != null
                && cells.get("cellThree").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.yellow).getConstantState()
                && cells.get("cellSix").getDrawable() != null
                && cells.get("cellSix").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.yellow).getConstantState()
                && cells.get("cellNine").getDrawable() != null
                && cells.get("cellNine").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.yellow).getConstantState())
            return true;
        if(cells.get("cellOne").getDrawable() != null
                && cells.get("cellOne").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.yellow).getConstantState()
                && cells.get("cellTwo").getDrawable() != null
                && cells.get("cellTwo").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.yellow).getConstantState()
                && cells.get("cellThree").getDrawable() != null
                && cells.get("cellThree").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.yellow).getConstantState())
            return true;
        if(cells.get("cellFour").getDrawable() != null
                && cells.get("cellFour").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.yellow).getConstantState()
                && cells.get("cellFive").getDrawable() != null
                && cells.get("cellFive").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.yellow).getConstantState()
                && cells.get("cellSix").getDrawable() != null
                && cells.get("cellSix").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.yellow).getConstantState())
            return true;
        if(cells.get("cellSeven").getDrawable() != null
                && cells.get("cellSeven").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.yellow).getConstantState()
                && cells.get("cellEight").getDrawable() != null
                && cells.get("cellEight").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.yellow).getConstantState()
                && cells.get("cellNine").getDrawable() != null
                && cells.get("cellNine").getDrawable().getConstantState() == getResources().getDrawable(R.drawable.yellow).getConstantState())
            return true;
        return false;
    }

    private void redPlay(View view)
    {
        ImageView cell = (ImageView) view;
        cell.setTranslationY(-10000f);
        cell.setImageResource(R.drawable.red);
        cell.setTranslationY(0f);
        cells.put(getResources().getResourceEntryName(cell.getId()), (ImageView) view);
        if(checkRedWin())
        {
            Toast.makeText(getApplicationContext(), "Red Player Wins", Toast.LENGTH_LONG).show();
            game = false;
        }
        player = false;
    }

    private void yellowPlay(View view)
    {

        ImageView cell = (ImageView) view;
        cell.setTranslationY(-10000f);
        cell.setImageResource(R.drawable.yellow);
        cell.setTranslationY(0f);
        cells.put(getResources().getResourceEntryName(cell.getId()), (ImageView) view);
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
        for(ImageView value : cells.values())
        {
            if(value.getDrawable() == null)
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
        ImageView temp;
        for(ImageView value : cells.values())
            value.setImageDrawable(null);
        cells.clear();
        prepare();
    }
}
