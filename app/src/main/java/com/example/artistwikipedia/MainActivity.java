package com.example.artistwikipedia;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView aRecyclerView;
    private ArtistListAdapter aAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        aRecyclerView = findViewById(R.id.recyclerview);
        aRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        aAdapter = new ArtistListAdapter(this, getMyList());
        aRecyclerView.setAdapter(aAdapter);
    }

    private ArrayList<Artist> getMyList(){
        ArrayList<Artist> artists = new ArrayList<>();

        Artist a = new Artist();
        a.setName("Ariana Grande");
        a.setDescription("Ariana Grande-Butera is an American singer, songwriter and actress. She is known for her expansive four-octave vocal range.");
        a.setSong("1. Santa Tell Me (2013)\n2. Break Free (2014)\n3. One Last Time (2014)\n4. Problem (2014)\n5. Into You (2016)\n6. Side to Side (2016)\n7. No Tears Left to Cry (2018)\n8. Thank U, Next (2019)\n9. 7 Rings (2019)\n10.Ghostin (2019)");
        a.setImg(R.drawable.ariana);
        artists.add(a);

        a = new Artist();
        a.setName("BlackPink");
        a.setDescription("Blackpink (블랙핑크) is a South Korean girl group formed by YG Entertainment, consisting of members Jisoo, Jennie, Rosé, and Lisa.");
        a.setSong("1. Whistle (2016)\n2. Stay (2016)\n3. Play with Fire (2016)\n4. Boombayah (2016)\n5. As If It's Your Last (2017)\n6. Ddu Du Ddu Du (2018)\n7. Kill This Love (2019)\n8. How You Like That (2020)\n9.Ice Cream(2020)\n10. Lovesick Girls (2020)");
        a.setImg(R.drawable.blackpink);
        artists.add(a);

        a = new Artist();
        a.setName("BTS");
        a.setDescription("BTS (방탄소년단 Bangtan Sonyeondan) is a seven member South Korean boy band that began formation in 2010 and debuted in 2013 under Big Hit.");
        a.setSong("1. Fire(2015)\n2. Spring Day (2016)\n3. Blood, Sweat, Tears (2016)\n4. Mic Drop (2016)\n5. DNA (2017)\n6. Fake Love (2018)\n7. IDOL (2018)\n8. Boy With Luv (2019)\n9. ON (2020)\n10. Dynamite (2020)");
        a.setImg(R.drawable.bts);
        artists.add(a);

        a = new Artist();
        a.setName("Coldplay");
        a.setDescription("Coldplay are a British rock band formed in London in 1996. Vocalist and pianist Chris, guitarist Jonny, bassist Guy, and drummer Will.");
        a.setSong("1. The Scientists (2002)\n2. Clocks (2002)\n3. Fix You (2005)\n4. Paradise (2011)\n5. Fallen Kingdom (2012)\n6. A Sky Full of Stars (2014)\n7. Adventure of a Life Time (2015)\n8. Viva la Vida (2015)\n9. Hymn For The Weekend (2016)\n10. Something Just Like This (2017)");
        a.setImg(R.drawable.coldplay);
        artists.add(a);

        a = new Artist();
        a.setName("Halsey");
        a.setDescription("Ashley Nicolette Frangipane (born September 29, 1994), known professionally as Halsey is an American singer, songwriter, and activist.");
        a.setSong("1. Colors (2015)\n2. New Americana (2015)\n3. Castle (2015)\n4. Closer (2016)\n5. Bad at Love (2017)\n6. 11 Minutes (2019)\n7. Nightmare (2019)\n8. Clementine (2020)\n9.Graveyard(2020)\n10. Without Me (2020)");
        a.setImg(R.drawable.halsey);
        artists.add(a);

        a = new Artist();
        a.setName("Maroon 5");
        a.setDescription("Maroon 5 is an American pop rock band from Los Angeles. It currently consists of vocalist Adam Levine and the others.");
        a.setSong("1. She Will Be Loved (2002)\n2. This Love (2002)\n3. Moves Like Jagger (2010)\n4. Payphone (2012)\n5. Animals (2014) \n6. Lost Stars (2014)\n7. Maps (2014)\n8. Sugar (2015)\n9.Girls Like You (2017)\n10. Memories (2019)");
        a.setImg(R.drawable.maroon5);
        artists.add(a);

        a = new Artist();
        a.setName("One Direction");
        a.setDescription("One Direction are an English-Irish pop boy band formed in London in 2010. The group are composed of Niall, Liam, Harry and Louis.");
        a.setSong("1. What Makes You Beautiful (2011)\n2. One Thing (2012)\n3. Live While We're Young (2012)\n4. Story of My Life (2013)\n5. Best Song Ever (2013)\n6. Kiss You (2013)\n7. Midnight Memories (2014)\n8. Drag Me Down (2015)\n9. Steal My Girl (2015)\n10. History (2015)");
        a.setImg(R.drawable.onedirection);
        artists.add(a);

        a = new Artist();
        a.setName("SF9");
        a.setDescription("SF9 (에스에프나인) is a South Korean boy group formed by FNC Entertainment. Consisting of nine members, the group debuted on October 5, 2016.");
        a.setSong("1. Fanfare (2016)\n2. Easy Love (2017)\n3. Roar (2017)\n4. Mamma Mia (2018)\n5. Now or Never (2018)\n6. Enough (2019)\n7. RPM (2019)\n8. Good Guy (2020)\n9. Summer Breeze (2020)\n10. Shine Together (2020)");
        a.setImg(R.drawable.sf9);
        artists.add(a);

        return artists;
    }
}