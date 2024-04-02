package com.example.tiktaktoegame;

import android.widget.ImageView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Methods {
    public int verifyWinner(List<ImageView> imageViewList){
        String image1String=imageViewList.get(0).getContentDescription().toString();
        String image2String=imageViewList.get(1).getContentDescription().toString();
        String image3String=imageViewList.get(2).getContentDescription().toString();
        String image4String=imageViewList.get(3).getContentDescription().toString();
        String image5String=imageViewList.get(4).getContentDescription().toString();
        String image6String=imageViewList.get(5).getContentDescription().toString();
        String image7String=imageViewList.get(6).getContentDescription().toString();
        String image8String=imageViewList.get(7).getContentDescription().toString();
        String image9String=imageViewList.get(8).getContentDescription().toString();

        ArrayList<String> lista= new ArrayList<>();
        lista.add(image1String);
        lista.add(image2String);
        lista.add(image3String);
        lista.add(image4String);
        lista.add(image5String);
        lista.add(image6String);
        lista.add(image7String);
        lista.add(image8String);
        lista.add(image9String);


        if(Objects.equals(lista.get(0), lista.get(3)) && Objects.equals(lista.get(3), lista.get(6))){
            if(Objects.equals(lista.get(0), "x")){
                return 1;
            }
            else if(Objects.equals(lista.get(0), "o")){
                return 2;
            }
        }
        if(Objects.equals(lista.get(1), lista.get(4)) && Objects.equals(lista.get(4), lista.get(7))){
            if(Objects.equals(lista.get(1), "x")){
                return 1;
            }
            else if(Objects.equals(lista.get(1), "o")){
                return 2;
            }        }
        if(Objects.equals(lista.get(2), lista.get(5)) && Objects.equals(lista.get(5), lista.get(8))){
            if(Objects.equals(lista.get(2), "x")){
                return 1;
            }
            else if(Objects.equals(lista.get(2), "o")){
                return 2;
            }        }
        if(Objects.equals(lista.get(0), lista.get(1)) && Objects.equals(lista.get(1), lista.get(2))){
            if(Objects.equals(lista.get(0), "x")){
                return 1;
            }
            else if(Objects.equals(lista.get(0), "o")){
                return 2;
            }        }
        if(Objects.equals(lista.get(3), lista.get(4)) && Objects.equals(lista.get(4), lista.get(5))){
            if(Objects.equals(lista.get(3), "x")){
                return 1;
            }
            else if(Objects.equals(lista.get(3), "o")){
                return 2;
            }        }
        if(Objects.equals(lista.get(6), lista.get(7)) && Objects.equals(lista.get(7), lista.get(8))){
            if(Objects.equals(lista.get(6), "x")){
                return 1;
            }
            else if(Objects.equals(lista.get(6), "o")){
                return 2;
            }        }
        if(Objects.equals(lista.get(0), lista.get(4)) && Objects.equals(lista.get(4), lista.get(8))){
            if(Objects.equals(lista.get(0), "x")){
                return 1;
            }
            else if(Objects.equals(lista.get(0), "o")){
                return 2;
            }        }
        if( Objects.equals(lista.get(2), lista.get(4)) && Objects.equals(lista.get(4), lista.get(6))){
            if(Objects.equals(lista.get(2), "x")){
                return 1;
            }
            else if(Objects.equals(lista.get(2), "o")){
                return 2;
            }
        }
        else if(!Objects.equals(lista.get(0), "empty") &&!Objects.equals(lista.get(1), "empty")&&
                !Objects.equals(lista.get(2), "empty")&&!Objects.equals(lista.get(3), "empty")&&
                !Objects.equals(lista.get(4), "empty")&&!Objects.equals(lista.get(5), "empty")&&
                !Objects.equals(lista.get(6), "empty")&&!Objects.equals(lista.get(7), "empty")&&
                !Objects.equals(lista.get(8), "empty")){
            return 3;

        }
        return 0;
    }
}
