package fr.wildcodeschool.airbusproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

import fr.wildcodeschool.airbusproject.Adapter.RecyclerViewAdapter;
import fr.wildcodeschool.airbusproject.Model.ProjetModel;

public class MainActivity extends AppCompatActivity {

    List<ProjetModel> lstBook ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new ProjetModel("Projet 1","Categorie Book","Description book",R.drawable.un));
        lstBook.add(new ProjetModel("Projet 2","Categorie Book","Description book",R.drawable.deux));
        lstBook.add(new ProjetModel("Projet 3","Categorie Book","Description book",R.drawable.trois));
        lstBook.add(new ProjetModel("Projet 4","Categorie Book","Description book",R.drawable.quatre));
        lstBook.add(new ProjetModel("Projet 5","Categorie Book","Description book",R.drawable.cinq));
        lstBook.add(new ProjetModel("Projet 6","Categorie Book","Description book",R.drawable.six));
        lstBook.add(new ProjetModel("Projet 7","Categorie Book","Description book",R.drawable.sept));
        lstBook.add(new ProjetModel("Projet 8","Categorie Book","Description book",R.drawable.huit));
        lstBook.add(new ProjetModel("Projet 10","Categorie Book","Description book",R.drawable.neuf));
        lstBook.add(new ProjetModel("Projet 11","Categorie Book","Description book",R.drawable.dix));



        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }
}
