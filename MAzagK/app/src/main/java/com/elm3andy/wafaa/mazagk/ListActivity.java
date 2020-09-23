package com.elm3andy.wafaa.mazagk;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
    ListView modelist ;
    TextView textView ;
    ArrayList<String> modek ;
    ListAdapter listAdapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        modelist =(ListView)findViewById(R.id.mode);
        textView =(TextView)findViewById(R.id.massage);
        modek = new ArrayList<>();
        modek.add("مبسوط");
        modek.add("حزين");
        modek.add("مضايق");
        modek.add("غضبان");
        modek.add("خائف");
        modek.add("محبط");
        modek.add("زهقان");
        modek.add("مضغوط");
        modek.add("مريض");
        listAdapter =new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,modek);
        modelist.setAdapter(listAdapter);
        modelist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String [] m ={
                        "كان النبي صلى الله عليه وسلم اذا اتاه أمر يسره او يسر به خر ساجد شكرا لله تبارك وتعالى ",
                        " ولا تهنوا ولا تحزنوا وأنتم الاعلون ان كنتم مؤمنين",
                        "ولقد نعلم انك يضيق صدرك بما يقولون فسبح بحمد ربك وكن من الساجدين واعبد ربك حتى يأتيك اليقين"
                        ,"ماالدنيا الا ساعة فما الذى يغضبك قم توضئ يااخى واستعذ بالله من الشيطان الرجيم"
                        ,"اللهم اكفينهم بما شئت ,اللهم انت عضدى ونصيرى بك احول وبك اصول وبك اقاتل"
                        ,"لا اله الا أنت سبحانك إنى كنت من الظالمين "
                        ,"لا اله الا الله العظيم الحليم لا اله الا الله رب العرش العظيم لا اله الا الله رب السماوات ورب الارض ورب العرش الكريم ",
                        "اللهم رحمتك أرجو فلا تكلنى الى نفسي طرفة عين وأصلح لى شأنى كله لا اله الا أنت",
                        "ضع يدك على الذى تألم من جسدك وقل : بسم الله ثلاثا وقل أعوذ بالله وقدرته من شر ما أجد وأحاذر"

                } ;

textView.setText(m[position]);
              //  Toast.makeText(ListActivity.this,m[position],Toast.LENGTH_SHORT).show();

            }
        });

    }

    }

