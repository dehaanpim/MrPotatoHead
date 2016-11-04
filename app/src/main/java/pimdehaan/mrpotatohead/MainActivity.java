package pimdehaan.mrpotatohead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

import static pimdehaan.mrpotatohead.R.id.CheckArms;
import static pimdehaan.mrpotatohead.R.id.CheckEars;
import static pimdehaan.mrpotatohead.R.id.CheckEyebrows;
import static pimdehaan.mrpotatohead.R.id.CheckEyes;
import static pimdehaan.mrpotatohead.R.id.CheckGlasses;
import static pimdehaan.mrpotatohead.R.id.CheckHat;
import static pimdehaan.mrpotatohead.R.id.CheckMouth;
import static pimdehaan.mrpotatohead.R.id.CheckMustache;
import static pimdehaan.mrpotatohead.R.id.CheckNose;
import static pimdehaan.mrpotatohead.R.id.CheckShoes;


public class MainActivity extends AppCompatActivity {
CheckBox CheckMouth, CheckArms, CheckNose, CheckShoes, CheckHat, CheckMustache, CheckGlasses, CheckEyebrows, CheckEyes, CheckEars;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        CheckMouth = (CheckBox) findViewById(R.id.CheckMouth);
        CheckArms = (CheckBox) findViewById(R.id.CheckArms);
        CheckNose = (CheckBox) findViewById(R.id.CheckNose);
        CheckShoes = (CheckBox) findViewById(R.id.CheckShoes);
        CheckHat = (CheckBox) findViewById(R.id.CheckHat);
        CheckMustache = (CheckBox) findViewById(R.id.CheckMustache);
        CheckGlasses = (CheckBox) findViewById(R.id.CheckGlasses);
        CheckEyebrows = (CheckBox) findViewById(R.id.CheckEyebrows);
        CheckEyes = (CheckBox) findViewById(R.id.CheckEyes);
        CheckEars = (CheckBox) findViewById(R.id.CheckEars);
        }

    public void CheckboxClicked(View view) {
        ImageView Mouth = (ImageView) findViewById(R.id.Mouth);
        if (CheckMouth.isChecked()){
            Mouth.setVisibility(View.VISIBLE);
        }
        else if (!CheckMouth.isChecked()) {
            Mouth.setVisibility(View.INVISIBLE);
        }

        ImageView Arms = (ImageView) findViewById(R.id.Arms);
        if (CheckArms.isChecked()){
            Arms.setVisibility(View.VISIBLE);
        }
        else if (!CheckArms.isChecked()) {
            Arms.setVisibility(View.INVISIBLE);
        }

        ImageView Eyes = (ImageView) findViewById(R.id.Eyes);
        if (CheckEyes.isChecked()){
            Eyes.setVisibility(View.VISIBLE);
        }
        else if (!CheckMouth.isChecked()) {
            Eyes.setVisibility(View.INVISIBLE);
        }

        ImageView Ears = (ImageView) findViewById(R.id.Ears);
        if (CheckEars.isChecked()){
            Ears.setVisibility(View.VISIBLE);
        }
        else if (!CheckEars.isChecked()) {
            Ears.setVisibility(View.INVISIBLE);
        }

        ImageView Glasses = (ImageView) findViewById(R.id.Glasses);
        if (CheckGlasses.isChecked()){
            Glasses.setVisibility(View.VISIBLE);
        }
        else if (!CheckGlasses.isChecked()) {
            Glasses.setVisibility(View.INVISIBLE);
        }

        ImageView Eyebrows = (ImageView) findViewById(R.id.Eyebrows);
        if (CheckEyebrows.isChecked()){
            Eyebrows.setVisibility(View.VISIBLE);
        }
        else if (!CheckEyebrows.isChecked()) {
            Eyebrows.setVisibility(View.INVISIBLE);
        }

        ImageView Nose = (ImageView) findViewById(R.id.Nose);
        if (CheckNose.isChecked()){
            Nose.setVisibility(View.VISIBLE);
        }
        else if (!CheckNose.isChecked()) {
            Nose.setVisibility(View.INVISIBLE);
        }

        ImageView Shoes = (ImageView) findViewById(R.id.Shoes);
        if (CheckShoes.isChecked()){
            Shoes.setVisibility(View.VISIBLE);
        }
        else if (!CheckShoes.isChecked()) {
            Shoes.setVisibility(View.INVISIBLE);
        }

        ImageView hat = (ImageView) findViewById(R.id.hat);
        if (CheckHat.isChecked()){
            hat.setVisibility(View.VISIBLE);
        }
        else if (!CheckHat.isChecked()) {
            hat.setVisibility(View.INVISIBLE);
        }

        ImageView Mustache = (ImageView) findViewById(R.id.Mustache);
        if (CheckMustache.isChecked()){
            Mustache.setVisibility(View.VISIBLE);
        }
        else if (!CheckMustache.isChecked()) {
            Mustache.setVisibility(View.INVISIBLE);
        }
    }
}
