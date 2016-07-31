package com.mi025.dra.smellslikebakin;

import android.widget.CheckBox;

public class IngredientsFragment extends CheckBoxesFragment{
    @Override
    public String[] getContents(int index) {
        return Recipes.ingredients[index].split("`");
    }
}
