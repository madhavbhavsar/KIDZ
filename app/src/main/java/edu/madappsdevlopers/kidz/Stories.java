package edu.madappsdevlopers.kidz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.net.Uri;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class Stories extends AppCompatActivity {
    RecyclerView recyclerView;
    List<StoryModel> storyList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);
        recyclerView = findViewById(R.id.recyclerViewStory);

        initData();
        initRecyclerView();
    }
    private void initRecyclerView() {
        StoryAdapter storyAdapter = new StoryAdapter(this, storyList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(storyAdapter);

    }
    private void initData() {
        storyList = new ArrayList<>();

        Uri path1 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+ R.drawable.story1);
        Uri path2 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/" + R.drawable.story2);
        Uri path3 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.story3);
        Uri path4 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.story4);
        Uri path5 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.story5);
        Uri path6 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.story6);
        Uri path7 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.story7);
        Uri path8 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.story8);
        Uri path9 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.story9);
        Uri path10 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+ R.drawable.story10);
        Uri path11 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+ R.drawable.story11);
        Uri path13 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.story13);
        Uri path14 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.story14);
        Uri path15 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.story15);
        Uri path16 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.story17);
        Uri path17 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.story16);
        Uri path18 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.story18);
        Uri path19 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.story19);
        Uri path20 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.story20);
        Uri path21 = Uri.parse("android.resource://edu.madappsdevlopers.kidz/"+  R.drawable.story21);













        storyList.add(new StoryModel("1. The birth of Krishna",
                path1.toString(), "Lord Krishna was born to King Vasudeva and his wife Devaki. Devaki’s brother Kansa was a cruel man who engaged in heinous activities.\n" +
                "\n" +
                "During Devaki and Vasudeva’s wedding rituals, Kansa is warned by the astrologers that their child would kill him. Hearing this, Kansa imprisons the couple and kills every child that is born them.\n" +
                "\n" +
                "But when Krishna is born, Vasudeva secretly arranges for the infant to be carried away and replaces him with another baby (Krishna’s foster-mother Yashoda’s daughter).\n" +
                "\n" +
                "When evil Kansa tries to kill this replaced baby, she turns into goddess Adi Parashakti and warns him that his death has arrived and nothing can change his fate.\n" +
                "\n" +
                "Meanwhile, the newborn Krishna is carried to the other side of the river Yamuna, where he is rescued and fostered by Nanda and his wife Yashoda in Gokul. The birth of Lord Krishna is celebrated as Krishnashtami or Janmashtami."));
        storyList.add(new StoryModel("2. Krishna and Sudama",
                path2.toString(),"Sudama was Krishna's friend and devotee. He belonged to a poor Brahmin family. Years passed and Krishna became king of Dwarka but Sudama remained a poor man. Sudama and his wife and children starved without food.\n" +
                "\n" +
                "Tired of their pitiable state, one day his wife advised him go seek his Sudama goes to Krishnafriend Krishna's help. Sudama who was an extremely honest man felt ashamed to ask for help. When his wife insisted, Sudama agreed to go, but realised that going empty-handed to meet a friend after so long would look odd. So he carried with him a handful of puffed rice as a gift. " +
                "\n" +"\n" +
                "Krishna greeted Sudama warmly when he arrived at the palace. Seeing the splendour of Dwarka, Sudama felt awed. Krishna's hospitality humbled him, and was now feeling embarrassed to take out his simple gift. Seeing a small bag in Sudama's hand, Krishna promptly asked him whether his gift was inside the bag. Sudama unwillingly took it out and said he could not gift a handful of puffed rice to a king. Krishna immediately understood Sudama's problem. He happily accepted the gift as if it was the most precious thing.\n" +
                "\n" +
                "When Sudama reached home the next day, he saw a huge mansion instead of his hut and his family wearing new clothes. He went inside and found lots of food. At once he knew that god had showered his blessings on him."));
        storyList.add(new StoryModel("3. कुंए का विवाह और तेनालीराम",
                path11.toString(),"एक बार राजा कृष्णदेव और तेनालीराम का किसी बात को लेकर विवाद हो गया। तेनालीराम रूठ कर चला गया। आठ दस दिन बीते तो राजा का मन उदास हो गया। राजा ने तुरंत तेनालीराम को खोजने के लिए अपने सैनिकों को भेजा। आसपास का पूरा क्षेत्र छान मारा पर तेनालीराम का कोई अता पता नहीं चला। अचानक राजा को एक तरकीब सूझी उन्होंने आस-पास के इलाकों में मुनादी करवाई। राजा अपने राजकीय कुँए का विवाह रचा रहे है। इसलिए आस-पास के गाँव के सभी मुखिया अपने-अपने कुओं को लेकर राजमहल पहुंचे अन्यथा सभी मुखियों को एक एक हजार स्वर्ण मुद्रा जुर्माने के तौर पर अदा करने होंगे।\n" +
                "\n" +
                "तेनाली राम जिस गाँव में भेष बदलकर रहता था उस गाँव में भी ये मुनादी सुनाई दी। गाँव का मुखिया और अन्य गांवों के भी मुखिया बड़े परेशान थे सोच रहे थे अब किया क्या जाये क्योंकि कँुओं को राजमहल कैसे ले जाया जा सकता है। तेनालीराम जान गया था कि मुझे खोजने के लिए राजा ने ये तरकीब लड़ाई है। तेनालीराम ने गाँव के मुखिया को बुलाकर कहा आप चिंता न करें आपने मुझे इस गाँव में रहने के लिए जगह दी है इसलिए मैं आपकी मुश्किल का हल कर सकता हूँ आप सब गांवों के मुखिया को बुला लायें और मेरे बताये अनुसार करें।\n" +
                "\n" +
                "तेनालीराम के साथ गाँव के मुखियाओं ने राजधानी की और प्रस्थान किया और राजधानी केबाहर एक जगह वो रुक गये और तेनालीराम के बताये अनुसार एक आदमी राजा के महल में सन्देश लेकर गया और बोला महाराज आपके बताये अनुसार हमारे गाँव के कुँए राजधानी के बाहर डेरा डाले हुए है। आप अपने राजकीय कुँए को उनकी अगवानी के लिए भेजें ताकि हमारे कुँए आपके दरबार में ससम्मान हाजिर हो सकें।\n" +
                "\n" +
                "राजा को समझते देर नहीं लगी और उसने उस आदमी से पूछा की सच-सच बताओ यह तरकीब तुम लोगों को किसने दी। आगन्तुक ने जवाब दिया थोड़े दिन पहले हमारे गाँव में एक परदेसी आकर रुका था उसी ने ये तरकीब दी है। तो राजा रथ पर बैठकर उसी समय उस स्थान पर पहुंचे और तेनालीराम को ससम्मान वापिस लेकर आये। और गाँव वालों को उपहार देकर विदा किया।"));
        storyList.add(new StoryModel("4. Two Clever Goats",
                path3.toString(),
                "In a jungle over a river there was a very narrow bridge. One day a goat named Billy had to go to the other side of the river for food. He started crossing the bridge. Just at the middle of the bridge he met another goat named Silly. Silly had to come to this side of the bridge. There was noplace for them to pass.\n"
                        +"\n" +

                "\"Go back\" said Billy to Silly, \"there is no place for both of us\". \"Why should I go back?\", said Silly goat. \"Why should you not go back?\" said Billy.\n" +
                        "\n" +

                        "\"You must go back\", said Billy, \"because I am stronger than you.\" \"You are not stronger than me\", said Silly.\n"+
                        "\n" + "\"We will see about that\", said Billy, and he put down his horns to fight.\n"+"\n" +

                "\"Stop!\", said Silly. \"If we fight, we shall both fall into the river and be drowned. Instead we must not fight and think of an idea.\"\n"+"\n" +

                "\"I have an idea- I shall lie down, and you may walk over me,\" said Billy.\n"+"\n" +

                "Then Billy lay down on the bridge, and Silly slowly walked over him.So they passed each other happily. Silly thanked Billy the clever goat and both went on their ways.\n"+
                "\n" +
                "Moral: Instead of fighting think of a clever solution."

        ));
        storyList.add(new StoryModel("5. Just One Question (Akbar and Birbal)",
                path4.toString(),
                "The tales of Birbal’s unparalleled wit and wisdom had reached faraway lands. Once a scholar visited Akbar’s court with the thought of challenging Birbal’s intelligence. The scholar told the king that he is the smartest and even Birbal would not be able to answer his questions. \n" +
                        "\n" +    "Akbar called Birbal to the court and told him what the scholar claimed. Birbal accepted the challenge that the scholar had posed for him. The scholar asked Birbal, \"Do you want to answer a hundred easy questions or one difficult question?\" Birbal said that he wanted to answer the difficult one. \n" +
                        "\n" +    "The scholar said, \"Tell me Birbal, what came first, the chicken or the egg?\" Birbal thought for a while and said, \"Chicken came first\". The scholar mocked Birbal and said, \"How can you be sure?\" Birbal immediately replied, \"I had only promised to answer one question, and therefore, I will not reply\". The scholar felt ashamed of his claim and left with a heavy heart.\n" +
                "\n" +
                "Moral: Presence of mind helps solve even the trickiest of problems."));
        storyList.add(new StoryModel("6. The Lion And The Mouse",
                path5.toString(),"Once when a lion, the king of the jungle, was asleep, a little mouse began running up and down on him. This soon awakened the lion, who placed his huge paw on the mouse, and opened his big jaws to swallow him.\n" +
                "\n" +
                "\"Pardon, O King!\" cried the little mouse. \"Forgive me this time. I shall never repeat it and I shall never forget your kindness. And who knows, I may be able to do you a good turn one of these days!\"\n" +
                "\n" +
                "The lion was so tickled by the idea of the mouse being able to help him that he lifted his paw and let him go.\n" +
                "\n" +
                "Sometime later, a few hunters captured the lion, and tied him to a tree. After that they went in search of a wagon, to take him to the zoo.\n" +
                "\n" +
                "Just then the little mouse happened to pass by. On seeing the lion’s plight, he ran up to him and gnawed away the ropes that bound him, the king of the jungle.\n" +
                "\n" +
                "\"Was I not right?\" said the little mouse, very happy to help the lion.\n" +
                "\n" +
                "MORAL: Small acts of kindness will be rewarded greatly."));
        storyList.add(new StoryModel("7. चना जोर गरम",
                path19.toString(),"स्कूल से घर पहुँचते ही राजू ने अपना बस्ता दरवाजे पर रखा और सीढ़ियों पर बैठ गया। दरवाजे पर लटका ताला देख समझ गया कि माँ को आज भी दफ्तर से लौटने में देर हो गयी है। \n" +
                "\n" +
                "पड़ोस वाली वर्मा आंटी ने उसे अंदर आने को कहा तो उसने यह कह \"बस माँ पहुँचने ही वाली हैं\" मना कर दिया। इस तरह रोज़ रोज़ उनके घर जाना राजू को ठीक नहीं लगता था। बैठा हुआ सोचने लगा की उसके और दोस्तों की माँ कितने प्यार से उनके घर पहुँचने का इंतज़ार करती हैं। एक मैं ही अभागा हुँ जिसका स्वागत ये दरवाजे पर लटका ताला करता है। \n" +
                "\n" +
                "फिर उसका मन उसे बीते दिनों में ले गया जब उसके पापा उनके साथ थे। कितनी मस्ती करते थे हम तीनो मिल कर। कभी पिकनिक पर जाना तो कभी सर्कस देखने, कभी पापा का उसे साइकिल चलाना सिखाना तो कभी अपने स्कूटर पर बैठा इधर उधर के चक्कर लगाना। क्या दिन थे वो भी, जब मैं स्कूल से आता तो माँ मेरी राह देख रही होती और गरमा गरम नाश्ता कराती। कुछ देर बाद पापा भी आ जाते और फिर शुरू होता भर में ख़ुशी का माहौल। पापा जब आफिस से आते तो अक्सर अपने साथ ‘चना जोर गरम’ लाते। और माँ हमेशा एक ही बात दोहरा देती \" ये सेहत के लिए अच्छी नहीं है।\" मगर मसाले और नीम्बू से मिश्रित उस चने को खाते हुए वो खुद भूल जाती कि ये सेहत के लिए अच्छी नहीं है। और चने से भरे मुँह से कहती \" जो भी हो, है तो लाजवाब।\" और हम सब जोर से ठहाका लगाते। \n" +
                "\n" +
                "इन्ही भूली बिसरी बातों में खोया था राजू कि माँ पहुँच गयी। उसे इस तरह सीढ़ियों पर बैठा देख उनकी आँखें नाम हो गयी। झट से ताला खोला और उसे हाथ मुँह धोने को कह किचन में घुस गयी। जल्दी से खाना गरम कर टेबल पर लगाया और राजू को आवाज दी \" राजू, जल्दी से आयो, गरमा गरम खाना तुम्हारा इंतज़ार कर रहा है।\"\n" +
                "\n" +
                "राजू टेबल पर बैठ गया और खाने लगा। उसे गुम सुम से देख माँ ने पुछा \" क्या हुआ राजू, इतना उदास क्यों है। सॉरी बेटा, आज फिर ऑफिस में देरी हो गयी।\" ये कह माँ ने अपना हाथ राजू के सर को प्यार से सहलाना शुरू कर दिया। राजू पहले ही पापा को याद कर उदास था लेकिन जब माँ का लाड मिला तो अपने को रोक नहीं पाया और उसकी आँखों से जर जर आँसू टपकने लगे। \n" +
                "\n" +
                "उसे रोता देख माँ अपनी कुर्सी छोड़ उसकी तरफ लपकी और उसका सर अपने सीने से लगा चुप कराने लगी। बिन कहे ही माँ समझ गयी थी कि राजू अपने पापा की कमी महसूस कर रहा है। राजू के पापा की मृत्यु एक सड़क हादसे में दो साल पहले ही हुई थी। उसके बाद घर का सारा भार माँ पर आ पड़ा जिसके कारण वह नौकरी कर रही थी। दोनों माँ बेटा एक दुसरे से लिपट बहुत देर तक रोते रहे। आखिर कुछ देर बाद माँ ने अपने और राजू के आँसू पोछे और हल्का सा मुस्करा के बोली \" राजू, जाने वाले का दुःख तो सदा ही होता रहेगा मगर बेटा जो पीछे रह जाते हैं जीना तो उन्हें पड़ता ही है। जब जीना है तो क्यों न थोड़ा मुस्करा कर जीने की आदत डालें। हमें रुपयों पैसों की तंगी होने लगी थी सो मैंने नौकरी कर ली। बड़े हो तुम भी कुछ बन जाओगे तो वो तंगी भी दूर हो जाएगी।\"\n" +
                "\n" +
                "माँ की बात सुन राजू भी थोड़ा मुस्करा दिया और बोला \" हाँ माँ, हस्ते गाते जीने का पाठ तो हमें पापा ने ही पढ़ाया था और हम उसे ही भूल गए और उदास रहने लगे। हमें इस तरह जिंदगी जीते हुए देख पापा को कितना बुरा लगेगा।\" यह कह राजू अपना मुँह पोच खड़ा हुआ और घर से बहार निकल पड़ा। माँ ने पीछे से आवाज दे पुछा \" अरे, कहाँ जा रहे हो। \" तो सिर्फ \" अभी आता हूँ \" राजू चल दिया। \n" +
                "कुछ देर बाद राजू जब घर पहुंचा तो उसके हाथ में एक पैकेट में बंधा कुछ सामान था। माँ ने जब उसे खोला तो देखते ही रह गयी। सामने पड़ी था ढेर सारा ‘चना जोर गरम’ । आज दो साल बाद चना जोर गरम घर आया था। अनकहीं फिर से नम हो गयी। माँ को भावुक होता देख राजू बोला \" माँ, ये सेहत के लिए अच्छा नहीं होता, मगर हमें ये खाता देख पापा कितने खुश होंगे। \" अपने को संभालते हुए माँ बोली \" अरे नहीं, चना जोर गरम तो लाजवाब है। \" और दोनों हँसते हुए मिल कर ‘चना जोर गरम’ पर टूट पड़े। \n" +
                "\n" +
                "परिस्थितियाों और कठिनाइयों का सामना हमें हमेशा मुस्कुराते हुए करना चाहिए।"));

        storyList.add(new StoryModel("8. बीरबल की चतुराई",
                path17.toString(),"रामलाल के खेत में ना तो कोई कुआँ था और बारिश ना होने की वजह से सूखा पड़ा हुआ था। चारों तरफ हरियाली की लहर दिखती थी। मगर रामलाल के खेत में सूखे की मार झेलती तबाही ही दिखती थी।\n" +
                "\n" +
                "उसके खेत से सटा खेत एक सूदखोर और लालची व्यक्ति भीम सिंह का था। उस खेत में दो कुँए थे जिन की वजह से उसके खेत में फसल खूब होती थी।\n" +
                "\n" +
                "रामलाल ने सोचा कि अगर मैं भीम सिंह से एक कुआँ खरीद लूँ तो मेरी फसल को भी भरपूर पानी मिल पायेगा। यह विचार आते ही उसने भीम सिंह से सौदा कर एक कुआँ खरीद लिया।\n" +
                "\n" +
                "अगले दिन रामलाल ख़ुशी ख़ुशी खेत पर पहुंचा और अपने खरीदे हुए कुँए से पानी लेने लगा। तभी भीम सिंह वहाँ आ टपका और उसे पानी लेने से रोक दिया। जब कारण पुछा तो बोला\n" +
                "\"तुमने कुआँ खरीदा है लेकिन उसमे पानी तो मेरा है। पानी चाहिए तो उसके पैसे अलग से देने होंगे।\"\n" +
                "\n" +
                "यह सुन बेचारा रामलाल दुखी हो घर लौट आया। उसे उम्मीद नहीं थी की भीम सिंह लालच की वजह से इतना नीचे गिर जाएगा। घर पहुँच उसने अपनी पत्नी को सारा किस्सा सुनाया तो वो भी हक्की बक्की रह गयी। आखिर दोनों ने फैसला किया कि इसका हल तो सिर्फ सम्राट अकबर के दरबार में ही मिलेगा।\n" +
                "\n" +
                "सम्राट अकबर के दरबार में पहुँच रामलाल ने अपनी आप बीती सुनाई और सम्राट से इन्साफ की गुहार लगायी। सम्राट ने बीरबल को बुलाया और इस अजीब से मुक़दमे को सुलझाने को कहा। बीरबल ने सारी बात सुन सिपाहीओं को भेज भीम सिंह को दरबार में बुला लिया।\n" +
                "\n" +
                "बरिबल ने जब भीम सिंह से झगड़े का कारण पुछा तो उसने वही बात दोहरा दी।\n" +
                "\"जनाब, इसने कुआँ खरीदा है पानी नहीं।\"\n" +
                "\n" +
                "बस फिर क्या था। बीरबल का दिमाग फ़ौरन हरकत में आया और उसने बहुत ही चतुराई से भीम सिंह की कही बात में से ही झगड़े का हल निकल लिया।\n" +
                "\"भीम सिंह, माना की रामलाल ने सिर्फ कुआँ ही खरीदा है और उसका पानी नहीं। तो इसका मतलब हुआ की पानी तुम्हारा है।\" यह बात सुन भीम सिंह ने खुश हो हाँ में सर हिला दिया।\n" +
                "तब चतुर बीरबल ने अपना फैसला सुनाया\n" +
                "\n" +

                "\"क्योंकि कुआँ रामलाल का है इसलिय भीम सिंह को उसमे अपना पानी रखने का कोई हक़ नहीं है। भीम सिंह तुम फ़ौरन अपना सारा पानी उस कुँए से निकल लो।\"\n" +
                "\n" +
                "इतना सुनते ही भीम सिंह का सर चकराने लगा। उसकी चालाकी उस पर ही भारी पड़ने लगी। हाथ जोड़ते हुए वो बीरबल के पैर पर गिर माफ़ी माँगने लगा। बीरबल ने उसे रामलाल से माफ़ी मांगने को कहा और दोबारा ऐसी चालाकी दिखाने पर जेल जाने की चितावनी दे छोड़ दिया। अपनी गलती का एहसास कर भीम सिंह ने रामलाल से माफ़ी मांगी।\n" +
                "\n" +
                "इस तरह कुआँ और उसक पानी उसके असली मालिक रामलाल को मिल गया।\n" +
                "\n" +
                "देखो, कैसे चतुर बीरबल ने एक लालची इंसान की चालाकी को मूर्खता साबित कर फैसला सचाई के हक़ में दिया।"));


        storyList.add(new StoryModel("9. The Ant and the Grasshopper",
                path6.toString(),"One summer’s day, in a field, a Grasshopper was hopping about, chirping and singing to its heart's content. An Ant passed by, bearing along with great effort an ear of corn he was taking to his nest.\n" +
                "\n" +
                "\"Why don’t you come and chat with me,\" asked the Grasshopper, \"instead of toiling your life away?\"\n" +
                "\n" +
                "\"I am helping to store up food for the winter,\" said the Ant, \"and I recommend you to do the same.\"\n" +
                "\n" +
                "\"Why bother about winter?\" said the Grasshopper. \"We have got plenty of food at present.\"\n" +
                "\n" +
                "But the Ant went on its way and continued its toil.\n" +
                "\n" +
                "When winter came, the Grasshopper found itself dying of hunger, while it saw the ants distributing, every day, corn and grain from the stores they had collected in summer.\n" +
                "\n" +
                "Then the Grasshopper knew...\n" +
                "\n" +
                "MORAL: WORK TODAY AND YOU CAN REAP THE BENEFITS TOMORROW!"));
        storyList.add(new StoryModel("10. The Greedy Crocodile",
                path7.toString(),"Once there was a crocodile. He was really hungry. He saw a boy. The boy had some meat in his hand. He decided he wanted to eat both the boy and his meat. He would trick the boy.\n" +
                "\n" +
                "The crocodile said, \"Oh! Little Boy! could you please give me some meat?\"\n" +
                "\n" +
                "The boy said, \"Oh no, you will eat me\"\n" +
                "\n" +
                "The crocodile said, \"I promise, I won't eat you.\"\n" +
                "\n" +
                "So the boy went near the crocodile to give him the meat. But, instead the crocodile tried to catch the boy. It caught just his arm.\n" +
                "\n" +
                "There came a rabbit. It wanted to help the boy. It did help the boy. The crocodile wanted to eat the rabbit first, so he let go of the boy's arm.\n" +
                "\n" +
                "The boy ran away and escaped and the rabbit too fled away. The cunning crocodile didn't get his dinner."));
        storyList.add(new StoryModel("11. ईमानदारी की जीत",
                path15.toString(),"\"सोनू, उठ जा। स्कूल में देरी से पहुंचा तो मास्टरजी से डांट खानी पड़ेगी।\" डांट का नाम सुनते हो सोनू ने फ़ौरन बिस्तर छोड़ दिया और स्कूल जाने के तैयारी में लग गया। उधर माँ ने गरमा गर्म परांठा और दूध उसके आगे रख दिया, जिसे उसने किताबें सँभालते हुए ही ख़तम किया। मन ही मन माँ को धन्यवाद देता पूरे 7 बजे स्कूल पहुंचा तो बच गया। \n" +
                "\n" +
                "पिता की अचानक मृत्यु के बाद एक छोटे से कमरे में अपने माँ के साथ रहता था। पिताजी एक सुनार की दुकान पर काम करते थे। उनकी मृत्यु के बाद सुनार ने वह नौकरी माँ को दे दी। माँ की पगार से घर का और सोनू की पढाई का खर्च आराम से चलता था। \n" +
                "\n" +
                "दोपहर 2 बजे छुट्टी होते ही सोनू दौड़ कर सुनार की दुकान पर पहुँच जाता। माँ-बेटे के घर के हालात देखते हुए उस सुनार ने सोनू को भी अपने यहाँ काम पर लगा लिया था। लेकिन उसे हमेशा ही स्कूल जाने के लिए प्रेरित करते थे। सोनू को छूट थी कि वह दुकान पर 2 बजे बाद ही आता। \n" +
                "\n" +
                "माँ हमेशा सोनू को सचाई और ईमानदारी की कहानियां सुनाती थी। उसको जीवन में आगे बढ़ने के लिए हमेशा सच और न्याय का सहारा लेने की शिक्षा देती रहती थी। कभी किसी को धोखा देना तो वह सबसे बड़ा पाप समझती थी। \n" +
                "\n" +
                "एक दिन शाम को दुकान बंद करते हुए सुनार ने एक बक्सा सोनू को दिया और बोले \" मैं कहीं जा रहा हुँ। इसमें कीमती हीरे-जेवरात हैं, संभाल के लेजाना और मेरे घर पर छोड़ देना। \" \n" +
                "\n" +
                "सोनू ने बक्सा लिया और चल पड़ा सुनार के घर की तरफ। रास्ते में उस बक्सा को खोल कर देखने का विचार भी आया उसके मन में, लेकिन फिर माँ के पढ़ाये ईमानदारी के सब पाठ उसे याद आ गए।उसने बिना खोले ही उस बक्से को सुनार के घर छोड़ दिया। \n" +
                "\n" +
                "अगले दिन दोपहर को जब वह दुकान पर पहुंचा तो सुनार ने उसे अपने पास बुलाया और कहा\n" +
                "\n" +
                "\"सोनू, कल जो हीरे-जेवरात मैंने तुम्हे दिए थे, उन्हें मेरे घर पहुंचा कर तुमने अपनी ईमानदारी को साबित कर दिया है। तुम सोनू नहीं एक खरा सोना हो।\"\n" +
                "\n" +
                "और फिर सुनार ने उसे तरक्की देते हुए अपनी दुकान का मैनेजर बना दिया। \n" +
                "\n" +
                "ईमानदारी और सच्चाई पर चलने वाले व्यक्ति के सफल भविष्य को\n" +
                "आगे बढ़ने से कोई नहीं रोक सकता। "));

        storyList.add(new StoryModel("12. Birbal And Akbar’s Ring",
                path8.toString(),"It so happened that once, Emperor Akbar misplaced his ring somewhere. When Birbal arrived in the court, Akbar told him, \"I have lost my ring. It was very dear to me as my father had given it to me as a gift. Please help me find it!\"\n" +
                "\n" +
                "Birbal said, \"You need not worry, Jahanpanah! I will find your ring right away.\"\n" +
                "\n" +
                "He further added, \"Your Majesty, the ring is here in this court itself. It is with one of our courtiers.  The courtier who has a straw in his beard has your ring.\" The courtier who had filched the Emperor’s ring was shocked and immediately moved his hand over his beard.  Birbal was waiting for this reaction from one of the courtiers. He immediately pointed towards that particular courtier and ordered the royal guards to search him. The guards frisked the courtier and found the Emperor’s ring lying in the pocket of his achkan.\n" +
                "\n" +
                "Akbar was pleasantly surprised at another wonderful example of Birbal’s wit and asked him \"Birbal, tell me how were you able to find the culprit?\" Birbal then told the Emperor, \"Your Majesty, I just shot an arrow in the dark. As they rightly say that a guilty person is always scared, the real culprit revealed himself by moving his hand over his beard.\""));
        storyList.add(new StoryModel("13. आलसी आदमी",
                path18.toString(),"बच्चों! आज हम आप सब को एक आलसी आदमी की कहानी सुनते हैं। \n" +
                "\n" +
                "यह अलसी व्यक्ति एक गाँव में रहता था। इतना आलसी था कि कई कई दिन तक नहाता भी नहीं था। मगर पेट तो रोज़ भोजन माँगता है। लेकिन उस आलसी व्यक्ति के मन में था कि भगवान ने उसे पैदा किया है तो वह ही उसके भोजन का इंतजाम करेगा। \n" +
                "\n" +
                "उसने ने कभी घर में चूला तक न जलाया था। जब कोई खाने को दे दे तो खा लेता नहीं तो भूखा प्यासा नदी किनारे बैठा भगवान को कोसता रहता। \n" +
                "\n" +

                "दो दिन से किसी ने भी उसे खाने को कुछ नहीं दिया था। नदी किनारे बैठ कर हवा खा कर तो पेट नहीं भरता। \n" +
                "\n" +
                "जब भूख बहुत सताने लगी तो बेचैन हो गया। \n" +
                "\n" +
                "तभी वह क्या देखता है कि नदी में एक कौआ बड़े ही आराम से तैर रहा है। हैरानी हुई, लेकिन ध्यान से देखने पर पता चला कि कौआ एक मगरमच्छ की पीठ पर बैठा था। \n" +
                "\n" +
                "उसने सोचा मैं जितना भी आलसी हूँ लेकिन यह कौआ तो मुझ से भी ज्यादा आलसी है। जो उड़ने से बचने के लिए मगरमच्छ की पीठ पर बैठ कर नदी पार कर रहा है। \n" +
                "\n" +
                "धीरे धीरे दोनों नदी किनारे पहुँच गए। नदी किनारे पहुँचते ही कौआ उड़ कर जामुन के पेड़ पर जा पहुंचा। और कुछ हो देर में उड़ कर आया और मगरमच्छ के मुँह में कुछ जामुन डाल दिए। और मगरमच्छ मजे से जामुन खाने लगा। कौआ बार बार उड़ता और जामुन अपनी चोंच में भर मगरमच्छ के मुँह में डाल देता। कुछ देर बाद अपना पेट भर मगरमच्छ वापिस नदी में चला गया और कौआ पेड़ पर बैठ जामुन खाने लगा। \n" +
                "\n" +
                "यह सब देख वह आलसी व्यक्ति सोच में डूब गया। जिसे मैं आलसी कौआ समझ रहा था वह तो बिलकुल उल्टा निकला। इतनी बार पेड़ से जामुन तोड़ उसने पहले अपने मित्र का पेट भरा और फिर अपना। \n" +
                "\n" +
                "एक कौवे ने उसकी सोच बदल दी। उसने ठान लिया कि अब से वह काम करेगा और सिर्फ अपनी मेहनत की रोटी ही खाएगा। \n" +
                "\n" +
                "बच्चों, भगवान का आशीर्वाद उन्ही लोगों को मिलता है जो मेहनत और लगन से आगे बढ़ना चाहते हैं। आलस छोड़ो और अपना काम स्वयं करने की आदत डालो।"));



        storyList.add(new StoryModel("14. The Story Of Eklavya",
                path9.toString(),"Long ago there lived the Pandavas and the Kauravas, the princes of Hastinapura. All the princes were taught archery by Sage Dronacharya. The Pandava prince, Arjuna was Drona’s favourite student. Ekalavya, a poor commoner boy also wanted to be Drona’s pupil but Drona refused to teach him.\n" +
                "\n" +
                "Ekalavya was a determined boy. He carved a statue of Drona on a tree trunk in the forest and started practising in front of it. Time went by. One day the princes and their teacher came to the same forest. As Arjuna aimed at a particularly difficult target, an arrow pierced the target. \n" +
                "\n" +
                "Shocked, the boys and their teacher looked around. They saw Ekalavya, who went up to touch Drona’s feet. \"Who is your teacher?\" Drona asked. Ekalavya quietly led him to the statue. Drona did not want anyone to be better than Arjun. He thought for some time and said, \"If I am your guru, give me my gurudakshina.\" \"Surely, sir,\" bowed Ekalavya. \"I want your right thumb, replied Drona. Ekalavya wordlessly cut off his right thumb and laid it at Drona’s feet."));
          storyList.add(new StoryModel("15. Fear is The Key (Akbar and Birbal)",
                path10.toString(),"One day, Emperor Akbar said to Birbal, \"Birbal, my people love me very much and that is why they are ready to carry out every order of mine willingly.\"\n" +
                  "Birbal smiled and said, \"This is true, but they fear you too, Jahanpanah.\" Akbar did not agree with Birbal on this and that is why it was decided that Birbal's statement should be tested.\n" +
                  "\n" +
                  "Next day, according to Birbal's instructions, it was announced that the Emperor would be going for hunting, and people should pour a pot of milk in a tub kept in the courtyard. The people thought that the Emperor is out and would not come to see the tub himself, so all they poured in the tub, was some water. Next day, when Akbar returned from hunting, he found that there was not even a single drop of milk in the tub, instead there was just some water.\n" +
                  "\n" +
                  "Akbar got very disappointed when he saw this and asked Birbal about his next move.\n" +
                  "\n" +
                  "Birbal said, \"Jahanpanah, once again announce that you are going for hunting and this time you will see the tub yourself after coming back.\"\n" +
                  "\n" +
                  "The Emperor did as Birbal said. Once again, the tub was kept in the courtyard. This time, when the king returned from hunting, he was pleasantly surprised to see the tub overflowing with milk.\n"+
                  "\n" +
                  "Birbal said, \"This proves the truthfulness of my statement, Huzoor! It is your fear which makes the people obey you. The first time there was no one to check the tub, so people poured the water, but the second time, they knew that you would check it yourself, that is why they brought the milk.\"\n"+
                    "\n" +
                  "Akbar understood that it is indeed fear that keeps people disciplined.\n"));
       storyList.add(new StoryModel("16. सचाई ख़ुशी देती है",
                path13.toString(), "विक्की बहुत खुश था। क्योंकि कल उसके स्कूल में स्वतंत्रता दिवस का समारोह था। स्कूल को अच्छी तरह से रंग बिरंगी झंडियों से सजाया जाएगा। प्रधानाचार्य हमारा प्यारा तिरंगा फेहराएँगें और फिर रंगा रंग एक कार्यक्रम भी होगा। \n" +
               "\n" +

               "इसी उत्साह से जब वह घर पहुँचा तो उसके होश उड़ गए। पिताजी के सीने में बहुत ज़ोर से दर्द हो रहा था और सब डॉक्टर के आने का इंतज़ार कर रहे थे। कुछ देर में डॉक्टर साहब भी आ गए और उपचार शुरू कर दिया। दवा से दर्द कम हुआ तो पिताजी कुछ शाँत हो सो गए। डॉक्टर ने कहा कि समय पर दवा देते रहें और अगर दर्द फिर होता है तो पिताजी को फ़ौरन अस्पताल ले जाएँ। \n" +
               " \n" +

               "पूरी रात विक्की और उसकी और मम्मी पिताजी की देखभाल में लगे रहे। सुबह करीब 4 बजे पिताजी को दर्द फिर से शुरू हो गया तो मम्मी ने फोरना एम्बुलेंस को फ़ोन लगाया। कुछ देर में एम्बुलेंस आ गयी और पिताजी को ले अस्पताल पहुँच गए। \n" +
               " \n" +

               "वहाँ डॉक्टरों ने उनका इलाज़ शुरू किया और दोपहर होते होते उन्हें भला चंगा कर अस्पताल से छुट्टी दे दी। रोज़ दवा खाने और कुछ चीज़ों से परहेज करने की सलाह दी। \n" +
               " \n" +

               "सब जब घर पहुँचे तो शाम हो चुकी थी। पिताजी को बिस्तर पर लिटाने के बाद विक्की को ख़याल आया कि आज तो स्कूल में स्वतंत्रता दिवस का समारोह था। पिताजी की तबियत ख़राब होने की वजह से वो पूरी तरह से भूल ही गया था। मायूसी तो हुई पर पिताजी का अच्छा स्वास्थ ज्यादा जरूरी था। \n" +
               " \n" +
               "अगले दिन प्रधानाचार्य बहुत गुस्से में थे क्योंकि उस समारोह में बहुत से छात्र नहीं आए था। हालांकि उन्होंने एक दिन पहले ही सबको स्वतंत्रता दिवस का महत्व समझाया था और आदेश दिया था कि सब छात्रों को उस में सम्मिलत होना है। फिर क्या था, उन छात्रों की सूची बनाई गयी जो बिना इजाजत के नहीं आए थे। उन सबको क्लास में खड़ा किया गया और प्रधानाचार्य ने खूब डाँटा। बाकी सब बच्चे खामोश बैठे उन बच्चों को दंड प्राप्त करते देखते रहे। \n" +
               " \n" +

               "सब को दंड दे जब प्रधानाचार्य जाने को हुए तो विक्की खड़ा हो गया। अपनी जगह से उठ वो प्रधानाचार्य के सामने पहुँचा और बोला \n" +
               "\" सर, आप मेरा नाम लेना भूल गए। मैं भी कल अनुपस्थित था।\"\n" +
               " \n" +

               "यह सुन प्रधानाचार्य अपना गुस्सा भूल मुस्कुराने लगे। विक्की के कंधे पर हाथ रख बोले \n" +
               "\" जिस छात्र में अपनी गलती मानने की हिम्मत है वो कभी दंड का हक़दार नहीं हो सकता।\" \" मैं नहीं पुछूंगा कि किस कारण तुम कल अनुपस्थित थे, लेकिन वादा करो कि कभी सच का साथ नहीं छोड़ोगे।\" और वो उसकी पीठ थपथपाते हुई कक्षा से बाहर चले गए। \n" +
               " \n" +
               "बच्चों! तुमसे कुछ गलत भी हो जाए तो भी कभी सचाई का साथ नहीं छोड़ना।"));
       storyList.add(new StoryModel("17. Puss in Boots",
                path14.toString(),"This is the Puss in Boots Story. There are three brothers. One day, the elder brothers let the youngest brother go avway. The youngest takes a cat with him. The cat tells the youngest, \"Master, I have a good idea! Lend me your boots and a sack.\" The cat wears the boots. The cat runs to the forest. He catches a rabbit and he brings the rabbit to the King. \"This is a present from the Marquis of Carabas.\" The King is very happy.\n"+
                "\n" +
                "Later, the King and the princess go on a picnic. The cat says, \"Master, go into the stream.\" Then the cat streams, \"Help! A thief has stolen my master's clothes!\" The cat says to the King, \"Someone stole my master's clothes!\" So the King gives the youngest nice clothes. Then the cat says, \"Please come to the Marquis castle. Follow me!\"\n" +
                "\n" +
                "The cat runs into the golden wheat fields. The wheat fields belong to a Scary Ogre. The cat tells the farmers, \"Tell the King these fields belong to the Marquis of Carabas. If you do this, I will get rid of the Scary Ogre.\" Then the cat runs to the Scary Ogre's castle. Later, the King asks the farmers, \"Who owns these golden wheat fields?\" They say, \"Marquis of Carabas.\"\n" +
                "\n" +
                "At the Scary Ogre's castle, the Scary Ogre catches the cat. Then he says, \"How dare you come in this castle?\" The cat asks to the Scary Ogre, \"Can you change into a big lion?\" \"Ha Ha Ha! That is so easy!\" Scary Ogre said. The Scary Ogre changes into a big lion. The cat says, \"But you can't change into a small mouse!\"\n" +
                "\n" +
                "The Scary Ogre quickly changes into a little mouse. Guip! The cat eats the mouse and he released all the farmers from Scary Ogre as he said. \"Welcome to the Marquis of Carabas castle!\" says the cat. Later, the Marquis and the princess get married. The cat becomes the Knight of Carabas. And they all lived happily ever after."


                ));

               storyList.add(new StoryModel("18. पढाई का महत्व",
                path16.toString(),"जब भी विकास पढ़ने के लिए किताबें निकालता तब उस का मन पढाई में नहीं लगता। किताबें खोलते ही उसे बाहर जा अपने दोस्तों के साथ मस्ती करने का मन करता। माँ ने उसे कभी खेलने के लिए रोका नहीं था। सिर्फ इतना समझाया था कि खेलने के साथ पढ़ना भी कितना जरूरी है।\n" +

                "\n" +
                "पर विकास का बिगड़ैल मन हमेशा उल्टा ही करता था। जब सब साथी स्कूल से आकर थोड़ा सुस्ता कर पढ़ने बैठ जाते और शाम को खेलने निकलते। वहीं विकास स्कूल से आकर टीवी देखने बैठ जाता और शाम होते ही खेलने निकल जाता। इसका नतीजा ये हुआ कि तिमाही परीक्षा में बड़ी ही मुश्किल से पास हो पाया।\n" +
                "\n" +

                "इतने कम नंबर देख माँ ने उसे खूब डाँटा और पढ़ने पर ज़ोर देने को कहा। माँ के डर से वो पढ़ने तो बैठ जाता मगर उसका चंचल मन पढाई में उसका साथ ना देता।\n" +

                "\n" +
                "फाइनल परीक्षा में कुछ हो दिन शेष रह गए थे जब एक छोटी सी घटना ने विकास की सोच को बदल दिया।\n" +
                "एक दिन शाम उसकी माँ ने उसे बताया कि धोबी अभी तक उसकी स्कूल यूनिफार्म लेकर नहीं आया था। और अगर नहीं आया तो वो अगले दिन स्कूल क्या पहन कर जाएगा। माँ ने ये भी बताया कि धोबी शायद बीमार न पड़ा हो। माँ ने उसे धोबी के घर जा अपनी यूनिफार्म लाने को कहा।\n" +
                "\n" +

                "धोबी का घर पास ही की एक बस्ती में था इसलिए विकास पैदल ही चल पड़ा। इस बस्ती में काफी गरीब लोग ही रहते थे इसी कारण कई घरों में तो बिजली भी नहीं थी। मगर सड़कों पर बिजली के खंबे लगे थे जो चारों तरफ रौशनी फैला रहे थे।\n" +
                "\n" +

                "विकास अपने धोबी के घर पहुंचा तो पता चला कि माँ का कहना सही था। धोबी बीमार पड़ा था और इसलिए यूनिफार्म लेकर नहीं आ पाया था। खैर, अपनी यूनिफार्म ले विकास घर वापिस चल दिया। अभी कुछ कदम ही चला होगा कि उसकी नज़र एक खंबे के नीचे बैठे एक लड़के पर गयी जो किताबें खोल पढ़ रहा था। उसकी लगन देख विकास उसके करीब गया और पूछा की आखिर वो इतनी रात सड़क पर बैठा क्यों पढ़ रहा है।\n" +
                "\n" +

                "उस लड़के ने उसे बताया कि दिन भर वो अपने पिता के साथ घर घर जा सब्जी बेचता है और फिर दोपहर के स्कूल में पढ़ने जाता है। शाम को स्कूल से घर आकर घर के कामों में माँ का हाथ बटाता है। क्योंकि उसका परिवार बिजली का खर्चा नहीं उठा पता इसलिए रात का खाना खा यहाँ बैठ कर पढ़ता है।\n" +
                "\n" +

                "अपनी उम्र के लड़के की दिनचर्या सुन विकास का मन रो पड़ा।\n" +
                "कहाँ मैं जो दिन भर खेलने और टीवी की सोचता हूँ। और कहाँ ये जो माँ और पिता के कामों में हाथ तो बटाने के बाद भी सड़क पर बैठा पढाई कर रहा है। उस लड़के की लगन को देख विकास का सर शर्म से झुक गया।\n" +
                "\n" +

                "कदम तो घर की तरफ चल रहे थे मगर विकास के मन में रह रह कर उस लड़के की बातें ही आ रही थी। घर पहुँचते तक उसने ये ठान लिया कि आज से पढाई में पूरा मन लगा के पढ़ेगा।\n" +
                "\n" +

                "और उसके उस दृढ़ निशचय ने रंग दिखाया। विकास सिर्फ पास नहीं हुआ बल्कि अपने स्कूल की वार्षिक परीक्षा में फर्स्ट आया।"));


           storyList.add(new StoryModel("19. राजा और मूर्ख बन्दर",
                path20.toString(),"एक सम्पन राज्य का राजा था जिसको एक बन्दर से गहरा लगाव था। उस राजा ने उस बन्दर को अपना प्रधान सेवक नियुक्त किया। अब बन्दर हर सभा या किसी भी कार्यक्रम में राजा के साथ जाने लगा। \n" +
                   "\n" +
                   "क्योंकि वो राजा का करीबी माना जाता था इस लिए उसके महल में आने जाने पर कोई रोक टोक नहीं थी। \n" +
                   " \n" +
                   "एक बार राज्य सभा से वापिस आकर राजा ने भोजन किया और सुस्ताने के लिए अपने शयन कक्ष में लेट गए। वो लेटे तो बन्दर उनके सिरहाने खड़ा हो पंखे से उन्हे हवा करने लगा। बस फिर क्या था राजा को नींद आ गयी और वो सो गए। \n" +
                   "\n" +
                   "तभी जाने कहाँ से एक मक्खी उड़ती हुई आयी और राजा की नाक पर बैठ गयी। बन्दर ने उसे उड़ा दिया। अभी उड़ाया ही था कि भिनभिनाते हुए फिर से आकर राजा की नाक पर बैठ गयी। बन्दर ने फिर उसे उड़ा दिया। ये सिलसिला काफी देर तक चलता रहा। मक्खी आती और बन्दर उसे भगा देता पर फिर वो आकर बैठ जाती। \n" +
                   "\n" +
                   "आखिर बन्दर को गुस्सा आगया। उसने सोचा ये छोटी सी मक्खी इतने बड़े राजा को चैन से सोने भी नहीं दे रही, क्यों ना इसे मार ही दिया जाए। फिर क्या था, अब बन्दर मक्खी को मरने के लिए कोई हथियार ढूंढ़ने लगा। जब कुछ और नहीं दिखाई नहीं दिया तो सामने पड़ी राजा की तलवार पर उसकी नज़र पड़ी। \n" +
                   "\n" +
                   "बस उसने तलवार उठाई और मक्खी के बैठते ही उस पर जोर से वार कर दिया। मक्खी तो उड़ गयी लेकिन राजा की मौत हो गयी। \n" +
                   "\n" +
                   "तभी कहते है कि मूर्ख से मित्रता में कोई भलाई नहीं।"));
        storyList.add(new StoryModel("20. The Boy Who Cried Wolf",
                path21.toString(),"Once upon a time, there lived a shepherd boy who was bored watching his flock of sheep on the hill. To amuse himself, he shouted, “Wolf! Wolf! The sheep are being chased by the wolf!” The villagers came running to help the boy and save the sheep. They found nothing and the boy just laughed looking at their angry faces.\n" +
                "\n" +
                "“Don’t cry ‘wolf’ when there’s no wolf boy!”, they said angrily and left. The boy just laughed at them.\n" +
                "\n" +
                "After a while, he got bored and cried ‘wolf!’ again, fooling the villagers a second time. The angry villagers warned the boy a second time and left. The boy continued watching the flock. After a while, he saw a real wolf and cried loudly, “Wolf! Please help! The wolf is chasing the sheep. Help!”\n" +
                "\n" +
                "But this time, no one turned up to help. By evening, when the boy didn’t return home, the villagers wondered what happened to him and went up the hill. The boy sat on the hill weeping. “Why didn’t you come when I called out that there was a wolf?” he asked angrily. “The flock is scattered now”, he said.\n" +
                "\n" +
                "An old villager approached him and said, “People won’t believe liars even when they tell the truth. We’ll look for your sheep tomorrow morning. Let’s go home now”.\n" +
                "\n" +
                "Moral - Lying breaks trust. Nobody trusts a liar, even when he is telling the truth."));













    }


}
