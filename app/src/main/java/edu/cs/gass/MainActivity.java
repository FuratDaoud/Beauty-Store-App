package edu.cs.gass;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView rcv;
    myadapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("BEAUTY STORE APP");

        rcv = (RecyclerView) findViewById(R.id.recview);
        //  rcv.setLayoutManager(new LinearLayoutManager(this));

        adapter = new myadapter(dataqueue(),getApplicationContext());
        rcv.setAdapter(adapter);

        //LinearLayoutManager layoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        //rcv.setLayoutManager(layoutManager);

        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        rcv.setLayoutManager(gridLayoutManager);
    }

    public final static ArrayList<Model> dataqueue()
    {
        ArrayList<Model> holder=new ArrayList<>();

        Model m1=new Model();
        m1.setHeader("LIPLINEAR");
        m1.setDesc("Price: 7$ \n" +
                "Used for : Blush your lips. \n" +
                "Company : Mac Cosmatics  \n" +
                "Color:Red, pink, purple");
        m1.setImgname(R.drawable.lipliner);
        holder.add(m1);

        Model m2=new Model();
        m2.setHeader("LIPSTICK");
        m2.setDesc("Price: 15$\n" +
                "Used for : Give your lips a beautiful color.\n" +
                "Company : Mac Company \n" +
                "Color: whole Color");
        m2.setImgname(R.drawable.libstck);
        holder.add(m2);

        Model m3=new Model();
        m3.setHeader("EYESHADOW");
        m3.setDesc("Price: 40$\n" +
                "Used for : To give shades to your eyes with different colors.\n" +
                "Company : Huda Beauty");
        m3.setImgname(R.drawable.eyeshadow);
        holder.add(m3);

        Model m4=new Model();
        m4.setHeader("BODYLOTION");
        m4.setDesc("Price: 65$\n" +
                "Used for :Gives a beautiful smell to the body, softness and shine for a long time.\n" +
                "Company : Lorial Company");

        m4.setImgname(R.drawable.badylotion);
        holder.add(m4);


        Model m5=new Model();
        m5.setHeader("MASCARA");
        m5.setDesc("Price:30$\n" +
                "Used for : It gives length and density to eyelashes and an attractive look.\n" +
                "Company :Essences Company");
        m5.setImgname(R.drawable.maskara);
        holder.add(m5);

        Model m6=new Model();
        m6.setHeader("EYELINEAR");
        m6.setDesc("Price: 18$\n" +
                "Used for : It gives a specify to the upper area of the eye with the possibility of drawing it in any way that you prefer on your eyes.\n" +
                 "Company : Mac Company \n" + "Color : Whole color");
        m6.setImgname(R.drawable.eyeliner);
        holder.add(m6);

        Model m7=new Model();
        m7.setHeader("CONTOR");
        m7.setDesc("Price: 25$ \n" +
                        "Used for : It works to specify the area of the cheeks and work to highlight it and highlight the areas that you want on the face\n" +
                        "Color: Brown in all its shades. \n" + "Company : Huda Beauty");
        m7.setImgname(R.drawable.contor);
        holder.add(m7);

        Model m8=new Model();
        m8.setHeader("HIGHLIGHTER");
        m8.setDesc("Price:44$\n" +
                "Used for :It works to lighten the areas you want on your face with very attractive lighting colors.\n" +
                "Company : Lorial Company");
        m8.setImgname(R.drawable.hilight);
        holder.add(m8);

        Model m9=new Model();
        m9.setHeader("BLUSHER");
        m9.setDesc("Price: 35$\n" +
                "Used for : Works on supplying the cheeks and forehead area and giving vitality to the face.\n" +
                "Color: Pink, red and orange\n" + "Company : Mac Company");
        m9.setImgname(R.drawable.blusher1);
        holder.add(m9);

        Model m1o=new Model();
        m1o.setHeader("LOSEBODER");
        m1o.setDesc("Price: 43$\n" +
                "Used for : It is used to lighten certain areas on your face and to clean up the remnants of makeup that you used.\n" +
                "Company : Maybelline");
        m1o.setImgname(R.drawable.losboder);
        holder.add(m1o);

        Model m11=new Model();
        m11.setHeader("PRIMER");
        m11.setDesc("Price: 35$\n" +
                "Used for : It is used to moisturize the face and prepare it for making up on it.\n" +
                "Company : Sephora \n" + "Color : White");
        m11.setImgname(R.drawable.primer);
        holder.add(m11);


        Model m12=new Model();
        m12.setHeader("FOUNDATION");
        m12.setImgname(R.drawable.fundition);
        m12.setDesc("Price: 70$\n" +
                "Used for : It is used to give cover to the skin and has a percentage of protection from sunscreen, as it works to hide any defects in the skin.\n" +
                "Company : Mac Company");
        holder.add(m12);


        return holder;
    }


}
