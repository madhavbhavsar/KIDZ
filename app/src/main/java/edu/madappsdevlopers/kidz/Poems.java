package edu.madappsdevlopers.kidz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.Uri;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class Poems extends AppCompatActivity {
        RecyclerView recyclerView;
        List<PoemModel> poemList;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poems);
            recyclerView = findViewById(R.id.recyclerViewPoem);

            initData();
            initRecyclerView();
    }
        private void initRecyclerView() {
            PoemAdapter poemAdapter = new PoemAdapter(this, poemList);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(poemAdapter);

        }
        private void initData() {
            poemList = new ArrayList<>();

            Uri path1 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/" + R.drawable.poem1);
            Uri path2 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/" + R.drawable.poem2);
            Uri path3 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/" + R.drawable.poem3);
            Uri path4 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/" +  R.drawable.poem4);
            Uri path5 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/" +  R.drawable.poem5);
            Uri path6 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/" +  R.drawable.poem6);
            Uri path7 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/" +  R.drawable.poem7);
            Uri path8 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/" +  R.drawable.poem8);
            Uri path9 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/" +  R.drawable.poem9);
            Uri path10 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.poem10);
            Uri path11= Uri.parse("android.resource://edu.madappsdevlopers.kidz/" +  R.drawable.poem11);
            Uri path12= Uri.parse("android.resource://edu.madappsdevlopers.kidz/" +  R.drawable.poem12);
            Uri path13= Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.poem13);
            Uri path14= Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.poem14);
            Uri path15= Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.poem15);
            Uri path16= Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.poem16);
            Uri path17= Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.poem17);
            Uri path18= Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.poem18);
            Uri path19= Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.poem19);
            Uri path20= Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.poem20);



            poemList.add(new PoemModel("1. सुबह",
                    path1.toString(),""));
            poemList.add(new PoemModel("2. Now We Are Six",
                    path2.toString(), "When I was One,\n" +
                    "I had just begun.\n" +
                    "When I was Two,\n" +
                    "I was nearly new.\n" +
                    "When I was Three\n" +
                    "I was hardly me.\n" +
                    "When I was Four,\n" +
                    "I was not much more.\n" +
                    "When I was Five,\n" +
                    "I was just alive.\n" +
                    "But now I am Six,\n" +
                    "I’m as clever as clever,\n" +
                    "So I think I’ll be six now for ever and ever"));

            poemList.add(new PoemModel("3. कौआ बोला",
                    path3.toString(),"कौआ बोला कांव-कांव जी\n" +
                    "बार-बार बस कांव-कांव जी।\n" +
                    " \n" +
                    "बोली मुन्नी, छत पर चलना,\n" +
                    "मुझे अभी कौए से मिलना।\n" +
                    "\n" +
                    "कौआ सोता कहां बताओ?\n" +
                    "कथा अभी उसकी सुनाओ जी।\n" +
                    " \n" +
                    "कौआ सुबह-सुबह क्यों आता?\n" +
                    "खुद का घर क्यों नहीं बनाता?\n" +
                    "अपनी मां से लड़ता है क्या,\n" +
                    "बात मुझे सच्ची बताओ जी।\n" +
                    " \n" +
                    "कहती दादी, कौआ आया\n" +
                    "खबर कोई अच्छी सी लाया।\n" +
                    "अतिथि कोई है आनेवाला,\n" +
                    "चाय-नाश्ता तो बनाओ जी।\n" +
                    " \n" +
                    "दादी की बातें क्या सच हैं,\n" +
                    "बातें क्या सच में ही सच हैं।\n" +
                    "या ये बातें मनगढंत हैं,\n" +
                    "मुझको यह सच-सच बताओ जी।"));
            poemList.add(new PoemModel("4. Puppy And I - By A. A. Milne",
                    path4.toString(),"I met a Man as I went walking:\n" +
                    "We got talking,\n" +
                    "Man and I.\n" +
                    "\"Where are you going to, Man?\" I said\n" +
                    "  (I said to the Man as he went by).\n" +
                    "\"Down to the village, to get some bread.\n" +
                    "  Will you come with me?\" \"No, not I.\"\n" +
                    "\n" +
                    "I met a horse as I went walking;\n" +
                    "We got talking,\n" +
                    "Horse and I.\n" +
                    "\"Where are you going to, Horse, today?\"\n" +
                    "  (I said to the Horse as he went by).\n" +
                    "\"Down to the village to get some hay.\n" +
                    "  Will you come with me?\" \"No, not I.\"\n" +
                    "\n" +
                    "I met a Woman as I went walking;\n" +
                    "We got talking,\n" +
                    "Woman and I.\n" +
                    "\"Where are you going to, Woman, so early?\"\n" +
                    "  (I said to the Woman as she went by).\n" +
                    "\"Down to the village to get some barley.\n" +
                    "  Will you come with me?\" \"No, not I.\"\n" +
                    "\n" +
                    "I met some Rabbits as I went walking;\n" +
                    "We got talking,\n" +
                    "Rabbits and I.\n" +
                    "\"Where are you going in your brown fur coats?\"\n" +
                    "  (I said to the Rabbits as they went by).\n" +
                    "\"Down to the village to get some oats.\n" +
                    "  Will you come with us?\" \"No, not I.\"\n" +
                    "\n" +
                    "I met a Puppy as I went walking;\n" +
                    "We got talking,\n" +
                    "Puppy and I.\n" +
                    "\"Where are you going this nice fine day?\"\n" +
                    "  (I said to the Puppy as he went by).\n" +
                    "\"Up to the hills to roll and play.\"\n" +
                    "\"I'll come with you, Puppy,\" said I.\n" ));
            poemList.add(new PoemModel("5. Life Doesn't Frighten Me",
                    path5.toString(),"Shadows on the wall\n" +
                    "Noises down the hall\n" +
                    "Life doesn't frighten me at all\n" +
                    "\n" +
                    "Bad dogs barking loud\n" +
                    "Big ghosts in a cloud\n" +
                    "Life doesn't frighten me at all\n" +
                    "\n" +
                    "Mean old Mother Goose\n" +
                    "Lions on the loose\n" +
                    "They don't frighten me at all\n" +
                    "\n" +
                    "Dragons breathing flame\n" +
                    "On my counterpane\n" +
                    "That doesn't frighten me at all.\n" +
                    "\n" +
                    "I go boo\n" +
                    "Make them shoo\n" +
                    "I make fun\n" +
                    "Way they run\n" +
                    "I won't cry\n" +
                    "So they fly\n" +
                    "I just smile\n" +
                    "They go wild\n" +
                    "\n" +
                    "Life doesn't frighten me at all.\n" +
                    "\n" +
                    "Tough guys fight\n" +
                    "All alone at night\n" +
                    "Life doesn't frighten me at all.\n" +
                    "\n" +
                    "Panthers in the park\n" +
                    "Strangers in the dark\n" +
                    "No, they don't frighten me at all.\n" +
                    "\n" +
                    "That new classroom where\n" +
                    "Boys all pull my hair\n" +
                    "(Kissy little girls\n" +
                    "With their hair in curls)\n" +
                    "They don't frighten me at all.\n" +
                    "\n" +
                    "Don't show me frogs and snakes\n" +
                    "And listen for my scream,\n" +
                    "If I'm afraid at all\n" +
                    "It's only in my dreams.\n" +
                    "\n" +
                    "I've got a magic charm\n" +
                    "That I keep up my sleeve\n" +
                    "I can walk the ocean floor\n" +
                    "And never have to breathe.\n" +
                    "\n" +
                    "Life doesn't frighten me at all\n" +
                    "Not at all\n" +
                    "Not at all.\n" +
                    "\n" +
                    "Life doesn't frighten me at all.\n" ));
            poemList.add(new PoemModel("6. What is pink? -By Christina Rossetti",
                    path6.toString(),"What is pink? A rose is pink\n" +
                    "By the fountain's brink.\n" +
                    "What is red? A poppy's red\n" +
                    "In its barley bed.\n" +
                    "What is blue? The sky is blue\n" +
                    "Where the clouds float through.\n" +
                    "What is white? A swan is white\n" +
                    "Sailing in the light.\n" +
                    "What is yellow? Pears are yellow,\n" +
                    "Rich and ripe and mellow.\n" +
                    "What is green? The grass is green,\n" +
                    "With small flowers between.\n" +
                    "What is violet? Clouds are violet\n" +
                    "In the summer twilight.\n" +
                    "What is orange? Why, an orange,\n" +
                    "Just an orange!\n" ));
            poemList.add(new PoemModel("7. Bed In Summer - By R. L. Stevenson",
                    path7.toString(),"In Winter I get up at night\n" +
                    "And dress by yellow candle light.\n" +
                    "In Summer, quite the other way,\n" +
                    "I have to go to bed by day.\n" +
                    "I have to go to bed and see\n" +
                    "The birds still hopping on the tree,\n" +
                    "Or hear the grown-up people's feet\n" +
                    "Still going past me in the street.\n" +
                    "And does it not seem hard to you,\n" +
                    "When all the sky is clear and blue,\n" +
                    "And I should like so much to play,\n" +
                    "To have to go to bed by day?\n" ));
            poemList.add(new PoemModel("8. If I Were King - By A. A. Milne",
                    path8.toString(),"I often wish I were a King,\n" +
                    "And then I could do anything.\n" +
                    "\n" +
                    "If only I were King of Spain,\n" +
                    "I'd take my hat off in the rain.\n" +
                    "\n" +
                    "If only I were King of France,\n" +
                    "I wouldn't brush my hair for aunts.\n" +
                    "\n" +
                    "I think, if I were King of Greece,\n" +
                    "I'd push things off the mantelpiece.\n" +
                    "\n" +
                    "If I were King of Norroway,\n" +
                    "I'd ask an elephant to stay.\n" +
                    "\n" +
                    "If I were King of Babylon,\n" +
                    "I'd leave my button gloves undone.\n" +
                    "\n" +
                    "If I were King of Timbuctoo,\n" +
                    "I'd think of lovely things to do.\n" +
                    "\n" +
                    "If I were King of anything,\n" +
                    "I'd tell the soldiers, \"I'm the King!\"\n" ));
            poemList.add(new PoemModel("9. Maggie And Milly And Molly And May",
                    path9.toString(),"maggie and milly and molly and may\n" +
                    "went down to the beach(to play one day)\n" +
                    "\n" +
                    "and maggie discovered a shell that sang\n" +
                    "so sweetly she couldn’t remember her troubles,and\n" +
                    "\n" +
                    "milly befriended a stranded star\n" +
                    "whose rays five languid fingers were;\n" +
                    "\n" +
                    "and molly was chased by a horrible thing\n" +
                    "which raced sideways while blowing bubbles:and\n" +
                    "\n" +
                    "may came home with a smooth round stone\n" +
                    "as small as a world and as large as alone.\n" +
                    "\n" +
                    "For whatever we lose(like a you or a me)\n" +
                    "it’s always ourselves we find in the sea\n" ));
            poemList.add(new PoemModel("10. अगर पेड भी चलते होते",
                    path10.toString(),""));
            poemList.add(new PoemModel("11. धमाल",
                    path11.toString(),""));
            poemList.add(new PoemModel("12. Hush, Little Baby",
                    path12.toString(),""));
            poemList.add(new PoemModel("13. Water",
                    path13.toString(),""));
            poemList.add(new PoemModel("14. बढ़े चलो! बढ़े चलो!",
                    path14.toString(),"न हाथ एक शस्त्र हो\n" +
                    "न हाथ एक अस्त्र हो,\n" +
                    "न अन्न, नीर, वस्त्र हो,\n" +
                    "हटो नहीं,\n" +
                    "डटो वहीं,\n" +
                    "बढ़े चलो!\n" +
                    "बढ़े चलो!\n" +
                    "\n" +
                    "रहे समक्ष हिमशिखर,\n" +
                    "तुम्हारा प्रण उठे निखर,\n" +
                    "भले ही जाए तन बिखर,\n" +
                    "रुको नहीं,\n" +
                    "झुको नहीं\n" +
                    "बढ़े चलो!\n" +
                    "बढ़े चलो!\n" +
                    "\n" +
                    "घटा घिरी अटूट हो,\n" +
                    "अधर में कालकूट हो,\n" +
                    "वही अम्रत का घूँट हो,\n" +
                    "जिये चलो,\n" +
                    "मरे चलो,\n" +
                    "बढ़े चलो!\n" +
                    "बढ़े चलो!\n" +
                    "\n" +
                    "गगन उगलता आग हो,\n" +
                    "छिड़ा मरण का राग हो,\n" +
                    "लहू का अपने फाग हो,\n" +
                    "अड़ो वहीं,\n" +
                    "गड़ो वहीं,\n" +
                    "बढ़े चलो!\n" +
                    "बढ़े चलो!\n" +
                    "\n" +
                    "चलो नई मिसाल हो,\n" +
                    "जलो नई मशाल हो,\n" +
                    "बढ़ो नया क़माल हो,\n" +
                    "झुको नहीं,\n" +
                    "रुको नहीं\n" +
                    "बढ़े चलो!\n" +
                    "बढ़े चलो!\n" +
                    "\n" +
                    "अशेष रक्त तोल दो,\n" +
                    "स्वतन्त्रता का मोल दो,\n" +
                    "कड़ी युगों की खोल दो,\n" +
                    "डरो नहीं,\n" +
                    "मरो वहीं,\n" +
                    "बढ़े चलो!\n" +
                    "बढ़े चलो!\n" +
                    "\n" +
                    "- सोहनलाल द्विवेदी"));
            poemList.add(new PoemModel("15. चुन चुन करती आई चिड़िया",
                    path15.toString(),""));
            poemList.add(new PoemModel("16. A House, A Home",
                    path16.toString(),"What is a house?\n" +
                    "It’s brick and stone\n" +
                    "and wood that’s hard.\n" +
                    "Some window glass\n" +
                    "and perhaps a yard.\n" +
                    "It’s eaves and chimneys\n" +
                    "and tile floors\n" +
                    "and stucco and roof\n" +
                    "and lots of doors.\n" +
                    "What is a home?\n" +
                    "It’s loving and family\n" +
                    "and doing for others.\n" +
                    "It’s brothers and sisters\n" +
                    "and fathers and mothers.\n" +
                    "It’s unselfish acts\n" +
                    "and kindly sharing\n" +
                    "and showing your loved ones\n" +
                    "you’re always caring."));
            poemList.add(new PoemModel("17. चिड़िया",
                    path17.toString(),""));
            poemList.add(new PoemModel("18. आम",
                    path18.toString(),""));
            poemList.add(new PoemModel("19. My doggy ate my homework",
                    path19.toString(),"“My doggy ate my homework.\n" +
                    "He chewed it up,” I said.\n" +
                    "But when I offered my excuse\n" +
                    "My teacher shook her head.\n" +
                    "I saw this wasn’t going well.\n" +
                    "I didn’t want to fail.\n" +
                    "Before she had a chance to talk,\n" +
                    "I added to the tale:\n" +
                    "“Before he ate, he took my work\n" +
                    "And tossed it in a pot.\n" +
                    "He simmered it with succotash\n" +
                    "Till it was piping hot.\n" +
                    "“He scrambled up my science notes\n" +
                    "With eggs and bacon strips,\n" +
                    "Along with sautéed spelling words\n" +
                    "And baked potato chips.\n" +
                    "“He then took my arithmetic   \n" +
                    "And had it gently fried.\n" +
                    "He broiled both my book reports   \n" +
                    "With pickles on the side.\n" +
                    "“He wore a doggy apron\n" +
                    "As he cooked a notebook stew.\n" +
                    "He barked when I objected.\n" +
                    "There was nothing I could do.”\n" +
                    "“Did he wear a doggy chef hat?”\n" +
                    "She asked me with a scowl.\n" +
                    "“He did,” I said. “And taking it\n" +
                    "Would only make him growl.”\n" +
                    "My teacher frowned, but then I said   \n" +
                    "As quickly as I could,\n" +
                    "“He covered it with ketchup,   \n" +
                    "And he said it tasted good.”\n" +
                    "“A talking dog who likes to cook?”   \n" +
                    "My teacher had a fit.\n" +
                    "She sent me to the office,   \n" +
                    "And that is where I sit.\n" +
                    "I guess I made a big mistake   \n" +
                    "In telling her all that.\n" +
                    "’Cause I don’t have a doggy.   \n" +
                    "It was eaten by my cat."));
            poemList.add(new PoemModel("20. हाथी की शादी",
                    path20.toString(),""));

        }


    }
