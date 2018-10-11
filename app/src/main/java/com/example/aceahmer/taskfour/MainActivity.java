package com.example.aceahmer.taskfour;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainActivity extends Activity{

    RecyclerView rc;
    List<ModelClass> mc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       initializeViews();
       setData();
       bind_and_set_Layoutmanger();
    }
    public void initializeViews(){
        rc=(RecyclerView)findViewById(R.id.recycler);
        mc=new ArrayList<>();
    }
    public void bind_and_set_Layoutmanger(){
        rc.setLayoutManager(new GridLayoutManager(this,2));
        rc.setAdapter(new AdapterClass(this,mc));
    }
    public void setData(){
        mc.add(new ModelClass("Coco",(int)R.drawable.coco,"2017","Despite his family's generations-old ban on music, young Miguel dreams of becoming an accomplished musician like his idol Ernesto de la Cruz. Desperate to prove his talent, Miguel finds himself in the stunning and colorful Land of the Dead. After meeting a charming trickster named Héctor, the two new friends embark on an extraordinary journey to unlock the real story behind Miguel's family history."));
        mc.add(new ModelClass("Frozen",(int)R.drawable.frozen,"2013","When their kingdom becomes trapped in perpetual winter, fearless Anna (Kristen Bell) joins forces with mountaineer Kristoff (Jonathan Groff) and his reindeer sidekick to find Anna's sister, Snow Queen Elsa (Idina Menzel), and break her icy spell. Although their epic journey leads them to encounters with mystical trolls, a comedic snowman (Josh Gad), harsh conditions, and magic at every turn, Anna and Kristoff bravely push onward in a race to save their kingdom from winter's cold grip."));
        mc.add(new ModelClass("Hotel Translyvania",(int)R.drawable.hotel_translyvania,"2017","In Sony Pictures Animation’s Hotel Transylvania 3: Summer Vacation, join our favorite monster family as they embark on a vacation on a luxury monster cruise ship so Drac can take a summer vacation from providing everyone else's vacation at the hotel. It’s smooth sailing for Drac’s Pack as the monsters indulge in all of the shipboard fun the cruise has to offer, from monster volleyball to exotic excursions, and catching up on their moon tans. But the dream vacation turns into a nightmare when Mavis realizes Drac has fallen for the mysterious captain of the ship, Ericka, who hides a dangerous secret that could destroy all of monsterkind."));
        mc.add(new ModelClass("Incredibles 2",(int)R.drawable.incredibles2,"2018","Everyone’s favorite family of superheroes is back in “Incredibles 2” – but this time Helen (voice of Holly Hunter) is in the spotlight, leaving Bob (voice of Craig T. Nelson) at home with Violet (voice of Sarah Vowell) and Dash (voice of Huck Milner) to navigate the day-to-day heroics of “normal” life. It’s a tough transistion for everyone, made tougher by the fact that the family is still unaware of baby Jack-Jack’s emerging superpowers. When a new villain hatches a brilliant and dangerous plot, the family and Frozone (voice of Samuel L. Jackson) must find a way to work together again—which is easier said than done, even when they’re all Incredible."));
        mc.add(new ModelClass("InsideOut",(int)R.drawable.insideout,"2015","Riley (Kaitlyn Dias) is a happy, hockey-loving 11-year-old Midwestern girl, but her world turns upside-down when she and her parents move to San Francisco. Riley's emotions -- led by Joy (Amy Poehler) -- try to guide her through this difficult, life-changing event. However, the stress of the move brings Sadness (Phyllis Smith) to the forefront. When Joy and Sadness are inadvertently swept into the far reaches of Riley's mind, the only emotions left in Headquarters are Anger, Fear and Disgust."));
        mc.add(new ModelClass("Moana",(int)R.drawable.moana,"2016","An adventurous teenager sails out on a daring mission to save her people. During her journey, Moana meets the once-mighty demigod Maui, who guides her in her quest to become a master way-finder. Together they sail across the open ocean on an action-packed voyage, encountering enormous monsters and impossible odds. Along the way, Moana fulfills the ancient quest of her ancestors and discovers the one thing she always sought: her own identity."));
        mc.add(new ModelClass("Ralph 2",(int)R.drawable.ralph_breaks_the_internet,"2018","Arcade-game character Wreck-It Ralph (John C. Reilly) is tired of always being the \"bad guy\" and losing to his \"good guy\" opponent, Fix-It Felix (Jack McBrayer). Finally, after decades of seeing all the glory go to Felix, Ralph decides to take matters into his own hands. He sets off on a game-hopping trip to prove that he has what it takes to be a hero. However, while on his quest, Ralph accidentally unleashes a deadly enemy that threatens the entire arcade."));
        mc.add(new ModelClass("White Fang",(int)R.drawable.white_fang,"2018","A young boy befriends a half-breed wolf as he searches for his father, who has mysteriously gone missing during the gold rush."));
        mc.add(new ModelClass("Big Hero 6",(int)R.drawable.bighero,"2014","Robotics prodigy Hiro (Ryan Potter) lives in the city of San Fransokyo. Next to his older brother, Tadashi, Hiro's closest companion is Baymax (Scott Adsit), a robot whose sole purpose is to take care of people. When a devastating turn of events throws Hiro into the middle of a dangerous plot, he transforms Baymax and his other friends, Go Go Tamago (Jamie Chung), Wasabi (Damon Wayans Jr.), Honey Lemon (Genesis Rodriguez) and Fred (T.J. Miller) into a band of high-tech heroes."));
        mc.add(new ModelClass("Early",(int)R.drawable.early_man,"2018","A plucky cave man named Dug, his sidekick Hognob and the rest of their tribe face a grave threat to their simple existence. Lord Nooth plans to take over their land and transform it into a giant mine, forcing Dug and his clan to dig for precious metals. Not ready to go down without a fight, Dug and Hognob must unite their people in an epic quest to defeat a mighty enemy -- the Bronze Age."));
    }


}
