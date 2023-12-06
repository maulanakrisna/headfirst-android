package com.hfad.beeradviser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by maulanakrisna on 22/01/21.
 */

public class BeerExpert {
    List<String> getBrands(String color){
        List<String> brands = new ArrayList<>();
            if (color.equals("amber")){
                brands.add("Jack Amber");
                brands.add("Red Moose");
            }else{
                brands.add("Pale Jail Ale");
                brands.add("Gout Stout");
            }
        return brands;
    }
}
